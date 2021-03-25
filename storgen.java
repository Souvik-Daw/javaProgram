import java.util.*;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.time.format.DateTimeFormatter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;  
public class storgen {
	
	public class pair{
		String user="";
		String pass="";
		pair(String user,String pass)
		{
			this.user=user;
			this.pass=pass;
		}
	}
	
	private static SecretKeySpec secretKey;
    private static byte[] key;
 
    public static void setKey(String myKey) 
    {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16); 
            secretKey = new SecretKeySpec(key, "AES");
        } 
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } 
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
 
    public static String encrypt(String strToEncrypt, String secret) 
    {
        try
        {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } 
        catch (Exception e) 
        {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }
 
    public static String decrypt(String strToDecrypt, String secret) 
    {
        try
        {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } 
        catch (Exception e) 
        {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
	static String geek_Password(int len) 
    { 
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
        String numbers = "0123456789"; 
        String symbols = "!@#$%^&*_=+-/.?<>)"; 
        String values = Capital_chars + Small_chars + 
                        numbers + symbols; 
        Random rndm_method = new Random(); 
  
        char[] password = new char[len]; 
  
        for (int i = 0; i < len; i++) 
        { 
            password[i] = 
              values.charAt(rndm_method.nextInt(values.length())); 
  
        } 
        String p="";
        for(char ch:password)
        {
        	p+=ch+"";
        }
        return p; 
    } 
	public static void main(String args[])
	{
		storgen obj=new storgen();
		Map<String,String> m=new LinkedHashMap<>();
		final String secretKey = "asdgbbdfdfbdfbtbdfefsfdv545s1v5s5sd1f5s48%^#%^#^3";
		while(1>0){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter \n 1:To Generate               2.To Store               3.View");
			int n=sc.nextInt();
			switch(n)
			{
				case 1:
				{
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");  
					LocalDateTime now = LocalDateTime.now();  
				    String key=dtf.format(now); 
				    Map<String,String> m1=new HashMap<>();
				    String arr[]= {"","Whats Your name","Your First Pet","Your fav teacher","Your nick name","Your fav song",
							          "Whats Your name","Your First Pet","Your fav teacher","Your nick name","Your fav song",
							    	  "Whats Your name","Your First Pet","Your fav teacher","Your nick name","Your fav song",
							    	  "Whats Your name","Your First Pet","Your fav teacher","Your nick name","Your fav song",
							    	  "Whats Your name","Your First Pet","Your fav teacher","Your nick name","Your fav song",
							    	  "Whats Your name","Your First Pet","Your fav teacher","Your nick name","Your fav song",
							    	  "this app name"};
				    for(int i=1;i<=31;i++)
				    {
				    	m1.put(i+"",arr[i]);
				    }
				    sc.nextLine();
				    System.out.println(m1.get(key));
				    String part_1=sc.nextLine();
				    if(part_1.contains(" "))
				    	part_1=part_1.replace(" ", "_");
				    System.out.println("Enter a number bt 1 to 100");
				    int part_3=sc.nextInt();
				    System.out.println("Enter a special character");
				    char part_2=sc.next().charAt(0);
				    int max = 100; 
			        int min = 1; 
			        int range = max - min + 1; 
			        int part_4=(int)(Math.random() * range) + min; 
			        String last_1=part_4+part_1+part_2+part_3+"";
			        	System.out.println("Passward 1: "+last_1);
			        	
			        	
			        	
				    System.out.println("Enter the length of the passward");
				    int len=sc.nextInt();
				    String last_2=geek_Password(len);
			        System.out.println("Passward 2: "+last_2);
					}
			break;
				case 2:
				{
					sc.nextLine();
					System.out.println("Enter the name of the App");
					String app_name=sc.nextLine();
					System.out.println("Enter the user name");
					String user_name=sc.nextLine();
					System.out.println("Enter the Passward");
					String passward=sc.next(); 
					String originalString = passward;
					String encryptedString = AES.encrypt(originalString, secretKey) ;
					String store=user_name+" "+encryptedString;
					m.put(app_name,store);
					System.out.println("Done...");
				}
			break;
				case 3:
				{
					sc.nextLine();
					int i=1;
					System.out.println("Your stored applications");
					for(Map.Entry<String, String> e:m.entrySet())
					{
						System.out.println(i+": "+e.getKey());
						i++;
					}
					System.out.println("Enter the app name whose details you want to view");
					String s=sc.nextLine();
					if(m.get(s)!=null)
					{
						String arr[]=m.get(s).split(" ");
						String user=arr[0];
						String pass=arr[1];
						System.out.println("Username : "+user);
						String decryptedString = AES.decrypt(pass, secretKey) ;
						System.out.println("Passward : "+decryptedString);
					}
					else
						System.out.println("No such app exists");
				}
			break;
				default:
					System.out.println("Invalid Input");
			}
			System.out.println("Do you want to continue \n Enter 1 for Yes                      2 for No");
			int q=sc.nextInt();
			if(q==1)
				continue;
			else
				break;
			
		}
		System.out.println("Thank You.............");
	}
}
