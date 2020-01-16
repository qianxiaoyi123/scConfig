package multipledatasources.service;




import multipledatasources.bean.BtrnbPrsnPutrecBsc;
import multipledatasources.bean.BtrnbPrsnPutrecBscWithBLOBs;
import multipledatasources.dao.BtrnbPrsnPutrecBscDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BtrnbPrsnPutrecBscService {

	@Autowired
	private BtrnbPrsnPutrecBscDao bt;


	public int test01_delete(String btrnbPrsnPutrecBscNo){
		int a=bt.delete(btrnbPrsnPutrecBscNo);
		return a;
	}
	public int test01_update(BtrnbPrsnPutrecBscWithBLOBs btrnbPrsnPutrecBscWithBLOBs){
		int a=bt.update(btrnbPrsnPutrecBscWithBLOBs);
		return a;
	}
	public int test01_BtrnbPrsnPutrecBscInsert(BtrnbPrsnPutrecBscWithBLOBs btrnbPrsnPutrecBscWithBLOBs){
		int a=bt.insert(btrnbPrsnPutrecBscWithBLOBs);
		return a;
	}
	public int test01_BtrnbPrsnPutrecBscALLInsert(List<BtrnbPrsnPutrecBscWithBLOBs> btrnbPrsnPutrecBscWithBLOBs){
		int a=bt.allinsert(btrnbPrsnPutrecBscWithBLOBs);
		return a;
	}

	public BtrnbPrsnPutrecBscWithBLOBs test01_SelectCache(String id){
		return bt.SelectCache(id);
	}


}
