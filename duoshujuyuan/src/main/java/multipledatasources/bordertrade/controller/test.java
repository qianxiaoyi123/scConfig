package multipledatasources.bordertrade.controller;

import multipledatasources.water.controller.res.Response;

/**公路舱单
 * Created by zhangmingyu on 2019/11/19.
 */
public class test {
    public static void main(String[] args) {
//        private String manifest_id;// 货物运输批次号/航班航次号
//        private String bill_no;// 提单号
//        private String decl_traf_mode;// 运输方式代码(4 公路运输
//        private String i_e_flag;// 进出境标志（I进口 E出口）
//        private String customscode;// 进出境海关代码（4位关区代码）
//        private String form_id;// 互市申报单号
//        private String weight;// 反核注重量
        DoCheckRelManifestData manifest=new DoCheckRelManifestData(
                "4123456789041",
                "001",
                "4",
                "E",
                "7207",
                "123",
                "100");
        DoCheckRelManifestServiceImpl d=new DoCheckRelManifestServiceImpl();
        try {
            //公路核注核销接口
         //   Response<String> res=d.queryDoCheckRelManifest(manifest);
            //反核接口
            Response<String> res=d.queryDoAntiCheckRelManifest(manifest);
            System.out.println(res.getHeader().getCode()+res.getHeader().getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
