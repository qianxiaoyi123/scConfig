package multipledatasources.service;

import multipledatasources.bean.TeachersBean;
import multipledatasources.dao.TransactionDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
public class TransactionService2 {
	@Autowired
	private TransactionDao2 ts2;

	@Transactional
	public void test02_saveTeachersBean(TeachersBean t) {
		ts2.save(t);
	}
	public Map<String, Object> test02_select() {

		return ts2.select();
	}


}
