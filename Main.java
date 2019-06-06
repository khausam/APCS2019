import java.io.File;
import java.io.IOException;
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.FileEntity;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{

    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] args) {
        System.out.println("Starting...");
        
        String urlStr = "https://api.coinlore.com/api/tickers/";
        HttpPost request = new HttpPost(urlStr);
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        
        try {
            HttpResponse response = httpClient.execute(request);
            HttpEntity entity = response.getEntity();
            String jsonString = EntityUtils.toString(entity);
            System.out.println(jsonString);
            
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        
        System.out.println("Done!");
    }

}
