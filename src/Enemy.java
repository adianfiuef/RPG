public class Enemy {
    
    public float attack;
    public float defense;
    public float health;
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

}

