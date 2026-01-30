package EDE;
/*
 * Programa que permite al usuario que lo
 * utilice saber tanto la nota media como
 * indicar si el alumno ha aprobado o suspendido 
*/
public class NotasAlumno {
	
	/*
	 * Punto de partida.
	 * El programa hace llamada a unos
	 * métodos para obtener la nota
	 * más alta, el número de veces
	 * que se repite la nota más alta
	 * e indicar al usuario si el
	 * alumno está aprobado o suspendido 
	*/
	
    public static void main(String[] args) {
    	// Array de notas del Alumno
        int[] notas = {5, 7, 3, 7, 2, 9, 7};
        // Nota más alta del alumno
        int notaMayor = obtenerMayor(notas);
        // Numero de veces que se repite la nota más alta
        int repetidas = vecesRepetidasMayor(notas, notaMayor);
        // Comprobar si se repite la nota más alta
        if (repetidas >= 2) 
            System.out.printf("La nota más alta (%d) se repite %d veces\n", notaMayor, repetidas);
        else 
            System.out.printf("La nota más alta (%d) no se repite\n", notaMayor);
        // Obtener la nota media del alumno basandose en sus notas
        double media = mediaNotas(notas);
        // Mostrar en pantalla si el alumno ha aprobado o ha suspendido
        if (media >= 5) 
            System.out.printf("Has aprobado con una media de: %.2f", media);
        else 
            System.out.printf("Has suspendido con una media de: %.2f", media);
    }
    
    /*
     * Obtiene el valor máximo de un array.
     * 
     * @param notas Array con los números a revisar.
     * @return Número más grande del array.
    */
    public static int obtenerMayor(int [] notas) {
    	int notaMayor = notas[0];
        for (int i = 1; i < notas.length; i++) 
            if (notas[i] > notaMayor) 
                notaMayor = notas[i];
        return notaMayor;
    }
    
    /*
     * Obtener el número de veces que se repite la nota más alta.
     * 
     * @param notas Array de números a comparar
     * @param notaMayor Número más alto del array.
     * @return Número de veces que se repite el número ás alto.
    */
    public static int vecesRepetidasMayor(int [] notas, int notaMayor) {
    	if(notas == null || notas.length == 0 ) return 0;
    	int repetidas = 0;
        for (int i = 0; i < notas.length; i++)
            if (notas[i] == notaMayor) 
                repetidas++;
        return repetidas;
    }
    
    /*
     * Obtener la media de x números
     *
     * @param notas Array de números para saber la media
     * @return Media de los números del array
    */
    public static double mediaNotas(int [] notas) {
    	if(notas == null || notas.length == 0 ) return 0;
    	double sumaNotas = 0;
        for (int i = 0; i < notas.length; i++) 
            sumaNotas += notas[i];
        return sumaNotas / notas.length;
    }
}

