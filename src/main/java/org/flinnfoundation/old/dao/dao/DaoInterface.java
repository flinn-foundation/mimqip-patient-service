package org.flinnfoundation.old.dao.dao;

import javax.naming.NamingException;
import java.sql.SQLException;

public interface DaoInterface
{

	void renewConnection() throws SQLException, NamingException, Exception;
	void closeConnection() throws SQLException;
	void commitConnection() throws SQLException;

}
