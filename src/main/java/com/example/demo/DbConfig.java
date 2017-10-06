package com.example.demo;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {

    private String url = "jdbc:oracle:thin:@oracle_db1:1521/test";
    private String url1 = "jdbc:oracle:thin:@oracle_db2:1521/test";
    private String url2 = "jdbc:oracle:thin:@oracle_db3:1521/test";
    private String url3 = "jdbc:oracle:thin:@oracle_db4:1521/test";
    private String url4 = "jdbc:oracle:thin:@oracle_db5:1521/test";



}
