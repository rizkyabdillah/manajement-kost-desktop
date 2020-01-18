package Library;

public class TempUser {
    
    private static String idTemp = "", levelTemp = "", userName = "";
        
    public static void setId(String id) {
        idTemp = id;
    }
    
    public static void setUsername(String user) {
        userName = user;
    }
        
    public static void setLevel(String nm) {
        levelTemp = nm;
    }
        
    public static String getId() {
        return idTemp;
    }
        
    public static String getLevel() {
        return levelTemp;
    }
    
    public static String getUsername() {
        return userName;
    }
    
    
    
}
