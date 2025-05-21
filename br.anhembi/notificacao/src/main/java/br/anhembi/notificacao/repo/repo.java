package br.anhembi.notificacao.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.anhembi.notificacao.model.model;

public interface repo extends JpaRepository<model, Integer> {
    @Query("SELECT t.valorSaida FROM model t WHERE t.userId = :userId ORDER BY t.data DESC")
    List<Double> findUltimosValoresPorUsuario(@Param("userId") int userId);
}


   

