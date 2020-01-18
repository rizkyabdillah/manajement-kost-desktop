package Library;

public class LookNFeel {
    
    private final OSPrompt os = new OSPrompt();
    private String looknfeel = "";

    public LookNFeel() {
        if(os.isWindows()) {
            looknfeel = "Windows";
        } else if(os.isUnix()) {
            looknfeel = "GTK+";
        }
    }
    
    public String getLnF() {
        return looknfeel;
    }
    
}
