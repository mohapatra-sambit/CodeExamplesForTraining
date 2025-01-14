package training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEmployeeManager {

	private static Connection connection;
	private static PreparedStatement sql;
	private static ResultSet output;
	private static int currentRecordCount;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Starting Employee Manager Application");
		loadDBDriver();
		connectToEmployeeDB();
		sql = prepareSQL();
		executeSQL();
		displayResult();
		getPreviousRecordCount();
		insertNewRecord();
		updateRecords();
		deleteRecords();
//		System.out.println("------------------------------");
//		Statement statement = connection.createStatement();
//		ResultSet rs = statement.executeQuery("select * from public.\"Employee\"");
//		while (rs.next()) {
//			System.out.println("Employee ID: " + rs.getInt("Id"));
//			System.out.println("Employee Name: " + rs.getString("first_name") +
//					" " + rs.getString("last_name"));
//		}
		
	}

	private static void deleteRecords() throws SQLException {
		PreparedStatement statement = connection.prepareStatement("delete from public.\"Employee\""
				+ " where id = ?");
		statement.setInt(1, 1);
		int result = statement.executeUpdate();
		System.out.println(result + " record(s) deleted successfully");
	}

	private static void updateRecords() throws SQLException {
		Statement statement = connection.createStatement();
		int result = statement.executeUpdate(
				"UPDATE public.\"Employee\" " + "SET last_name='SampleLastName_3' "
						+ "WHERE first_name like '%3';");
		System.out.println(result + " record(s) updated successfully");
	}

	private static void getPreviousRecordCount() throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select count(*) from public.\"Employee\"");
		if (rs.next()) {
			currentRecordCount = rs.getInt(1);
		}
		System.out.println("Current record Count: " + currentRecordCount);
	}

	private static void insertNewRecord() throws SQLException {
		System.out.println("Inserting new record");
		++currentRecordCount;
		Statement insertStatement = connection.createStatement();
		int result = insertStatement.executeUpdate("INSERT INTO public.\"Employee\"("
				+ "id, first_name, last_name) VALUES (" + currentRecordCount + ", 'SampleFirstName_"
				+ currentRecordCount + "'" + ", 'SampleLastName_" + currentRecordCount + "')");
		System.out.println(result + " record(s) inserted successfully");
	}

	private static void displayResult() throws SQLException {
		while (output.next()) {
			System.out.println("Employee ID: " + output.getInt("Id"));
			System.out
					.println("Employee Name: " + output.getString("first_name") + " " + output.getString("last_name"));
		}
	}

	private static void executeSQL() throws SQLException {
		sql.setString(1, "X%");
		sql.setString(2, "%6");
		System.out.println("Executing SQL query");
		output = sql.executeQuery();
	}

	private static PreparedStatement prepareSQL() throws SQLException {
		System.out.println("Preparing SQL statement");
		return connection
				.prepareStatement("SELECT * FROM public.\"Employee\" where first_name like ? and last_name like ?");
	}

	private static void connectToEmployeeDB() throws SQLException {
		System.out.println("Establishing connection to database");
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UDM", "postgres", "postgres");
		System.out.println("Connection successful");
	}

	private static void loadDBDriver() throws ClassNotFoundException {
		System.out.println("Loading DB Driver");
		Class.forName("org.postgresql.Driver");
		System.out.println("Loading DB Driver completed");
	}

}
