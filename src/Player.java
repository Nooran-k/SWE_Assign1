import java.util.Scanner;

public class Player {
    int choiceX,choiceY,bombX,bombY;
    String name;
    void setName(Scanner scanner){
        System.out.println("enter player name: ");
        name= scanner.nextLine();

    }

    void getChoice(Scanner scanner){
        System.out.println(name +" ,enter the coordinates of the cookie :");
        System.out.println("x= ");
        choiceX= scanner.nextInt();

        System.out.println("y= ");
        choiceY=scanner.nextInt();
        if (choiceX>=4 || choiceY>=4){
            System.out.println("invalid input , enter numbers from 0-3");
            getChoice(scanner);
        }

    }

    void setBombPos(Scanner scanner){
        System.out.println( name +", enter the coordinates of your bomb: ");
        System.out.println("x= ");
        bombX= scanner.nextInt();

        System.out.println("y= ");
        bombY=scanner.nextInt();
        if (bombY>=4 || bombX>=4){
            System.out.println("invalid input , enter numbers from 0-3");
            setBombPos(scanner);
        }

        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }

    }

}

