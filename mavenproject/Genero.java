
package com.mycompany.mavenproject;

public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    private String texto;

    private Genero() {
    }

    private Genero(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
            
}
