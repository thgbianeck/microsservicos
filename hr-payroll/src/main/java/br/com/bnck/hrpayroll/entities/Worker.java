package br.com.bnck.hrpayroll.entities;

import lombok.*;

/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: microsservicos
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 31/01/2022
 * Hora: 23:56
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Worker {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Double dailyIncome;
}
