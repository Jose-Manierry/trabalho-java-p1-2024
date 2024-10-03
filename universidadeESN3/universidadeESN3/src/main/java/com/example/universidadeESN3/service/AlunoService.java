package com.example.universidadeESN3.service;

import com.example.universidadeESN3.entity.Aluno;

import java.util.List;

public class AlunoService implements IAlunoService{
    @Override
    public Aluno buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<Aluno> buscarTodos() {
        return List.of();
    }

    @Override
    public Aluno salvar(Aluno aluno) {
        return null;
    }

    @Override
    public void atualizar(Aluno aluno) {

    }

    @Override
    public void excluir(Long id) {

    }
}
