package Fibonacci;
//Ряд Фибоначчи
public class Fibo {
    int fibo(int n){
        int oldLast = 0, last = 0, next = 1;
        int i = 0;
        for (i=0; i<n; i++){
            oldLast = last;
            last = next;
            next = oldLast + next;
            System.out.println(i+": "+oldLast);
        }
        return oldLast;
    }
}
