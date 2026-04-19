import java.net.*;
import java.util.List;

public class Lab12_Cookies {
    public static void main(String[] args) throws Exception {
        // 1. Set up a Cookie Manager
        CookieManager manager = new CookieManager();
        CookieHandler.setDefault(manager);

        // 2. Open a connection to a site that uses cookies
        URL url = new URL("https://www.google.com");
        URLConnection conn = url.openConnection();
        conn.getContent(); // This triggers the cookie exchange

        // 3. Retrieve cookies from the CookieStore
        CookieStore store = manager.getCookieStore();
        List<HttpCookie> cookies = store.getCookies();

        // 4. Print each cookie
        System.out.println("Stored Cookies:");
        for (HttpCookie cookie : cookies) {
            System.out.println("Name: " + cookie.getName() + " | Value: " + cookie.getValue());
        }
    }
}