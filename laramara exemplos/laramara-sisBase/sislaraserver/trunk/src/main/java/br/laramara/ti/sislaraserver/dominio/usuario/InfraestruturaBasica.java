package br.laramara.ti.sislaraserver.dominio.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.laramara.ti.sislaraserver.dominio.TamanhoMaximoGenerico;

@Entity
@Table(name = "infraestrutura_basica")
public class InfraestruturaBasica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "descricao", length = TamanhoMaximoGenerico.NOME, nullable = false)
	private String descricao;

	public InfraestruturaBasica() {
	}

	public InfraestruturaBasica(Long id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "InfraestruturaBasica [id=" + id + ", descricao=" + descricao + "]";
	}
}
