package IOUtilis;

import com.app.core.Volunter;

import java.io.*;
import java.util.List;

public class IOFilemaker {
    public static void storeDate(String fileName, List<Volunter> list) throws IOException {
        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(fileName));
        obj.writeObject(list);
    }
    public static List<Volunter> reciveData(String fileName) throws  Exception{
        ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream(fileName));
        return (List<Volunter>)obj1.readObject();

    }
}
