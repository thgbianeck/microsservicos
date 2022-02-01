package br.com.bnck.hrpayroll.services;

import br.com.bnck.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: microsservicos
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 01/02/2022
 * Hora: 07:46
 */
@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Thiago", 100.0, days);
    }
}
