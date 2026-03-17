import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); //Leitor do teclado
        int valores01[] = new int[10];
        int valores02[] = new int[10];
        int inter[] = new int[10];
        boolean encontrou = false;
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite os valores do primeiro vetor:");
            valores01[i] = sc.nextInt();

            System.out.println("Digite os valores do segundo vetor:");
            valores02[i] = sc.nextInt();
        }

            for(int y =0; y<0; y++){
                for (int x = 0; x < 10; x++) {
                if (valores01[y] == valores02[x]) {
                    encontrou = true;
                }
            }}
        

        sc.close();
    }
}
