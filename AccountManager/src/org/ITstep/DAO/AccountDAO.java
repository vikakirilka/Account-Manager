package org.ITstep.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.ITstep.model.Account;

public class AccountDAO {

	public void save(Account account) {

		Connection connection = null;
		PreparedStatement statement = null;

		String sql = "INSERT INTO accounts(first_name, second_name, email, password) VALUES(?,?,?,?)";

		try {
			connection = DBConnection.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, account.getFirstName());
			statement.setString(2, account.getSecondName());
			statement.setString(3, account.getEmail());
			statement.setString(4, account.getPassword());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}

	public Account get(String firstName, String secondName) {
		Account account = new Account();
		String sql = "SELECT * FROM accounts WHERE first_name=? AND second_name=?";

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			connection = DBConnection.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, firstName);
			statement.setString(2, secondName);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				account.setFirstName(resultSet.getString("first_name"));
				account.setSecondName(resultSet.getString(3));
				account.setEmail(resultSet.getString(4));
				account.setPassword(resultSet.getString(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return account;
	}

	public void update(Account accInDB, Account accUpdated) {
		Connection connection = null;
		PreparedStatement statement = null;

		String sql = "UPDATE accounts SET first_name=?, second_name=?, email=?, password=? WHERE first_name=? AND second_name=?";

		try {
			connection = DBConnection.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, accUpdated.getFirstName());
			statement.setString(2, accUpdated.getSecondName());
			statement.setString(3, accUpdated.getEmail());
			statement.setString(4, accUpdated.getPassword());
			statement.setString(5, accInDB.getFirstName());
			statement.setString(6, accInDB.getSecondName());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void delete(String firstName, String secondName) {

		Connection connection = null;
		PreparedStatement statement = null;

		String sql = "DELETE FROM accounts WHERE first_name=? AND second_name=?";

		try {
			connection = DBConnection.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, firstName);
			statement.setString(2, secondName);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}