package br.com.lucas.xyinc.poi.service.dto;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true, exclude = "serialVersionUID")
@EqualsAndHashCode(of = { "posX", "posY", "raio" })
public class PointInterestProximity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private Integer posX;

	@Getter
	@Setter
	private Integer posY;
	
	@Getter
	@Setter
	private Double raio;
}
