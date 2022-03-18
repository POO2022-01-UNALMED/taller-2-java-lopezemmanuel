package test;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestMetodos {
	
	@Test
   	public void testMetodoCambiarColor(){
		
		Asiento a1 = new Asiento();
		Asiento a2 = new Asiento();
		
		a1.color = "blanco";
		a2.color = "blanco";
		
		a1.cambiarColor("naranja");
		a2.cambiarColor("verde");
		
		boolean ok = false;
		
		if(a1.color.equals("blanco") && 
				a2.color.equals("verde")) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con el metodo cambiarColor y sus restricciones de la clase Asiento");
    }
	
	@Test
   	public void testMetodoCambiarRegistro(){
		
		Motor m = new Motor();
		
		m.registro = 123;
		m.cambiarRegistro(423);
		
		boolean ok = false;
		
		if(m.registro == 423) {
			ok = true;
		}

		assertTrue(ok, "Hay un problema con el metodo cambiarRegistro y sus restricciones de la clase Motor");
    }
	
	@Test
   	public void testMetodoAsignarTipo(){
		
		Motor m1 = new Motor();
		Motor m2 = new Motor();
		m1.tipo = "normal";
		m2.tipo = "normal";
		
		m1.asignarTipo("hibrido");
		m2.asignarTipo("electrico");
		boolean ok = false;
		
		if(m1.tipo.equals("normal") && 
				m2.tipo.equals("electrico")) {
			ok = true;
		}

		assertTrue(ok, "Hay un problema con el metodo asignarTipo y sus restricciones de la clase Motor");
    }
	
	@Test
   	public void testMetodoCantidadAsientos(){
		
		Auto a = new Auto();
		
		a.asientos = new Asiento[5];
		
		a.asientos[0] = new Asiento();
		a.asientos[4] = new Asiento();

		boolean ok = false;
		
		if(a.cantidadAsientos() == 2) {
			ok = true;
		}

		assertTrue(ok, "Hay un problema con el metodo cantidadAsientos y sus restricciones de la clase Auto");
    }
	
	@Test
   	public void testMetodoVerificarIntegridad(){
		
		Auto a = new Auto();
		Motor m = new Motor();
		a.registro = 32;
		m.registro = 32;
		a.motor = m;
		a.asientos = new Asiento[5];
		a.asientos[0] = new Asiento();
		a.asientos[0].registro = 32;
		a.asientos[4] = new Asiento();
		a.asientos[4].registro = 32;
		
		
		Auto a2 = new Auto();
		Motor m2 = new Motor();
		a2.registro = 32;
		m2.registro = 32;
		a2.motor = m2;
		a2.asientos = new Asiento[5];
		a2.asientos[0] = new Asiento();
		a2.asientos[0].registro = 40;
		a2.asientos[4] = new Asiento();
		a2.asientos[4].registro = 32;

		boolean ok = false;
		
		if(a.verificarIntegridad().equals("Auto original") && 
				a2.verificarIntegridad().equals("Las piezas no son originales")) {
			ok = true;
		}

		assertTrue(ok, "Hay un problema con el metodo verificarIntegridad y sus restricciones de la clase Auto");
    }

}
