package pl.edu.pja.s26635.zapis;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Zapis {

    public static void zapiszDoPliku(String nazwa, Object obj) throws IOException {
        File file = new File("C:\\Users\\tomek\\IdeaProjects\\GUI_projekt_1\\src\\plikiTxt\\", nazwa);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(obj);
        oos.flush();
        oos.close();

    }

}
