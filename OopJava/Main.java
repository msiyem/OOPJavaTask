import static java.lang.Math.sqrt;

public class main{
    public static void Main(String[] args) {
        int base=9,height=17;
        float pi=3.1416F;
        int radius=5;
        float celsius = 32.6F;
        int arm=7;

        int a=3,b=4,c=5;

        System.out.println("Aria of a triangle: " + calculateTriangle(base,height) );
        System.out.println("Volume of a ball: " + calculateVolumeBall(pi,radius) );
        System.out.println("Area of a circle: " + calculateCircle(pi,radius) );
        System.out.println("Convert Celsius scale to Fahrenheit: " + convertCelsius2Fahrenheit(celsius));
        System.out.println("Area of a equilateral triangle: " + calculateEquilateralTriangle(arm));
        System.out.println("Aria of a triangle(2): " + calculateTriangle2(a, b, c) );
    }

    public static double calculateTriangle(int base, int height){
        return 0.5*base*height;
    }

    public static double calculateVolumeBall(float pi, int radius){
        return 4*pi*(radius*radius*radius)/3;
    }

    public static double calculateCircle(float pi, int radius){
        return pi*radius*radius;
    }

    public static double convertCelsius2Fahrenheit(float celsius){
        return 32+(celsius*9/5);
    }

    public static double calculateEquilateralTriangle(int arm){
        return (sqrt(3))/4*arm*arm;
    }

    public static double calculateTriangle2(int a, int b, int c){
        double s = (float)((a+b+c)/2);
        return (sqrt(s * (s-a) * (s-b) * (s-c)));
    }
}
