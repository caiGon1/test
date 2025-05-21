package br.anhembi.notificacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import br.anhembi.notificacao.dto.dto;
import br.anhembi.notificacao.model.model;
import br.anhembi.notificacao.repo.repo;

@Service
public class service {
    @Autowired
    private repo repo;
    private dto transacao;

    public service() {
        transacao = new dto();
        transacao.setUserId(1);
    }

    public List<model> getAllNotificacoes() {
        return (List<model>)repo.findAll();
    }

    public boolean isSuspeita(int userId,  double valorAtual) {
        List<Double> ultimosValores = repo.findUltimosValoresPorUsuario(userId);
        if (ultimosValores.isEmpty()) return false;
        double media = ultimosValores.stream()
                                     .mapToDouble(Double::doubleValue)
                                     .average()
                                     .orElse(0.0);

        return valorAtual > media * 1.5;
    
}

@Scheduled(fixedRate = 5000)
public String verificar() {
        boolean suspeita = isSuspeita(transacao.getUserId(), transacao.getValorSaida());

        if (suspeita) {
            System.out.println("Notificação: Transação anormal (valor acima da média histórica)");
            return "Notificação: Transação anormal (valor acima da média histórica)";
        }
        System.out.println("Transação normal");
        return "Transação normal";
    }

}
