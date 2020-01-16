package multipledatasources.service;


import multipledatasources.bean.TestBean;
import multipledatasources.dao.TransactionDao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
public class TransactionService1 {
	@Autowired
	private TransactionDao1 ts1;

	@Transactional
	public void test01_saveTestBean(TestBean t) {
		ts1.save(t);
	}

	public Map<String,Object> test01_select(){
		return ts1.select();
	}
	public Map<String,Object> test01_select3(){
		return ts1.select3();
	}

}
