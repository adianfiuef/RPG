import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        boolean battle = true;
        boolean characterSelection = true;
        Scanner scanner = new Scanner(System.in);
        int gameChoice=0;

        ArrayList <Character> characters = new ArrayList<Character>();

        while (characterSelection)

        {
            String input = scanner.nextLine();

            switch (input) {
                case "kid":
         
                characters.add(new Kid(null, null) );
                    
                    break;
            

                case "robot":

                characters.add(new Robot(null,null));

                    break;

                
                case "warrior":

                characters.add(new Warrior(null, null));
        

                default:
                    break;
            }
        }


        System.out.println("Please type in the character names");
        String name = scanner.nextLine();
        Kid yuo = new Kid("", name );
        String name2 = scanner.nextLine();
        Kid beo = new Kid("", name2);

        Robot ro = new Robot("", "");

    

        System.out.println(yuo.getUserName() + " is ready to fight");
        System.out.println(beo.getUserName() + " is ready to fight");
        System.out.println(ro.getUserName() + " is ready to fight");

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
