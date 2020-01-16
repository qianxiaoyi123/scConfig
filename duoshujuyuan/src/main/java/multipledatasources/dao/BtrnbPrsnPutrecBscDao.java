package multipledatasources.dao;



import multipledatasources.bean.BtrnbPrsnPutrecBsc;
import multipledatasources.bean.BtrnbPrsnPutrecBscWithBLOBs;
import multipledatasources.mapper.BtrnbPrsnPutrecBscMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BtrnbPrsnPutrecBscDao {
	@Autowired
	private BtrnbPrsnPutrecBscMapper bt;


	public int delete(String btrnbPrsnPutrecBscNo) {
		int a=bt.deleteByPrimaryKey(btrnbPrsnPutrecBscNo);
		return a;
	}
	public int update(BtrnbPrsnPutrecBscWithBLOBs btrnbPrsnPutrecBscWithBLOBs) {
		int a=bt.updateByPrimaryKeySelective(btrnbPrsnPutrecBscWithBLOBs);
		return a;
	}
	public int insert(BtrnbPrsnPutrecBscWithBLOBs btrnbPrsnPutrecBscWithBLOBs) {
		int a=bt.insertSelective(btrnbPrsnPutrecBscWithBLOBs);
		return a;
	}
	public int allinsert(List<BtrnbPrsnPutrecBscWithBLOBs> btrnbPrsnPutrecBscWithBLOBs) {
		int a=bt.insertSelectiveallinsert(btrnbPrsnPutrecBscWithBLOBs);
		return a;
	}

	public BtrnbPrsnPutrecBscWithBLOBs SelectCache(String id){
		return bt.selectByPrimaryKey(id);
	}

}
