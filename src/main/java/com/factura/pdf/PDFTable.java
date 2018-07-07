package com.factura.pdf;

import java.util.List;

class PDFTable {

	private final int rowsCount;
	private final int colsCount;
	private final List<String> headers;
	private final List<List<String>> body;

	public PDFTable(List<String> headers, List<List<String>> body) {
		this.headers = headers;
		this.body = body;
		this.colsCount = headers.size();
		this.rowsCount = body.size();
	}

	public int getRowsCount() {
		return rowsCount;
	}

	public int getColsCount() {
		return colsCount;
	}

	public List<String> getHeaders() {
		return headers;
	}

	public List<List<String>> getBody() {
		return body;
	}

}
