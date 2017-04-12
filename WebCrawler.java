import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
    public static void main(String[] args){
        String rootUrl = "http://www.google.com";
        discoverWeb(rootUrl);
    }

    public static void discoverWeb(String root){
    	Queue<String> queue = new LinkedList<>();;
    	List<String> discoveredWebsiteList = new ArrayList<>();
        queue.add(root);
        discoveredWebsiteList.add(root);
        
        while(!queue.isEmpty()){
            String v = queue.remove();
            String rawHtml = readUrl(v);
            String regExp = "http://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regExp);
            Matcher matcher = pattern.matcher(rawHtml);
            while(matcher.find()){
                String actualUrl = matcher.group();
                if(!discoveredWebsiteList.contains(actualUrl)){
                    discoveredWebsiteList.add(actualUrl);
                    System.out.println("New Website fount: " + actualUrl);
                    queue.add(actualUrl);
                }
            }
        }
    }

    public static String readUrl(String v){
        String rawHtml = "";
        try{
            URL url = new URL(v);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine = "";
            while((inputLine = in.readLine()) != null){
                rawHtml += inputLine;
            }
            in.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        return rawHtml;
    }
}



