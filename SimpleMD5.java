import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;

public class SimpleMD5 {
    public static void main(String[] args) throws Exception {
        
        String jsonContent = new String(Files.readAllBytes(Paths.get("input.json")));

     String firstName=("student"+firstName);
     String rollNumber=("student"+rollNumber);

     

    String combinedString = firstName + rollNumber;

        
        String md5Hash = generateMD5(combinedString);

        
        Files.write(Paths.get("output.txt"), md5Hash.getBytes());

        
        System.out.println("MD5 Hash: " + md5Hash);
    }

    
    private static String generateMD5(String input) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");  
        byte[] hashBytes = md.digest(input.getBytes());  
        
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            hexString.append(String.format("%02x", b));  
        }
        return hexString.toString();  
    }
}

