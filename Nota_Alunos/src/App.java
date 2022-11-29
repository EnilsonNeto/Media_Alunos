import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
        float nota = 0;
     
        for (int i = 1;
                    i < 11; 
                        i++) 
                        
           {float number = 0;
            System.out.println("Nota do aluno " + i + " = ");

            number = scan.nextFloat();
            nota += number;
        }
        scan.close();
        System.out.println("A média do aluno é " + (nota/10));
    }
}
