/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafoGFG;

public class Main {
    
      public static void main(String[] args) 
    { 
       Grafo g = new Grafo(10);
       g.AgregarVertice("A");
       g.AgregarVertice("B");
       g.AgregarVertice("C");
       g.AgregarVertice("D");
       g.AgregarVertice("E");
       g.AgregarVertice("F");
       g.AgregarArista("A", "B");
       g.AgregarArista("A", "D");
       g.AgregarArista("A", "E");
       g.AgregarArista("B", "A");
       g.AgregarArista("C", "D");
       g.AgregarArista("D", "A");
       g.AgregarArista("D", "C");       
       g.AgregarArista("E", "A");
       g.AgregarArista("E", "F");
       g.AgregarArista("F", "E");
       g.ImprimirVertices();
       System.out.println("");
       g.RecorridoAnchura("A");
       System.out.println("");
       g.RecorridoProfundidad("B");
       g.GraficarMatrizDeAdyacencia();
    } 
}
