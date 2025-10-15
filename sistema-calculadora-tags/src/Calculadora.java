/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemática entre números inteiros
 * <p>
 * <b>Note:<b/> Leia atentamente a documentação destas classes
 * para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Robert Luis 
 * @version 1.0
 * @since  15/10/2025
 */
public class Calculadora{
    /**
     * Este método é ultilizado para somar dois números inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public int somar(int numeroUm, int numeroDois){
        return numeroUm + numeroDois;
    }

    /**esse método é um exemplo do curso java básico da DIO apenas para aprendizado das condiçionais */
    public int somaMultiplica(int numeroUm, int numeroDois, String m ){
        int resultado = 0;
        if(m =="M"){
            resultado = numeroUm * numeroDois;
        }else{
            resultado = numeroUm + numeroDois;
        }
        return resultado;
    }

    /**
     * Código JAVADOC para criar nossa documentação no formato html para disponibilizar via web
     * 
     * Execute no terminal:
     * javadoc - encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
     */
}