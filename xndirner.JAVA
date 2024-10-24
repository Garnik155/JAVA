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


        //227
//        int []x={1,25,65,71,21};
//        int []y={3,65,1,23,2};
//        int sumx=0;
//        int sumy=0;
//        for (int i = 0; i < x.length; i++) {
//            if (x[i]%7==0){
//                sumx+=x[i];
//            }
//        }
//        for (int i = 0; i < y.length; i++) {
//            if (y[i]%7==0){
//                sumy+=y[i];
//            }
//        }
//        System.out.println(sumx+sumy);
        //228
//        int []x={25,3,65,12,8,7};
//        int []y={6,36,21,41,4};
//        int k=5;
//        int count=0;
//        for (int i = 0; i < x.length; i++) {
//            if (x[i]%k==0){
//                count++;
//            }
//        }
//        for (int i = 0; i < y.length; i++) {
//            if (y[i]%k==0){
//                count++;
//            }
//        }
//        System.out.println(count);
       
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//186
//        System.out.println(count);
//        int []x={25,3,65,12,8,7,-5,-15};
//        int k=15;
//        int count=0;
//        for (int i = 0; i < x.length; i++) {
//           if (x[i]<0){
//               x[i]*=-1;
//           }
//        }
//        for (int i = 0; i < x.length; i++) {
//            if (x[i]<k){
//                count++;
//            }
//        }
//            System.out.println(count);
        //189
//        int []x={25,3,65,12,8,7};
//        int sum=1;
//        for (int i = 0; i < x.length; i++) {
//            if (x[i]-i>0){
//                sum*=x[i];
//            }
//        }
//        System.out.println(sum);
        //209
//       int []x={25,3,65,12,8,7,-4,-15};
//       int k=14;
//      int count=0;
//       for (int i = 0; i < x.length; i++) {
//            if ((x[i])<0){
//               x[i]*=-1+i;
//           }
//       }
//       for (int i = 0; i < x.length; i++) {
//          if (x[i]-i>k){
//               count++;
//           }
//       }
//       System.out.println(count);
//        //210
       int []x={25,3,65,12,8,7};
        int sum =1;
       for (int i = 0; i < x.length; i++) {
           if ((x[i]*i)%3==2){
            sum*=(x[i]*x[i]);
            }
      }
      System.out.println(sum);
        }
    }

    }
}
