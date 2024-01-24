public class Character {


    public String info;
    public String name;

    public double attack;
    public double defense;
    public double health;
    public boolean isPoisioned;
    public boolean isZapped;
    


    public Character(String userName, String userinfo){
        this.name = userName;
        this.info = userinfo;
        this.attack = 10;
        this.defense = 10;
        this.health = 100;
        this.isPoisioned = false;
        this.isZapped = false;
    }

    //Getters
    public String getUserName(){

        return this.name;
    }

    public double getAttack(){

        return this.attack;
    }

    public double getDefense(){

        return this.defense;
    }
    public double getHealth(){

        return this.health;
    }

    public boolean getisPoisioned(){

        return this.isPoisioned;
    }

    public boolean getisZapped(){
        
        return this.isZapped;
    }

    //Setters
    public void setUsername(String name){
        this.name = name;
        
    }

    public void setAttack(double attack){
        if (attack < 0) {
            this.attack = 0;
        }
        else{
            this.attack = attack;
        }
    }

    public void setDefense(double defense){
        if (defense < 0)  {
            this.defense = 0;
        }
        else {
            this.defense = defense;
        }
    }
    
    public void setHealth(double health){

        if (health < 0) {
            this.health = 0;
        }
        else {
            this.health = health;
        }
    }

    public void setisPoisoned(boolean isPoisioned){

        this.isPoisioned = isPoisioned;
    }

    public void setisZapped(boolean isZapped){

        this.isZapped = isZapped;
    }

    public void printAttributes(){
        System.out.println("Name: " + name);
        System.out.println("Info: " + info);
        System.out.println("Attacks: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Health: " + health);
    }


    public void passive(){}
    public void stab(){}
    public void potion(){}
    public void displayChoiceMenu(){}
    public void battleChoice(int attackChoice, Character character){}
}



