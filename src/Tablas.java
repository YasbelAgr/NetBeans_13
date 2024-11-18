import javax.swing.JOptionPane;
public class Tablas {
    public static void main (String[] args) {
        int x,y,o;
        for (x=1; x<=10; x++){
        System.out.printf("Tabla del multiplicar del 1 al 10");
        for (x=1; x<=10; x++){  
            System.out.println();
            for (o=1; o<=10; o++){
                y=x*o;
                System.out.printf(x+"*"+o+"="+y+"\t");
                System.out.printf("\t");
            }
            }
        }
    }
}
