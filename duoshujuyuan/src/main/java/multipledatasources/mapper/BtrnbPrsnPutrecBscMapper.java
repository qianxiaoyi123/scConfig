package multipledatasources.mapper;

import multipledatasources.bean.BtrnbPrsnPutrecBsc;
import multipledatasources.bean.BtrnbPrsnPutrecBscWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BtrnbPrsnPutrecBscMapper {
    /**
     *
     * @mbggenerated 2019-03-27
     */
    int deleteByPrimaryKey(String btrnbPrsnPutrecBscNo);

    /**
     *
     * @mbggenerated 2019-03-27
     */
    int insert(BtrnbPrsnPutrecBscWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-03-27
     */
    int insertSelective(BtrnbPrsnPutrecBscWithBLOBs record);
    int insertSelectiveallinsert( List<BtrnbPrsnPutrecBscWithBLOBs> item);

    /**
     *
     * @mbggenerated 2019-03-27
     */
    BtrnbPrsnPutrecBscWithBLOBs selectByPrimaryKey(String btrnbPrsnPutrecBscNo);

    /**
     *
     * @mbggenerated 2019-03-27
     */
    int updateByPrimaryKeySelective(BtrnbPrsnPutrecBscWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-03-27
     */
    int updateByPrimaryKeyWithBLOBs(BtrnbPrsnPutrecBscWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-03-27
     */
    int updateByPrimaryKey(BtrnbPrsnPutrecBsc record);
}