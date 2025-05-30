package br.anhembi.centralalertas.repository;

import br.anhembi.centralalertas.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlertaRepository extends JpaRepository<Alerta, UUID> {
}