package desafio.itau.springboot.controller;

import desafio.itau.springboot.dto.Statics;
import desafio.itau.springboot.service.TransacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;

@RestController
@RequiredArgsConstructor
@RequestMapping("/estatistica")
public class StatisticsController {

    private final TransacaoService transacaoService;

    @GetMapping
    public ResponseEntity<Statics> getStatics() {
        DoubleSummaryStatistics stats = transacaoService.getStatistics();
        return ResponseEntity.ok(new Statics(stats));
    }

}
