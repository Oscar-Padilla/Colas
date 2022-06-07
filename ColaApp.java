public class ColaApp 
{
    public static void main(String[] args) 
    {
        Cola cola= new Cola(5);
        
        cola.insertar(10);
        cola.insertar(15);
        cola.insertar(20);
        cola.insertar(25);
        
        while(!cola.colaVacia())
        {
            Object n=cola.quitar();
            System.out.print(n);
            System.out.println("");
        }
        
        cola.insertar("Perro");
        cola.insertar("Gato");
        cola.insertar("Caballo");
        cola.insertar("Leon");
        cola.insertar("Tigre");
        
        System.out.println("Elemento en la cabeza de la cola: ");
        System.out.println(cola.frenteCola()+"\n");
        System.out.println("Esta cola está vacia? ");
        System.out.println(cola.colaVacia()+"\n");
        System.out.println("Esta cola está llena? ");
        System.out.println(cola.colaLLena()+"\n");
        System.out.println("Tamaño de la cola: ");
        System.out.println(cola.tamanoCola()+"\n");
        
        while(!cola.colaVacia())
        {
            Object m=cola.quitar();
            System.out.print(m);
            System.out.println("");
        }
        System.out.println("");
    }
}
