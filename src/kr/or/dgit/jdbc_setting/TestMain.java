package kr.or.dgit.jdbc_setting;

import java.sql.Connection;

import kr.or.dgit.jdbc_setting.jdbc.DBCon;
import kr.or.dgit.jdbc_setting.jdbc.JdbcUtil;
import kr.or.dgit.jdbc_setting.service.DbService;
import kr.or.dgit.jdbc_setting.service.ExportService;
import kr.or.dgit.jdbc_setting.service.ImportService;
import kr.or.dgit.jdbc_setting.service.InitService;

public class TestMain {

	public static void main(String[] args) {
		
		
		DBCon dbCon =DBCon.getInstance();
		Connection connection = dbCon.getConnection();
		System.out.println(connection);
		
		
		//
		DbService serivce = InitService.getInstance();
		serivce.service();

		serivce = ImportService.getInstance();
		serivce.service();
		
		serivce = ExportService.getInstance();
		serivce.service();
		
		JdbcUtil.close(connection);			//종료해줘야됨
	}

}
