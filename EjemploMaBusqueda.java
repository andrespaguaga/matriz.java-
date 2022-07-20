public class EjemploMaBusqueda {
    public static void main(String[] args) {

        int[][]  matizDeEnteros = {{3,5,6},{55,2,85},{8,98,4}};

        int elementoBusacar= 98;
        boolean encontrado= false;

        int i;
        int j=0;

       buscar: for ( i=0; i<matizDeEnteros.length; i++){
            for ( j=0; j<matizDeEnteros[i].length; j++){

                if (elementoBusacar==matizDeEnteros[i][j]){
                    encontrado= true;
                    break buscar;
                }

            }
        }
        if (encontrado){
            System.out.println("encontrado "+elementoBusacar+" en las cordenadas "+i+","+j);
        } else {
            System.out.println(" no se encontro elemento" );
        }

    }
}
