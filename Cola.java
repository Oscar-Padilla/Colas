public class Cola 
{
    private Object[] colaArr;
    private int tamanoMax;
    private int frente;
    private int fin;
    private int numElems;
    
    public Cola(int tamano)
    {
        tamanoMax=tamano;
        colaArr=new Object[tamanoMax];
        fin=-1;
        frente=0;
        numElems=0;
    }
    public void insertar(Object elemento)
    {
        if(fin==tamanoMax-1)
        {
            fin=-1;
        }
        fin++;
        colaArr[fin]=elemento;
        numElems++;
    }
    public Object quitar()
    {
        Object temp=colaArr[frente]==null;
        frente+=1;
        if(frente==tamanoMax)
        {
            frente=0;
        }
        numElems--;
        return temp;
    }
    public Object frenteCola()
    {
        return colaArr[frente];
    }
    public boolean colaVacia()
    {
        return (numElems==0);
    }
    public boolean colaLLena()
    {
        return (numElems==tamanoMax);
    }
    public int tamanoCola()
    {
        return numElems;
    }
}
