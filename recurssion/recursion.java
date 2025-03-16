package recurssion;

//============================================================================================================
    //                                       RECURSION
    //============================================================================================================


// a function that calls itself is known as recurssion..



// public class recursion {
//         private static void SayHi(int count){
//                 System.out.println("Hi!!");
//                 if(count<=1){
//                         return;
//                 }

//                 SayHi(count-1);  //call stack memory

                
//         }
//         public static void main(String[] args) {
               
//             SayHi(3);    
//         }
// }






//====================  print numbers from 5 to 1 =============================================


// public class recursion {

//         public static void printnum(int n){
//                 if(n==0){
//                         return;
//                 }
//                 System.out.println(n);
//                 printnum(n-1);
//         }
//         public static void main(String[] args) {
//                 int n=5;
//             printnum(n);
//         }
// }



//=========================


// public class recursion {
//        public static void print(int n){
//         if(n==0){
//              return;
//         }
//         System.out.println(n);
//         print(n-1);
//        }
//         public static void main(String[] args) {
//                 Scanner sc= new Scanner(System.in);
//                 System.out.print("enter n : ");
//                 int n = sc.nextInt();
//                 print(n);
//         }
// }




//===========================================================================================
// public class recursion {
//          static int n;
//       public static void print(int x){
//           if(x>n){      // base case
//             return;
//           }
//         System.out.println(x);    // work
//         print(x+1); // call
                     
//       }
//         public static void main(String[] args) {
//                 Scanner sc= new Scanner(System.in);
//                 System.out.print("enter n : ");
//                 n = sc.nextInt();
//                 print(1);
//         }
// }




//========================== after recurive call==========================================

// public class recursion {
//         public static void print(int n){
//                 if(n==0) return;
//                 print(n-1);
//                 System.out.println(n);

//         }
//         public static void main(String[] args) {
//                 Scanner sc= new Scanner(System.in);
//                                 System.out.print("enter n : ");
//                                 int n = sc.nextInt();
//                                 print(n);  
//         }
// }




//==========================================================================================
// sum of 1 to n (parameterized)


// public class recursion {
//         public static void sum(int n,int s){
//          if(n==0){ 
//                 System.out.println(s);
//                 return;}   //base case
//           sum(n-1,s+n);
 
 
//         }
//          public static void main(String[] args) {
//                  sum(5,0);
                 
//          }
//  }
 
 

//================================================
//return type


// public class recursion {
//        public static int sum(int n){
//         if(n==0 || n==1) return n;   //base case
//         return n+sum(n-1);


//        }
//         public static void main(String[] args) {
//                 int s=sum(5);
//                 System.out.println(s);
//         }
// }




//===============================================================================
//================== n^p ========================================

// public class recursion {
//     public static int power(int n,int p, int ans){
//             if(p==0){
//                 return 1;
//             }
//             return n*power(n,p-1,ans);
//     }
//     public static void main(String[] args) {
//            System.out.println(power(2,5,0)); 
//     }
// }

// its time complexity is O(p)






//=======================================================================================================================
//                                    calculating power in logarithmic time complexity
//=====================================================================================================================

// public class recursion {
//     public static int pow(int n, int p){
//         if(p==0) return 1;
//         int ans= pow(n,p/2);
//         if(p%2==0) return ans * ans;
//         else return ans * ans * n;
//     }
//     public static void main(String[] args) {
//         System.out.println(pow(12,2));
//     }
// }

// time complexity - O(logp)




//==========================================================================================================================
//                             Multiple calls
//==========================================================================================================================



//============== find nth fibonacci term ===========================================

// public class recursion {
//     public static int fib(int n){
//         if(n<=1) return n;
//         return fib(n-1) + fib(n-2);
//     }
//     public static void main(String[] args) {
//         System.out.println(fib(8));
//     }
// }








//==========================================================================================================================
//                                            nth stair (stair path)
//==========================================================================================================================

//  public class recursion {
//     public static int stair(int n){
//         if(n<=2) return n;
//         return stair(n-1) + stair(n-2);
//     }
//     public static void main(String[] args) {
//         System.out.println(stair(3));
//     }
//  }



//========================================================================

//  public class recursion {
//     public static int stair(int n){
//         if(n) return n;
//         return stair(n-1) + stair(n-2);
//     }
//     public static void main(String[] args) {
//         System.out.println(stair(3));
//     }
//  }



//==========================================================================================================================
//                                     maze path (or rat in a maze)
//==========================================================================================================================


// public class recursion {
//    public static int maze(int row, int col, int m, int n){
     
//     if(row == m || col == n) return 1;

//     int rightWays = maze(row, col+1, m, n);
//     int downWays = maze(row+1, col, m, n);
//     return rightWays + downWays;
//    }
//     public static void main(String[] args) {
//         System.out.println(maze(1,1, 3,3));
//     }
// }











//==========================================================================================================================
//                                preInPost (zigzag)
//==========================================================================================================================

// public class recursion {
//    public static void pip(int n){
//     if(n==0) return;
//     System.out.print(n + " ");    // pre
//     pip(n-1);
//     System.out.print(n + " ");     // in
//     pip(n-1);                     
//     System.out.print(n + " ");       // post
//    }
//     public static void main(String[] args) {
//         pip(3);
//     }
// }




//==========================================================================================================================
//                          Array Traversal using recursion
//==========================================================================================================================


// public class recursion {
//     public static void print(int i, int[] arr){
//         if(i==arr.length) return;
//         System.out.print(arr[i] + " ");
//         print(i+1,arr);
//     }
//     public static void main(String[] args) {
//         int[] arr= {1,2,3,4,5,6,7,8,9,0};
//         print(0,arr);
//     }
// }





//==========================================================================================================================
//                             String traversal using recursion
//==========================================================================================================================


public class recursion {
    public static void print(int i, String s, String ans){
        if(i==s.length()){ 
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)!='a') ans+=s.charAt(i);
        print(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s = "Divyansh";
        print(0,s,"");
    }
}











//==========================================================================================================================
//
//==========================================================================================================================









//==========================================================================================================================
//
//==========================================================================================================================











//==========================================================================================================================
//
//==========================================================================================================================
















//==========================================================================================================================
//
//==========================================================================================================================














//==========================================================================================================================
//
//==========================================================================================================================
//
//==========================================================================================================================
//
//==========================================================================================================================


















