public class Warrior extends Character{
    
    public float attack = 70;
    public float defence = 50;
    int spear;
    

    public Warrior (String username, String userinfo)
    {
        super(userinfo, username);
        this.setAttack(70);
        this.setDefense(50);
        this.setHealth(150);
        this.spear = 5;

    }
    
    public void spear(Character target)
    {
        System.out.println(this.getUserName() + "uses the spear on" + this.getUserName() + "!");
        double damage = (this.getAttack() + 2.4);
        
        if (damage<0)
        {
            damage = 0;
        } 

        target.setHealth(target.getHealth() - damage);
    }

    public void sword(Character target)
    {

        System.out.println(this.getUserName() + "uses the sword on" + this.getUserName() + "!");
        double damage = (this.getAttack() + 1.4);

        if (damage<0)
        {
            damage = 0;
        }

        target.setHealth(target.getHealth() - damage);

        target.setisPoisoned(true);
        

    }

    //Future Reference
    // public void fireBow(Character[] targets)
    // {

    //     for(Character x: targets){
    //         x
    //     }

    // }


}
