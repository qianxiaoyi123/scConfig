package multipledatasources.service;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import multipledatasources.bean.BtrnbChktstDmdDt;
import multipledatasources.dao.BtrnbChktstDmdDtDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BtrnbChktstDmdDtService {
	@Autowired
	private BtrnbChktstDmdDtDao bt;


	public BtrnbChktstDmdDt test01_select(String btrnbChktstDmdDtNo){
		BtrnbChktstDmdDt btrnbChktstDmdDt=bt.select(btrnbChktstDmdDtNo);
		return btrnbChktstDmdDt;
	}
	public List<BtrnbChktstDmdDt> test01_selectAll(){
		List<BtrnbChktstDmdDt>  btrnbChktstDmdDt=bt.selectAll();
		return btrnbChktstDmdDt;
	}
	public PageInfo test01_selectAllpage(){
		BtrnbChktstDmdDt bmd=new BtrnbChktstDmdDt();
		//Page  PageSize
		PageHelper.startPage(3,3);
		List<BtrnbChktstDmdDt>  btrnbChktstDmdDt=bt.selectAll();
		return new PageInfo(btrnbChktstDmdDt);
	}

}
