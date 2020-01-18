package Library;

public class OSPrompt {
    
    private final String OS = System.getProperty("os.name").toLowerCase();
    
    public boolean isWindows() {
       return (OS.contains("win"));
    }

    public boolean isMac() {
        return (OS.contains("mac"));
    }

    public boolean isUnix() {
        return (OS.contains("nix") || OS.contains("nux") || OS.indexOf("aix") > 0 );
    }

    public boolean isSolaris() {
        return (OS.contains("sunos"));
    }
    
}
