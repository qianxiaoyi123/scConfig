package multipledatasources.datasource;

import multipledatasources.datasource.DataSourceType.DataBaseType;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAop {
	@Before("execution(* multipledatasources.service..*.test01*(..))")
	public void setDataSource2test01() {
		System.err.println("test01业务");
		DataSourceType.setDataBaseType(DataBaseType.TEST01);
	}
	
	@Before("execution(* multipledatasources.service..*.test02*(..))")
	public void setDataSource2test02() {
		System.err.println("test02业务");
		DataSourceType.setDataBaseType(DataBaseType.TEST02);
	}
}
