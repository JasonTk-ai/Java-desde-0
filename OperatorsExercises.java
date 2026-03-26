public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a = 5;
        int b = 6;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(modulo);






        
        // 2. Crea una variable para cada tipo de operación de asignación.
        int aa = 5;
        int bb = 10;
        aa *= 4;//=20
        aa += 2;//=22
        aa -= 4;//=18
        aa /= 2;//=9
        System.out.println(aa);







        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        int jason = 18;
        int paola = 19;
        int edad_minima = 18;

        System.out.println(jason <= paola);
        System.out.println(jason != paola);
        System.out.println(jason < paola);






        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(jason >= paola);
        System.out.println(jason == paola);
        System.out.println(jason > paola);







        // 5. Utiliza el operador lógico and.
        System.out.println(jason >= edad_minima && jason < paola); // compara si (jason) es mayor o igual a (edad_minima) y si (jason) es menor a (paola)
        
        
        
        
        // 6. Utiliza el operador lógico or.
        System.out.println(jason >= edad_minima || jason < paola); // compara si (jason) es mayor o igual a (edad_minima) o si (jason) es menor a (paola)
        
        
        
        
        // 7. Combina ambos operadores lógicos.
        System.out.println(jason >= paola || paola >= edad_minima && jason <= edad_minima);// compara si (jason) es menor o igual a (paola) o si (paola) es mayor o igual a (edad_minima) y si (jason) es mayor o igual a (edad_minima)





        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        String carcel = "carcel";
        boolean antidopping = !true;;

        if (antidopping == true){
            System.out.println(carcel);
        }  
        
        



        // 10. Combina operadores aritméticos, de comparación y lógicos.
        boolean fruteria_abierta = true;
        int manzanas = 5 + 10;
        int naranjas = 3;

        //llego la yarda
        naranjas += 3;
        
        //quiero comprar 10 naranjas
        boolean puedo_comprar = fruteria_abierta && naranjas >= 10;
        System.out.println(puedo_comprar);


    }
}
