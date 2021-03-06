package com.github.erikzielke.model_generator.databaseinfo;

import java.math.BigDecimal;
import java.sql.Types;
import java.util.Date;

/**
 * Created by Erik on 10/2/13.
 */
public class TypeUtil {
    public static String sqlTypeToSetterGetter(int sqlType) {
        switch (sqlType) {
            case Types.BIT:
                return "Boolean";
            case Types.TINYINT:
                return "Boolean";
            case Types.SMALLINT:
                return "Short";
            case Types.INTEGER:
                return "Int";
            case Types.BIGINT:
                return "Long";
            case Types.REAL:
                return "Float";
            case Types.DOUBLE:
                return "Double";
            case Types.FLOAT:
                return "Float";
            case Types.NUMERIC:
            case Types.DECIMAL:
                return "BigDecimal";
            case Types.DATE:
                return "Date";
            case Types.TIME:
                return "Time";
            case Types.TIMESTAMP:
                return "Timestamp";
            case Types.CHAR:
            case Types.VARCHAR:
            case Types.LONGVARCHAR:
                return "String";
            case Types.BINARY:
            case Types.VARBINARY:
            case Types.LONGVARBINARY:
                return "BinaryStream";
            default:
                return null;
        }
    }


    public static Class sqlTypeToJavaClass(int sqlType) {
        switch (sqlType) {
            case Types.BIT:
                return Boolean.class;
            case Types.TINYINT:
                return Boolean.class;
            case Types.SMALLINT:
                return Short.class;
            case Types.INTEGER:
                return Integer.class;
            case Types.BIGINT:
                return Long.class;
            case Types.REAL:
                return Float.class;
            case Types.DOUBLE:
                return Double.class;
            case Types.FLOAT:
                return Float.class;
            case Types.NUMERIC:
            case Types.DECIMAL:
                return BigDecimal.class;
            case Types.DATE:
            case Types.TIME:
            case Types.TIMESTAMP:
                return Date.class;
            case Types.CHAR:
            case Types.VARCHAR:
            case Types.LONGVARCHAR:
                return String.class;
            case Types.BINARY:
            case Types.VARBINARY:
            case Types.LONGVARBINARY:
                return Object.class;
            case Types.ARRAY:
                return Object.class;
            default:
                return null;
        }
    }
}
