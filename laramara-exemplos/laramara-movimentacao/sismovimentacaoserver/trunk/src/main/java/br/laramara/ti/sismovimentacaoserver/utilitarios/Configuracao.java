package br.laramara.ti.sismovimentacaoserver.utilitarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.PropertyResourceBundle;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

public class Configuracao {

	private static final Logger logger = Logger.getLogger(Configuracao.class);

	private static PropertyResourceBundle arquivoPropriedades;
	
	public static final String DIRETORIO_RELATORIOS = "diretorio.relatorios";
	public static final String DIRETORIO_TELAS_CAPTURADAS = "diretorio.telas_capturadas";
	public static final String DIRETORIO_FOTOS = "diretorio.fotos";
	public static final String DIRETORIO_PRONTUARIOS_ESCANEADOS = "diretorio.prontuarios.escaneados";
	public static final String DIRETORIO_INTERNO_PRONTUARIOS_ESCANEADOS = "diretorio.interno.prontuarios.escaneados";
	public static final String EXTENSAO_FOTOS = "extensao.fotos";
	public static final String ARQUIVO_SESSAO = "arquivo.sessao";
	public static final String ARQUIVO_COORDENACAO_USUARIO = "arquivo.coordenacao.usuario";
	public static final String ARQUIVO_COORDENACAO_GRUPO = "arquivo.coordenacao.grupo";
	public static final String ARQUIVO_COORDENACAO_GERAL = "arquivo.coordenacao.geral";
	public static final String SENHA_PADRAO_CONTA_ACESSO = "senha.padrao.conta.acesso";
		
	public static final String ARQUIVO_CONFIGURACAO = "/application.properties";
	
	private void inicializar() {
		if (arquivoPropriedades == null)
			try {
				arquivoPropriedades = new PropertyResourceBundle(
						getClass().getResourceAsStream(ARQUIVO_CONFIGURACAO));
			} catch (Exception e) {
				logger.fatal("Erro durante carregamento de arquivo de configura��o.\n Detalhes: "
						+ e);
			}
	}

	public final String obterConfiguracao(String chave) {
		inicializar();
		return arquivoPropriedades.getString(chave);
	}

	public void desabilidarLogNoConsole(){
		Logger.getRootLogger().removeAppender("stdout");
	}
	
	@SuppressWarnings("resource")
	public void atualizarRelatoriosEImagens() {
		try {
			String caminhoDoJar = getClass().getProtectionDomain()
					.getCodeSource().getLocation().getPath().toString();
			logger.info("Jar com arquivos localizado em " + caminhoDoJar);
			String diretorioDestino = obterConfiguracao(Configuracao.DIRETORIO_RELATORIOS);
			JarFile arquivoJar = new JarFile(caminhoDoJar);
			Enumeration<JarEntry> entries = arquivoJar.entries();
			while (entries.hasMoreElements()) {
				JarEntry arquivo = entries.nextElement();
				String extensao = arquivo.getName().substring(
						arquivo.getName().lastIndexOf(".") + 1);
				if (extensao.equals("jasper") || extensao.equals("gif")) {
					String[] nomeArquivo = arquivo.getName().split("/");
					FileUtils.copyInputStreamToFile(arquivoJar
							.getInputStream(arquivo), new File(diretorioDestino
							+ File.separator + nomeArquivo[1]));
					logger.info("Arquivo " + arquivo.getName()
							+ " extraido com sucesso no diretorio "
							+ diretorioDestino);
				}
			}
		} catch (FileNotFoundException c){
			logger.warn("Arquivo Jar da aplica��o n�o foi localidado.");
		} catch (Exception e) {
			logger.error("Erro durante extra��o de arquivos de relat�rio. \nDetalhes: "
					+ e);
		}
	}
}