//import java.util.Arrays;
import java.util.Scanner;

public class Bags {
    public static void main(String[] args) {
        /*
        Так как в условии задачи не описано такие моменты, что вводится, какие имеенно параметры вещей,
        кроме факта, что у них есть две характеристики: вес, стоимость, то предположим, что пользователь программы
        вводит сам эти параметры, хотя это и очень утомительно.
         */
        Scanner input = new Scanner(System.in); // Объявляем Scanner для массива чисел
        System.out.println("Введите максимальный объем рюкзака M (это целое число) : ");
        Scanner M=new Scanner(System.in);
        if (M.hasNextInt()){
            int Col;
            int R=M.nextInt(); //R- масксимальная масса рюкзака
            System.out.println("Введите количество вещей K (это целое число) : ");
            Scanner K=new Scanner(System.in);
            if (K.hasNextInt()){
                Col=K.nextInt(); // Col -- количество вещей
                double [][] A=new double[3][Col]; // А [ценность][вес]
                System.out.println("Введите параметры вещей (это целые числа) :  Сначало первый ряд вводим ценность вещей в кол-ве "+Col);
                for(int i=0;i<3;i++){
                    for(int j=0;j<Col;j++){
                        if (i<2) {
                            A[i][j] = input.nextDouble();
                        }else {
                            A[i][j]=j+1;
                        }
                    }
                    if (i!=1) System.out.println(" Теперь их веса в том же количестве (это целые числа ). Если вы введете нулевой вес, будем считать, что вес очень маленький и заменим его на 0.001");
                }

              for(int i=0;i<3;i++){
                    for(int j=0;j<Col;j++){
                        System.out.print(" "+A[i][j] +"\t");
                    }
                    System.out.println();
                }
                double [] B=new double[Col];
                for(int j=0;j<Col;j++){
                    if (A[1][j]!=0){
                        B[j]=A[0][j]/A[1][j];
                    }else{
                        A[1][j]=0.001;
                        B[j]=A[0][j]/A[1][j];
                    }
                }
                //Arrays.sort(B,0,Col);
                //double tmp;
                for(int i = B.length-1 ; i > 0 ; i--){
                    for(int j = 0 ; j < i ; j++){

                     if( B[j] > B[j+1] ){
                         double tmp = B[j];
                         double tmp1=A[0][j];
                         double tmp2=A[1][j];
                         double tmp3=A[2][j];

                         B[j] = B[j+1];
                         A[0][j]=A[0][j+1];
                         A[1][j]=A[1][j+1];
                         A[2][j]=A[2][j+1];

                         A[0][j+1]=tmp1;
                         A[1][j+1]=tmp2;
                         A[2][j+1]=tmp3;
                         B[j+1] = tmp;

                     }
                    }
                }
                System.out.println("_____________________");

                for(int i=0;i<3;i++){
                    for(int j=0;j<Col;j++){
                        System.out.print(" "+A[i][j] +"\t");
                    }
                    System.out.println();
                }

               double tek=0; //вес складывамых вещей
                double tek1=0; //временный вес, защита от переполнения рюкзака
                double cen=0; // ценность складываемых вещей
                double cen1=0;
                int l=0; //индекс для доброса вещей

                for(int j=0;j<Col;j++) {
                    System.out.print(" "+B[j] +"\t");
                }
                System.out.println("\n");
                for(int j=0;j<Col;j++){
                    tek1=tek1+A[1][Col-j-1];
                    if (tek1 >R) {
                        l= Col-j-1;
                        break;
                    }

                    tek=tek+A[1][Col-j-1];
                    cen=cen+A[0][Col-j-1];
                    if(tek<R){
                        System.out.println("Складываем в рюкзак " +A[2][Col-j-1]+" -ю вещь");

                    }
                   //
                }
                for (int p=0;p<l;p++){
                    //tek1=tek1+A[1][j];
                    if (R-tek>A[1][l-p-1]) {
                        tek=tek+A[1][l-p-1];
                        System.out.println("Докладываем  в рюкзак " +A[2][l-p-1]+" -ю вещь");
                        cen=cen+A[0][l-p-1];
                    }

                }


                System.out.println("Рюкзак заполнен на " +tek+" из  " +R);
                System.out.println("При этом ценность вещей в нем составляет " +cen);

            }else {
                String a = M.nextLine();
                System.out.println("Введенные данные -- " + a + " не являются требуемыми данными ввода");
                K.close();
                //break;
            }




        }else {
            String a = M.nextLine();
            System.out.println("Введенные данные -- " + a + " не являются требуемыми данными ввода");
        }
        M.close();
    }
}
