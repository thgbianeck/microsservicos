package br.com.bnck.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: microsservicos
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 31/01/2022
 * Hora: 23:55
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Payment {
    private static final long serialVersionUID = 1L;

    private String name;
    private Double dailyIncome;
    private Integer days;

    public double getTotal() {
        return days * dailyIncome;
    }
}
