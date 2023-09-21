import org.junit.Test;

public class CalculadoraJUNIT {

    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }
    public int mult(int a, int b) {
        return a * b;
    }
    public int divisao(int a, int b) {
        return a / b;
    }

    @Test
    public static void main(String[] args) {
        CalculadoraJUNIT calc = new CalculadoraJUNIT();
        int soma = calc.soma(10, 20);
        System.out.println(soma);

        int subtracao = calc.subtracao(10,5);
        System.out.println(subtracao);

        int mult = calc.mult(2,5);
        System.out.println(mult);

        int divisao = calc.divisao(10,0);
        System.out.println(divisao);
    }


}
