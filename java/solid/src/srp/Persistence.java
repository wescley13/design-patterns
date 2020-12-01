package srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {

    public void saveFile(Journal journal,
                         String fileName,
                         boolean overwrite) throws FileNotFoundException {

        if(overwrite || new File(fileName).exists()){
            try(PrintStream out = new PrintStream(fileName)){
                out.println(journal.toString());
            }
        }
    }

    public void load(Journal journal, String fileName){}
    public void load(Journal journal, URL url){}

}
