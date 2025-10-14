public class Conta{
    //variável da classe conta
    double saldo = 10.00;

    public void sacar(double valor){
        //variável local de método
        double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo(){
        //disponível em toda classe
        System.out.println(saldo);

        //somente o método sacar conhece essa variável
        //System.out.println(novoSaldo);
    }
    public double calcularDividaExponencial(){
        //variável local de método
        double valorParcela = 50.00;
        double valorMontante = 0.0; //começando a variável
        for(int x=1; x<=5; x++){ 

            //esta variável será reiniciada  a cada execução
            double valorCalculado = valorParcela *x;
            valorMontante = valorMontante + valorCalculado;
        }
        //escopo de fluxo
        //x e valorCalculado nunca estarão disponíveis 
        return valorMontante;
    }
}