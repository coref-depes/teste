package br.gov.camara.acessso.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.gov.camara.acessso.model.SPB_Permissao_Acesso;

import br.gov.camara.acessso.repository.PermissaoRepository;


	@Component
	public class PermissaoToStringConverter  implements Converter<String, SPB_Permissao_Acesso> {
		
	
		
		@Autowired
		private PermissaoRepository permissaodao;

		@Override
		public SPB_Permissao_Acesso convert(String text) {
			if (text.isEmpty()) {
				return null;
			}
			Long id = Long.valueOf(text);
			return permissaodao.findById(id).get();
		}

	
	
	
}
