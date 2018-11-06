public class W03D02E02_URLFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

//        url = url.replace("https//", "https://");
//        url = url.replace("bots", "odds");

//        System.out.println(url);

        if (!url.startsWith("https://")) {
            String toBeRepl = url.substring(0, url.indexOf("www"));
            url = url.replace(toBeRepl,"https://");
        }
        System.out.println(url);

        url = url.replace(url.substring(url.length() - 4, url.length()), "odds");

        System.out.println(url);
    }
}