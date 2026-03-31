import java.util.Scanner;

public class Trigonometry {

    // TODO: Create 'public static double sine(double angle)'
    public static double sine(double angle){
        double sin = Math.sin(angle);
        return sin;
    }

    // TODO: Create 'public static double cosine(double angle)'
    public static double cosine(double angle){
        double cos_value = Math.cos(angle);
        return cos_value;
    }
    
        // TODO: Read angle
        // TODO: Call sine() and cosine()
        // TODO: Print results in the required format
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        double angleRadians = Math.toRadians(angle);
        double sin = sine(angleRadians);
        double cos = cosine(angleRadians);
        System.out.println("Sine: "+ sin);
        System.out.println("Cosine: "+cos);        
    }
}
