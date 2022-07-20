public class MatrizDiagonalP {
    public static void main(String[] args) {

        int [][] d= new int[4][4];
        //llenar diagonal principal con 1

        for (int i=0; i< d.length; i++){
            for (int j=0; j<d[i].length; j++){

                if (i==j){
                    d[i][j]= 1;
                }
            }
        }
        System.out.println(" dioganal principal" );

        for (int i=0; i< d.length; i++){
            for (int j=0; j<d[i].length; j++){
                System.out.print(d[i][j] + "\t" );
            }
            System.out.println();
        }
    }
}
