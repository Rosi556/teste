import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        funcionario f = new funcionario("null", "null", "null", "null", "null");
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o email do funcionário?");
        f.setEmail(in.nextLine());  
        System.out.println("Qual o nome do funcionário?");
        f.setNome(in.nextLine());
        System.out.println("Qual o salário base do funcionário?");
        f.setSalario_base(in.nextLine());
        System.out.println("Qual o cargo do funcionário? \n1-GERENTE \n2-DESENVOLVEDOR \n3-DBA \n4-TESTADOR");
        f.setCargo(in.nextLine());
        in.close();
        f.Calculo_Salario();
        System.out.println(f.toString());

    }
}
