package br.anhembi.notificacao.model;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import java.time.LocalDate;

@Entity
@Table(name = "bdVerificacao")
public class model {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int notifId;

private int userId;

private LocalDate data;

private double valorSaida;


public model() {
}
public model(int userId, int notifId, LocalDate data, double valorSaida) {
    this.userId = userId;
    this.notifId = notifId;
    this.data = data;
    this.valorSaida = valorSaida;
}










public LocalDate getData() {
    return data;
}
public void setData(LocalDate data) {
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
public int getNotifId() {
    return notifId;
}
public void setNotifId(int notifId) {
    this.notifId = notifId;
}


}