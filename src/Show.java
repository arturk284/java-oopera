import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    @Override
    public String toString() {
        return "Show{" +
                "listOfActors=" + listOfActors +
                '}';
    }

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printCast() {
        System.out.println("Актерский состав спектакля \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println("- " + actor);
        }
        System.out.println();
    }

    public void addActor(Actor newActor) {
        if (!listOfActors.contains(newActor)) {
            listOfActors.add(newActor);
            System.out.println("Актёр " + newActor.name + " "+ newActor.surname + " добавлен в спектакль " + title);
        } else {
            System.out.println("Этот актёр уже есть в списке!");
        }
        System.out.println();
    }

    public void replaceActor(Actor oldActor, Actor newActor) {
        // Находим индекс старого актера в списке (использует equals)
        int index = listOfActors.indexOf(oldActor);
        if (index != -1) {
            // Если актер найден, заменяем его по индексу
            listOfActors.set(index, newActor);
            System.out.println("Актер " + oldActor.surname + " заменен на " + newActor.surname);
        } else {
            System.out.println("Актер " + oldActor.surname + " не найден в списке спектакля!");
        }
    }
}
