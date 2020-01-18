package Library;

import java.io.IOException;

public class RunXampp {
    
    private String command = "";
    private final Message msg = new Message();
    private final OSPrompt os = new OSPrompt();
        
    public void showXampp() {
        try {
            if(os.isUnix()) {
                command = "gksu /opt/lampp/manager-linux-x64.run";
            } else if(os.isWindows()) {
                command = "C:\\xampp\\xampp_start.exe";
            }
            Process proc = Runtime.getRuntime().exec(command);
            proc.waitFor();
        } catch (IOException | InterruptedException ex) {
            msg.msgError("Error Show Xampp : " + ex.getMessage());
        }
    }
    
}
