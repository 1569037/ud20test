package test;

import JUnit.Junit09_Geometria.dto.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeometriaTest {

	Geometria g=new Geometria();
	Geometria geo = new Geometria(1);
	@Test
	public void testAreaCuadrado()
	{
		System.out.println("testAreaCuadrado()");
		
		int resul = geo.areacuadrado(2);
		int esper = 4;
		assertEquals(esper,resul);
		
	}
	
	@Test
	public void testAreaCirculo()
	{
		System.out.println("testAreaCirculo()");
		double resul = g.areaCirculo(2);
		int esper = 12;
		assertEquals(esper,resul);
	}
	@Test
	public void testAreaTriangulo()
	{
		System.out.println("testAreaTriangulo()");
		int resul = g.areatriangulo(2,2);
		int esper = 2;
		assertEquals(esper, resul);
	}
	@Test
	public void testAreaRectangulo()
	{
		System.out.println("testAreaRectangulo()");
		int resul = g.arearectangulo(2, 2);
		int esper = 4;
		assertEquals(esper,resul);
	}
	@Test
	public void testAreaPentagono()
	{
		System.out.println("testAreaPentagono()");
		int resul = g.areapentagono(2, 2);
		int esper = 2;
		assertEquals(esper,resul);
	}
	@Test
	public void testAreaRombo()
	{
		System.out.println("testAreaRombo()");
		int resul = g.arearombo(2, 2);
		int esper = 2;
		assertEquals(esper,resul);
	}
	@Test
	public void testAreaRomboide()
	{
		System.out.println("testAreaRomboide()");
		int resul = g.arearomboide(2, 2);
		int esper = 4;
		assertEquals(esper,resul);
	}
	@Test
	public void testAreaTrapecio()
	{
		System.out.println("testAreaTrapecio()");
		int resul = g.areatrapecio(2, 2, 2);
		int esper = 4;
		assertEquals(esper,resul);
	}
	@Test
	public void testFigura()
	{
		System.out.println("testAreaFigura()");
		String resul = g.figura(1);
		String esper = "cuadrado";
		assertEquals(esper,resul);
		
		String resul2 = g.figura(2);
		String esper2 = "Circulo";
		assertEquals(esper2,resul2);
		
		String resul3 = g.figura(3);
		String esper3 = "Triangulo";
		assertEquals(esper3,resul3);
		
		String resul4 = g.figura(4);
		String esper4 = "Rectangulo";
		assertEquals(esper4,resul4);
		
		String resul5 = g.figura(5);
		String esper5 = "Pentagono";
		assertEquals(esper5,resul5);
		
		String resul6 = g.figura(6);
		String esper6 = "Rombo";
		assertEquals(esper6,resul6);
		
		String resul7 = g.figura(7);
		String esper7 = "Romboide";
		assertEquals(esper7,resul7);
		
		String resul8 = g.figura(8);
		String esper8 = "Trapecio";
		assertEquals(esper8,resul8);
		
		String resul9 = g.figura(9);
		String esper9 = "Default";
		assertEquals(esper9,resul9);
	}
	@Test
	public void testGettersSetters()
	{
		geo.setArea(2);
		geo.setId(2);
		geo.setNom("paco");
		
		assertEquals(2,geo.getArea());
		assertEquals(2,geo.getId());
		assertEquals("paco",geo.getNom());
	}
	@Test
	public void testToString()
	{
		geo.setArea(2);
		geo.setId(2);
		geo.setNom("paco");
		String a = geo.toString();
		String p = "Geometria [id=2, nom=paco, area=2]";
		assertEquals(p,a);
	}
	
}
