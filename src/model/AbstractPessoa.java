package model;

public abstract class AbstractPessoa {
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    public AbstractPessoa(Long id, String nome, String cpf, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }


}
