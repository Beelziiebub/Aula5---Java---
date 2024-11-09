package Aula;

public class Clientes {

    private int idCliente; 
    private String nome, email;

    // Getters e Setters
    public void setIdCliente(int _id) { this.idCliente = _id; }
    public void setNome(String _nome) { this.nome = _nome; }
    public void setEmail(String _email) { this.email = _email; }

    public int getIdCliente() { return this.idCliente; }
    public String getNome() { return this.nome; }
    public String getEmail() { return this.email; }

    // Métodos construtores
    
    public Clientes() {
        this.setIdCliente(0);
        this.setNome("");
        this.setEmail("");
    }

    public Clientes(int _id, String _nome, String _email) {
        this.setIdCliente(_id);
        this.setNome(_nome);
        this.setEmail(_email);
    }
}



