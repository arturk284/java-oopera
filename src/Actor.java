import java.util.Objects;

public class Actor extends Person{

    int height;
    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender); // Вызов конструктора родителя
        this.height = height;
    }

    @Override
    public String toString() {
        return "Актёр " + name + " " +surname + ", пол " + gender + ", рост: " + height
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Если это один и тот же объект в памяти
        if (o == null || getClass() != o.getClass()) return false; // Если типы разные
        Actor actor = (Actor) o;
        return height == actor.height &&
                Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                gender == actor.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }

}
