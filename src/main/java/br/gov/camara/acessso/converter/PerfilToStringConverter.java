package br.gov.camara.acessso.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.gov.camara.acessso.model.SPB_Perfil_Acesso;
import br.gov.camara.acessso.repository.PerfilRepository;


@Component
public class PerfilToStringConverter implements Converter<String, SPB_Perfil_Acesso>{
	@Autowired
	private PerfilRepository perfildao;

	@Override
	public SPB_Perfil_Acesso convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return perfildao.findById(id).get();
	}


}
