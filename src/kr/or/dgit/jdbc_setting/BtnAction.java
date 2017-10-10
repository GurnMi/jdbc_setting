package kr.or.dgit.jdbc_setting;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import kr.or.dgit.jdbc_setting.service.DbService;
import kr.or.dgit.jdbc_setting.service.ExportService;
import kr.or.dgit.jdbc_setting.service.ImportServise;
import kr.or.dgit.jdbc_setting.service.InitService;

public class BtnAction extends AbstractAction {
	
	public BtnAction(String name) {
		super(name);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 초기화, 백업, 복원
		DbService serivce = null;
		
		switch(e.getActionCommand()){
			case "초기화":
				serivce = InitService.getInstance();
				break;
			case "백업":
				serivce = ExportService.getInstance();
				break;
			case "복원":
				serivce = ImportServise.getInstance();
				break;
		}
		serivce.service();
		JOptionPane.showMessageDialog(null, e.getActionCommand()+"(이)가 완료되었습니다.");
		
		
	}

}
