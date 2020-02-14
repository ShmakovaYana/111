import java.io.Serializable;
import java.util.Objects;

public class Food implements Serializable {
    private String nameF;
    private  double count;

    public Food(String nameF, double count){
        this.nameF=nameF;
        this.count=count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Double.compare(food.count, count) == 0 &&
                Objects.equals(nameF, food.nameF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameF, count);
    }

    public String Returnname(){
        return nameF;
    }
    public double returncount(){
        return count;
    }

    @Override
    public String toString() {
        return "Food{" +
                "nameF='" + nameF + '\'' +
                ", count=" + count +
                '}';
    }
}

