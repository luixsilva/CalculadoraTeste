/**
*@author Luiz Silva
*@version 1.01
*@since 8/11/23
*/

public class calculadora{
/**
 * Calcula a soma de dois inteiros.
 *
 * @param a O primeiro inteiro a ser adicionado.
 * @param b O segundo inteiro a ser adicionado.
 * @return A soma de `a` e `b`.
 */
    public int somar(int a, int b){
     return a + b;   
    }
/**
 * Calcula a diferença entre dois inteiros.
 *
 * @param a O primeiro inteiro.
 * @param b O segundo inteiro a ser subtraído de `a`.
 * @return A diferença entre `a` e `b`.
 */
    public int subtraçao (int a , int b){
    return  a - b;
}
/**
 * Calcula o quociente de dois inteiros.
 *
 * @param a O dividendo.
 * @param b O divisor.
 * @return O quociente de `a` e `b`.
 */
    public int divisao (int a , int b){
     return  a / b;
}
/**
 * Calcula o produto de dois inteiros.
 *
 * @param a O primeiro inteiro a ser multiplicado.
 * @param b O segundo inteiro a ser multiplicado.
 * @return O produto de `a` e `b`.
 */
    public int multiplicaçao(int a , int b){
        return  a * b;
     }
}