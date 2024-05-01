
import java.util.Random;
import java.util.HashMap;

public class Generator
{
    private Random generator;
    private HashMap<Integer, String> things;
    private int current;
    private int total = 1;
    
    public Generator()
    {
        things = new HashMap();
    }
    
    public void add(int howMuch, String what)
    {
        while(howMuch > 0)
        {
            things.put(total, what);
            total++;
            howMuch--;
        }
    }
    
    public String generate()
    {
        generator = new Random();
        int num = generator.nextInt(total - 1);
        num += 1;
        if(things.get(num) != null) {
            return things.get(num);
        } else {
            throw new RuntimeException("Generator is empty, cannot generate");
        }
    }
    
    public void manyGenerates()
    {
        for(int i = 0; i < 256; i++)
        {
            generate();
        }
    }
}
