package org.cliente.ClienteContribuyente;

import java.util.List;

import org.certificatic.contribuyente.service.Contribuyente;
import org.certificatic.contribuyente.service.ContribuyenteService;
import org.certificatic.contribuyente.service.ContribuyenteServiceImplService;

public class ClienteContribuyente {
	private ContribuyenteService contribuyenteService = new ContribuyenteServiceImplService()
			.getContribuyenteServiceImplPort();

	public Contribuyente crearContribuyente(Contribuyente contribuyente) {

		return contribuyenteService.crearcontribuyente(contribuyente);
	}

	public List<Contribuyente> ObtenerContribuyentes() {
		contribuyenteService = new ContribuyenteServiceImplService().getContribuyenteServiceImplPort();

		return contribuyenteService.obtenerContribuyentes();

	}
}
