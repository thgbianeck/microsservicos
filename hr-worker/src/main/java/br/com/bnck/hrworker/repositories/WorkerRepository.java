package br.com.bnck.hrworker.repositories;

import br.com.bnck.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: microsservicos
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 31/01/2022
 * Hora: 22:46
 */
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
