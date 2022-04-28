package com.jacaranda.cadena;

	public class CadenaSimplificada {

		private Object contenido;
		
		
		public CadenaSimplificada(Object contenido) {
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
		
		/**
		 * Se ha simplificado el metodo para que pueda aceptar todo tipo de numeros, desde Integer, hasta float, double, etc.
		 * @return
		 */
		public boolean esAnagrama(String cadena) {
			
			boolean anagrama = false;
			String content = cadena instanceof String? (String) cadena: null;
			
			 if (this.contenido instanceof Double || this.contenido instanceof Integer ||  this.contenido instanceof Long) {
		            content = String.valueOf(this.contenido);
		        }
			
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
		
		/**
		 * Se ha simplificado el metodo para que pueda aceptar todo tipo de numeros, desde Integer, hasta float, double, etc.
		 * @return
		 */
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
		
		public boolean esCapicua(Number numero) {
			
			String content = numero instanceof Integer? String.valueOf(numero): null;
			if (this.contenido instanceof Double || this.contenido instanceof Integer ||  this.contenido instanceof Long) {
	            content = String.valueOf(this.contenido);
	        }
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
		//metodos eliminados//
	}