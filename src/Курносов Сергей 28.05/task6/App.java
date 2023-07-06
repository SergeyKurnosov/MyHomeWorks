package task6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class App {
    public static void main(String[] args) throws IOException {
        Result();
    }

    public static void Result() throws FileNotFoundException, IOException {
        XmlReader xmlReader1 = new XmlReader();
        XmlReader xmlReader2 = new XmlReader();
        XmlReader xmlReader3 = new XmlReader();
        XmlReader[] array = new XmlReader[3];
        array[0] = xmlReader1;
        array[1] = xmlReader2;
        array[2] = xmlReader3;
        for (int i = 0; i < array.length; i++) {
            try {
                array[i].read();
            } catch (FileSystemAlreadyExistsException e) {
                throw new FileNotFoundException("FileSystemAlreadyExistsException переделан в FileNotFoundException.");
            }
        }
    }
}
