import java.util.Scanner;
public class Counter {
    
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
    }
}

static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if(parametroDois <= parametroUm){
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }   

}

static void Contagem(int parametroUm, int parametroDois){
    int contagem = parametroDois - parametroUm;
            for(parametroUm = parametroUm; parametroDois >= parametroUm; parametroUm++){
            System.out.println("Imprimindo o número: " + parametroUm);
}
