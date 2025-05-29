package br.anhembi.centralalertas.service;

import br.anhembi.centralalertas.dto.AlertaDTO;
import org.springframework.stereotype.Service;

@Service
public class AlertaService {

    public void processarAlerta(AlertaDTO alerta) {
        System.out.println("Alerta recebido: " + alerta.getMensagem());

        if ("alta".equals(alerta.getSeveridade())) {
            System.out.println("⚠️ ALTA SEVERIDADE – Acionando autoridades...");
        } else {
            System.out.println("✅ Alerta de baixa/média severidade – Notificando família.");
        }
    }
}