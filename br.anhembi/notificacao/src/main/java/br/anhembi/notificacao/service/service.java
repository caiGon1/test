package br.anhembi.notificacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import br.anhembi.notificacao.repo.repo;

@Service
public class service {
    
    @Autowired
    private repo repo;




    public boolean isSuspeita(int userId) {
        List<Double> ultimosValores = repo.findAllExceptLast(1);
        if (ultimosValores.isEmpty()) return false;
        double media = ultimosValores.stream()
                                     .mapToDouble(Double::doubleValue)
                                     .average()
                                     .orElse(0.0);
                                     
        double ultimoValor=repo.findValorByUserId(1, PageRequest.of(0, 1)).stream().findFirst().orElse(null);

        return ultimoValor > media * 1.5;
    
}

@Scheduled(fixedRate = 5000)
public String verificar() {
        boolean suspeita = isSuspeita(1);

        if (suspeita) {
            System.out.println("Notificação: Transação anormal (valor acima da média histórica)");
            return "Notificação: Transação anormal (valor acima da média histórica)";
        }
        System.out.println("Transação normal");
        return "Transação normal";
    }

}
