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
