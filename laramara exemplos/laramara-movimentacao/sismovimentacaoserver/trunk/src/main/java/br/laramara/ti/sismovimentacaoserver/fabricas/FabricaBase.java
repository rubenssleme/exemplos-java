package br.laramara.ti.sismovimentacaoserver.fabricas;

import java.util.ArrayList;
import java.util.List;

public abstract class FabricaBase<DTO, DOMINIO> {

	public List<DTO> converterParaDTO(List<DOMINIO> objetosDominio) {
		List<DTO> objetosDto = new ArrayList<>();

		for (DOMINIO objetoDominio : objetosDominio) {
			objetosDto.add((DTO) converterParaDTO(objetoDominio));
		}
		return objetosDto;
	}

	public List<DOMINIO> converterParaDominio(List<DTO> objetosDto) {
		List<DOMINIO> objetosDominio = new ArrayList<>();

		for (DTO objetoDto : objetosDto) {
			objetosDominio.add(this.converterParaDominio(objetoDto));
		}
		return objetosDominio;
	}

	public abstract DOMINIO converterParaDominio(DTO objetoDto);

	public abstract DTO converterParaDTO(DOMINIO objetoDominio);
}
