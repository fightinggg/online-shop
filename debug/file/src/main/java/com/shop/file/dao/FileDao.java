package com.shop.file.dao;

import io.minio.MinioClient;
import io.minio.Result;
import io.minio.errors.*;
import io.minio.messages.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;


@Component
public class FileDao {

    @Value("${minio.url}")
    private String url;

    @Value("${minio.accessKey}")
    private String accessKey;

    @Value("${minio.secretKey}")
    private String secretKey;

    @Value("${minio.bucketName}")
    private String bucketName;

    @Autowired
    MinioClient minioClient;

    @Bean
    MinioClient getminioClient() throws InvalidPortException, InvalidEndpointException {
        return new MinioClient(url, accessKey, secretKey);
    }

    public String insert(String fileName, MultipartFile file) throws Exception {
        InputStream is = file.getInputStream(); //得到文件流
        String contentType = file.getContentType();  //类型
        minioClient.putObject(bucketName, fileName, is, contentType);
        return minioClient.getObjectUrl(bucketName, fileName);
    }

    public InputStream getStream(String objectName) throws Exception {
        return minioClient.getObject(bucketName, objectName);
    }

    public void delete(String objectName) throws Exception {
        minioClient.removeObject(bucketName, objectName);
    }

    public List<String> getImageNameBySeller(String sellerId) throws Exception {
        Iterable<Result<Item>> results = minioClient.listObjects(bucketName, sellerId);
        List<String> res = new ArrayList<>();
        for (Result<Item> result : results) {
            res.add(result.get().objectName());
        }
        return res;
    }
}
