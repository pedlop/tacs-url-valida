package com.br.ufg.inf.url;

import org.junit.Assert;
import org.junit.Test;

public class UrlValidaTeste {
	@Test
    public void converteNumeroTeste(){
    	UrlValida urlValida = new UrlValida();
    	
    	urlValida.validaURL("http://globoesporte.globo.com/go/futebol/times/goias");
    	urlValida.validaURL("https://outlook.live.com/owa/?realm=hotmail.com&path=/mail/sentitems/rp");
    	urlValida.validaURL("http://www.google.com/mail/user=fulano");
    	urlValida.validaURL("http://www.google");
    }  
}
