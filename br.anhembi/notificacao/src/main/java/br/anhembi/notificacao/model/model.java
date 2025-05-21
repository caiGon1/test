package br.anhembi.notificacao.model;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import java.time.LocalDateTime;

@Entity
@Table(name = "bdNotificacao")
public class model {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int userId;
private String notificacao;
private LocalDateTime data;
private double valorSaida;
private double valorAtual;



public model() {
}



public model(String notificacao, LocalDateTime data, double valorSaida, int userId, double valorAtual) {
    this.userId = userId;
    this.notificacao = notificacao;
    this.data = data;
    this.valorSaida = valorSaida;
    this.valorAtual = valorAtual;
}





public String getNotificacao() {
    return notificacao;
}
public void setNotificacao(String notificacao) {
    this.notificacao = notificacao;
}
public LocalDateTime getData() {
    return data;
}
public void setData(LocalDateTime data) {
    this.data = data;
}
public double getValorSaida() {
    return valorSaida;
}
public void setValorSaida(double valorSaida) {
    this.valorSaida = valorSaida;
}
public int getUserId() {
    return userId;
}
public void setUserId(int userId) {
    this.userId = userId;
}



public double getValorAtual() {
    return valorAtual;
}



public void setValorAtual(double valorAtual) {
    this.valorAtual = valorAtual;
}


}