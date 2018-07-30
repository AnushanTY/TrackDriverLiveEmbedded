package com.pickme.dbhelper;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;


public class CassandraConnector {
    private Cluster cluster;
    private Session session;

    public CassandraConnector(String node, int port){
        connect(node,port);
    }

    public void connect(String node, Integer port){    //connection cassandra server with a node and a port
        Cluster.Builder builder = Cluster.builder().addContactPoint(node);
        if(port != null){
            builder.withPort(port);
        }
        cluster = builder.build();
        session = cluster.connect();
    }

    public Session getSession(){
        return this.session;
    }

    public void close(){    //closing server
        session.close();
        cluster.close();
    }



   
    public void insertShiftStatus(int driver_id , String status){
        StringBuilder sb = new StringBuilder("INSERT INTO ")
                .append("TrackDriverLive")
                .append(".").append("Driverlive").append("(driver_id,shiftstatus ) ")
                .append("VALUES (").append(driver_id)
                .append(", '").append(status).append("');");

        String query = sb.toString();
        session.execute(query);
    }
    public void insertLoginStatus(int driver_id , String status){
        StringBuilder sb = new StringBuilder("INSERT INTO ")
                .append("TrackDriverLive")
                .append(".").append("Driverlive").append("(driver_id,loginstatus ) ")
                .append("VALUES (").append(driver_id)
                .append(", '").append(status).append("');");

        String query = sb.toString();
        session.execute(query);
    }
    public void insertDriverStatus(int driver_id , String status){
        StringBuilder sb = new StringBuilder("INSERT INTO ")
                .append("TrackDriverLive")
                .append(".").append("Driverlive").append("(driver_id,driverstatus ) ")
                .append("VALUES (").append(driver_id)
                .append(", '").append(status).append("');");

        String query = sb.toString();
        session.execute(query);
    }

    public  void insertDriverlocationchanged(int driver_id, Long time){
        StringBuilder sb = new StringBuilder("INSERT INTO ")
                .append("TrackDriverLive")
                .append(".").append("Driverlive").append("(driver_id,last_heartbeat ) ")
                .append("VALUES (").append(driver_id)
                .append(", '").append(time).append("');");

        String query = sb.toString();
        session.execute(query);
    }





}

