package multipledatasources.mapper;

import multipledatasources.bean.BtrnbChktstDmdDt;
import multipledatasources.msg.ReceiveMsgWithBLOBs;

import java.util.List;
import java.util.Map;

public interface BtrnbChktstDmdDtMapper {
    /**
     *
     * @mbggenerated 2019-03-25
     */
    int deleteByPrimaryKey(String btrnbChktstDmdDtNo);

    /**
     *
     * @mbggenerated 2019-03-25
     */
    int insert(BtrnbChktstDmdDt record);

    /**
     *
     * @mbggenerated 2019-03-25
     */
    int insertSelective(BtrnbChktstDmdDt record);

    /**
     *
     * @mbggenerated 2019-03-25
     */
    BtrnbChktstDmdDt selectByPrimaryKey(String btrnbChktstDmdDtNo);

    /**
     *
     * @mbggenerated 2019-03-25
     */
    /**
     *
     * @mbggenerated 2019-03-25
     */

    List<BtrnbChktstDmdDt> selectAll();

    int updateByPrimaryKeySelective(BtrnbChktstDmdDt record);

    /**
     *
     * @mbggenerated 2019-03-25
     */
    int updateByPrimaryKey(BtrnbChktstDmdDt record);
}