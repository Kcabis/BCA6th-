import java.net.URL;

public class Lab8{
    public static void main(String[] args) throws Exception {
        // 1. Create the URL object
        URL url = new URL("https://example.com/en/4.2/querysets/#queryset-api");

        // 2. Extract and print each part
        System.out.println("Scheme (Protocol): " + url.getProtocol());
        System.out.println("Authority: " + url.getAuthority());
        System.out.println("Path: " + url.getPath());
        System.out.println("Section (Ref/Anchor): " + url.getRef());
        System.out.println("Query String: " + url.getQuery());
    }
}