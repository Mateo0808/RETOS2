import java.util.Scanner;

public class RETO4 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);

        String[][] calculadora=new String[6][6];

        calculadora[0]=new String [] {"AC","BORRAR","%","/",};
        calculadora[1]=new String [] {"7","8","9","*",};
        calculadora[2]=new String [] {"4","5","6","-",};
        calculadora[3]=new String [] {"1","2","3","+",};
        calculadora[4]=new String [] {"","0",".","=",};
        
        for(int i=0;i<=4;i++){
            System.out.print("|");
            for(int j=0;j<4;j++){
                System.out.print(calculadora[i][j]);
                if(j!=calculadora[i].length)
                System.out.print("\t");
            }
            System.out.println("|");
            lectura.close();
        }

    }
}
