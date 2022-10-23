import java.util.Scanner;
public class PlanetWeight
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double num2[]={0.38, 0.91, 0.38, 2.34,1.06,0.92,1.19,0.06};
        String planet[]={"Mercury", "Venus", "Mars", "Jupiter","Saturn","Uranus","Neptune","Pluto"};
        System.out.print("What is your weight on the Earth? ");
        int weight=kb.nextInt();
        for(int i=0; i<planet.length; i=i+1)
            System.out.println(i+1 +". " + planet[i]);
        System.out.print("  Selection?");
        int num = kb.nextInt();
        System.out.print("Your weight on " + planet[num-1] + " would be " + (weight*num2[num-1]));
    }
}