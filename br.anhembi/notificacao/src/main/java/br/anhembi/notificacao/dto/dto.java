package br.anhembi.notificacao.dto;

import java.time.LocalDate;

public class dto {
private int userId;
private String notificacao;
private LocalDate data;
private double valorSaida;
private double valorAtual;

public int getUserId() {
    return userId;
}
public void setUserId(int userId) {
    this.userId = userId;
}
public String getNotificacao() {
    return notificacao;
}
public void setNotificacao(String notificacao) {
    this.notificacao = notificacao;
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
public double getValorAtual() {
    return valorAtual;
}
public void setValorAtual(double valorAtual) {
    this.valorAtual = valorAtual;
}
public dto() {
}
public dto(int userId, String notificacao, LocalDate data, double valorSaida, double valorAtual) {
    this.userId = userId;
    this.notificacao = notificacao;
    this.data = data;
    this.valorSaida = valorSaida;
    this.valorAtual = valorAtual;
}






}
