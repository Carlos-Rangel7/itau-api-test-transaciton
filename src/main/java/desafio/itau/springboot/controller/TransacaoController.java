package desafio.itau.springboot.controller;

import desafio.itau.springboot.dto.TransacaoDTO;
import desafio.itau.springboot.entity.Transacao;
import desafio.itau.springboot.service.TransacaoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("/transacao")
public class TransacaoController {

    private final TransacaoService transacaoService;

    @PostMapping
    public ResponseEntity<Void> createTrasancao(@Valid @RequestBody TransacaoDTO dto) {
        BigDecimal valor = dto.getValor();
        if(dto.getDataHora().isAfter(OffsetDateTime.now()) || valor.compareTo(BigDecimal.ZERO) <= 0) {
            return ResponseEntity.unprocessableEntity().build();
        }
        transacaoService.addTransacao(new Transacao(dto.getValor(), dto.getDataHora()));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> clearTransacao() {
        transacaoService.clearTransacao();
        return ResponseEntity.ok().build();
    }





}
