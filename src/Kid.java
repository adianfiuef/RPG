public class Kid extends Character
{

    int potion;


    public Kid (String userinfo, String username )
    {

        super(username, userinfo);
        this.setHealth(100);
        this.setDefense(10);
        this.setAttack(20);
        this.potion = 3;
       
    }

    @Override
    public void displayChoiceMenu()
    {
        String displayMenu[] ={"Which attack do you want to choose", "1. Stab", "2. Potion", "3. PoisonDart"};

        for(String i : displayMenu)
        {
            System.out.println(i);
        }

    }

    @Override
    public void battleChoice(int choice, Character target)
    {
        switch (choice) {
            case 1:
                this.stab(target);
                break;

            case 2:

                this.potion();

                break;

            case 3:

                this.poisonDart(target);
        
            default:

                System.out.println("turned skiped");
                break;
        }

    }

    public void stab(Character target)
    {

        System.out.println(this.getUserName() + " used stab on " + target.getUserName() + "!");
        double damage = (this.getAttack() * 1.2 - this.getDefense() * 1.4);

        if (damage<0)
        {
            damage = 0;
        }

        target.setHealth(target.getHealth() - damage);
        this.setDefense(this.getDefense() - 2);
 
        
    }

    
    public void potion()
    {
        System.out.println(this.getUserName() + " used potion! " );
        double healing = (this.getHealth() * 1.5);
        
        this.setHealth(healing);
        this.setDefense(defense);
        this.setisPoisoned(false);
        

    }

    public void poisonDart(Character target){

        System.out.println(this.getUserName() + " poisoned " + target.getUserName());

        target.setisPoisoned(true);
        
    }

    // Showing side effects and losses 
    @Override
    public void passive()
    {
        if(this.isPoisioned)
        {
            this.setHealth(this.getHealth() - 1.5);
            System.out.println(this.getUserName() + " is poisoned! ");
        }

        if (this.isZapped) 
        {
            this.setHealth(this.getHealth() - 1.5);
            System.out.println(this.getUserName() + " is zapped! ");

        }

        if(this.getHealth() == 0)
        {
            System.out.println(this.getUserName() + " died game over ");
        }


    }








    
}
