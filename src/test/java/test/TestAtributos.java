package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestAtributos {
	
	@Test
   	public void testAtributosMotor(){
		
		Motor m = new Motor();
		m.numeroCilindros = 4;
		m.registro = 142;
		m.tipo = "electrico";
		
		assertTrue(true, "Hay un problema con los atributos de la Clase Motor");
    }
	
	@Test
   	public void testAtributosAsiento(){
		
		Asiento a = new Asiento();
		a.color = "blanco";
		a.precio = 5000;
		a.registro = 435;
		
		assertTrue(true, "Hay un problema con los atributos de la Clase Asiento");
    }
	
	@Test
   	public void testAtributosAuto(){
		
		Auto v = new Auto();
		v.asientos = new Asiento[5];
		v.marca = "tesla";
		v.modelo = "model 3";
		v.motor = new Motor();
		v.precio = 33000;
		v.registro = 341;
		
		assertTrue(true, "Hay un problema con los atributos de la Clase Auto");
    }

}
