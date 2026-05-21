package src.main.java;
public class Main {

    public static void main(String[] args){

        ArbolBST arbol = new ArbolBST();

        arbol.insertar(50, "Hato La Aurora", "Hato Corozal");

        arbol.insertar(30, "Finca El Encanto", "Yopal");

        arbol.insertar(70, "hacienda La Esperanza", "aguazul");

           arbol.insertar(20, "Finca San isidro", "Nunchía");

        arbol.insertar(40, "Hato Caribayona", "Paz de Ariporo");

        arbol.insertar(60, "Finca Las Brisas", "Tauramena");

        arbol.insertar(80, "Hacienda La Palma", "Maní");

        arbol.insertar(10, "Finca El Porvenir",  "Pore");

           arbol.insertar(25, "Finca las Garzas", "Trinidad");

        arbol.insertar(35, "Hato la Cabaña", "Orocué");

        arbol.insertar(45, "Finca Buenavista", "Monterrey");

        //Ejecutar los tres recorridos
        arbol.preOrden();
        arbol.inOrden();
        arbol.postOrden();

        //Probar búsqueda
        System.out.println("\n Búsqueda");
        NodoBST resultado = arbol.buscar(45);
        if(resultado != null){
            System.out.println("Encontrada: " + resultado.codigo + " - " + resultado.nombreFinca + " (" + resultado.municipio + ")");
        }else{
            System.out.println("Finca no encontrado. ");
        }

        NodoBST noExiste = arbol.buscar(33);
        if(noExiste != null){
            System.out.println("Encontrada: " + noExiste.codigo);
        }else{
            System.out.println("Código 33: Fínca no encontrada.");
        }


    }
}
