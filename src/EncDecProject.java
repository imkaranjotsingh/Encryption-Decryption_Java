import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
 
public class EncDecProject{
    public static void main(String[] args) {
 
        try{
            KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
            SecretKey myDesKey = keygenerator.generateKey();
            System.out.println(myDesKey.toString());
 
            Cipher desCipher;
            desCipher = Cipher.getInstance("AES");
 
         
            byte[] text = "Helo World".getBytes("UTF8");
 
 
            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            byte[] textEncrypted = desCipher.doFinal(text);
 
            String s = new String(textEncrypted);
            System.out.println(s);
 
            desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
            byte[] textDecrypted = desCipher.doFinal(textEncrypted);
 
            s = new String(textDecrypted);
            System.out.println(s);
        }catch(Exception e)
        {
            System.out.println("Exception");
        }
    }
}