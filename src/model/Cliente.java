package model;

import java.math.BigDecimal;

public class Cliente extends AbstractPessoa{
    private BigDecimal percentualDescontoMaximo;

    public Cliente(Long id, String nome, String cpf, String endereco, String telefone, BigDecimal percentualDescontoMaximo) {
        super(id, nome, cpf, endereco, telefone);
        this.percentualDescontoMaximo = percentualDescontoMaximo;
    }


}
