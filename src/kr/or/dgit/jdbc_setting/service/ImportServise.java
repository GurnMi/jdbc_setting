package kr.or.dgit.jdbc_setting.service;

import kr.or.dgit.jdbc_setting.Config;
import kr.or.dgit.jdbc_setting.dao.DatabaseDao;

public class ImportServise implements DbService {
	
	private static final ImportServise Instance = new ImportServise();
	

	public static ImportServise getInstance() {
		return Instance;
	}
	
	public ImportServise() {
	}



	@Override
	public void service() {
		DatabaseDao.getInstance().executeUpdateSQL("SET FOREIGN_KEY_CHECKS = 0");	//외래키 체크 해제
		DatabaseDao.getInstance().executeUpdateSQL("use " + Config.DB_NAME);
		for (String tableName : Config.TABLE_NAME) {
			DatabaseDao.getInstance().executeUpdateSQL(String.format("LOAD DATA LOCAL INFILE '%s' INTO TABLE %s ",	Config.getFilePath(tableName, false), tableName));
		}
		DatabaseDao.getInstance().executeUpdateSQL("SET FOREIGN_KEY_CHECKS = 1");	//외래키 체크 다시 시작
	}

}
