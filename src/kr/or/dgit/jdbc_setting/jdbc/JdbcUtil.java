package kr.or.dgit.jdbc_setting.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcUtil {
	public static void close(Connection con){
		if(con !=null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
