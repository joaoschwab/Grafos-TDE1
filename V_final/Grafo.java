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
public class Grafo {
    private int matriz[][];
    private Vertice vertice[];
    private int tamanho;
    private static int infinito = 9999;
    
    
    public Grafo(int tamanhon){
        this.tamanho = tamanhon;
        this.vertice = new Vertice[tamanhon];
        this.matriz = new int[tamanhon][tamanhon];
        for(int i = 0; i < tamanhon; i++){
            
         for(int j = 0; j< tamanhon; j++){
             matriz[i][j] = infinito;
         }   
        }
    }
    
    
    public void seta_informacao(int posicao,String valor){
        this.vertice[posicao] = new Vertice(valor);
    }
    
    public void cria_adjacencia(int posi1,int posi2, int peso){
        this.matriz[posi1][posi2] = peso;
    }
    
    public void remove_adjacencia(int posi1, int posi2){
        this.matriz[posi1][posi2] = infinito;
    }
    public void impreme_adjacencias(){
      for (int i = 0; i < tamanho; i++)  {  
        for (int j = 0; j < tamanho; j++)     { 
           System.out.print(matriz[i][j] + " "); //imprime caracter a caracter
        }  
       System.out.println(" "); //muda de linha
      }  
    }
    
    public int adjacentes(int i,int adj[]){
        int contador = 0;
    for(int j = 0; j<tamanho;j++){
        if(matriz[i][j] != infinito){
            adj[contador] = matriz[i][j];
            contador++;
        }
    }
    return contador;
    }
    
    
    /*void cria_adjacencia( i, j, P)  // cria uma adjacência entre i e j com custo P no grafo G;
void remove_adjacencia( i, j)  // remove a adjacência entre i e j no grafo G;
void imprime_adjacencias()  // imprime a matriz de adjacências do grafo G
void seta_informacao( i, String V)  // atualiza a informação do nó i com o valor V (que deve ser uma string) no grafo G
int adjacentes(i, adj)  // retorna o número de adjacentes ao vértice i no grafo G e os armazena no vetor adj

*/
    
}
