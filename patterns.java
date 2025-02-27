// ****
// ****
// ****
// ****

// public class patterns {
//     public static void main(String[] args){
//        for(int i=0;i<4;i++){
//         for(int j=0;j<4;j++){
//             System.out.print("*");
//         }
//          System.out.println();
//        }
//     }
// }




//=====================================================================================

// *
// **
// ***
// ****
// *****


// public class patterns{
//     public static void main(String[] args){
//         for(int i=0;i<5;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//====================================================================================

// 1
// 12
// 123
// 1234
// 12345

// public class patterns{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



//======================================================================================

// public class patterns{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }


//=====================================================================================

import java.util.*;

// public class patterns{
//       public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//       }
// }


//=====================================================================================


// public class patterns{
//     public static void main(String[] args){
//       Scanner sc=new Scanner(System.in);
//       int n= sc.nextInt();
//       for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i+1;j++){
//           System.out.print(j + " ");
//         }
//         System.out.println();
//       }
//     }
// }



//==================================================================================

// public class patterns{
//     public static void main(String args[] ){
//         System.out.println("enter the value of n:");
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
        
//     }
// }




//=======================================================================================

// public class patterns{
//     public static void main(String args[]){
//         System.out.println("enter the value of n:");
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*n-(2*i)+1;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }



//======================================================================================


// class p{
//     public void pattern1(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<n-i+1;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<n-i+1;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public void pattern2(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*n-(2*i)+1;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args){
//         System.out.println("enter the value of n:");
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         p obj= new p();
//         obj.pattern1(n);
//         obj.pattern2(n);
        
//     }
// }


//======================================================================================


// class p{
//     public void pattern1(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//           System.out.println();
//         }
//     }
//     public void pattern2(int m){
//         for(int i=1;i<=m;i++){
//             for(int j=1;j<=m-i+1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args){
//         System.out.println("enter the value of n:");
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         System.out.println("enter the value of m:");
//         Scanner sc2=new Scanner(System.in);
//         int m= sc.nextInt();
//         p obj= new p();
//         obj.pattern1(n);
//         obj.pattern2(m);
        
//     }
// }



//=================================================================================

// public class patterns{
//     public static void main(String args[]){
//         System.out.println("enter the value of n:");
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         int start=1;
//         for(int i=1;i<=n;i++){
//             if(i%2==0)
//               start=0;
//               else
//               start=1;
//             for(int j=1;j<=i;j++){
//                 System.out.print(start);
//                 start=1-start;
//             }
//             System.out.println();
//         }
//     }
// }



//======================================================================================

// public class patterns{
//     public static void main(String[] args){
//         System.out.println("enter the value of n");
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             for(int k=1;k<=2*(n-i);k++){
//                 System.out.print(" ");
//             }
//             for(int l=i;l>=1;l--){
//                 System.out.print(l);
//             }
//           System.out.println();
//         }
//     }
// }



//=======================================================================================

// public class patterns{
//     public static void main(String[] args){
//         int a=1;
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(a + " ");
//                 a++;
//             }
//             System.out.println();
//         }
//     }
// }



//=====================================================================================

// public class patterns{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(char j='A';j<'A'+i;j++){
//                 System.out.print( j+" ");
//             }
//             System.out.println();
//         }
//     }
// }



//=======================================================================================

// public class patterns{
//     public static void main(String[] args){
//         System.out.println("Enter the number of rows: ");
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(char j='A';j<=(char) (n+'A'-i);j++){
//                 System.out.print( j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//====================================================================================

// public class patterns{
//     public static void main(String[] args){
//         System.out.println("Enter the number of rows: ");
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(char j='A';j<('A'+i);j++){
//                 System.out.print( (char)('A'+i-1));
//             }
//             System.out.println();
//         }
//     }
// }



//=====================================================================================


// public class patterns{
//     public static void main(String[] args){
//         System.out.println("Enter the number of rows: ");
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int a=1;a<=4-i;a++){
//                 System.out.print(" ");
//             }
//             char j;
//             for( j='A';j<('A'+i);j++){
//                 System.out.print(j);
//             }
//             for(char k=(char)('A'+i-2);k>='A';k--){
//                 System.out.print(k);
//             }
//             for(int l=1;l<=4-i;l++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }


//=====================================================================================

// public class patterns{
//     public static void main(String[] args){
//         for(int i=0;i<=4;i++){
//             for(char j=(char)('E'-i);j<='E';j++){
//                  System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



// ==================================================================================

// public class patterns{
//     public static void main(String[] args){
//         for(int i=0;i<=4;i++){
//             for(){
//                  System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


