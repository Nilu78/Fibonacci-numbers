
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
   
     // TESTS 
      printFibonacci(25); //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368
      printFibonacci(8); //0 1 1 2 3 5 8 13
      printFibonacci(5); //0 1 1 2 3 
      printFibonacci(2); //0 1 
    
  }

  public static void printFibonacci(int x){
     int[] fib = new int[x];
    
    fib[0] = 0;
    fib[1] = 1;
    
    for(int i = 2; i < fib.length; i++){
      fib[i] = fib[i-1] + fib[i-2];
    
    }
    
    for(int i = 0; i < fib.length; i++){
      System.out.print(fib[i] + " ");
    }
    System.out.println();
       
    
      
  }
    
  }   

       

