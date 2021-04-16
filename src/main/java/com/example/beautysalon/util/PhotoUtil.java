package com.example.beautysalon.util;

/**
 * @author Lee
 * @date 2021.4.13  14:34
 * @description
 */

public class PhotoUtil {

//    //该路径是配置绝对路径进行上传
//    public final static String SYS_PATH = "E:\\work-space\\idea\\lqx\\src\\main\\resources\\static\\img\\pic";
//    public final static String STATIC_PATH = "/img/pic/";
//    //这个是获取服务器上边的实际路径，保存的图片会出现在target当中
//    public final static String REAL_PATH = ClassUtils.getDefaultClassLoader().getResource("static").getPath()+"/img/pic";
//    public static String savePhoto(MultipartFile multipartFile, String id){
//        String inputname = multipartFile.getOriginalFilename();
//
//        String outname = id +".jpg";
//        File savedFile =  new File(REAL_PATH , outname);
//
//        try {
//            FileUtils.copyInputStreamToFile(multipartFile.getInputStream(),savedFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return outname;
//    }
}
