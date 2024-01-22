import java.util.Scanner;
import java.util.ArrayList;


// Nicolas Angiulli
public class App {
    public static void main(String[] args) throws Exception {
        boolean battle = true;
        boolean characterSelection = true;
        Scanner scanner = new Scanner(System.in);
        int gameChoice = 0;
        Eastereggs egg = new Eastereggs();
        String username;
        int turncount = 0;
        


        ArrayList <Character> characters = new ArrayList<Character>();

        while (characterSelection)

        {
            
            System.out.println("Please type in what character you want \n1.Kid \n2.Robot \n3.Warrior \n");
            
            String input = scanner.nextLine();

            switch (input) {
                case "kid", "Kid":

                System.out.println("What username and info do you want to give to this character");

                username = scanner.nextLine();
         
                characters.add( new Kid("", username) );
                    
                    if (username == "")
                    
                    {
                        egg.randomName(characters.get(characters.size()- 1));
                    }
                

                    break;
            
                    

                case "robot", "Robot":

                System.out.println("What username and info do you want to give to this character");

                 username = scanner.nextLine();

                characters.add(new Robot("", username));

                    if (username == "")

                    {

                        egg.randomName(characters.get(characters.size() - 1));

                    }

                    break;

                
                case "warrior", "Warrior":

                characters.add(new Warrior(null, null));

                 
                break;

                default:

                    characterSelection = false;

                    break;
            }
        }

        for (Character e: characters)
        
        {
            
            System.out.println(e.getUserName() + "is ready to fight");

        }

        while (battle)
        {
            
            System.out.println("it's " + characters.get(turncount).getUserName() + "'s turn");

            

            characters.get(turncount).passive();


            characters.get(turncount).stab();

            
            characters.get(turncount).potion();

            //game over
            for (Character e: characters){
                if(e.health <= 0)
                {
                    battle = false;

                }
            }


            turncount++;
            if (turncount > (characters.size() - 1))
            
            {
                turncount = 0;   

            }

        }

         





        // while (battle) {
        //     yuo.displayChoiceMenu();
        //     gameChoice = scanner.nextInt();
        //     yuo.battleChoice(gameChoice, ro);

        //     beo.displayChoiceMenu();
        //     gameChoice = scanner.nextInt();
        //     beo.battleChoice(gameChoice, yuo);

        //     ro.displayChoiceMenu();
        //     gameChoice = scanner.nextInt();
        //     ro.battleChoice(gameChoice, beo);


        //     yuo.passive();
        //     beo.passive();
        //     ro.passive();
            

        //     if (yuo.getHealth() == 0  || beo.getHealth() == 0 || ro.getHealth() == 0)
        //     {
        //         battle = false;
        //         break;
        //     }

        //     yuo.printAttributes();
        //     beo.printAttributes();
        //     ro.printAttributes();

        // }
      
        scanner.close();
    }


}
