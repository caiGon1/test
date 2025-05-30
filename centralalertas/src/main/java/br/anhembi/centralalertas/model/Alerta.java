package br.anhembi.centralalertas.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String mensagem;

    @ManyToOne
    private Usuario usuario;

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}