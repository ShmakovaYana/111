import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Serialization {

    public static void SerializationWrite(List<Animal> ListAnimal, String nameFile)throws IOException, ClassNotFoundException{
        Path path = Paths.get(nameFile);

            try (ObjectOutputStream outputStream =
                        new ObjectOutputStream(Files.newOutputStream(path))) {
                outputStream.writeObject(ListAnimal);
            }
    }

    public static List<Animal> SerializationRead(Animal animal, String nameFile)throws IOException, ClassNotFoundException{
        List<Animal> newList;
        Path path = Paths.get(nameFile);
           try (ObjectInputStream inputStream =
                        new ObjectInputStream(Files.newInputStream(path))) {
               newList = (List<Animal>) inputStream.readObject();
           }
        return newList;
    }

}
