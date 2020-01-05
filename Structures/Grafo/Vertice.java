
package GrafoGFG;


public class Vertice {
    
    private String dato;
    private ListaAdyacencia listaAdyacencia;
    
    public Vertice(String dato){
        this.dato = dato;
        this.listaAdyacencia = new ListaAdyacencia();
    }

    public String getDato() { return this.dato; }

    public void setDato(String dato) { this.dato = dato;}

    public ListaAdyacencia getListaAdyacencia() { return this.listaAdyacencia; }

    public void setListaAdyacencia(ListaAdyacencia listaAdyacencia) { this.listaAdyacencia = listaAdyacencia; }
    
    
    
}
