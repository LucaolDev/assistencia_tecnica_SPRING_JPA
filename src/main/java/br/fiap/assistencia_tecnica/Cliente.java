package br.fiap.assistencia_tecnica;

import jakarta.persistence.*;

@Entity
@Table(name = "JAVA_CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "ID_CLIENTE")
    private Long id;

    @Column(name = "NOME", nullable = true, length = 120)
    private String nome;

    @Column(name = "EMAIL", nullable = false, length = 120)
    private String email;

    @Column(name = "TELEFONE", nullable = false, length = 20)
    private String telefone;

    @Column(name = "SENHA", nullable = false, length = 20)
    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
