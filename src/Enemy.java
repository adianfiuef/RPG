public class Enemy {
    
    public double attack;
    public double defense;
    public double health;
    public String name , info;



    public Enemy(String name, String info)
    {
        this.name = "enemyName";
        this.info = "enemyinfo";
        this.attack = 20;
        this.defense = 20;
        this.health = 300;

    }

    //Getters
    public String getEnemyInfo(){

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

    public void setEnemyInfo(String name){

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
        if (defense < 0) {
            this.defense = 0;
        }
        else{
            this.defense = defense;
        }
    }

    public void setHealth(double health){

        if(health < 0){
            this.health = 0;
        }
        else{
            this.health = health;
        }
    }

    public void printAttributes(){
        System.out.println("Name:" + name);
        System.out.println("Info:" + info);
        System.out.println("Attacks:" + attack);
        System.out.println("Defense:" + defense);
        System.out.println("Health:" + health);
    }
}

