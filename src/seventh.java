import java.util.Scanner;

class seventh {
    public static void main(){
        Scanner scanner=new Scanner(System.in);
        for(int i=1; i<=20; i+=1){
            System.out.print("Print your number:");
            int num = scanner.nextInt();
            if(num%3==0 && num%5==0){
                System.out.println("FizzBuzz:");
            }
            else if(num %5==0){
                System.out.println("Buuz:");

            }
            else if(num%3==0){
                System.out.println("Fizz:");
            }
            else{
                System.out.println("Nothing");
            }

        }




    }
}
