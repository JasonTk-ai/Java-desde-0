public class operators2{
    
public static void main (String []args) {

    int a = 10;
    int b = 5;

    // SUMA
    int suma = a + b;
    System.out.println("La suma es: " + suma);

    // RESTA
    int resta = a - b;
    System.out.println("La resta es: " + resta);

    // MULTIPLICACION
    int multiplicacion = a * b;
    System.out.println("La multiplicacion es: " + multiplicacion);

    // DIVISION de enteros 
    int division = a / b;
    System.out.println("La division es: " + division);

    // MODULO que es el resto de la division
    int modulo = a % b;
    System.out.println("El modulo es: " + modulo);


    // EJERCICIOS 

    int año = 365;
    int horas = 24;
    int minutos = 60;
    int segundos = 60;


    int horas_año = horas * año;
    System.out.println(horas_año);

    int minutos_año = minutos * horas_año;
    System.out.println(minutos_año);

    int segundos_año = segundos * minutos_año;
    System.out.println(segundos_año);





    //Operadores de asiganacion
    a = b * 4; // Se actualiza el valor de (a) y se multiplica 
    System.out.println(a);

    a += 1; //se le suma 1 a (a) y se actualiza el valor de (a)
    System.out.println(a);
    //Ejercicios de operadores de asignacion
    a -= 10; 
    System.out.println(a);

    a = 20;
    b = 5;
    a += 10 - b;
    a += b;
    System.out.println(a);
    a *= 3;
    System.out.println(a); // se le suma a (a) el resultado de la resta (5-3)
    
    int j = 20;
    int c = 40;





    //operadores de comparacion o relacionales (BOOLEAN).
    System.out.println(j == j ); // compara si (j) es igual a (j)
    System.out.println(j != c); // compara si (j) es diferente a (c)
    System.out.println(j >= c); // compara si (j) es mayor a (c)
    System.out.println(j > c); // compara si (j) es mayor a (c)
    System.out.println(j <= c); // compara si (j) es menor a (c)
    System.out.println(j < c); // compara si (j) es menor a (c)


    int Mcbook = 13000;
    int iphone = 20000;

    System.out.println((Mcbook < iphone) +" El Mcbook es mas barato que el iphone");



    //OPERADORES LOGICOS (BOOLEAN)

    //Y (AND) &&: Solo es verdadero si ambos operandos son verdaderos
    System.out.println(true && true);
    System.out.println(true &&false);
    System.out.println(false && true);
    System.out.println(false && false);
    int q = 3;
    int e = 5;
    System.out.println(q < e && q != e ); // compara si (q) es menor a (e) y si (q) es diferente a (e)

    //O (OR) ||: Es verdadero si al menos uno de los valores es verdadero
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);

    

    //NO (NOT) !: Invierte el valor de una variable booleana
    System.out.println(!true); // devuelve false
    System.out.println(!false); // devuelve true

    //UNARIOS
    int aa = 6;
    int bb = 6;
    System.out.println(aa--);// se le resta 1 a (aa) y se actualiza el valor de (aa)
    System.out.println(aa-);// se le resta 1 a (aa) y se actualiza el valor de (aa)
    System.out.println(aa+);// se le suma 1 a (aa) y se actualiza el valor de (aa)
    System.out.println(aa++);// se le suma 1 a (aa) y se actualiza el valor de (aa)

    System.out.println(--aa);// se le resta 1 a (aa) y se actualiza el valor de (aa)
    System.out.println(-aa);// se le resta 1 a (aa) y se actualiza el valor de (aa)
    System.out.println(+aa);// se le suma 1 a (aa) y se actualiza el valor de (aa)
    System.out.println(++aa);// se le suma 1 a (aa) y se actualiza el valor de (aa)


    




    
}


}
