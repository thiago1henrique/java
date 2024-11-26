package classes;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 13;
        d1.mes = 1;
        d1.ano = 2000;

        Data d2 = new Data();
        d2.dia = 31;
        d2.mes = 2;
        d2.ano = 2001;

        Data d3 = new Data(1,2,3);

        Data d4 = new Data();
        System.out.println(d4.obterDataFormatada());

        System.out.println(d3.obterDataFormatada());

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }
}
