public class Robot extends Character {

    
    
    int bomb;
    int armThrow;

    public Robot(String userinfo, String userName)
    {
        super(userName, userinfo);

        this.setAttack(15) ;
        this.setDefense(13);
        this.setHealth(120);
        // Future reference
        // this.bomb = 2;
        this.armThrow = 2;

    }

    public void displayChoiceMenu()
    {

            System.out.println("Which attack do you want to choose");
            System.out.println("1. Zap");
            System.out.println("2. Zap");


    }

    public void battleChoice(int choice, Character target)
    {

        switch (choice) {
            case 1:
                this.zap(target);    
                break;
            

            case 2:
                this.armThrow(target);
                break;
            
            default:

                System.out.println("turned skiped");
                break;
        }
    }


    public void zap(Character target)
    {
        System.out.println("Zap was use on" +  target.getUserName() + "!");
        
        double damage = this.getAttack() * 1.4;  

        if(damage<0)
        {
            damage = 0;
        }
        
        target.setHealth(target.getHealth() - damage);

        target.setisZapped(true);

    }



    // Future reference
    // public void bomb(Character[] targets)
    // {
    //     for (Character x: targets){
    //         x.printAttributes()
    //     }

    //     System.out.println

    // }

    public void armThrow(Character target)
    {
        System.out.println(this.getUserName() + "used one of his arms and threw it at" + target.getUserName());

        double damage = this.getAttack() * 1.8;

        if (damage<0)
        {
            damage = 0;
        }

        target.setHealth(target.getHealth() - damage);
        this.setHealth(this.getHealth() - damage * 0.2);
    }

    public void passive()
    {
        if(this.isPoisioned)
        {
            this.setHealth(getHealth() - 0);
            System.out.println(this.getUserName() + " is invulnerable to poison");
        }

        if(this.getHealth() == 0)
        {
            System.out.println(this.getUserName() + " died game over"); 
        }
    }

    public void repair()
    {
        if (this.armThrow == 0)
        {

            this.armThrow = 2;
            
            System.out.println("Your arms have been repaired");

            this.setDefense(this.getDefense() - 2.4);
        }

    }

}
