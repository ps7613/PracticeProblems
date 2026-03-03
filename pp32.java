import java.util.*;
class pp32
{
    static void main()
    {
        double celsiusResult,fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree Fahrenheit");
        fahrenheit =sc.nextDouble();
        celsiusResult=(fahrenheit-32)+(5/9);
        System.out.println("The "+fahrenheit+" fahrenheit is "+celsiusResult+" celsius");
    }
}