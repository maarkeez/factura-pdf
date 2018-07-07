package com.factura;

import java.io.IOException;

import com.factura.pdf.PDFService;

public class Main {

	public static void main(String args[]) throws IOException {
		PDFService.singleton().createPdf("test1", "/Users/dmarq/Desktop/pdf-test/prueba-pdf.pdf");
		System.out.println("PDF created");

	}
}
