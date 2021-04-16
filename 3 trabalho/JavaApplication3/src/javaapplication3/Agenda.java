
package javaapplication3;
import java.util.ArrayList;
import java.util.List;
public class Agenda {
    
    public List<Contato> contatos;

    public Agenda(List<Contato> contatos) {
        this.contatos = contatos;
    }
    
    public Agenda() {
        contatos = new ArrayList<>();
    }
    
    public List<Contato> getContatos() {
        return contatos;
    }

    public boolean add(Contato contato)
    {
        int i = 0,a=0;
        while (i < contatos.size())
        {
            if (contatos.get(i).getNome().contains(contato.getNome()))
            {
                contatos.set(i, contato);
                a=1;
            }
            i++;
        }
        if(a!=1){
           return contatos.add(contato); 
        }
        return true;
    }
    
    public void edit(Contato contato)
    {
        int i = 0;
        while (i < contatos.size())
        {
            if (contatos.get(i).getNumerotelefone() == contato.getNumerotelefone())
            {
                contatos.set(i, contato);
            }
            i++;
        }
    }
    
    public Contato buscaPorCodigo(int codigo)
    {
        Contato result = null;
        int i = 0;
        while (i < contatos.size() && result == null)
        {
            if (codigo == contatos.get(i).getCodigo())
            {
                result = contatos.get(i);
            }
            i=i+1;
        }
        return result;
    }
    
    public Contato buscaPorNome(String nome)
    {
        Contato result = null;
        int i = 0;
        while (i < contatos.size())
        {
            if (contatos.get(i).getNome().contains(nome))
            {
                return contatos.get(i);
            }
            i++;
        }
        return result;
    }
     public void remover(int numeroaj)
    {
        int i = 0;
        while (i < contatos.size())
        {
            if (contatos.get(i).getNumerotelefone() == numeroaj)
            {
                contatos.remove(i);
            }
            i++;
        }
    }
    public void todos(){
        int i =0;
        System.out.println("\n");
        while (i < contatos.size()){
           System.out.format("nome:%s  numero: %d endereço: %s \n", contatos.get(i).getNome(), contatos.get(i).getNumerotelefone(),contatos.get(i).getendereço());
        i++;
        }
        System.out.println("\n");
    } 
}