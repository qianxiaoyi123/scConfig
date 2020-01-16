package multipledatasources.mapper;


import multipledatasources.bean.TeachersBean;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface TransactionMapping2 {

	void save(TeachersBean t);
	Map<String,Object> select();

}
