package multipledatasources.mapper;


import multipledatasources.bean.TestBean;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface TransactionMapping1 {

	void save(TestBean t);
	Map<String,Object> select();
	Map<String,Object> select3();

}
