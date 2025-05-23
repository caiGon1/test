package br.anhembi.notificacao.dto;

import java.time.LocalDate;

public class dto {
private int userId;
private int notifId;
private LocalDate data;
private double valorSaida;



public int getNotifId() {
    return notifId;
}
public void setNotifId(int notifId) {
    this.notifId = notifId;
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


public dto() {
}
public dto(int notifId, LocalDate data, double valorSaida, int userId) {
    this.userId = userId;
    this.notifId = notifId;
    this.data = data;
    this.valorSaida = valorSaida;
}








}
