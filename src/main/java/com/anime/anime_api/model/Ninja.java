package com.anime.anime_api.model;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;

//Pra importar as dependências que você precisa, lembre
//de ser antes das classes!!

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_ninja")


public class Ninja {

    //Notação
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;


    private String nome;
    private int idade;
    private String aldeia;
    private String nivel;
    private String tecnicaPrincipal;

    public String usarTecnica(String alvo) {
        return this.nome + " usou a tecnica " + this.tecnicaPrincipal + " contra " + alvo;
    }
}
