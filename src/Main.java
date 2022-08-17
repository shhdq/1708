import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // array
        String[] cities = {"Riga", "Liepāja"};

        System.out.println(cities[0]);
        System.out.println(cities[1]);

        int[] numbers = {1, 2, 3, 5};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);

        System.out.println("-------");
        // for-each
        for(int i : numbers) {
            System.out.println(i);
        }

        cities[0] = "Hello";

//        System.out.println(cities[0]);

        for(String c : cities) {
            System.out.println(c);
        }

        // array-list
        // mini crud
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Dog");
        animals.add("Cat");

        System.out.println(animals.get(0));
        System.out.println(animals.get(1));

        animals.remove(1);

        System.out.println(animals);

        animals.set(0, "Rat");
        animals.add(1, "Dog");
//        animals.set(1, "Rat");

        System.out.println(animals);

        animals.clear();

        System.out.println(animals.size());

        System.out.println("*************");
        System.out.println(" ");

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Bwm");
        cars.add("Audi");
        cars.add("Mercedes");

//        for(int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }

//        for(String i : cars) {
//            System.out.println(i);
//        }


        ArrayList<String> todos = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Task name: ");
        String userChoice = scan.nextLine();

        todos.add(userChoice);

        System.out.println("Your tasks: " + todos.get(0));





    }

}