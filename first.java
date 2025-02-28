// Syntex of java Boilerplate code-
// public class basicJava { 
// public static void main(String args[]) {     /*1. Modifiers
              // public: Ye access modifier hai. Iska matlab hai ki main method ko kisi bhi class se access kiya ja sakta hai.
              //  Ye zaroori hai, kyunki JVM ko main method ko access karna hota hai.

               // static: Ye keyword batata hai ki main method ko bina kisi object ke call kiya ja sakta hai. 
               // Iska matlab hai ki aap MyClass.main(args) ke through is method ko call kar sakte hain bina MyClass ka instance banaye.

               // 2. Return Type
               // void: Ye return type batata hai ki main method koi value return nahi karta.
               //  Iska matlab hai ki ye sirf program ko execute karta hai, lekin koi value wapas nahi karta.
               // 3. Method Name
               // main: Ye method ka naam hai. Java mein main method ka naam fixed hai, aur ye aapko is naam ko change nahi karna chahiye, kyunki JVM is method ko hi dhundta hai.
                  // 4. Parameters

               // String[] args: Ye parameter command-line arguments ko represent karta hai. 
               // Ye ek array hai jo strings ko store karta hai. Jab aap Java program ko command line se run karte hain, to aap kuch arguments de sakte hain, jo args array mein store hote hai
               // }
// }; 



//hello world -
// public class javaBasic {
//     public static void main (String args[]) {
//         System.out.print("Hello world");
//     }
// }

//pattern -
//  public class javaBasic {
//     public static void main (String args[]) {
//         System.out.println("* * * *");
//         System.out.println("* * * ");
//         System.out.println("* *");
//         System.out.println("*");
//     }
// }


//input-
// import java.util.Scanner;
// public  class javaBasic {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();           /*next() -reads the next token(matlab sirf space ke pahle wali value bus) from the input and returns it as a string only first sentence
//                                                    nextLine() -reads the entire line from the input and returns it as a string
//                                                    nextInt() -reads the next token from the input and returns it as an integer
//                                                    nextDouble() -reads the next token from the input and returns it as a double
//                                                    nextByte() -reads the next token from the input and returns it as a byte
//                                                    nextShort() -reads the next token from the input and returns it as a short
//                                                    nextLong() -reads the next token from the input and returns it as a long
//                                                    nextFloat() -reads the next token from the input and returns it as a float
//                                                    nextBoolean() -reads the next token from the input and returns it as a boolean

//                                                    */
//         System.out.println(input);
                                                     
//     }
// }


// product of two numbers -
// import java.util.Scanner;
// public class javaBasic {
//     public static void main (String args[]) {
//         Scanner sc= new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int product = a*b;
//         System.out.println(product);
//     }
// }



//Function
// public class javaBasic {
//     public static void proDuct(int a, int b) {
//         int product = a*b;
//         System.out.print(product);
//     }
//     public static void main (String args[]) {
//     proDuct(5,6);
    
       
//     }
       
//}


//factorial-

// import java.util.Scanner;
//  public class javaBasic {
//     public static void/*int*/ fact(int n){          /*hum yaha per i=n-1 liya hai kyuki pahle hum n-1 ko n se multiply karwayenge
//                                               aur phir n-1 ko n-2 se multiply karwayenge         
//                                               .condition me i>0 matlab n ka last me 1 se multiply ho sake  */                                               
        
//         for(int i=n-1;i>0;i--) {
//          n=n*i;
//         }
//         System.out.println(n);
//         //  return n;
//     }
 
//  public static void main (String args[]) {
//     Scanner sc = new Scanner(System.in);
    
//     int n = sc.nextInt();
//     fact(n);                         /*void function ko call karna hai to hum function name likhna hai bus usko 
//                                      usko print karane ka kaam function ke andar hi hojata hai 
//                                      .-aur agar int function hai to wo value return karke dega jo fact() me store hogi 
//                                      us value ko print karane ke liye main fuction me S.o.p(fact) likhna padega*/                   
   
//     // System.out.println(fact);
//  }
//  }



 //binomial-
//  import java.util.Scanner;
//  public class javaBasic {
//     public static int fact(int n){        
//         for(int i=n-1;i>0;i--) {
//          n=n*i;
//         }
       
//          return n;
//     }
//     public static void binomial(int n,int r){
       
//         int N= fact(n);
//         int R=fact(r);
//         int ncr=fact(n-r);
//         int ans=(N/(R*ncr));
//         System.out.println(ans);
//     }
//     public static void main(String args[]) {
//         binomial(5,2);

//     }
//  }
 


 
 //Overloading-
 
//  public class javaBasic {
//     public static int sum(int A,int B) {
//        int sum=A+B;
//         return sum;
//     }
//     public static int sum(int A,int B,int C) {
//         int summ=A+B+C;
//         return summ;
//     }
//     public static void sum(float A,float B) {
//         System.out.println("sum of two void is "+(A+B));
//     }
//     public static void main(String args[]) {
//         System.out.println(sum(10,20));
//         System.out.println(sum(10,20,30));
//         sum(10.6f,20.78f);          //agar hum f na lagayenge to compiler usko double ki tarah hi consider karega
  
//     }
//  }


//prime number by function+
// public class javaBasic {
//     public static boolean isPrime(int n) {      ryturn type boolean hai to function type bhi boolean hi hoga 
//            boolean isprimee= true;
//         for(int i=2;i<n;i++){
//             if(n%i==0){
//          isprimee=false;
//             return isprimee;                 //return likhna jaruri hai
//         }
//         }
//         return isprimee;
//     }
//     public static void main(String args[]) {
//         System.out.println(isPrime(9));
//     }
// }



//Optimize code(second mathod)-   
// import java.util.Scanner;

// public class primeNumberChecker {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         if (isPrime(number)) {
//             System.out.println(number + " is a prime number.");
//         } else {
//             System.out.println(number + " is not a prime number.");
//         }

//         scanner.close();
//     }

//     public static boolean isPrime(int num) {
//         if (num <= 1) {
//             return false; // 0 and 1 are not prime numbers
//         }
//         for (int i = 2; i <= Math.sqrt(num); i++) {            //math.sqrt hume root of num print kara ke 
//                                                                 // jisse code optimije hoga (2*4=4*2) isse bachayega time waste karne me 
//             if (num % i == 0) {
//                 return false; // Found a divisor, not prime
//             }
//         }
//         return true; // No divisors found, is prime
//     }
//}
 
 //series of prime number
//  import java.util.Scanner;
//  public class PrimeSeries {
//     public static void getPrimeSeries(int n) {         //jis function me multiple values print karani hai to 
//                                                     //void function ko call karna hai   
//         for(int i=2;i<=n;i++){
//             if(isPrime(i)){
//                 System.out.print(i+" ");
//             }

//         }
        
       
//     }  

//     public static boolean isPrime(int n) {
//            boolean isprimee= true;
//         for(int i=2;i<n;i++){
//             if(n%i==0){
//          isprimee=false;
//          return isprimee ;              //return likhna jaruri hai
//         }
//         }
//         return isprimee;
//     }

//     public static void main(String[] args) {
//         Scanner sc= new Scanner (System.in);
//         int n= sc.nextInt();
//         getPrimeSeries(n);

        
//  }
//  }


// binary to decimal-
// import java.util.Scanner;
// public class binaryToDecimal {
//     public static void conversion(int num) {
//         int decimal=0;                        // for geting a int value from variable to number-swap wala logic hi lagega
//         int i=0;
//         while(num>0){
//             int lDig=num%10;
//             decimal = decimal + (lDig)*(int)Math.pow(2,i);     //Math.pow(a,b) function hai jo batata hai ki a ki power b hai 
//                                                                 //per ye double value return karta hai isko int me change karne ke liye (int) likhna hai
//             num=num/10;
//             i++;


//         }
//         System.out.print(decimal);
//         }
    
    
//     public static void main(String[] args) {
//         Scanner sc= new Scanner (System.in);
//         int num= sc.nextInt();
//         conversion(num);
//     }
// }


//decimal to binary



// Pattern :-

// /*holo ractangle pattern
// *****   --row
// *   *
// *   *     
// *****
// collom^
// */
// public class basicJava {
//     public static void pattern(int totRow, int totColm) {
//         for(int i=1; i<=totRow; i++) {
//             for(int j=1; j<=totColm; j++) {
//                 if(i ==1 || i== totRow || j==1 || j== totColm) {       //(i,j) ,where stand for row and j stand for column
//                     System.out.print("*");
//         }
//         else {
//             System.out.print(" ");
//         }
//             }
//             System.out.println();
//         }
//     }


//     public static void main(String[] args) {
//         pattern(4, 5);
//     }
// }


//inverted half pyramid:-
/*
   *   stage of row == number of stars
  **    number of collom-stage of row ==  number of spaces
 ***       
****
*/
// public class basicJava {
//     public static void pattern(int totRow , int totColm) {
//         for(int i=1; i<=totRow; i++) {
//             for(int j=1; j<=totColm-i; j++) {
//                System.out.print(" ");   //for print spaces
//             }
//             for(int j=1; j<=i; j++) {    //for print *
//                 System.out.print("*");
//         }
//         System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         pattern(4 , 4);

//     }
// }


//// integer number print in the place of stats
// public class basicJava {
//     public static void pattern(int totRow , int totColm) {
//         for(int i=1; i<=totRow; i++) {
//             int temp=1;
//             for(int j=1; j<=totColm-i; j++) {
//                System.out.print(" ");   //for print spaces
//             }
//             for(int j=1; j<=i; j++) {    //for print *
//                 System.out.print(temp);
//                 temp++;
//         }
//         System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         pattern(4 , 4);

//     }
// }



// //binary tryangle:-
// /*
// 1
// 01
// 101
// 0101     logic- row +collom=even, print 1;
// 10101           row +collom=odd , print 0;
// */
// public class basicJava {
//     public static void pattern(int totRow , int totColm) {
//         for(int i=1; i<=totRow; i++) {
//             for(int j=1; j<=i; j++) {
//             if((i+j)%2==0) {
//                 System.out.print("1");
//                 }
//                 else {
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();

//         }
//     }

//     public static void main(String args[]) {
//         pattern(5 , 5);
//     }
// }




//IMP-Butterfly Pattern-
/*
*      *
**    **            space=2*(n-row)
***  ***
********
********
***  ***
**    **
*      *
*/
// public class basicJava {
//     public static void pattern(int n) {
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++) {                //for print first four rows
//                 System.out.print("*");
//             }
//             for(int j=1; j<=2*(n-i); j++){        
//                 System.out.print(" ");             //for print spaces bitween stars
//             }
//             for(int j=1; j<=i; j++) {          
//                 System.out.print("*");
//             }
//             System.out.println();
//             }
//          for(int i=1; i<=n; i++){          //for print remaining four rows
//             for(int j=i; j<=n; j++) {
//                 System.out.print("*");   
//             }
//             for(int j=3; j<=2*i; j++) {            //for print spaces bitween stars
//                 System.out.print(" ");
//             }
//             for(int j=i; j<=n; j++) {
//                 System.out.print("*");   
//             }
//           System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         pattern(4);
//     }

// }
  




// //Solid rhombus pattern:-
// /*
//     *|****
//    **|***
//   ***|**   //logic- devide then create code for first half then second half recursively
//  ****|*
// *****
// */
// public class basicJava {
//     public static void pattern(int n) {
//         for(int i=1; i<=n;i++) {
//             for(int j=1;j<=(n-i);j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++) {         //j ki initial value aur condition me jitna likha hai(n) uske bich ka difference jitna hoga utne star print honge.
//                 System.out.print("*");
//             }
//             for(int j=i+1;j<=n;j++) {     
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         pattern(5);
//     }
// }



// //hollow rectangle:-
// /*
//     ****
//    *  *
//   *  *
//  **** 
// */
// public class basicJava {
//     public static void pattern(int n) {
//         for(int i=1; i<=n;i++) {
//             for(int j=i;j<=n;j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++) {
//                 if( i==1 || i==n || j==1 || j==n) {     /*yaha per i matlab first and last row ki baat ho rahi hai aur j matlab first
//                                                     and last column ki baat ho rahi hai per humne pahle hi spaces ko print karwa liya hai to j inclined print hoga */
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");      //it is complesory
//                 }

//         }
//         System.out.println();
//     }
//     }
//     public static void main(String args[]) {
//         pattern(4);
//     }
// }




// // dimond problem:-
// /*
//    *
//   **|*
//  ***|**
// ****|***     //we devide it into 4 parts and print seperatly (ye humne apni understaning ke liye bus devide kiya hai)
// ----------
// ****|***
//  ***|**
//   **|*
//    *
// */
// public class basicJava {
//     public static void pattern(int n) {
//         for(int i=1; i<=n; i++){
//             for(int j=i; j<=n; j++){   //for print spaces
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++) {
//             System.out.print("*");
//         }
//         for(int j=1;j<=i-1;j++) {
//             System.out.print("*");    //for print second half
//         }
//         System.out.println();
//     }
//     for(int i=n; i>=1; i--) {       //logic-agar kisi pattern ki mirror image banana hai to hum outer loop ko bus ulta karke likhte hai aur inner loop ko same rakh dete hai
//            for(int j=i; j<=n; j++){   //for print spaces
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++) {
//             System.out.print("*");
//         }
//         for(int j=1;j<=i-1;j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     } 
//     }
//     public static void main(String args[]) {
//         pattern(5);
//     }
// }


// //Array:-
// //1. Array is a collection of elements of the same data type stored in contiguous memory locations
// //wrong code findout mistake-
// import java.util.*; 
// public class ArrayCreate {
//     public static void main(String args[]) {
//         int[] arr = new arr[5]; //create an array of 5 elements
        
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter values");
//         arr[0] = sc.nextInt();
//         arr[1] -= sc.nextInt();
//         arr[2] = sc.nextInt();
//         arr[3] = sc.nextInt();
//            System.out.println("Physics : "+arr[0]);
//             System.out.println("Chemistry : "+arr[1]);
//             System.out.println("Bio : "+arr[2]);
//             System.out.println("English : "+arr[3]);
//     }
// }
 


// //correct code:-
// import java.util.*; 

// public class ArrayCreate {
//     public static void main(String args[]) {
//         int[] arr = new int[50]; // Corrected array declaration
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter values for Physics, Chemistry, Bio, and English: ");
        
//         // Input values
//         for (int i = 0; i < 4; i++) {
//             arr[i] = sc.nextInt();

//         }
        
//         // Output values
//         System.out.println("Physics : " + arr[0]);
//         System.out.println("Chemistry : " + arr[1]);
//         System.out.println("Bio : " + arr[2]);
//         System.out.println("English : " + arr[3]);
        
//         sc.close(); // Close the scanner
//     }
// }





// //Array argument passing:-
// import java.util.*;
// public class  first {     //jab jab compile karke run karenge tab tab file name and class name same hona chahiye
//    public static void Update(int arr[]) {    //int sirf argument passing bus me lagega
//      for(int i=0; i<arr.length; i++){          // <= nahi use karna 
//      arr[i]=arr[i]+1;
//      //System.out.println("Array after passing :"+ arr[i]);
//      }
//    }
//    public static void main(String args[]) {
//       int arrr[] = {11,21,31,41};
//       Update(arrr);
        
//       for(int i=0; i<arrr.length; i++){
//          System.out.println("Array after passing :"+ arrr[i]);
//    }
// }
// }

 //linear search-
//  import java.util.*;
//  public class basicJava {
// public static int search(int arr[], int key) {   //dubara bhi datatype lagana hoga(int) kyuki ye  arr[] aur key ak naye hi variables hai!
//    for(int i=0; i<arr.length; i++ ) {
//       if(arr[i] ==key) {
//          return i;
//       }

//    }
//        return -1;        //is return ko statement ko function ke closing bracket ke just pahle likhna hai
// }
      
//    public static void main(String args[]) {
//       int arr[] = {2,6,4,8,45,74,7,9};
//       int key= 7;
//       int index = search(arr,key);   //sirf array ka name bus likhna padta hai argument me 
//       if (index==-1) {
//          System.out.println("Invalid String");
//       }
//       else {
   //     System.out.println("THE ELEMENT IS FOUND AT INDEX "+index);
   //    }  
   //    }

   // }

//by the help of input method  
   // import java.util.*;
   // public class basicJava {
   //    public static int rch(int arr[], int key) {
   //       for(int i=0; i<arr.length; i++) {
   //          if(key==arr[i]) {
   //            /=9999
// System.out.println("index number of key is"+ i);
   //             return 0;
   //          }
   //       }
   //       return -1;
   //    }
   
   //    public static void main(String args[]) {
   //       int[] arr= {2,64,9,3,7,5,6,354,53};
   //       Scanner sc = new Scanner(System.in);
   //       System.out.println("Enter the key");
   //       int key = sc.nextInt();


   //    int index = rch(arr,key);
   //    if(index ==-1) {
   //       System.out.println("key is not found");
   //    }
   // }
   // }
 

//  //largest number in array
//  import java.util.*;
//  public class basicJava {
//    public static int largest(int arr[],int max) {      
//       for(int i=0; i<arr.length; i++) {
//          if(max < arr[i]) {
//             max = arr[i];

//       }

//    }
//       return max;   
//    }
//   public static void main(String args[]) {
//       int[] arr= {8448392,5,33,75,46,1};
//       int max = arr[0];
//       //or
//       // int max = Integer.MIN_VALUE;   //Integer.MIN_VALUE is the smallest possible integer value in Java(-infinity);
//                                         // Integer.MAX_VALUE is the largest possible integer value in Java(infinity);
//       int index = largest(arr,max);
//       System.out.println("largest number is "+ index);
      
//    }
   
//  }
 
// Binery Search-
// Incorrect code:
// :array.lenth is a total number of elements in array so last index will be - array.length-1;
// import java.util.*;
// public class basicJava {
//    public static int binerySearch(int arr[],int key) {
//       while(arr[0]<arr[arr.length-1]) {  // ye loop tab tak chalega jab tak key mid se match na kar jaye 
//          int start = 0;
//          int end = arr.length-1;
//       int[] mid = (start+end)/2;
//       if(mid[]==key[]){
//          return mid;
//       }
//       else if(mid[]>=arr[key]) {
//          end = mid-1;
//          }
//          else {
//             start = mid+1;
//          }
//       }
//       return  -1;      // ye statement tab likhte hai jab key array me nahi hai(invalid case ke liye )
//       }

//    public static void main(String args[]) {
//       int[] arr ={1,2,3,4,5,6,8,9,14,18,24,27,34,37};
//       int key = 18;
//       int index = binerySearch(arr,key);
//       if (index==-1) {
//          System.out.println("key is not found");
//       }
//       System.out.println("index of key is "+index);

//    }
// }


// // correct code-
// import java.util.*;
// public class basicJava {
//    public static int binerySearch(int arr[],int key) {
//          int start = 0;
//          int end = arr.length - 1;   //INKO BAHAR HI initialije karna hai!
//       while(start <= end)  {  // ye loop tab tak chalega jab tak key mid se match na kar jaye 
//       int mid = (start + end)/2;   //mid is like middile value ka index number 
//       if(arr[mid] == key) {
//          return mid;
//       }
//       else if(arr[mid] >= key) {
//          end = mid - 1;
//          }
//          else {
//             start = mid +1;
//          }
//       }

//       return  -1;      // ye statement tab likhte hai jab key array me nahi hai(invalid case ke liye )
//       }

//    public static void main(String args[]) {
//       int[] arr ={1,2,3,4,5,6,8,9,14,18,24,27,34,37};
//       int key = 18;
//       int index = binerySearch(arr,key);
//       if (index == -1) {
//          System.out.println("key is not found");
//       }
//       System.out.println("index of key is "+index);

//    }
// }
 





//  Uses of int return mathod & void mathod in java - return type mathod ka use tab karte hai jab kisi array ki help se nayi value return karna hai
//  void mathod ka use tab karte hai jab kisi array ko modify karke dubara usi ko print karna ho 

// import java.util.*;
// public class basicjava  {
//    public static  void reverse(int arr[]) {
//       int first = 0;
//       int last = arr.length - 1;
//       while (first < last) {
//          int temp = arr[first];
//          arr[first] = arr[last];
//          arr[last] = temp;
//          first++;
//          last--;
//       }
   
//    }

//    public static void main (String args[]) {
//       int[] arr = {2,4,6,8,10,12,14,16,18};
//       reverse(arr);                    //jo changes humne is array me function ke through ki hai wo updation automatic is array me ho jayega 

//       for (int i = 0; i < arr.length; i++) {
//          System.out.print(arr[i] + " ");
//       }      

//    }
// }

// // print pair of array elements-(using nested loop concept)
// import java.util.*;
// public class basicJava {
//    public static void pairs(int arr[]) {
//       int first = 0;
//       int last = arr.length;
//       for(int i=first; i<last; i++) {
//          for(int j=i+1; j<last; j++) {      // j depend i per karega
//             System.out.print("("+ arr[i]+", "+arr[j]+") ");
//          }
      
//    }
// }
//    public static void main(String args[]) {
//       int[] arr =  {2,4,6,8,10,12,14,16,18};
//       pairs(arr);
   


//    }
// }


// // print Subarray of anny array-
// //Importent-
// import java.util.*;
// public class basicJava {
//    public static void subarray(int arr[]) {
//       for(int i= 0; i<arr.length; i++) {
//          for (int j=i; j<arr.length; j++) {
//             System.out.println();
//             int sum = 0;
//             for(int k=i; k<=j; k++) {
//                System.out.print(" "+ arr[k] + " ");
//                sum += arr[k];
//          }
//                System.out.println(" ,their sum :" +sum);
//       }
//    }
//    }
//    public static void main (String args[]) {
//       int[] arr = {2,4,6,8,10};
//       subarray(arr);

//    }
// }


//For maximum sum of subarray
// #Brute Force-(but their time complexity is O(n^3) which is bad)
// import java.util.*;
// public class basicJava {  
//    public static void subarray(int arr[]) {
//       int maxSum = Integer.MIN_VALUE;            // value is -infinity
      
//       for(int i= 0; i<arr.length; i++) {
//          for (int j=i; j<arr.length; j++) {
//             System.out.println();
//             int sum = 0;
//             for(int k=i; k<=j; k++) {
//                System.out.print(" "+ arr[k] + " ");
//                sum += arr[k];
//              }
//              if(maxSum<sum) {
//                maxSum = sum;

//              }

//                System.out.println(" ,their sum :" +sum);
//       }
//    }
//       System.out.println(maxSum );           
//    }
//    public static void main (String args[]) {
//       int[] arr = {2,4,6,8,10};
//       subarray(arr);

      

//    }
// }


// //For maximum sum of subarray 
// // by prefix sum-
// import java.util.*;
// public class javaBasic {
//    public static void subarray(int arr[]) {
//          int prearr[] = new int[arr.length];
//           int prefix = 0; 
//       for(int i=0; i<arr.length; i++) {
//          prefix= prefix + arr[i];
//          prearr[i]= prefix;
//       }
//       int maxSum = Integer.MIN_VALUE;
//       int sum = 0;
//      for(int i= 0; i<arr.length; i++) {    //start  element
//          for (int j=i; j<arr.length; j++) {   //end element
//            for(int k=i; k<=j; k++) {
//             System.out.print(" "+ arr[k] + " ");        
//            }
//             sum = i==0 ? prearr[j] : prearr[j]-prearr[i-1];    //impprtent (ye kisi bhi do element ke biche ke sare element ko joodi hai) 
//             System.out.println(" ,their sum is :"+sum);
//             if(maxSum <sum) {
//                maxSum = sum;
//             }
          

//       }
//    }
//       System.out.println("So, the overall maximum sum of subarray is :"+maxSum);

//    }
//    public static void main(String args[]) {
//       int[] arr= {2,-9,5,-2,-1};
//       subarray(arr);


//    }
// }






// // Trapping Rain Water problem-
// import java.util.*;
// public class javaBasic {
//    public static void trapWater(int arr[]) {
//       // creating a copy of array and storing the max element on left side
//       int[] leftbar = new int[arr.length];
//       leftbar[0] = arr[0];
//       for(int i=1; i<arr.length; i++) {
//          leftbar[i]= Math.max(arr[i], leftbar[i-1]);
//       }
//       // creating a copy of array and storing the max element on right side
//       int[] rightbar = new int[arr.length];
//       rightbar[arr.length-1] = arr[arr.length-1];
//       for(int j=arr.length-2; j>=0; j--) {
//          rightbar[j]= Math.max(rightbar[arr.length-1], arr[j]);
//       }
//       // now we have two array, leftbar and rightbar!
//       // now we will iterate over the array and find the minimum of leftbar and rightbar
//       // and subtract the element from it, and add it to the sum
//       int sum=0;
//       for(int i=0; i<arr.length; i++) {
//          int capacity= Math.min(leftbar[i], rightbar[i])-arr[i];    //if width is define in question then you have to multiply it with capacity
//          sum += capacity;
//       }
//       System.out.println("So, the overall water trapped is :"+sum);

     


//    }
//    public static void main(String args[]) {
//       int[] arr = {8,2,0,6,3,2,5};     //Higth of each bar
//       trapWater(arr);
//    }
// }


// // Stock exchanging problem-
// import java.util.*;
// public class basicJava {
//    public static int maxProfit(int[] prices) {
//       int buypric = Integer.MAX_VALUE;
//       int maxProfit = 0;
//       int profit =0;
//       for(int i=0; i<prices.length; i++) {
//          if(buypric < prices[i] ) {
//            profit = prices[i]-buypric;
//            maxProfit = Math.max(profit , maxProfit);
      
//          }
//          else {
//             buypric = prices[i];
//          }
         
//       }
//       return maxProfit;
//    }
//    public static void main(String args[]) {
//       int[] prices = {7,6,4,3,1}; // prices
//       int index =maxProfit(prices);
//       System.out.print("maximum profite is equel to :" +index); 
//    }
// }


// // problem two-(treesum problem)
// import java.util.*;
// public class basicJava {
//    public static void treesum(int[] arr) {
//       for(int i=0; i<arr.length; i++) {
//          for(int j=i+1; j<arr.length; j++) {
//             for(int k=j+1; k<arr.length; k++) {
//                if(arr[i]+arr[j]+arr[k] == 0) {
//                   System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
//                }
//             }
//          }
//       }
//    }
//    public static void main(String args[]) {
//       int [] arr =  {-1, 0,  1, 2, -1, -4};
//       treesum(arr);
//    }
// }


 
// // BoubleShort -
// import java.util.*;
// public class javaBasic {
//    public static void boubleShort(int[] arr) {
//       // for(int i=0; i<arr.length-1; i++) {
//       //    for(int j=i+1; j<arr.length-1; j++) {
//       //    if(arr[i]>arr[j]) {
//       //       int temp = arr[i];
//       //       arr[i] = arr[j];
//       //       arr[j] = temp;    
//       //    }
//       //    break;
//       //    }
//          //ye niche ki di line ratt lo ...
//       for(int i=0; i<arr.length-1; i++) {
//          for(int j=0; j<arr.length-1-i; j++) {
//             if(arr[j]>arr[j+1]) {
//                int temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//             }
//          }
   
//       }
//    }


//    public static void main(String Args[]) {
//    int[] arr = {7,3,9,5,8,4,1};
//    boubleShort(arr);
//     System.out.print( "shorted elements is :");
//    for(int i=0; i<arr.length; i++) {
//       System.out.print ( arr[i] + " ");
//    }

// }
// }


// Improved code for Selection Sort
// import java.util.*;

// public class javaBasic {
//    public static void selectionSort(int[] arr) {
//       for (int i = 0; i < arr.length - 1; i++) {
//          int minIndex = i;
//          for (int j = i + 1; j < arr.length; j++) {
//             if (arr[minIndex] > arr[j]) {
//                minIndex = j;
//             }
//          }
//          // Swap elements
//          int temp = arr[i];
//          arr[i] = arr[minIndex];
//          arr[minIndex] = temp;
//       }
//    }

//    public static void main(String args[]) {
//       int[] arr = {7, 9, 3, 6, 0, 5, 8};
//       selectionSort(arr);
//       System.out.print("Sorted elements are: ");
//       for (int i = 0; i < arr.length; i++) {
//          System.out.print(arr[i] + " ");
//       }
//    }
// }

// selection short-
//Wong logic
// import java.util.*;
// public class javaBasic {
//    public static void SelectionShort(int[] arr) {
//       for(int i=0; i<arr.length; i++) {
//       int maxnum = Integer.MAX_VALUE;
//       for(int j=i; j<arr.length-1; j++) {
//          if(maxnum>arr[j]) {
//             maxnum = arr[j];
//           }
//       }
//          int temp = arr[i];
//         arr[i]= maxnum;
//         maxnum = temp;     values apas me nahi change hongi unki addressing change hongi example 2=8 nahi posible per arr[1] = arr[3] is this posible;
//          //  break;
//       }
//    }
//    public static void main(String args[]) {
//       int[] arr = {7,9,3,6,0,5,8};
//       SelectionShort(arr);
//       System.out.print("shorted elements is :");
//       for(int i=0; i<arr.length; i++) {
//          System.out.print(arr[i] + " ");
//    }
// }
// }
// import java.util.*;
// public class javaBasic {
//    public static void SelectionShort(int[] arr) {
//       for(int i=0; i<arr.length; i++) {
//       int maxIndex = i;
//       for(int j=i; j<arr.length; j++) {
//          if(arr[maxIndex]>arr[j]) {
            
//             maxIndex = j;
//           }
//       }
//       int temp = arr[i];
//       arr[i] = arr[maxIndex];
//       arr[maxIndex] = temp;
      
//       }
//    }
//    public static void main(String args[]) {
//       int[] arr = {7,9,3,6,0,5,8};
//       SelectionShort(arr);
//       System.out.print("shorted elements is :");
//       for(int i=0; i<arr.length; i++) {
//          System.out.print(arr[i] + " ");
//    }
// }
// }


// // insertion sort-
// import java.util.*;
// public class javaBasic {
//    public static void InsertionSort(int[] arr) {
//       for(int i=1; i<arr.length; i++) {
//          int current = i;
//          while(current>0 && arr[current]<arr[current-1]) {
//             int temp = arr[current];
//             arr[current] = arr[current-1];
//             arr[current-1] = temp;

//             current = current-1;         //current is a variable that is used to track the current element in the array
//          }
//       }
//    }
//    public static void main(String args[]) {
//       int arr[] = {7,8,2,5,3,6,0};
//       InsertionSort(arr);
//       System.out.print("sorted elements is :");
//       for(int i=0; i<arr.length; i++) {
//          System.out.print(arr[i] + " ");

//    }
// }


// }



//  Inbuilt function in java for sorting array
//Syntex-
// import java.util.Arrays;
// Arrays.sort(arr);


//Example-
import java.util.*;
public class javaBasic {
   public static void main(String args[]) {
      int arr[] = {7,8,2,5,3,6,0};
      Arrays.sort(arr);
     // System.out.print("sorted elements is :");
         System.out.print("Sorted array is :");
      for(int i=0; i<arr.length; i++) {
         System.out.print(arr[i]+ " ");
         }
         }
}


// Another feature- 
//  Inbuilt function in java for sorting array
//Syntex-
// import java.util.Arrays;
// Arrays.sort(arr ,STRTING INDEX,ENDING INDEX);  SI and EI is define for sorting array from specific index to specific index and bacha kucha sab waise ka waise hi 
//Example-
// Arrays.sort(arr,0,3); it will sort the array from index 0 to 3;

