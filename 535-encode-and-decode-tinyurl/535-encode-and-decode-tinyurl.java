public class Codec {
    HashMap<String,String> mp=new HashMap<>();
    String fix="https://";
    int i=0;
    public String encode(String longUrl) {
        i++;
        String curr=fix+i;
        mp.put(curr,longUrl);
        return curr;
       
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
       return mp.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));