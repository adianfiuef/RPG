import java.util.Random;


public class  Eastereggs {

    public void randomName(Character target){

    Random rng = new Random();
    String name = "";

    int n = rng.nextInt(10);

    for(int i = 0; i <= n; i++)
    {
        char randomCharacter = (char) (rng.nextInt(26) + 97);

        name = name + randomCharacter;
    }

    target.setUsername(name);
    
    }
}