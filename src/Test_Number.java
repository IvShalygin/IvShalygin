import java.util.Scanner;
//тест ЦЕЛОГО числа на четность/нечетность, простое/состовное
public class Test_Number {
    public static void main(String[] args) {
        Scanner N=new Scanner(System.in);
        System.out.println("Введите целое число");
        if(N.hasNextLong()){
            long a=N.nextLong();
            //System.out.println("Введенное число: "+a);
            long b=2;
            float c=a%b;
            if(c == 0) {
                System.out.println("Введенное число: "+a + " является четным");
            }
            else {
                System.out.println("Введенное число: "+a + " является НЕчетным");
            }
            boolean t=false;
            for (long i=2;i<a;i++){
                c=a%i;
                if(c==0){
                    t=true;
                    System.out.println("На что ж делится? "+i);
                    break;
                }
            }
            if(t==true){
                System.out.println("Введенное число: "+a + " является составным  числом");
            }
            else {
                System.out.println("Введенное число: "+a + " является простым числом");
            }

        }
        else {
            String a=N.nextLine();
            System.out.println("Введенные данные -- " + a + " не являются требуемыми данными ввода");
        }
        N.close();
    }

}
