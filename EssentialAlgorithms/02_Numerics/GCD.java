import java.util.*;
public class GCD
{
public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
    System.out.println("Enter the first number ");
    int firstNumber = in.nextInt();
    System.out.println("Enter the second number ");
    int secondNumber = in.nextInt();
    printGCD(firstNumber,secondNumber);
}

static void printGCD(int firstNumber, int secondNumber)
{
int remainder=0;
while (secondNumber != 0 && remainder < secondNumber)
	{
	System.out.println("firstNumber is "+ firstNumber+" secondNumber is "+secondNumber + "remainder is "+remainder );
	remainder = firstNumber/secondNumber ;
	firstNumber = secondNumber;
	secondNumber = remainder;
	}
System.out.println("GCD is"+ firstNumber);
}
}
class IntHolder
{
static int iteration_No = 0;
}
