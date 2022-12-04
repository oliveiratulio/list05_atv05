import java.util.Scanner;

public class App {

   
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nInforme o valor do produto: ");
        double produto=sc.nextDouble();
        System.out.print("\nInforme a taxa de imposto: ");
        double taxa=sc.nextDouble();
        sc.close();
        double totalComImposto=somaImposto(taxa, produto);
        System.out.print("\nValor do produto sem imposto: R$"+produto+"\nTaxa de imposto aplicada: "+taxa+" %\nValor total de imposto: R$"+(totalComImposto-produto)+"\nValor com imposto: R$"+totalComImposto);
    }

    static double somaImposto(double taxaImposto, double custo){
        double total=custo+((custo*taxaImposto)/100);
        return total;
    }

}
