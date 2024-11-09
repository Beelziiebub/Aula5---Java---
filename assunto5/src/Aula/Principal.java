package Aula;

public class Principal {

    public static void main(String[] args) {
    	
        // Criando objetos da classe Clientes
        // Sintaxe: NomeClasse NomeObjeto = new MetodoConstrutor();

        Clientes cli1 = new Clientes(); // Correção do 'new Clientes()'
        System.out.println("Id Cliente: " + cli1.getIdCliente());  
        System.out.println("Nome: " + cli1.getNome());             
        System.out.println("E-mail: " + cli1.getEmail());            

        // Criando um cliente com parâmetros
        
        Clientes cli2 = new Clientes(854, "Vitor", "Victorteste@gmail.com"); 
        System.out.println("Id Cliente: " + cli2.getIdCliente()); 
        System.out.println("Nome: " + cli2.getNome());             
        System.out.println("E-mail: " + cli2.getEmail());           
    }
}
