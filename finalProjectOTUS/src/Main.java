import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
         while(!input.equals("exit")) {
             if(input.endsWith("0") || input.endsWith("5") || input.endsWith("6") || input.endsWith("7")
                     || input.endsWith("8") || input.endsWith("9") || input.endsWith("11") || input.endsWith("12")
                     || input.endsWith("13") || input.endsWith("14")) {
                 System.out.println(input + " рублей");
             }
             else if(input.endsWith("2") || input.endsWith("3") || input.endsWith("4")){
                 System.out.println(input + " рубля");
             }
             else if(input.endsWith("1")){
                 System.out.println(input + " рубль");
             }
             input = sc.nextLine();

             //1 рублей
             //2 рубля
             //3 рубль
         }
    }

}
