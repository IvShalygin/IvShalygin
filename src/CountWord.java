import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        System.out.println("Введите предложение: ");
        Scanner N1=new Scanner(System.in);
        String a=N1.nextLine();

        System.out.println("Введите слово, которое будем искать в введенном предложении: ");
        Scanner N2=new Scanner(System.in);
        String b=N2.nextLine();

        a=a.trim();

        String a_copy=a;
        a=a.toLowerCase();
        b=b.toLowerCase();

        int i=0;
        int ind1;
        int lng_a=a.length();
        int lng_b=b.length();
        while (lng_a!=0){

            ind1 = a.indexOf(b);
            if (ind1==0) i++;

            if (ind1==-1) break;

            if (ind1!=0||ind1!=-1){
                i++;
                a=a.substring(ind1+lng_b, lng_a);
            }

            lng_a=a.length();
        }

        System.out.println("В введенном предложении -- " + a_copy + " искомое слово "+b +" употребляется "+i + " раз.");

    }


}
