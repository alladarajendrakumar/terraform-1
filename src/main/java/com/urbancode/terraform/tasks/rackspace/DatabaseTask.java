package com.urbancode.terraform.tasks.rackspace;

import org.apache.log4j.Logger;

import com.urbancode.x2o.tasks.SubTask;

public class DatabaseTask extends SubTask {

    //**********************************************************************************************
    // CLASS
    //**********************************************************************************************
    static private final Logger log = Logger.getLogger(DatabaseTask.class);

    //**********************************************************************************************
    // INSTANCE
    //**********************************************************************************************
    private String name;
    //utf-8 defaults
    private String charset = "utf8";
    private String collate = "utf8_general_ci";

    //----------------------------------------------------------------------------------------------
    public DatabaseTask() {
        super();
    }

    //----------------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    //----------------------------------------------------------------------------------------------
    public String getCharset() {
        return charset;
    }

    //----------------------------------------------------------------------------------------------
    public String getCollate() {
        return collate;
    }

    //----------------------------------------------------------------------------------------------
    public void setName(String name) {
        this.name = name;
    }

    //----------------------------------------------------------------------------------------------
    public void setCharset(String charset) {
        this.charset = charset;
    }

    //----------------------------------------------------------------------------------------------
    public void setCollate(String collate) {
        this.collate = collate;
    }

    //----------------------------------------------------------------------------------------------
    @Override
    public void create() throws Exception {
        // Database JSON is generated by the DatabaseInstanceTask
    }

    //----------------------------------------------------------------------------------------------
    @Override
    public void destroy() throws Exception {
        // Databases are deleted when the DatabaseInstanceTask is deleted
    }

}
