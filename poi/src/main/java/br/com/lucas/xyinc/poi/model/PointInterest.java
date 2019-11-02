package br.com.lucas.xyinc.poi.model;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@Table(name = "XYINC_POI")
@Cacheable(false)
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true, exclude = "serialVersionUID")
@EqualsAndHashCode(of = { "id", "posX", "posY" })
public class PointInterest implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Getter
	private Long id;

	@Column
	@Getter
	@Setter
	private String nome;

	@Column(name = "x")
	@Getter
	@Setter
	private Integer posX;

	@Column(name = "y")
	@Getter
	@Setter
	private Integer posY;

}
