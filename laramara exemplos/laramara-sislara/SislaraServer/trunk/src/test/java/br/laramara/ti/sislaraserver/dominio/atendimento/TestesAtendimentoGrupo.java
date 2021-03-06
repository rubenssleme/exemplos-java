package br.laramara.ti.sislaraserver.dominio.atendimento;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.laramara.ti.sislaracommons.utilitarios.TiposDeTeste;
import br.laramara.ti.sislaraserver.dominio.Arquivo;
import br.laramara.ti.sislaraserver.dominio.Horario;
import br.laramara.ti.sislaraserver.fabricas.ContextoAtendimentoProfissional;
import br.laramara.ti.sislaraserver.fabricas.ContextoAtendimentoUsuario;
import br.laramara.ti.sislaraserver.fabricas.ContextoGenerico;

public class TestesAtendimentoGrupo {
	@Test(groups = { TiposDeTeste.UNITARIO })
	public void atendimentogrupo_validacao_com_erro_obrigatoriedade_e_tamanho_maximo() {
		AtendimentoGrupo atendimento = new AtendimentoGrupo();
		atendimento.setDescricao(ContextoGenerico.obterGrande());
		atendimento.setInterdisciplinar(ContextoGenerico.obterGrande());
		atendimento.setArquivos(Arrays.asList(new Arquivo(new Long(1), "Arquivo.pdf", null),
				new Arquivo(new Long(1), "Arquivo.pdf", null)));
		atendimento.setAtendimentosProfissionais(
				Arrays.asList(ContextoAtendimentoProfissional.fabricarAtendimentoProfissionalComTodosOsDados(),
						ContextoAtendimentoProfissional.fabricarAtendimentoProfissionalComTodosOsDados()));
		atendimento.validarObrigatoriedadeETamanhoMaximoDeDados();

		Assert.assertFalse(atendimento.validado());
		Assert.assertEquals(atendimento.obterNumeroErros(), 7);
	}
	
	
	@Test(groups = { TiposDeTeste.UNITARIO })
	public void atendimentogrupo_validacao_com_sucesso() {
		AtendimentoGrupo atendimento = new AtendimentoGrupo();
		atendimento.setDescricao("Descri��o");
		atendimento.setInterdisciplinar("Inter");
		atendimento.setData("31/12/2015");
		atendimento.setHorario(new Horario("09:00", "10:00"));
		atendimento.setAtendimentosUsuarios(
				Arrays.asList(ContextoAtendimentoUsuario.fabricarAtendimentoUsuarioComTodosOsDados()));
		atendimento.setAtendimentosProfissionais(
				Arrays.asList(ContextoAtendimentoProfissional.fabricarAtendimentoProfissionalComTodosOsDados()));
		
		atendimento.validarObrigatoriedadeETamanhoMaximoDeDados();

		Assert.assertTrue(atendimento.validado());
	}
}
