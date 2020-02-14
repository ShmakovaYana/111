import java.util.List;
import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable{
    private String name;
    private int age;
    private List<Food> food;
    private Types type;

    public Animal(String name, int age, Types type){
        this.name=name;
        this.age=age;
        this.type=type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", food=" + food +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name) &&
                Objects.equals(food, animal.food) &&
                type == animal.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, food, type);
    }

    public int Returnage(){
        return age;
    }
    public String Returnname(){
        return name;
    }
    public List<Food> Returnfood(){
        return food;
    }


}