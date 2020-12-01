package srp;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Journal {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addJournal(String text){
        entries.add("" + (++count) +": " + text);
    }

    public void removeEntry(int index){
        entries.remove(index);
    }

    // Breaks the SRP
    public void save(String fileName) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(fileName))
        {
            out.println(toString());
        }
    }

    // Breaks the SRP
    public void load(Journal journal){}

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
