import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    int number;

    private void input(){
        Scanner input = new Scanner(System.in);
        boolean in = true;

        do{
            try{
                System.out.println("Enter integer: ");
                number = input.nextInt();

                while(number < 0){
                    System.out.println("Number must be greater than 0");
                    number = input.nextInt();
                }

                in = false;
            }catch(InputMismatchException ex){
                System.out.println("Integer expected!");
                input.nextLine();
            }
        }while(in);
    }

    private int factorial(int a){
        int result = 1;
        int i;
        for(i = 1; i < a; i++){
            result *= (i+1);
        }
        return result;
    }

    public static void main(String[] args) {
        Main obj = new Main();

        obj.input();
        System.out.println(obj.number + "! = " + obj.factorial(obj.number));
    }
}