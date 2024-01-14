import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean battle = true;
        Scanner scanner = new Scanner(System.in);
        int gameChoice=0;
        System.out.println("Please type in the character names");
        String name = scanner.nextLine();
        Kid yuo = new Kid("", name );
        String name2 = scanner.nextLine();
        Kid beo = new Kid("", name2);
        String name3 = scanner.nextLine();
        Robot ro = new Robot("", name3);
        System.out.println(yuo.getUserName() + "is ready to fight");
        System.out.println(beo.getUserName() + "is ready to fight");
        System.out.println(ro.getUserName() + "is ready to fight");

        while (battle) {
            yuo.displayChoiceMenu();
            gameChoice = scanner.nextInt();
            yuo.battleChoice(gameChoice, ro);

            beo.displayChoiceMenu();
            gameChoice = scanner.nextInt();
            beo.battleChoice(gameChoice, yuo);

            ro.displayChoiceMenu();
            gameChoice = scanner.nextInt();
            ro.battleChoice(gameChoice, beo);

            yuo.passive();
            beo.passive();
            ro.passive();
            

            if (yuo.getHealth() == 0  || beo.getHealth() == 0 || ro.getHealth() == 0)
            {
                battle = false;
                break;
            }

            yuo.printAttributes();
            beo.printAttributes();
            ro.printAttributes();

        }
      
        scanner.close();
    }

}
