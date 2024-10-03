package com.example.universidadeESN3.service;

import com.example.universidadeESN3.entity.Professor;

import java.util.List;

public class ProfessorService implements IProfessorService {
    @Override
    public Professor buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<Professor> buscarTodos() {
        return List.of();
    }

    @Override
    public Professor salvar(Professor professor) {
        return null;
    }

    @Override
    public void atualizar(Professor professor) {

    }

    @Override
    public void excluir(Long id) {

    }
}
