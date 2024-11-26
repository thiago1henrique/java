package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações do funcionário

        //tipos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 4333;
        int id = 56809;
        long pontosAcumulados = 3_324_459_222L;


        //tipos numéricos flutuantes
        float salario = 11_329_389F;
        double vendasAcumuladas = 1_390_293_100.01;

        //tipo booleano
        boolean estaDeFerias = false;

        //tipo caractere
        char status = 'A';

        //dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //número de viagens
        System.out.println(numeroDeVoos / 2);

        //pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + " ganha: " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
