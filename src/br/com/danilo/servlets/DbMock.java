package br.com.danilo.servlets;

import java.util.ArrayList;
import java.util.List;

public class DbMock {
	private static List<Company> list = new ArrayList<>();
	
//	static {
//		Company company = new Company();
//		company.setName("Google");
//		Company company2 = new Company();
//		company2.setName("Tesla");
//		DbMock.list.add(company);
//		DbMock.list.add(company2);
//	}
	
	public List<Company> getCompanys() {
		return DbMock.list;
	}
	
	public void add(Company company) {
		DbMock.list.add(company);
	}
}