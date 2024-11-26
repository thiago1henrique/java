package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Hello Folks".charAt(2));

        String s = "Boa tarde";
        s = s.toUpperCase();
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("BOA"));

        s = s.replace("BOA TARDE", "BOA NOITE").concat("!!!!");
        System.out.println(s);

        var nome = "Thiago";
        var sobrenome = "Henrique";
        nome = nome.toUpperCase();
        System.out.println(nome + " " + sobrenome);
        System.out.printf("Nome: %s %s", nome, sobrenome);
    }
}
