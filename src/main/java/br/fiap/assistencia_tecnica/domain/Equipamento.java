package br.fiap.assistencia_tecnica.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "JAVA_EQUIPAMENTO")
public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EQUIP")
   private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CLIENTE",nullable = false, foreignKey = @ForeignKey(name = "FK_EQUIP_CLIENTE"))
   private String cliente;
   private String tipo;
   private String marca;
   private String modelo;
   private String numeroSerie;
   private LocalDate dataCadastro;




}
