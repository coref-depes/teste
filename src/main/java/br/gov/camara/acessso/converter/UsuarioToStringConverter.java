package br.gov.camara.acessso.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.gov.camara.acessso.model.SPB_Usuario;
import br.gov.camara.acessso.repository.UsuarioRepository;



@Component
public class UsuarioToStringConverter  implements Converter<String, SPB_Usuario> {
	
	@Autowired
	private UsuarioRepository usuariodao;

	@Override
	public SPB_Usuario convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return usuariodao.findById(id).get();
	}

}
