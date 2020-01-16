package multipledatasources.dao;


import multipledatasources.bean.BtrnbChktstDmdDt;
import multipledatasources.mapper.BtrnbChktstDmdDtMapper;
import multipledatasources.msg.ReceiveMsgWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BtrnbChktstDmdDtDao {
	@Autowired
	private BtrnbChktstDmdDtMapper bt;


	public BtrnbChktstDmdDt select(String btrnbChktstDmdDtNo) {
		BtrnbChktstDmdDt btrnbChktstDmdDt=bt.selectByPrimaryKey(btrnbChktstDmdDtNo);
		return btrnbChktstDmdDt;
	}
	public List<BtrnbChktstDmdDt>  selectAll() {
		List<BtrnbChktstDmdDt> btrnbChktstDmdDt=bt.selectAll();
		return btrnbChktstDmdDt;
	}
}
