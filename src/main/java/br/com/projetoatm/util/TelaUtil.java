
package br.com.projetoatm.util;

import java.io.Console;
import static java.lang.System.in;
import java.util.Scanner;



public class TelaUtil{

    public static void limparTela() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    public static void exibirAperteEnterParaContinuar() {
        
        System.out.println("\nPressione ENTER para continuar...");
         
        Scanner s = new Scanner(System.in);
        s.nextLine();
        limparTela();
    }
    
    public static void exibirAperteEnterParaContinuar(String Mensagem, Boolean limpaTela) {
        
        System.out.println("\n" + Mensagem);
         
        Scanner s = new Scanner(System.in);
        s.nextLine();
        
        if(limpaTela)
            limparTela();
    }
    
    public static String montarTituloTela(String titulo){
        
        String aux = titulo.replaceAll(".", "-");
        
        titulo = "+---------------" +  aux   + "---------------+\n"
                +"|               " + titulo + "               |\n" 
                +"+---------------" +  aux   + "---------------+\n";
        
        return titulo;
    }
    
    
}
