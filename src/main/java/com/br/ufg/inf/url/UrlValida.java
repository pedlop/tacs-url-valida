package com.br.ufg.inf.url;

import java.util.ArrayList;

public class UrlValida {
    public void validaURL( String url ) {	
        String[] urlpartes = new String[20];
        urlpartes = url.split("/");
        if(urlpartes.length > 3) {
	        System.out.println("Protocolo: " + urlpartes[0]);
	        String dominio = urlpartes[2];
	        String[] dominios = dominio.split("\\.");
	        System.out.println("Host: "+ dominios[0]);
	        String dominioCompleto = dominios[1];
	        for(int i = 2; i< dominios.length; i++) {
	        	dominioCompleto += "." + dominios[i];
	        }
	        System.out.println("Dominio: " + dominioCompleto);
	        System.out.println("Path: " + urlpartes[3]);
	        String parametros = "";
	        for(int i = 4; i < urlpartes.length; i++) {
	        	parametros += "/"+urlpartes[i];
	        }
	        System.out.println("Parametros: " + parametros);
        } else {
        	System.out.println("URL Invalida!");
        }
        
    }
}
