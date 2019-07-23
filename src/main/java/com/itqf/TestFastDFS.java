package com.itqf;

import org.csource.fastdfs.*;

/**
 * 别闹！学习呢！
 */
public class TestFastDFS {
    public static void main(String[] args) throws Exception {
        //声明tracker storage
        TrackerClient trackerClient=null;
        TrackerServer trackerServer=null;
        StorageClient storageClient=null;
        StorageServer storageServer=null;
        //1.加载配置文件
       ClientGlobal.init("client.conf");
        System.out.println(ClientGlobal.configInfo());
        //2.创建trackerCLient对象
        trackerClient =new TrackerClient();
        //3.得到TrackerServer对象
        trackerServer=trackerClient.getConnection();
        //4.构建StorageClient对象
        storageClient=new StorageClient(trackerServer,storageServer);
        //5.上传图片
       String[] s= storageClient.upload_file("D:\\Java课上文件\\0课上文件\\workspace\\fastdfs\\src\\main\\resources\\g.png","jpg",null);
       for (String s1:s){
           System.out.println(s1);
       }

    }
}
