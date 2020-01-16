package multipledatasources.dao;



import multipledatasources.bean.TeachersBean;
import multipledatasources.mapper.TransactionMapping2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TransactionDao2 {
	@Autowired
	private TransactionMapping2 tm2;

	public void save(TeachersBean t) {
		tm2.save(t);
	}
	public Map<String, Object> select() {
		return tm2.select();
	}

}
