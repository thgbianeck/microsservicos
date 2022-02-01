package br.com.bnck.hrpayroll.services;

import br.com.bnck.hrpayroll.entities.Payment;
import br.com.bnck.hrpayroll.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: microsservicos
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 01/02/2022
 * Hora: 07:46
 */
@Service
public class PaymentService {

    @Value("${hr-worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(long workerId, int days) {
        Map<String, String> uriVariables = Map.of("id", String.valueOf(workerId));

        Worker worker = restTemplate.getForObject(workerHost.concat("/workers/{id}"), Worker.class, uriVariables);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
