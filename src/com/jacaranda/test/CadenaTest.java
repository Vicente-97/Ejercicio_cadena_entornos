package com.jacaranda.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.jacaranda.cadena.Cadena;

class CadenaTest {

	
	@ValueSource(strings= {"Hola", "dado", "nana"})
	@ParameterizedTest	
	void noEsCapicuaCadenatest(String nombre) {
		Cadena cadena1= new Cadena(nombre);
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
		Cadena cadena2= new Cadena(valor);
		assertEquals(cadena2.esCapicua(), true);		
	}
	
	@ValueSource(ints= {69,82,47})
	@ParameterizedTest	
	void  NoesCapicuaCadenaIntegerTest(Integer valor) {
		Cadena cadena5= new Cadena(valor);
		assertEquals(cadena5.esCapicua(), false);		
	}
	
	@ValueSource(strings= {"ana","ana","ana"})
	@ParameterizedTest	
	void  NoEsCapicuaCadenaConString(String valor) {
		Cadena cadena3= new Cadena(valor);
		assertEquals(cadena3.esCapicua(), false);	
		//Espera recibir un Integer, al no hacerlo, pone el campo a null y el boolean es false//
	}
	@ValueSource(longs= {555555,91019,9102019})
	@ParameterizedTest	
	void  EsCapicuaCadenaLong(Long valor) {
		Cadena cadena4= new Cadena(valor);
		assertEquals(cadena4.esCapicua(valor), true);		
	}
	@ValueSource(longs= {152488,8755622,95485323})
	@ParameterizedTest	
	void  NoEsCapicuaCadenaLong(Long valor) {
		Cadena cadena6= new Cadena(valor);
		assertEquals(cadena6.esCapicua(valor), false);		
	}
	
	@ValueSource(doubles= {55.55,12.21,12.21})
	@ParameterizedTest	
	void  EsCapicuaCadenaDouble(double valor) {
		Cadena cadena7= new Cadena(valor);
		assertEquals(cadena7.esCapicua(valor), true);		
	}
	
	@ValueSource(doubles= {82.55,34.21,87.21})
	@ParameterizedTest	
	void  NoEsCapicuaCadenaDouble(double valor) {
		Cadena cadena8= new Cadena(valor);
		assertEquals(cadena8.esCapicua(valor), false);		
	}
	
	
	@ValueSource(strings= {"ana","uyu","unu"})
	@ParameterizedTest	
	void  EsAnagramaCadena(String valor) {
		Cadena cadena9= new Cadena(valor);
		assertEquals(cadena9.esAnagrama(valor), true);		
	}
	
	@ValueSource(strings= {"sol","pie","arena"})
	@ParameterizedTest	
	void  NoEsAnagramaCadena(String valor) {
		Cadena cadena10= new Cadena(valor);
		assertEquals(cadena10.esAnagrama(valor), false);		
	}
	@ValueSource(strings= {"anA","uy","  "})
	@ParameterizedTest	
	void  NoEsAnagramaCadenaEquivalencia(String valor) {
		Cadena cadena10= new Cadena(valor);
		assertEquals(cadena10.esAnagrama(valor), false);		
	}
	
	@Test
	void  NoEsAnagramaCadenaEquivalenciaNull() {
		String valores=null;
		Cadena cadena10= new Cadena(valores);
		assertEquals(cadena10.esAnagrama(), false);		
	}
	
}
