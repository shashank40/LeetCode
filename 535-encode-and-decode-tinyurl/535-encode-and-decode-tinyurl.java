public class Codec {
    HashMap<Integer,String> mp=new HashMap<>();
    String fix="https://";
    int i=0;
    public String encode(String longUrl) {
        i++;
        mp.put(i,longUrl);
        return i+"";
       
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
       return mp.get(Integer.parseInt(shortUrl));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));