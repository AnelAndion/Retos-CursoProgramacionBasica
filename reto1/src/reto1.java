import java.util.Scanner;
import java.text.DecimalFormat;
public class reto1 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        double[][] datos; // Guardar los datos introducidos en la segunda Entrada

// - Entrada 1
        // leer tamaño de la muestra
        int n; // el tamaño de la muestra de la informacion de las calificaciones de los examenes
        String Entrada1 = leer.nextLine();
        n = Integer.parseInt(Entrada1);
        datos = new double[n][4]; // define el tamaño de la matriz  i = 18 ; j = 4

//- Entrada 2
        // proceso de lectura
        for(int i = 0; i < n; i++){
            String line = leer.nextLine();
            // Separar los mitiples datos de la variable line
            String[] lineSeparados = line.split(" ");
            // proceso para converir de string a double y guardar en la matris datos
            for(int j = 0; j < 4; j++){
                datos[i][j] = Double.parseDouble(lineSeparados[j]);
            }
        }
// - proceso
        // Cuál es el desempeño promedio de todo el grupo?
        // recorrer matriz vertical
        DecimalFormat f = new DecimalFormat("#.##");
        double sumatoria = 0.0;
        double promedio;
        for(int i = 0; i < n ; i++){
            sumatoria = sumatoria + datos[i][3];
        }
        // promedio
        promedio = sumatoria / n ;
        // salida 1
        System.out.println(f.format(promedio));

        // Cuántos exámenes tiene una calificación insuficiente?
        // recorrer matriz vertical
        int notasInsuficientes = 0;
        for(int i = 0; i < n; i++){
            if(datos[i][3] <= 6 && datos[i][3] > 3){
                notasInsuficientes = notasInsuficientes + 1;
            }
        }
        // salida 2
        System.out.println(notasInsuficientes);

        // Cuál es el estudiante con el mejor desempeño promedio para el genero femenino?
        // recorrer maatriz
        int contadorliteratura = 0 , contadorbiologia = 0 , contadorgeometria = 0;
        double sumadorliteratura= 0.0 , sumadorbiologia = 0.0 , sumadorgeometria = 0.0;
        Double[] sumatoriasmaterias = new Double[3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){ // Esta de más -- quitar
                if(datos[i][1] == 1.0){ // filtra las filas correspondientes al genero femenino
                    if(datos[i][2] == 1.0){ // literatura
                        sumadorliteratura = sumadorliteratura + datos[i][3]; // sumatoria
                        contadorliteratura = contadorliteratura + 1; // contador
                    }else if(datos[i][2] == 2.0){ // biologia
                        sumadorbiologia = sumadorbiologia + datos[i][3]; // sumatoria
                        contadorbiologia = contadorbiologia + 1; // contador
                    }else if(datos[i][2] == 3.0){ // geografia
                        sumadorgeometria = sumadorgeometria + datos[i][3]; // sumatoria
                        contadorgeometria = contadorgeometria + 1; // contador
                    }
                }
            }
        }

        // Se Agregan los promedios de las materias en el Arreglo
        sumatoriasmaterias[0] = sumadorliteratura / contadorliteratura;
        sumatoriasmaterias[1] = sumadorbiologia / contadorbiologia;
        sumatoriasmaterias[2] = sumadorgeometria / contadorgeometria;

        // Recorre el Areglo buscando el promedio mayor
        Double mayor = 0.0;
        for(int i = 0; i < 3; i++){
            if(sumatoriasmaterias[i] > mayor){
                mayor = sumatoriasmaterias[i];
            }
        }

        //buscar en el Arreglo el mayor promedio y imprimir en pantalla
        if(sumatoriasmaterias[0] == mayor){
            // salida 3
            System.out.println("literatura");
        }else if(sumatoriasmaterias[1] == mayor){
            // salida 3
            System.out.println("biologia");
        }else if(sumatoriasmaterias[2] == mayor){
            // salida 3
            System.out.println("geografia");
        }
        // Cuál es el estuduante con el mejor desempeño para la materia literarura
        // recorrer matriz
        Double[] notasLiteratura = new Double[6];
        int j = 0;
        for(int i = 0; i < n; i++){
            if(datos[i][2] == 1.0){ // filtra si la nota es literatura
                notasLiteratura[j] = datos[i][3]; // guardar nota en la posicion correspondiente al  estdiante
                j = j + 1; // identifica el campo correspondiente del estudiante
            }
        }


        Double notamayor = 0.0;
        String[] estudiantes = {"armando","nicolas","daniel","maria","marcela","alexander"};
        String persona = "";

        for(int i = 0; i < 6; i++){
            if(notasLiteratura[i] > notamayor){ // encontrar el mayor
                notamayor = notasLiteratura[i];
                persona = estudiantes[i]; // se asigna el nombre, de acuerdo a la posicion de la mejor nota
            }
        }
        // salida 4
        System.out.println(persona);

        leer.close();
    }
}
