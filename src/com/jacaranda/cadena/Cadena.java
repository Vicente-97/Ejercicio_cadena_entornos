package com.jacaranda.cadena;

public class Cadena {

	private Object contenido;
	
	
	public Cadena(Object contenido) {
		this.contenido = contenido;
	}
	
	
	
	public boolean esAnagrama() {
		
		boolean anagrama = false;
		String content = this.contenido instanceof String? (String) contenido: null;
		
		if(content!=null && !content.isEmpty()	&& !content.trim().isEmpty()) {
			anagrama = true;
			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isAlphabetic(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					anagrama = false;
				}
			}
		}
		return anagrama;
		
	}
	
	
	public boolean esAnagrama(String cadena) {
		
		boolean anagrama = false;
		String content = cadena instanceof String? (String) cadena: null;
		
		if(content!=null && !content.isEmpty()	&& !content.trim().isEmpty()) {
			anagrama = true;
			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isAlphabetic(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					anagrama = false;
				}
			}
		}
		return anagrama;
		
	}
	
	
public boolean esCapicua() {
		
		String content = this.contenido instanceof Integer? String.valueOf(this.contenido): null;
		boolean capicua = content!=null && !content.isEmpty() && !content.trim().isEmpty();
		
		if(capicua) {

			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isDigit(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		}
		return capicua;
		
	}
	
	public boolean esCapicua(Integer numero) {
		
		String content = numero instanceof Integer? String.valueOf(numero): null;
		boolean capicua = content!=null && !content.isEmpty() && !content.trim().isEmpty();
		
		if(capicua) {

			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isDigit(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		}
		return capicua;
		
	}
	
	public boolean esCapicua(Long numero) {
		
		String content = numero instanceof Long? String.valueOf(numero): null;
		boolean capicua = content!=null && !content.isEmpty() && !content.trim().isEmpty();
		
		if(capicua) {

			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isDigit(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		}
		return capicua;
		
	}
	
	
	
	public boolean esCapicua(Double numero) {
		
		String content = numero instanceof Double? String.valueOf(numero): null;
		boolean capicua = content!=null && !content.isEmpty() && !content.trim().isEmpty();
		
		if(capicua) {

			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isDigit(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		}
		return capicua;
		
	}
	
}
