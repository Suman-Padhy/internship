import java.util.Scanner;

public class EvenOddCheck {
  public static void main(String[] args) {
     System.out.println("Enter Number to verify even or odd");
     Scanner in = new Scanner(System.in);
     int  number = Integer.parseInt(in.nextLine());
     System.out.println((number %2 ==0)?"Even Number":"Odd NUmber");
  }    
}
