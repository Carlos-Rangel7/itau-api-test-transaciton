package desafio.itau.springboot.dto;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;

@Getter
public class Statics {

    private long count;
    private BigDecimal sum;
    private BigDecimal avg;
    private BigDecimal min;
    private BigDecimal max;

    public Statics(DoubleSummaryStatistics statics) {
        this.count = statics.getCount();
        this.sum = BigDecimal.valueOf(statics.getSum());
        this.avg = BigDecimal.valueOf(statics.getAverage());
        this.min = BigDecimal.valueOf(statics.getMin());
        this.max = BigDecimal.valueOf(statics.getMax());
    }

}
