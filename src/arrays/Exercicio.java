package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunosA = new double[3];
        notasAlunosA[0] = 7.9;
        notasAlunosA[1] = 8;
        notasAlunosA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunosA));

        System.out.println("---------");

        double total = 0;
        for(int i = 0; i < notasAlunosA.length; i++){
            total += notasAlunosA[i];
        }

        System.out.println(total/3);

        double[] notasAlunosB = {6.9, 8.9, 5.5};
    }
}
