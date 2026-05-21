package src.main.java;
public class ArbolBST {
    
    NodoBST raiz;

    public ArbolBST(){
        this.raiz = null;
    }

    //método público que llama al privado recursivo
    public void insertar(int codigo, String nombreFinca, String municipio){
        raiz = insertarRec(raiz,codigo, nombreFinca, municipio);
    }

    //metodo privado recursivo
    private NodoBST insertarRec(NodoBST nodo, int codigo, String nombreFinca, String municipio){
        if(nodo == null){
            return new NodoBST(codigo, nombreFinca, municipio);
        }

        if(codigo < nodo.codigo){
            //Va a la izquierda
            nodo.izquierdo = insertarRec(nodo.izquierdo, codigo, nombreFinca, municipio);
        }else if (codigo > nodo.codigo){
            //va a la derecha
            nodo.derecho = insertarRec(nodo.derecho, codigo, nombreFinca, municipio);
        }

        //si codigo == nodo.codigo, no se inserta (código duplicado)

        return nodo;
    }

    public NodoBST buscar(int codigo){
        return buscarRec (raiz, codigo);
    }

    private NodoBST buscarRec (NodoBST nodo, int codigo){
        //caso base: no existe o lo encontramos
        if(nodo == null || nodo.codigo == codigo){
            return nodo;
        }

        if(codigo < nodo.codigo){
            return buscarRec(nodo.izquierdo, codigo);
        }else{
            return buscarRec(nodo.derecho,codigo);
        }
    }

    // Pre Orden: Raíz -> Izquierda -> Derecha

    public void preOrden(){
        System.out.println("\nRecorrido PreOrden:");
        preOrdenRec(raiz);
        System.out.println();
    }

    private void preOrdenRec (NodoBST nodo){
        if (nodo == null) return;
        System.out.println(nodo.codigo + " (" + nodo.nombreFinca + ") -> ");
        preOrdenRec(nodo.izquierdo);
        preOrdenRec(nodo.derecho);
    }

    //IN ORDEN: Izquierda -> Raíz -> Derecha
    public void inOrden(){
        System.out.println("\nRecorrido inOrden:");
        inOrdenRec(raiz);
        System.out.println();
    }

    private void inOrdenRec(NodoBST nodo){
        if (nodo == null) return;
        inOrdenRec(nodo.izquierdo);
        System.out.println(nodo.codigo + " (" + nodo.nombreFinca + ") ->");
        inOrdenRec(nodo.derecho);
    }

    //POST ORDEN: izquierda -> Derecha -> Raíz
    public void postOrden(){
        System.out.println("\nRecorrido PostOrden");
        postOrdenRec(raiz);
        System.out.println();
    }

    private void postOrdenRec(NodoBST nodo){
        if (nodo == null) return;
        postOrdenRec(nodo.izquierdo);
        postOrdenRec(nodo.derecho);
        System.out.println(nodo.codigo + " (" + nodo.nombreFinca + ") -> ");

    }
}
