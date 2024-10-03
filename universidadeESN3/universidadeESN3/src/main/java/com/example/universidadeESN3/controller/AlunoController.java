package com.example.universidadeESN3.controller;

import com.example.universidadeESN3.entity.Aluno;
import com.example.universidadeESN3.service.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("/aluno")
    public class AlunoController {

        @GetMapping

        public ResponseEntity<List<Aluno>> buscarTodos() {
            return ResponseEntity.ok(AlunoService.buscarTodos());
        }
    }

