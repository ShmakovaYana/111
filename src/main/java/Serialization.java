import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Serialization implements Serializable {

    public static void SerializationWrite(List<Food> food, String nameFile)throws IOException, ClassNotFoundException{
        Path path = Path 
        try (FileWriter fileWriter = new FileWriter(Files.newInputStream(path))){
            fileWriter.writeObject(animalList);
        }
    }

    void SerializationRead(){

    }

}
