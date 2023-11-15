package avengers;

import java.util.Scanner;

public class NomesArray {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int qtdNomes;
        System.out.print("Quantos nomes terá na lista: ");
        qtdNomes = input.nextInt();
        input.nextLine(); //para encesrrar o inpunt.nextInt
        
        String[] nomes = new String[qtdNomes];
        
        System.out.println(nomes.length);
        
        for(int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° nome: ");
            nomes[i] = input.nextLine();
        }
        
        System.out.println("Os nomes da lista são: ");
        
        for (String listaNomes : nomes) {  //listaNomes para exibir todo o array
            System.out.println(listaNomes);
        }
      
        input.close();
    }
}    