package utils.excelUtils;

import java.io.IOException;
import java.util.List;

public class Client {
    public static void main(String[] args) throws IOException {

        //TODO
        //1. 上传 xls 文件到指定目录；
        //2.读取上一步上传的 xls 文件并解析成 List<Object>;
        //3.持久化 List<Object> 中的每个 Object；

        List<ApiInfo> apiInfoList =  Excel2Object.loadApiInfo("E:\\testworkbook.xls");
        System.out.println("表格中一共有"+ apiInfoList.size() +"个api");

        for (int i = 0; i < apiInfoList.size(); i++) {
            System.out.println("------第" + (i+1) + "个 API 的信息如下------");
            System.out.println("API 名称：" + apiInfoList.get(i).getName());
            System.out.println("API 描述：" + apiInfoList.get(i).getDesc());
        }
    }
}
