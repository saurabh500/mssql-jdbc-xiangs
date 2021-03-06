//---------------------------------------------------------------------------------------------------------------------------------
// File: SQLServerCallableStatement42.java
//
//
// Microsoft JDBC Driver for SQL Server
// Copyright(c) Microsoft Corporation
// All rights reserved.
// MIT License
// Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files(the "Software"), 
//  to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
//  and / or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions :
// The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
// THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS 
//  IN THE SOFTWARE.
//---------------------------------------------------------------------------------------------------------------------------------
 
 
package com.microsoft.sqlserver.jdbc;

import java.sql.SQLType;

/**
 * 
 * This class is separated from SQLServerCallableStatement class in order to resolve compiling error of
 * missing Java 8 Types when running with Java 7.
 * 
 * This class will be initialized instead of SQLServerCallableStatement when Java 8 and JDBC 4.2 are used.
 * 
 * It shares the same PreparedStatement implementation with SQLServerPreparedStatement42.
 * 
 */
public class SQLServerCallableStatement42 extends SQLServerCallableStatement implements ISQLServerCallableStatement42{
	
	SQLServerCallableStatement42(SQLServerConnection connection, String sql, int nRSType, int nRSConcur,
			SQLServerStatementColumnEncryptionSetting stmtColEncSetting) throws SQLServerException {
		super(connection, sql, nRSType, nRSConcur, stmtColEncSetting);
	}

	public void registerOutParameter(int index, SQLType sqlType) throws SQLServerException
	{
		DriverJDBCVersion.checkSupportsJDBC42();

		if(loggerExternal.isLoggable(java.util.logging.Level.FINER))
			loggerExternal.entering(getClassNameLogging(),  "registerOutParameter", new Object[]{new Integer(index), sqlType});

		// getVendorTypeNumber() returns the same constant integer values as in java.sql.Types
		registerOutParameter(index, sqlType.getVendorTypeNumber().intValue());
		loggerExternal.exiting(getClassNameLogging(),  "registerOutParameter");
	}

	public void registerOutParameter (int index, SQLType sqlType, String typeName) throws SQLServerException 
	{
		DriverJDBCVersion.checkSupportsJDBC42();

		if(loggerExternal.isLoggable(java.util.logging.Level.FINER))
			loggerExternal.entering(getClassNameLogging(),  "registerOutParameter", new Object[]{new Integer(index), sqlType, typeName});

		// getVendorTypeNumber() returns the same constant integer values as in java.sql.Types
		registerOutParameter(index, sqlType.getVendorTypeNumber().intValue(), typeName);

		loggerExternal.exiting(getClassNameLogging(),  "registerOutParameter");
	}

	public void registerOutParameter(int index, SQLType sqlType, int scale) throws SQLServerException 
	{
		DriverJDBCVersion.checkSupportsJDBC42();

		if(loggerExternal.isLoggable(java.util.logging.Level.FINER))
			loggerExternal.entering(getClassNameLogging(),  "registerOutParameter", new Object[]{new Integer(index), sqlType, new Integer(scale)});

		// getVendorTypeNumber() returns the same constant integer values as in java.sql.Types
		registerOutParameter(index, sqlType.getVendorTypeNumber().intValue(), scale);

		loggerExternal.exiting(getClassNameLogging(),  "registerOutParameter");
	}

	public void registerOutParameter(int index, SQLType sqlType, int precision, int scale) throws SQLServerException 
	{
		DriverJDBCVersion.checkSupportsJDBC42();

		if(loggerExternal.isLoggable(java.util.logging.Level.FINER))
			loggerExternal.entering(getClassNameLogging(),  "registerOutParameter", new Object[]{new Integer(index), sqlType, new Integer(scale)});

		// getVendorTypeNumber() returns the same constant integer values as in java.sql.Types
		registerOutParameter(index, sqlType.getVendorTypeNumber().intValue(), precision, scale);

		loggerExternal.exiting(getClassNameLogging(),  "registerOutParameter");
	}

	public void setObject(String sCol, Object obj, SQLType jdbcType) throws SQLServerException
	{
		DriverJDBCVersion.checkSupportsJDBC42();

		if(loggerExternal.isLoggable(java.util.logging.Level.FINER))
			loggerExternal.entering(getClassNameLogging(), "setObject", new Object[]{sCol,  obj, jdbcType });

		// getVendorTypeNumber() returns the same constant integer values as in java.sql.Types
		setObject(sCol, obj, jdbcType.getVendorTypeNumber().intValue());

		loggerExternal.exiting(getClassNameLogging(),  "setObject");
	}

	public void setObject(String sCol, Object obj, SQLType jdbcType, int scale) throws SQLServerException
	{
		DriverJDBCVersion.checkSupportsJDBC42();

		if(loggerExternal.isLoggable(java.util.logging.Level.FINER))
			loggerExternal.entering(getClassNameLogging(), "setObject", new Object[]{sCol,  obj, jdbcType , scale});

		// getVendorTypeNumber() returns the same constant integer values as in java.sql.Types
		setObject(sCol, obj, jdbcType.getVendorTypeNumber().intValue(), scale);

		loggerExternal.exiting(getClassNameLogging(),  "setObject");
	}

	public void setObject(String sCol, Object obj, SQLType jdbcType, int scale, boolean forceEncrypt) throws SQLServerException
	{
		DriverJDBCVersion.checkSupportsJDBC42();

		if(loggerExternal.isLoggable(java.util.logging.Level.FINER))
			loggerExternal.entering(getClassNameLogging(), "setObject", new Object[]{sCol,  obj, jdbcType , scale, forceEncrypt});

		// getVendorTypeNumber() returns the same constant integer values as in java.sql.Types
		setObject(sCol, obj, jdbcType.getVendorTypeNumber().intValue(), scale, forceEncrypt);

		loggerExternal.exiting(getClassNameLogging(),  "setObject");
	}

	public void registerOutParameter(String parameterName, SQLType sqlType, String typeName) throws SQLServerException 
	{
		DriverJDBCVersion.checkSupportsJDBC42();

		if(loggerExternal.isLoggable(java.util.logging.Level.FINER))
			loggerExternal.entering(getClassNameLogging(),  "registerOutParameter", new Object[]{parameterName, sqlType, typeName});

		// getVendorTypeNumber() returns the same constant integer values as in java.sql.Types
		registerOutParameter(parameterName, sqlType.getVendorTypeNumber().intValue(), typeName);

		loggerExternal.exiting(getClassNameLogging(),  "registerOutParameter");
	}

	public void registerOutParameter(String parameterName, SQLType sqlType, int scale) throws SQLServerException 
	{
		DriverJDBCVersion.checkSupportsJDBC42();

		if(loggerExternal.isLoggable(java.util.logging.Level.FINER))
			loggerExternal.entering(getClassNameLogging(),  "registerOutParameter", 
					new Object[]{parameterName, sqlType,  new Integer(scale)});

		// getVendorTypeNumber() returns the same constant integer values as in java.sql.Types
		registerOutParameter(parameterName, sqlType.getVendorTypeNumber().intValue(), scale);

		loggerExternal.exiting(getClassNameLogging(),  "registerOutParameter");
	}

	public void registerOutParameter(String parameterName, SQLType sqlType, int precision, int scale) throws SQLServerException 
	{
		DriverJDBCVersion.checkSupportsJDBC42();

		if(loggerExternal.isLoggable(java.util.logging.Level.FINER))
			loggerExternal.entering(getClassNameLogging(),  "registerOutParameter", 
					new Object[]{parameterName, sqlType,  new Integer(scale)});

		// getVendorTypeNumber() returns the same constant integer values as in java.sql.Types
		registerOutParameter(parameterName, sqlType.getVendorTypeNumber().intValue(), precision, scale);

		loggerExternal.exiting(getClassNameLogging(),  "registerOutParameter");
	}

	public void registerOutParameter(String parameterName, SQLType sqlType) throws SQLServerException 
	{
		DriverJDBCVersion.checkSupportsJDBC42();

		if(loggerExternal.isLoggable(java.util.logging.Level.FINER))
			loggerExternal.entering(getClassNameLogging(),  "registerOutParameter", new Object[]{parameterName, sqlType});

		// getVendorTypeNumber() returns the same constant integer values as in java.sql.Types
		registerOutParameter(parameterName, sqlType.getVendorTypeNumber().intValue());

		loggerExternal.exiting(getClassNameLogging(),  "registerOutParameter");
	}

	public final void setObject(int index, Object obj, SQLType jdbcType) throws SQLServerException
	{		
		SQLServerPreparedStatement42Helper.setObject(this, index, obj, jdbcType);
	}

	public final void setObject(int parameterIndex, Object x, SQLType targetSqlType, int scaleOrLength) throws SQLServerException
	{
		SQLServerPreparedStatement42Helper.setObject(this, parameterIndex, x, targetSqlType, scaleOrLength);
	}

	public final void setObject(int parameterIndex, Object x, SQLType targetSqlType, Integer precision, Integer scale) throws SQLServerException
	{
		SQLServerPreparedStatement42Helper.setObject(this, parameterIndex, x, targetSqlType, precision, scale);
	}

	public final void setObject(int parameterIndex, Object x, SQLType targetSqlType, Integer precision, Integer scale, boolean forceEncrypt) throws SQLServerException
	{
		SQLServerPreparedStatement42Helper.setObject(this, parameterIndex, x, targetSqlType, precision, scale, forceEncrypt);
	}

}
