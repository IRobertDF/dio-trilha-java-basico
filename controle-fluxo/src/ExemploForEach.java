public class ExemploForEach{
public static void main(String[] args) {
    //em arrays o indice inicia em zero
    String []alunos  = {"Felipe", "Jonas", "Julia", "Marcos"};

    for (String aluno : alunos){
        System.out.println("O nome do aluno é: " + aluno);
    }
}
}
