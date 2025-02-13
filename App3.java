public class App3 {
   public static void main(String[] args) {
    int count=0;
    for (int i = 1; i <=100; i++) {
        if(i % 3 == 0){
         count++;
        }
    }
    System.out.println("a quantidade de numeros múltiplos de 3 entre 1 e 100 é "+ count);
   } 
}
