package solid.srp;

import java.io.File;
import java.io.IOException;

public class SRPDemo {

    public static void main(String[] args) throws IOException {
        Journal journal = new Journal();
        journal.addJournal("First Journal.");
        journal.addJournal("Second Journal.");

        Persistence persistenceJournal = new Persistence();
        File tempFile = File.createTempFile("srp", ".txt");

        persistenceJournal.saveFile(journal, tempFile.getAbsolutePath(), true);

        // LINUX
        Runtime.getRuntime().exec("gedit " + tempFile);
        // Windows
//        Runtime.getRuntime().exec("notepad.exe " + tempFile);
    }

}
