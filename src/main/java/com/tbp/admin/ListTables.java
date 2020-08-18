package com.tbp.admin;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.TableDescriptor;

import java.io.IOException;
import java.util.List;

public class ListTables {
    public static void main(String[] args) throws IOException {
        System.out.println("Listing  table start...");
        Configuration conf = HBaseConfiguration.create();

        Connection connection = ConnectionFactory.createConnection(conf);

        Admin admin = connection.getAdmin();
        // Get list of tables
        List<TableDescriptor> tables = admin.listTableDescriptors();
          for(TableDescriptor tableDescriptor : tables){
               System.out.println(tableDescriptor.getTableName().getNameAsString());
          }

    }
    }
