import java.util.Scanner;
// Нахождение НОК и НОД двух ЦЕЛЫХ чисел
public class NodNoK {
    public static void main(String[] args) {
        Scanner N1=new Scanner(System.in);
        System.out.println("Введите целое число А");
        if(N1.hasNextLong()){
            long a=N1.nextLong();
            long a1=a;
            Scanner N2=new Scanner(System.in);
            System.out.println("Введите целое число B");
            if(N2.hasNextLong()){
                long b=N2.nextLong();
                long b1=b;
                while (a!=0 && b!=0){
                    if(a>b){
                        a=a%b;
                    }
                    else{
                        b=b%a;
                    }
                }
                long nod=a+b;
                System.out.println("Наибольший общий делитель чисел: " + a1 + " и "+b1+" является: " +nod);
                long nok=a1*b1/nod;
                System.out.println("Наименьшее общее кратное чисел: " + a1 + " и "+b1+" является: " +nok);



            }
            else {
                String b=N2.nextLine();
                System.out.println("Введенные данные -- " + b + " не являются требуемыми данными ввода");
            }
            N2.close();
        }
        else {
            String a=N1.nextLine();
            System.out.println("Введенные данные -- " + a + " не являются требуемыми данными ввода");
        }
        N1.close();

    }
}
