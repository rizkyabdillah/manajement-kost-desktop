package Library;

public class TempData {
    
    private static String idTemp = "", idTemp1 = "", idTemp2 = "", namaTemp = "";
    private static boolean enabled = false;
    
    public TempData() {
        
    }
    
    public static void setId(String id) {
        idTemp = id;
    }
    
    public static void setId1(String id) {
        idTemp1 = id;
    }
    
    public static void setId2(String id) {
        idTemp2 = id;
    }
    
    public static void setNama(String nm) {
        namaTemp = nm;
    }
    
    public static void setStatus(boolean enb) {
        enabled = enb;
    }
    
    public static String getId() {
        return idTemp;
    }
    
    public static String getId1() {
        return idTemp1;
    }
    
    public static String getId2() {
        return idTemp2;
    }
    
    public static String getNama() {
        return namaTemp;
    }
    
    public static boolean getStatus() {
        return enabled;
    }
    
}
