//package utils.excelUtils;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Excel2Object {
//
//    public static List<ApiInfo> loadApiInfo(String xlsPath) throws IOException {
//        List temp = new ArrayList();
//        FileInputStream fileIn = new FileInputStream(xlsPath);
//        //根据指定的文件输入流导入Excel从而产生Workbook对象
//        Workbook wb0 = new HSSFWorkbook(fileIn);
//        //获取Excel文档中的第一个表单
//        Sheet sheet0 = wb0.getSheetAt(0);
//        //对Sheet中的每一行进行迭代
//        for (Row r: sheet0
//             ) {
//            //从第二行开始循环
//            if (r.getRowNum()<1) {
//                continue;
//            }
//            //创建实体类
//            ApiInfo apiInfo = new ApiInfo();
//            //取出当前行第1个单元格数据，并封装在apiInfo 实体name属性上
//            apiInfo.setName(r.getCell(0).getStringCellValue());
//            //取出当前行第2个单元格数据，并封装在apiInfo 实体desc属性上
//            apiInfo.setDesc(r.getCell(1).getStringCellValue());
//            temp.add(apiInfo);
//        }
//        fileIn.close();
//        return temp;
//    }
//
//}
