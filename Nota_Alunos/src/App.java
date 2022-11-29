import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        Scanner yorn = new Scanner (System.in);
        float nota = 0f;
        int yn = 0;
        while (yn == 0)
        {
            for (int i = 1;i < 11; i++)
                {
                    float number = 0f;
                    System.out.println("Nota do aluno " + i + " = ");
                    number = scan.nextFloat();
                    nota += number;
                }
            System.out.println("A média do aluno é " + (nota/10));
            nota = 0f;
            System.out.println("Deseja continuar inserindo notas? se sim digite '0' , se não Digite '-1'");
            yn = yorn.nextInt();
        } 
        scan.close();
        yorn.close();
    }
}
