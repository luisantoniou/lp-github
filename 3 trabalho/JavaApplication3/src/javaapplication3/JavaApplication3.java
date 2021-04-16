
package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {

    public static void main(String[] args) {
       Agenda agenda = new Agenda();
       int i=0,f;
//criando duas classes contato
/*
Contato contato1 = new Contato(1, "luis", 99999999 , "rua a");
Contato contato2 = new Contato(2, "pedro",88888888 , "rua b");
Contato contato3 = new Contato(3, "luis" ,88889999 , "rua c");*/
Scanner teclado = new Scanner(System.in);
//adicionando
/*
agenda.add(contato1);
agenda.add(contato2);
agenda.add(contato3);*/


do{
    System.out.println("o que você deseja fazer?");
    System.out.println("1:adicionar");
    System.out.println("2:remover");
    System.out.println("3:alterar");
    System.out.println("4:buscar por nome");
    System.out.println("5:ver todos");
    System.out.println("6:sair");
    f =teclado.nextInt();
switch(f){
    case 1:
    Contato contatoajuda1 = new Contato();
    
    System.out.println("nome");
    contatoajuda1.setNome(teclado.nextLine());
    contatoajuda1.setNome(teclado.nextLine());
    System.out.println("numero");
    contatoajuda1.setNumerotelefone(teclado.nextInt());
    System.out.println("endereço");
    contatoajuda1.setendereço(teclado.nextLine());
    contatoajuda1.setendereço(teclado.nextLine());
    agenda.add(contatoajuda1);
    break;
    
    case 2:
    System.out.println("digite o numero que vc deseja remover");
    agenda.remover(teclado.nextInt());
    break;
    
    case 3:
    Contato contatoajuda3 = new Contato();
    System.out.println("digite o numero que vc deseja alterar");    
    contatoajuda3.setNumerotelefone(teclado.nextInt());
    System.out.println("digite o novo nome");
    contatoajuda3.setNome(teclado.nextLine()); 
    contatoajuda3.setNome(teclado.nextLine()); 
    System.out.println("digite o novo endereço");
    contatoajuda3.setendereço(teclado.nextLine());
    agenda.edit(contatoajuda3);
    break;    
        
    case 4:
    Contato contatoajuda4 = new Contato();
    System.out.println("nome do aluno");
    String ajuda = teclado.nextLine();
    ajuda = teclado.nextLine();
    contatoajuda4 = agenda.buscaPorNome(ajuda);
    System.out.format("nome:%s  numero: %d endereço: %s \n", contatoajuda4.getNome(), contatoajuda4.getNumerotelefone(),contatoajuda4.getendereço());
    break;  
    case 5:
        agenda.todos();
    break;    
}}while(f != 6);
    }
    
}
