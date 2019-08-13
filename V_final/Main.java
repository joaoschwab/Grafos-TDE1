/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos_tde1;

/**
 *
 * @author PUCPR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int tamanho = 5;
        int adj[] = new int[tamanho];
        Grafo g = new Grafo(tamanho);
        
        g.seta_informacao(0, "Parana");
        g.seta_informacao(1, "Sao paulo");
        g.seta_informacao(2, "Rio de janeiro");
        g.seta_informacao(3, "Rio grande do Sul");
        g.seta_informacao(4, "Santa catarina");
        g.cria_adjacencia(0, 1, 30);
        g.remove_adjacencia(0,1);
        g.cria_adjacencia(0, 4, 50);
        g.impreme_adjacencias();
        System.out.println(g.adjacentes(0,adj));
        
        
        
    }
    
}
