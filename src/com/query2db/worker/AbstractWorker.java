package com.query2db.worker;

public abstract class AbstractWorker {

    protected boolean _isTestMode;
    protected Q2dLoggingManager _q2dLog;
    protected WorkHistoryManager _hisMan;
  
    protected DatabaseInfoDefine _dbInfoDefine;
    protected EnvironmentVarsInfo _envVarsInfo;
    protected Map<String, List<Map<String, Object>>> _subsVarsMap;
    public final String _subsVarRegexPattern = "\\$\\{[a-zA-Z0-9_-]+\\}";
  
    public DatabaseInfo getDatabaseInfo( String dbName ) {
  
        for ( DatabaseInfo dbinfo : _dbInfoDefine.getDatabases()) {
            
            if(dbInfo.getName().equalsIgnoreCase( dbName ))
                return dbInfo;
        }        
        throw new Q2dException( String.format("Not exists database name(%s) in config/database-define.xml", dbName) );
    }
    
}
