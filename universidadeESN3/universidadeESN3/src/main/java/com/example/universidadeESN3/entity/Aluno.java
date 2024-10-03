package com.example.universidadeESN3.entity;

import lombok.Data;

@Data
public class Aluno {
    private Long id;
    private Long matricula;
    private String nome;
    private Genero genero;

}
