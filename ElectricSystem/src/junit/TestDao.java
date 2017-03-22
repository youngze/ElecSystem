package junit;

import java.io.Serializable;
import java.util.Date;

import com.young.elec.container.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.young.elec.dao.*;
import com.young.elec.domain.*;

public class TestDao {


	/*public void saveElecText() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/beans.xml");
		IElecTextDao elecTextDao = (IElecTextDao) ac.getBean(IElecTextDao.SERVICE_NAME);
		//实例化PO对象，赋值，执行保存
		ElecText elecText = new ElecText();
		elecText.setTextName("DAO名称");
		elecText.setTextDate(new Date());
		elecText.setTextRemark("DAO备注");
		elecTextDao.save(elecText);
	}*/
	
	/*public void update() {
		//ApplicationContext ac = new ClassPathXmlApplicationContext("/beans.xml");
		IElecTextDao elecTextDao = (IElecTextDao) ServiceProvider.getService(IElecTextDao.SERVICE_NAME);
		//实例化PO对象，赋值，执行保存
		ElecText elecText = new ElecText();
		elecText.setTextID(28);
		elecText.setTextName("28");
		elecText.setTextDate(new Date());
		elecText.setTextRemark("28备注");
		elecTextDao.update(elecText);
	}*/
	@Test
	public void findObjectByID() {
		IElecTextDao elecTextDao = (IElecTextDao) ServiceProvider.getService(IElecTextDao.SERVICE_NAME);
		Serializable id = 28;		
		ElecText elecText = elecTextDao.findObjectByID(id);
		System.out.println(elecText.getTextName() + " " + elecText.getTextDate());
	}
	
}
