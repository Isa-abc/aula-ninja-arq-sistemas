package com.anime.anime_api.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue("ROCK_LEE")

public class RockLee extends Ninja {

    private int portoesAbertos = 0;

    public String abrirPortao() {

        if (this.portoesAbertos < 8) {
            this.portoesAbertos++;
            return getNome() + " abriram-se " + this.portoesAbertos + "º portões!";
        }
        else {
            return getNome() + "Já abriram-se todos os portões, risco de vida!!";
        }
    }

    @Override   
    public String usarTecnica(String alvo) {
        if (portoesAbertos >= 1) {
            return getNome() + " usou Lótus Primária contra " + alvo + " com " + portoesAbertos + " portões abertos! ";
        }
        else {
            return super.usarTecnica(alvo);
        }
    }
}


