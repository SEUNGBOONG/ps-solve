import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilo = scanner.nextInt();
        int sum = 0;
        while (true){
            if(kilo%5==0){
                sum+=kilo/5;
                System.out.println(sum);
                break;
            }
            else {
                kilo-=3;
                sum++;
                
            }
            
            if(kilo<0){
                System.out.println("-1");
                break;
            }
        }
    }
}
