import java.net.URI;

public class Lab9_ResolveURI {
    public static void main(String[] args) throws Exception {
        // 1. The base URI
        URI base = new URI("http://example.com");

        // 2. The relative path
        String path = "colleges/SWASTIK#admission";

        // 3. Resolve them together
        URI combined = base.resolve(path);

        // 4. Print the result
        System.out.println("Full URI: " + combined.toString());
    }
}