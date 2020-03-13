import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        System.out.println("Будем искать полиндромы от 0 до N. Введите N: ");
        Scanner N=new Scanner(System.in);
        if(N.hasNextLong()){
            long pol=N.nextLong();
            int m=0;
            for(int j=0; j<pol;j++){
                String s_j=Long.toString(j);
                //String s_j_c=s_j;
                String s_j1="";
                char[] arr = s_j.toCharArray();
                for (int i = arr.length - 1; i >= 0; i--) {
                    s_j1=s_j1+arr[i];
                }
                if (s_j.equals(s_j1)){
                    System.out.println(" " + s_j );
                    m++;
                }
            }
            if(m!=0){
                System.out.print("В введенном интервале 0..." + pol + " "+m + "  полиндромов");
            }

        } else {
            String a=N.nextLine();
            System.out.println("Введенные данные -- " + a + " не являются требуемыми данными ввода");
        }
        N.close();
    }
}
