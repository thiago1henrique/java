package classes;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "John Doe";
        u1.email = "john@doe.com";

        Usuario u2 = new Usuario();
        u2.nome = "Doe John";
        u2.email = "doe@john.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        System.out.println(u1 == u1);
        System.out.println(u2 == u2);


    }
}
