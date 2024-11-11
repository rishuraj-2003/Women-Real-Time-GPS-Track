import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Result {
    public static void main(String[] args) {
        
        String filePath = "example3.html"; 
        
        // Create a file object
        File htmlFile = new File(filePath);
        
        
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                // Open the HTML file in the default browser
                desktop.browse(htmlFile.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Desktop is not supported. Cannot open the HTML file.");
        }
    }
}
