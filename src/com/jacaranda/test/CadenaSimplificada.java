package com.jacaranda.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.jacaranda.cadena.Cadena;

class CadenaSimplificada {


	@ValueSource(strings= {"Hola", "dado", "nana"})
	@ParameterizedTest	
	void noEsCapicuaCadenatest(String nombre) {
		com.jacaranda.cadena.CadenaSimplificada cadena1= new com.jacaranda.cadena.CadenaSimplificada(nombre);
		//Con Equals//
		assertEquals(cadena1.esCapicua(), false);
		//sin el Equals//
		assertFalse(cadena1.esCapicua());
		// con un assert, siempre espera recibir un true, lo negamos si la condicion que nos val es false.//
		assert(!cadena1.esCapicua());
				
	}

	@ValueSource(ints= {161,2992,3003})
	@ParameterizedTest	
	void  esCapicuaCadenaIntegerTest(Integer valor) {
		com.jacaranda.cadena.CadenaSimplificada cadena2= new com.jacaranda.cadena.CadenaSimplificada(valor);
		assertEquals(cadena2.esCapicua(), true);		
	}
	
	@ValueSource(ints= {69,82,47})
	@ParameterizedTest	
	void  NoesCapicuaCadenaIntegerTest(Integer valor) {
		com.jacaranda.cadena.CadenaSimplificada cadena5= new com.jacaranda.cadena.CadenaSimplificada(valor);
		assertEquals(cadena5.esCapicua(), false);		
	}
	
	@ValueSource(strings= {"ana","ana","ana"})
	@ParameterizedTest	
	void  NoEsCapicuaCadenaConString(String valor) {
		com.jacaranda.cadena.CadenaSimplificada cadena3= new com.jacaranda.cadena.CadenaSimplificada(valor);
		assertEquals(cadena3.esCapicua(), false);	
		//Espera recibir un Integer, al no hacerlo, pone el campo a null y el boolean es false//
	}
	@ValueSource(longs= {555555,91019,9102019})
	@ParameterizedTest	
	void  EsCapicuaCadenaLong(Long valor) {
		com.jacaranda.cadena.CadenaSimplificada cadena4= new com.jacaranda.cadena.CadenaSimplificada(valor);
		assertEquals(cadena4.esCapicua(valor), true);		
	}
	@ValueSource(longs= {152488,8755622,95485323})
	@ParameterizedTest	
	void  NoEsCapicuaCadenaLong(Long valor) {
		com.jacaranda.cadena.CadenaSimplificada cadena6= new com.jacaranda.cadena.CadenaSimplificada(valor);
		assertEquals(cadena6.esCapicua(valor), false);		
	}
	
	@ValueSource(doubles= {55.55,12.21,12.21})
	@ParameterizedTest	
	void  EsCapicuaCadenaDouble(double valor) {
		com.jacaranda.cadena.CadenaSimplificada cadena7= new com.jacaranda.cadena.CadenaSimplificada(valor);
		assertEquals(cadena7.esCapicua(valor), true);		
	}
	
	@ValueSource(doubles= {82.55,34.21,87.21})
	@ParameterizedTest	
	void  NoEsCapicuaCadenaDouble(double valor) {
		com.jacaranda.cadena.CadenaSimplificada cadena8= new com.jacaranda.cadena.CadenaSimplificada(valor);
		assertEquals(cadena8.esCapicua(valor), false);		
	}
	
	
	@ValueSource(strings= {"ana","uyu","unu"})
	@ParameterizedTest	
	void  EsAnagramaCadena(String valor) {
		com.jacaranda.cadena.CadenaSimplificada cadena9= new com.jacaranda.cadena.CadenaSimplificada(valor);
		assertEquals(cadena9.esAnagrama(valor), true);		
	}
	
	@ValueSource(strings= {"sol","pie","arena"})
	@ParameterizedTest	
	void  NoEsAnagramaCadena(String valor) {
		com.jacaranda.cadena.CadenaSimplificada cadena10= new com.jacaranda.cadena.CadenaSimplificada(valor);
		assertEquals(cadena10.esAnagrama(valor), false);		
	}

	@ValueSource(strings= {"anA","uy","  "})
	@ParameterizedTest	
	void  NoEsAnagramaCadenaEquivalencia(String valor) {
		com.jacaranda.cadena.CadenaSimplificada cadena10= new com.jacaranda.cadena.CadenaSimplificada(valor);
		assertEquals(cadena10.esAnagrama(valor), false);		
	}
	
	@Test
	void  NoEsAnagramaCadenaEquivalenciaNull() {
		String valores=null;
		com.jacaranda.cadena.CadenaSimplificada cadena10= new com.jacaranda.cadena.CadenaSimplificada(valores);
		assertEquals(cadena10.esAnagrama(), false);		
	}


	
}
