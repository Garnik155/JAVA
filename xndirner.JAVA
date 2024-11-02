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
 //taza zangvac
//        char [] x={'g','h','j','l','y'};
//        int index = 0;
//
//
//        for (int i = 0; i < x.length; i++) {
//
//                index++;
//                char [] y = new char [index];
//                y[index-1] = x[i];
//                System.out.println(x[i]);
//
//
//        }
//292
//      int []x={1,2,0,45,0,87,0,90,0};
//      int index=0;
//        for (int i = 0; i < x.length; i++) {
//            System.out.println(x[i]);
//            if (x[i]==0){
//                index+=3;
//                int []y=new int[index];
//                y[index-3]=x[i];
//                y[index-2]=0;
//                y[index-1]=0;
//                System.out.println(y[index-2]);
//                System.out.println(y[index-1]);
//        int [][] array = {
//                {2,3,4,5,6},
//                {4,6,23,5,60,8},
//                {5,7,5},
//                {2,3,4,5}
//        };
 //361
        int k=2;
        int count=0;
        int [][]a={
                {5,4,2,87,9,5},
                {8,7,9,85,1,125,0},
                {9,84,5,5,2,1,7,8},
                {9,78,1,22,255,5,23}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]%k==0){
                    count++;

                }
            }
        }
        System.out.print(count);
 //362
      //  int sum=0;
        //int count =0;
//int a[][]={
  //      {5,62,35,24,1,2,12,58,98,10},
    //    {14,21,36,96,65,20,12,35,47},
      //  {7,87,78,65,20,33,67,87,14,5},
        //{5,21,2,141,487,41,42,32,3659,1},
//};
  //      for (int i = 0; i <a.length ; i++) {
    //        for (int j = 0; j <a[i].length ; j++) {
//if (a[i][j]%5==0){
  //  sum+=a[i][j];
   // count++;
//}
  //          }
    //    }
      //  System.out.println(sum/count);
        //364
        //int sum=0;
        //int count=0;
        //int a[][]={{5,62,35,24,1,2,12,58,98,10},
              //     {14,21,36,96,65,20,12,35,47},
            //      {7,87,78,65,20,33,67,87,14,5},
          //      {5,21,2,141,487,41,42,32,3659,1},
        //};
        //for (int i = 0; i <a.length ; i++) {
            //for (int j = 0; j <a[i].length ; j++) {
                //if(a[i][j]%2!=0){
                //    sum+=a[i][j];
              //      count++;
            //    }
          //  }
        //}
      //  System.out.println(sum/count);
        //365
      //  int count=0;
       // int a[][]={
         //       {5,62,35,24,1,2,12,58,98,10},
           //         {14,21,36,96,65,20,12,35,47},
             //     {7,87,78,65,20,33,67,87,14,5},
               // {5,21,2,141,487,41,42,32,3659,1},
       // };
        //for (int i = 0; i <a.length ; i++) {
          //  for (int j = 0; j <a[i].length ; j++) {
            //    if (a[i][j]%2==0){
              //      count++;
               // }
            //}
       // }
        //System.out.println(count);
        //367
        //int k =7;
        //int sum=1;
        //int a[][]={
                //{5,62,35,24,1,2,12,58,98,10},
              //  {14,21,36,96,65,20,12,35,47},
            //    {7,87,78,65,20,33,67,87,14,5},
          //      {5,21,2,141,487,41,42,32,3659,1}
        //};
       // for (int i = 0; i <a.length ; i++) {
            //for (int j = 0; j <a[i].length ; j++) {
               // if (a[i][j]%k==0){
              //      sum*=a[i][j];
            //    }
          //  }
        //}

        //System.out.println(sum);
        //368
        //int count=0;
        //int a[][]={
               // {5,62,35,24,1,2,12,58,98,10},
              //  {14,21,36,96,65,20,12,35,47},
            //    {7,87,78,65,20,33,67,87,14,5},
          //      {5,21,2,141,487,41,42,0,32,3659,1}
        //};
        //for (int i = 0; i <a.length ; i++) {
            //for (int j = 0; j <a[i].length ; j++) {
              //  if (a[i][j]==0){
             //       count++;
           //     }
         //   }
       // }
     //   System.out.println(count);
        //369
        //int count =0;
        //int a[][]={
               // {5,62,35,24,1,2,12,58,98,10},
              //      {14,21,36,96,65,20,12,35,47},
            //      {7,87,78,65,20,33,67,87,14,5},
          //      {5,21,2,141,487,41,42,32,3659,1}
        //};
        //for (int i = 0; i <a.length ; i++) {
            //for (int j = 0; j <a[i].length ; j++) {
               // if (a[i][j]%5==2){
             //       count++;
           //     }
         //   }
       // }
     //   System.out.println(count);
        //371
        int count=0;
        int a[][]={
                {5,62,35,24,1,2,12,58,98,10},
                {14,21,36,96,65,20,12,35,47},
                {7,87,78,65,20,33,67,87,14,5},
                {5,21,2,141,487,41,42,32,3659,1}
        };
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
            if ((i+j)%2!=0){
                    count++;
                }
            }
        }
        System.out.println(count);
        
