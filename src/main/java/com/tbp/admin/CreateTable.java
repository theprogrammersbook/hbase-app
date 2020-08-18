package com.tbp.admin;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;

import java.io.IOException;

public class CreateTable {

    public static void main(String[] args) throws IOException {
        System.out.println("Creating  table start...");
        Configuration conf = HBaseConfiguration.create();

        Connection connection = ConnectionFactory.createConnection(conf);

        Admin admin = connection.getAdmin();

        HTableDescriptor tableName = new HTableDescriptor(TableName.valueOf("notifications"));

        tableName.addFamily(new HColumnDescriptor("attributes"));
        tableName.addFamily(new HColumnDescriptor("metrics"));
        System.out.println("Formation is done");

        if (!admin.tableExists(tableName.getTableName())) {
            System.out.print("Creating table. ");
            admin.createTable(tableName);
            System.out.println(" Done.");
        }
    }
}
