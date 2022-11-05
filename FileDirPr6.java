import java.io.File;
import java.io.IOException;
class FileDirPr6 {
    public static void main(String[] args) {
        File filedir = new File(".");
        displayDirectory(filedir);
    }
    private static void displayDirectory(File filedir) {
        try {
            File[] file = filedir.listFiles();
            for(File file2 : file) {
                if (file2.isDirectory()) {
                    System.out.println("Directory :"+file2.getCanonicalPath());
                    displayDirectory(file2);
                }
                else {
                    System.out.println("File :"+file2.getCanonicalPath());
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}