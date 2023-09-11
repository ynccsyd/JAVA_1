import java.util.Scanner;

public class GradeAvarage {
    public static void main(String[] args) {
        int math, physics, chemistry, music;

        Scanner input = new Scanner(System.in);
        System.out.print("Math grade: ");
        math = input.nextInt();

        System.out.print("Physics grade: ");
        physics = input.nextInt();

        System.out.print("Chemistry grade: ");
        chemistry = input.nextInt();

        System.out.print("Music grade: ");
        music = input.nextInt();

        double average = (math + physics + chemistry + music) / 4;
        if (average > 55) {
            System.out.println("Congratulations. You did it!.");
        } else {
            System.out.println("you must achieve the required average.");
        }
        System.out.println("Your average: " + average);

    }
}
