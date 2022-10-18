public class Main {
    public static void main(String[] args) {
        // Task1
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // Task2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // Task3
        var dogs = 8.0;
        dogs = dogs - 3.5;
        System.out.println(dogs);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // Task4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        // Task5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        // Task6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес " + totalWeight + " кг");
        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница в весе " + weightDifference + " кг" );

        // Task7
        var champ1 = 78.2;
        var champ2 = 82.7;
        var weightDifference1 = champ2 - champ1;
        System.out.println("Разница в весе " + weightDifference1 + " кг");
        var difference = champ2 % champ1;
        System.out.println("Полная разница в весе " + difference + " кг" );

        // Task8
        var numberofHours = 640;
        var workDay = 8;
        var numberofPeople = numberofHours / workDay;
        System.out.println("Всего работников в компании " + numberofPeople + " человек");
        var people1 = 80;
        var people2 = 94;
        var totalPeople = people2 + people1;
        var dayWork = 8;
        var hours = totalPeople * dayWork;
        System.out.println("Если в компании работает " + totalPeople + " человека, то всего " + hours + " часов работы может быть поделено между сотрудниками");

    }

}
