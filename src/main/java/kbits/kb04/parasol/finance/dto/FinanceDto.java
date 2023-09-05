package kbits.kb04.parasol.finance.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class FinanceDto {
	private long fin_no;
	private String fin_name;
	private int fin_type;
	private String fin_link;
}
