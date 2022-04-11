import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String connectionUrl = "jdbc:mysql://127.0.0.1:3306/new_schemav2";
        String username = "root";
        String password = "admin";
        Customer customer = new Customer(7,"myUser", "Ionica","Matei","0749683479", "Regie","Bucharest", "077160", "Romania");
        Connection connection = DriverManager.getConnection(connectionUrl,username,password);
        int id = 1;


        insert(connection, "myUser", "Ionica","Matei","0749683479", "Regie","Bucharest", "077160", "Romania");
        getById(connection,7);
        insertOrder(connection, "2008-11-11 12:12:02", "done", 1);
        update(connection, customer);
    }

    public static void getById(Connection connection, int id) throws SQLException {

        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM customers WHERE id =" + id);
        while(rs.next()) {
            System.out.println("id: " + rs.getInt("id"));
            System.out.println("username: " + rs.getString("username"));
            System.out.println("last_name: " + rs.getString("last_name"));
            System.out.println("first_name: " + rs.getString("first_name"));
            System.out.println("phone: " + rs.getString("phone"));
            System.out.println("address: " + rs.getString("address"));
            System.out.println("city: " + rs.getString("city"));
            System.out.println("postalCode: " + rs.getString("postalCode"));
            System.out.println("country: " + rs.getString("country"));
        }
    }

    public static void insert(Connection connection, String user, String last, String first, String phone, String address, String city, String postalCode, String country) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO customers (username, last_name, first_name, phone, address, city, postalCode, country) VALUES (?,?,?,?,?,?,?,?)");
        ps.setString(1, user);
        ps.setString(2, last);
        ps.setString(3, first);
        ps.setString(4, phone);
        ps.setString(5, address);
        ps.setString(6, city);
        ps.setString(7, postalCode);
        ps.setString(8, country);
        ps.execute();
    }

    public static int delete(Connection connection, int id) {
        // DELETE FROM table_name WHERE condition;

        try {
            Statement statement = connection.createStatement();
            int rs = statement.executeUpdate("DELETE FROM customers WHERE id = " + id);

            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public static void getAll(Connection connection, String tableName) throws SQLException
    {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName);

        while(resultSet.next())
        {
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            for(int i = 1; i < resultSetMetaData.getColumnCount(); i++)
            {
                if(resultSetMetaData.getColumnName(i).equals("INT"))
                {
                    System.out.println(resultSet.getInt(i));
                }
                else
                {
                    System.out.println(resultSet.getString(i));
                }
            }
        }

    }

    public static void update(Connection connection, Customer customer) throws SQLException
    {
        PreparedStatement statement = connection.prepareStatement(
                "UPDATE customers SET username = ?, " +
                        "last_name = ?, " +
                        "first_name = ?" +
                        "WHERE id = ?"
        );
        statement.setString(1, customer.getUsername());
        statement.setString(2, customer.getLast_name());
        statement.setString(3, customer.getFirst_name());
        statement.setInt(4, customer.getId());
        statement.executeUpdate();
    }

    public static void insertOrder(Connection connection, String date, String status, int customerId) throws SQLException {

        try{
            getById(connection, customerId);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO orders (order_date, status,customer_id) VALUES (?, ?, ?)");

            preparedStatement.setTimestamp(1, Timestamp.valueOf(date));
            preparedStatement.setString(2, status);

            preparedStatement.setInt(3, customerId);
            preparedStatement.execute();
            System.out.println(preparedStatement.getUpdateCount());
        }
        catch (SQLException e){
            System.out.println("nu exista un customer cu acel id.");
        }


    }
}
