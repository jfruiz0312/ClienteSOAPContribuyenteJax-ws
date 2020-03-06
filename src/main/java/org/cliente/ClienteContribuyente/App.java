package org.cliente.ClienteContribuyente;

import java.util.Iterator;
import java.util.List;

import org.certificatic.contribuyente.service.Contribuyente;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {

		ClienteContribuyente cliente = new ClienteContribuyente();

		if (cliente!=null) {
			
			Contribuyente contribuyente = new Contribuyente();
			
			contribuyente.setCodigo(20);
			contribuyente.setNombreContribuyente("utec");
			contribuyente.setNumeroRegistro("999");
			contribuyente.setNit("222222");
			contribuyente.setRazonSocial("Education");
			contribuyente.setGiro("education");
			contribuyente.setDireccion("SAn salvador");
			contribuyente.setFecha("04/06/2020");

			cliente.crearContribuyente(contribuyente);
		}
		
			List<Contribuyente> contribuyentes = cliente.ObtenerContribuyentes();
			for (Contribuyente contribuyente : contribuyentes) {
				System.out.println("Codigo              :" + contribuyente.getCodigo());
				System.out.println("Direccion           :" + contribuyente.getDireccion());
				System.out.println("Fecha               :" + contribuyente.getFecha());
				System.out.println("Giro                :" + contribuyente.getGiro());
				System.out.println("Nombre contribuyente:" + contribuyente.getNombreContribuyente());
				System.out.println("Numero registro     :" + contribuyente.getNumeroRegistro());
				System.out.println("Razon Social        :" + contribuyente.getRazonSocial());
				System.out.println("Fin                 :");
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
			}
		}

	}


