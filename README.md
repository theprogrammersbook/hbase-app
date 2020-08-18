# hbase-app
Hbase Application with Java 

Pre Requisite


#Hadop Environment Variables

export HADOOP_HOME=/usr/local/softwares/hadoop-2.8.5
export HADOOP_CONF_DIR=$HADOOP_HOME/etc/hadoop
export HADOOP_HDFS_HOME=$HADOOP_HOME
export HADOOP_INSTALL=$HADOOP_HOME
export HADOOP_MAPRED_HOME=$HADOOP_HOME
export HADOOP_COMMON_HOME=$HADOOP_HOME
export HADOOP_HDFS_HOME=$HADOOP_HOME
export YARN_HOME=$HADOOP_HOME
export HADOOP_COMMON_LIB_NATIVE_DIR=$HADOOP_HOME/lib/native

#Hbase Environment Variables
export HBASE_HOME=/usr/local/softwares/hbase-2.2.5
export PATH=$PATH:$HBASE_HOME/bin


## Hbase environment setup values in  hbase-env.sh
 export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64

export HBASE_REGIONSERVERS=/usr/local/softwares/hbase-2.2.5/conf/regionservers

export HBASE_MANAGES_ZK=true

export HBASE_PID_DIR=/var/nagaraju/pids

## Hbase site .xml file
```
<configuration>
  
<property>
<name>hbase.rootdir</name>
<value>hdfs://localhost:9000/user/nagaraju/hbase</value>
</property>

<property>
<name>hbase.cluster.distributed</name>
<value>true</value>
</property>

<property>
<name>hbase.zookeeper.quorum</name>
<value>localhost</value>
</property>

<property> 
<name>hbase.master</name> 
<value>localhost:60010</value> 
</property>

<property>
<name>hbase.zookeeper.property.clientPort</name>
<value>2181</value>
</property>

<property>
<name>hbase.zookeeper.property.dataDir</name>
<value>/usr/local/softwares/hbase-2.2.5/zookeeper</value>
</property>

</configuration>

```

## start hbase 

bin/start-hbase.sh 

## Check Hbase 
$ jps

HMaster

HRegionServer

HQuorumPeer

$$ Make sure that Hadoop deamons are running.

nagaraju@nagaraju:~$ jps
19585 Jps

9030 ResourceManager

8840 SecondaryNameNode

9197 NodeManager

8405 NameNode

19480 HRegionServer

19356 HMaster

8605 DataNode

19295 HQuorumPeer
