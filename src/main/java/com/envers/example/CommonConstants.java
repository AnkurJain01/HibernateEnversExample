package com.envers.example;

/**
 * 
 * Class containing common Constants
 *
 */
public class CommonConstants {

	/**
	 * private constructor to prevent initialization directly
	 */
	private CommonConstants() {
	}
	
	public static final Integer IDLE_TIME_OUT_MS = 60000;
	public static final Integer CONNECTION_TIME_OUT = 60000;
	public static final Integer VALIDATION_TIME_OUT = 30000;
	public static final Integer MAX_LIFE_TIME = 60000;

	// Hibernate Properties
	public static final String HIBERNATE_DIALECT = "hibernate.dialect";
	public static final String HIBERNATE_SHOW_SQL = "hibernate.show_sql";
	public static final String HIBERNATE_FORMAT_SQL = "hibernate.format_sql";
	public static final String HIBERNATE_HBM2DDL_AUTO = "hibernate.hbm2ddl.auto";
	public static final String HIBERNATE_CACHE_USE_QUERY_CACHE = "hibernate.cache.use_query_cache";
	public static final String HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = "hibernate.cache.use_second_level_cache";
	public static final String HIBERNATE_CACHE_REGION_FACTORY_CLASS = "hibernate.cache.region.factory_class";
	public static final String HIBERNATE_ENVERS_AUDIT_TABLE_SUFFIX_PROP = "org.hibernate.envers.audit_table_suffix";
	public static final String HIBERNATE_ENVERS_AUDIT_TABLE_SUFFIX_VALUE = "_aud";
	public static final String HIBERNATE_ENVERS_STORE_DATA_AT_DELETE = "org.hibernate.envers.store_data_at_delete";
	public static final String HIBERNATE_JDBC_BATCH_SIZE = "hibernate.jdbc.batch_size";
	public static final String JDBC_URL = "jdbc.url";
	public static final String JDBC_USERNAME = "jdbc.username";
	public static final String JDBC_PASS = "jdbc.password";
	public static final String JDBC_DRIVERNAME = "jdbc.driverClassName";
	public static final String CACHE_PREP_STMTS = "cachePrepStmts";
	public static final String PREP_STMT_CACHE_SIZE = "prepStmtCacheSize";
	public static final String PREP_STMT_CACHE_SQL_LIMIT = "prepStmtCacheSqlLimit";
	public static final String USE_SERVER_PREP_STMTS = "useServerPrepStmts";
	public static final String HIBERNATE_CACHEPREPSTMTS = "hibernate.hikari.dataSource.cachePrepStmts";
	public static final String HIBERNATE_PREPSTMTCACHESIZE = "hibernate.hikari.dataSource.prepStmtCacheSize";
	public static final String HIBERNATE_PREPSTMTCACHESQLLIMIT = "hibernate.hikari.dataSource.prepStmtCacheSqlLimit";
	public static final String HIBERNATE_USESERVERPREPSTMTS = "hibernate.hikari.dataSource.useServerPrepStmts";
	public static final String CLASSPATH_SYSTEM_PROPERTIES = "classpath:system.properties";
	public static final int POOL_SIZE = 30;

	public static final String PACKAGES_TO_SCAN_FIRST = "com.envers.example";
}