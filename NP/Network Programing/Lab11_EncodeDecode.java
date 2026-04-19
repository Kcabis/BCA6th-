import java.net.*;

public class Lab11_EncodeDecode {
    public static void main(String[] args) throws Exception {
        String data = "This string has space";

        // 1. Encode the string
        String encoded = URLEncoder.encode(data, "UTF-8");
        System.out.println("Encoded: " + encoded);

        // 2. Decode it back to original
        String decoded = URLDecoder.decode(encoded, "UTF-8");
        System.out.println("Decoded: " + decoded);
    }
}