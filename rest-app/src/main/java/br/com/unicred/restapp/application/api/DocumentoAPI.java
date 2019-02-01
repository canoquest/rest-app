package br.com.unicred.restapp.application.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.unicred.restapp.application.model.request.DocumentRequest;
import br.com.unicred.restapp.application.model.response.DocumentResponse;

@Path("/api/v1/document")
@Consumes({"application/json"})
@Produces({"application/json"})
public class DocumentoAPI {

	public DocumentoAPI() {
		super();
	}
	
	@POST
	@Path("/send")
	public DocumentResponse sendDocument(DocumentRequest documentRequest) {
		DocumentResponse documentResponse = new DocumentResponse();
		documentResponse.setMessage("Sucesso!");
		return documentResponse;
	}
	
	@GET
	@Path("/get")
	public DocumentResponse getDocument() {
		DocumentResponse documentResponse = new DocumentResponse();
		documentResponse.setMessage("Novo Sucesso!");
		return documentResponse;
	}

}