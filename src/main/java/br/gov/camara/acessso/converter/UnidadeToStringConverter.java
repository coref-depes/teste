package br.gov.camara.acessso.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.gov.camara.acessso.model.SPB_Unidade_Camara_Boletim;
import br.gov.camara.acessso.repository.UnidadeCamaraRepository;

@Component
public class UnidadeToStringConverter implements Converter<String, SPB_Unidade_Camara_Boletim>{

	@Autowired
	private UnidadeCamaraRepository unidadedao;

	@Override
	public SPB_Unidade_Camara_Boletim convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return unidadedao.findById(id).get();
	}


}
