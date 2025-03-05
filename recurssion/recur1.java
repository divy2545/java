package recurssion;

import java.sql.Array;
import java.util.*;

// class rec{
//     int i;
//     public void f(int i,int n){
//          if(i>n)
//          return;
//        System.out.println(i);  
//        f(i+1,n);
//     }
// }
// public class recur1 {
//     public static void main(String[] args){
//          rec obj= new rec();
//          obj.f(1, 9);
//     }
// }


//====================================================================================


// class rec{
//     int i;
//     public void f(int i,int n){
//          if(i<1)
//          return;
//        System.out.println(i);  
//        f(i-1,n);
//     }
// }
// public class recur1 {
//     public static void main(String[] args){
//          rec obj= new rec();
//          obj.f(13, 9);
//     }
// }

//====================================================================================

// 1 to n without using + operator

// class rec{
//     public void f(int i,int n){
//         if(i<1)
//         return;
//         f(i-1,n);
//         System.out.println(i);
//     }
// }
// public class recur1{
//     public static void main(String[] args) {
//         rec obj= new rec();
//         obj.f(12, 12);
//     }
// }

//===============================================================================

// calculate the sum using parameterised recursion


// class rec{
//     public void f(int i,int sum){
//         if(i<1){
//             System.out.println(sum);
//             return;
//         }
//         f(i-1,sum+i);
//     }
// }
// public class recur1{
//     public static void main(String[] args) {
//         rec obj= new rec();
//         System.out.println("enter the number:");
//         Scanner sc= new Scanner(System.in);
//         int i=sc.nextInt();
//         obj.f(i,0);
//     }
// }


//=======================================================================================

// calculate the sum of n numbers using functional recursion

// class test{
//     public int sum(int n){
//         if(n==0)
//           return 0;
//         return n+sum(n-1);  
//     }
// }
// public class recur1 {

//     public static void main(String[] args) {
//         test obj= new test();
//         System.out.println(obj.sum(12));
//     }
// }



//============================================================================

// factorial of n using functonal recurssion

// class test{
//     public int fact(int n){
//         if(n==0)
//           return 1;
//         return n*fact(n-1);  
//     }
// }
// public class recur1 {

//     public static void main(String[] args) {
//         test obj= new test();
//         System.out.println(obj.fact(4));
//     }
// }


//====================================================================================

//reverse an array

// class test{
//     public void reverse(int n){
//         int half=n/2;
//         swap(0,n-1);
//     }

    
// }

// public class recur1 {
//     public static void main(String[] args) {
        
//         System.out.println("enter the no. of elements : ");
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr= new int[n];
//         for(int i=0;i<n;i++){
//             int m=sc.nextInt();
//             arr[i]=m;
//         }
//         // for(int i=0;i<n;i++){
//         //     System.out.println(arr[i]);
//         // }
        
//     }
// }

//==============================================================================================

// class test{
//      int i=0;
//     public void reverse(int i,int n){
//         Collections.swap(arr, i, n-i-1);
//         reverse(i+1,n);
//     }

    
// }

// public class recur1 {
//     public static void main(String[] args) {
       
        // System.out.println("enter the no. of elements : ");
        // Scanner sc= new Scanner(System.in);
        // int n=sc.nextInt();
        // List<Integer> arr= new ArrayList<Integer>();
        // for(int i=0;i<n;i++){
        //     int m=sc.nextInt();
        //     arr.add(m);
        // }
//         test obj= new test();
//         obj.reverse(0,n);
//         System.out.println("reversed array: " + arr);
        
//     }
// }

//=============================================================================================

// public class recur1 {
//      static void rev(Integer a[]){
//           Collections.reverse(Arrays.asList(a));
//           System.out.println(Arrays.asList(a));
//      }
//     public static void main(String[] args) {
//         Integer[] arr= {1,2,3,4,5};
//         rev(arr);
//     }
// }


//==========================================================================================

// string is palindrome or not

// public class recur1 {
//     int i=0;
//     static boolean palindrome(int i, String s){
//             if(i>=s.length()/2){
//             return true;}
//             if(s.charAt(i)!=(s.charAt(s.length()-i-1)))
//             return false;
//             return palindrome(i+1, s);
//     }



//=========================================================================================
// Leetcode prb 125 - valid palindrome


// class Solution {
//     int i=0;
//     String str="";
//     String str2="";
//     public boolean isPalindrome(String s) {

//         if(i==0){
//             str2=s.toLowerCase();
//            for(int j=0;j<str2.length();j++){
//             if(str2.charAt(j)>=97 && str2.charAt(j)<=122)
//             str= str+str2.charAt(j);
//         }}
//         if(str=="")
//         return true;
//       if(i>str.length()/2)
//       return true;
//       if(str.charAt(i)!=str.charAt(str.length()-i-1))
//       return false;
//       else{
//         i++;
//       return isPalindrome(str);
//       }
//     }
//     public static void main(String[] args) {
//         Solution obj= new Solution();

//         System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
//     }
// }





// practice

// import java.util.*;

// public class recur1{
//         public static int linearSearch(int arr[],int key){
//           for(int i=0;i<arr.length;i++){
//                 if(arr[i]==key){
//                        return key;
//                 }
//           }
//           return -1;
//         }
// public static void main(String args[]){
//    int arr[]= {1,2,3,4,5,6,7,8,9};
//    int key=5;
//    int index=linearSearch(arr,key);
//    System.out.println("element found at index: "+ index);
// }
// }




// largest number in an array

// public class recur1{
//         public static void max(int arr[]){
//                 int max=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//                 if(arr[i]>max){
//                         max=arr[i];
//                 }
//         }
//         System.out.println("maximum element in array: " + max);
//         }
//         public static void main(String args[]){
//                 int arr[]={1,2,3,4,5,6,67,60};
//                 max(arr);
//         }
// }



//binary search

// public class recur1 {
//        public static int binarySearch(int arr[],int key){
//          int start=0, end=arr.length-1;
//          while(start<end){
//          int mid=(start+end)/2;
//          if(arr[mid] ==key){
//                 return mid;
//          }
//          else if(key> arr[mid]){
//                 start=mid+1;
//          }
//          else{
//                 end=mid-1;
//          }
//        }
//        return -1;
// }
//         public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7,8,9};
//         int key=7; 
//         int idx= binarySearch(arr,key);
//         if(idx==-1){
//                 System.out.println("not found");

//         }
//         else{
//                 System.out.println("key found at index: " + idx);
//         }
//         }
// }



// reverse an array



// public class recur1 {

//         public static void main(String[] args) {
//                 int arr[]={1,2,3,4,5};
//                 int newarr[]= new int[arr.length];
//                 int j=0;
//                 for(int i=arr.length-1; i>=0; i--){
//                    newarr[j]=arr[i];
//                    j++;
                    
//                 }
//                 for(int i=0;i<newarr.length;i++){
//                         System.out.println(newarr[i]);
//                 }
//         }
// }




// 


// class Solution {
//     public int longestSubarray(int[] arr, int k) {
        
//         int length=0;
//         int maxlength=0;
//         int left=0,right=left+1;
//         int sum=arr[left]+arr[right];
    
//         while(right<arr.length && left<right){
                
//                 if(sum==k){
//                    length=right-left+1;
//                    maxlength=Math.max(length,maxlength);
//                    right++;
//                    if(right<arr.length)
//                       sum+=arr[right];
//                 }
//                 else if(sum>k){
//                         sum-=arr[left];
//                         left++;
//                 }
//                 else{
//                     if(right<arr.length-1){
//                     right++;
//                     if(right<arr.length)
//                     sum+=arr[right];
//                     }
//                     else{
//                         left--;
//                         sum+=arr[left];
//                     }
//                 }
                
                
//             }
//             return maxlength;
//     }
// }


//==========================================================


// class Solution {
//         public int longestSubarray(int[] arr, int k) {
            
//             int length=0;
//             int maxlength=0;
//             int left=0,right=left+1;
//             int sum=arr[left]+arr[right];
        
//             while(right<arr.length && left<right){
                    
//                     if(sum==k){
//                        length=right-left+1;
//                        maxlength=Math.max(length,maxlength);
//                        right++;
//                        if(right<arr.length)
//                           sum+=arr[right];
//                     }
//                     else if(sum>k){
//                             sum-=arr[left];
//                             left++;
//                     }
//                     else{
//                         if(right<arr.length-1){
//                         right++;
//                         if(right<arr.length)
//                         sum+=arr[right];
//                         }
//                         else{
//                             left--;
//                             sum+=arr[left];
//                         }
//                     }
                    
                    
//                 }
//                 return maxlength;
//         }
//     }







//==============================================================================================================
//                                               STRING
//================================================================================================================

// public class recur1 {

//         public static void main(String[] args) {
//                 // String name="divyansh";
//                 // System.out.println(name);

//                 // String newname="divyansh";
//                 // System.out.println(name==newname);

//                 // String name1= new String("divyansh");
//                 // String name2= new String("divyansh");
//                 // System.out.println(name1==name2);
//                 // System.out.println(name1.equals(name2));

//                 String str= "Divyansh Yadav";
//                 String arr[]=str.split(" ");
//                 System.out.println( arr.toString());
//         }
// }


    

public class recur1 {
        private static void SayHi(int count){
                System.out.println("Hi!!");
                if(count<=1){
                        return;
                }

                SayHi(count-1);  //call stack memory

                
        }
        public static void main(String[] args) {
               
            SayHi(3);    
        }
}