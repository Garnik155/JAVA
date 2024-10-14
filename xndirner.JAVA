//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//225
//        int []x={2,4,6};
//        int []y={1,2,3};
//        int sumX=0;
//        for (int i = 0; i < x.length; i++) {
//            sumX += x[i];
//
//        }
//        int producty=1;
//        for (int i = 0; i < y.length; i++) {
//            producty*=y[i];
//        }
//        System.out.println(sumX);
//        System.out.println(producty);
//        System.out.println(sumX/producty);
//        //226
        int []x={2,4,6,5,7,16};
        int []y={1,2,3,21,14,52};
        int sumx=0;
        int sumy=0;
        for (int i = 0; i < x.length; i++) {
            if (x[i]%2!=0){
                sumx+=x[i];
            }
            for (int j = 0; j < y.length; j++) {
                if (y[i]%2==0){
                    sumy+=y[i];
                }
                
            }
        }
        System.out.println(sumx-sumy);
    }
}
