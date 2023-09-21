public class testes {


    public static void main(String[] args) {
        calculadora calc = new calculadora();
       
       //Soma de dois valores inteiros
        int soma =calc.somar(5, 7);
        System.out.println(soma);

       //Soma de dois valores sendo um zero
       soma = calc.somar(4, 0);
       System.out.println(soma);

       //Soma de dois valors que ambos são zeros
       soma = calc.somar(0, 0);
       System.out.println(soma);

       //Soma de dois valores sendo um negativo
       soma = calc.somar(5, -2);
       System.out.println(soma);

       //Soma de dois valores sendo os dois negativos
       soma = calc.somar(-5, -3);
       System.out.println(soma);

       //Teste de tamanho maximo de um número
       soma = calc.somar(2147483647,1);
       System.out.println(soma);
      
       //teste de tamanho minino de um número
       soma = calc.somar(-2147483648,-1);
       System.out.println(soma);
//------------------------------------------------------------------------------------------------------------------------------------
System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
       //Subtração de dois numeros positivos 
       int sub = calc.subtraçao(4,2);
        System.out.println(sub);

      //Subtração de dois valores sendo um zero
       sub = calc.subtraçao(4,0);
       System.out.println(sub);
    
     //Subtração de dois valores sendo um negativo
     sub = calc.subtraçao(4,-2);
     System.out.println(sub);
     
     //Subtração de dois valores sendo os dois negativos
     sub = calc.subtraçao(-4,-2);
     System.out.println(sub);
    
     //Subtração de dois valores sendo os dois zeros
     sub = calc.subtraçao(0,0);
     System.out.println(sub);
//------------------------------------------------------------------------------------------------------------------------------------
System.out.println("----------------------------------------------------------------------------------------");
      
     //Divisão de dois números positivos
     int div = calc.divisao(6, 2);
     System.out.println(div);
    
     //Divisão de dois valores sendo um zero
     div = calc.divisao(6, 0);
     System.out.println(div);

     //Divisão de dois valores sendo um negativo
     div = calc.divisao(6, -2);
     System.out.println(div);
    
     //Divisão de dois valores sendo os dois negativos
     div = calc.divisao(-6,-2);
     System.out.println(div);
     
     //Divisão de dois valores sendo os dois zero
     div = calc.divisao(0, 0);
     System.out.println(div);
//------------------------------------------------------------------------------------------------------------------------------------
System.out.println("----------------------------------------------------------------------------------------");
    
    //Multiplicação de dois valores sendo os dois positivos
    int mult = calc.multiplicaçao(5, 5);
    System.out.println(mult);

    //Multiplicação de dois valores sendo um negativo
    mult = calc.multiplicaçao(5, -5);
    System.out.println(mult);

    //Multiplicação de dois valores sendo od dois negativos
    mult = calc.multiplicaçao(-5, -5);
    System.out.println(mult);
    
    //Multiplicação de dois valores sendo um zero
    mult = calc.multiplicaçao(5, 0);
    System.out.println(mult);

    //Multiplicação de dois valores sendo os dois zero
    mult = calc.multiplicaçao(0, 00);
    System.out.println(mult);
    
 }
    
}
