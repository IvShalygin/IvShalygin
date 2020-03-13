import java.util.Arrays;
import java.util.Scanner;

public class CountStringSort {

    public static String func_prep(String f_a, String f_chto){
        int f_lng=f_a.length();
        int ind1 = f_a.indexOf(f_chto);
        if (ind1==0){
            f_a=f_a.substring(ind1+1, f_lng);
        }
        return f_a;
    }

    public static void main(String[] args) {
        int kol_prob=0; int i=0;
        int kol_slov=0; int def_size=1000;
        int max_slov=0;
        String [] Slova= new String[def_size];
        int [] L_Slova=new int[def_size];
        System.out.println("Введите предложение. \nНаша задача: •\tподсчитывать количество слов в предложении\n" +
                "•\tвыводить их в отсортированном виде \n" +
                "•\tделать первую букву каждого слова заглавной. \n");
        Scanner N1=new Scanner(System.in);
        String a=N1.nextLine();
        a= a.trim();
        int lng=a.length();
        int lng1=lng;
        int ind1; String b="";String c="";
        while (lng1!=0){
            //a= a.trim();
            a=func_prep(a,".");
            a=func_prep(a,",");
            a=func_prep(a,":");
            a=func_prep(a,";");
            a=func_prep(a,"-");

           ind1 = a.indexOf(" ");
            if (ind1==-1){
                c=a.substring(0,1);
                Slova[i]=c.toUpperCase()+a.substring(1,a.length());
                L_Slova[i]=Slova[i].length();
                i++;
                break;
            }

            //a.getChars(ind1+1,lng1,a,0);
            if (ind1!=0){
                kol_prob++;

                c=a.substring(0,1);
                b=b+c.toUpperCase()+a.substring(1,ind1)+" ";

                Slova[i]=c.toUpperCase()+a.substring(1,ind1);
                L_Slova[i]=Slova[i].length();
                i++;
                a=a.substring(ind1+1, lng1);
                //if i>1000 then увеличить массив на 1000

            }
            else {
                a=a.trim();
            }
            lng1=a.length();
           // System.out.println(a+"\n");
        }
        //System.out.println("пробелов " + kol_prob);
        c=a.substring(0,1);
        b=b+c.toUpperCase()+a.substring(1,a.length());
        kol_slov=kol_prob+1;
        System.out.println("Слов " + kol_slov);
        System.out.println("Предложение с измененным регистром:  " + b);
        //System.out.println(Arrays.toString(Slova));//выводим отсортированный массив на экран
        Arrays.sort(Slova, 0, i-1); //сортируем весь массив от нулевого до четвёртого члена
        for (int g=0;g<=i-1;g++){
            if (Slova[g]!=null) {
                //System.out.println(Arrays.toString(Slova));//выводим отсортированный массив на экран
                System.out.print(Slova[g]+" ");
            }
        }



    }
}
