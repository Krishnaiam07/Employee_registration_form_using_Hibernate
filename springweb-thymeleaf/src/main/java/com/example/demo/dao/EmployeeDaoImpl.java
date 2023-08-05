//package com.example.demo.dao;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class EmployeeDaoImpl implements EmployeeDao{
//
//@Autowired
//	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//
//	@Override
//	public int addLanguage(long empId, String empLanguage) {
//	
//
//		String sql = "INSERT INTO employee_language(employee_id,employee_language) "
//				+ " values (:employee_id, :employee_language, now())";
//
//		int save = 0;
//		MapSqlParameterSource language = new MapSqlParameterSource();
//
//		language.addValue("employee_id",empId);
//	language.addValue("employee_language", empLanguage);
//
//		try {
//
//			save = namedParameterJdbcTemplate.update(sql, language);  
//		} catch (Exception e) { 
//			e.printStackTrace();
//			save = 0;
//		}
//
//		return save;
//	}
//}