package junit;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.young.elec.container.*;
import com.young.elec.dao.IElecTextDao;
import com.young.elec.domain.ElecText;
import com.young.elec.service.*;
public class TestService {

	@Test
	public void saveElecText() {
		IElecTextService elecTextService = (IElecTextService) ServiceProvider.getService(IElecTextService.SERVICE_NAME);
		//ApplicationContext ac = new ClassPathXmlApplicationContext("/beans.xml");
		//IElecTextService elecTextService = (IElecTextService) ac.getBean(IElecTextService.SERVICE_NAME);
		//ʵ����PO���󣬸�ֵ��ִ�б���
		ElecText elecText = new ElecText();
		elecText.setTextName("Service����");
		elecText.setTextDate(new Date());
		elecText.setTextRemark("Service��ע");
		elecTextService.saveElecText(elecText);
	}
	
}
