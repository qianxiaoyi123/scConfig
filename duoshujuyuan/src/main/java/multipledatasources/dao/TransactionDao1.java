package multipledatasources.dao;


import multipledatasources.bean.TestBean;
import multipledatasources.mapper.TransactionMapping1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component

public class TransactionDao1 {
	@Autowired
	private TransactionMapping1 tm1;

	public void save(TestBean t) {
		tm1.save(t);
	}
	public Map<String,Object> select() {
		return tm1.select();
	}
	public Map<String,Object> select3() {
		return tm1.select3();
	}

}
