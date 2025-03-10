package desafio.itau.springboot.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@RequiredArgsConstructor
@Getter
public class TransacaoDTO {

    private BigDecimal valor;
    private OffsetDateTime dataHora;
}
