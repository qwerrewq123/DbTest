import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectService {
    public List<WiFI> dbSelect(){

        List<WiFI> WifiList = new ArrayList<WiFI>();

        String url = "jdbc:mariadb://olocalhost:3306/testdb";
        String dbUserId = "testuser";
        String dbPassword = "zerobase";

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,dbUserId,dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PreparedStatement preparedStatement = null;
        String sql = "select member_type, user_id, password, name from wifimember where lat = ? and lnt = ?";
        String lat = null;
        String lnt = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,lat);
            preparedStatement.setString(2,lnt);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){

                String distance=rs.getString("distance");
                String number=rs.getString("number");
                String gu=rs.getString("gu");
                String wifi=rs.getString("wifi");
                String dor_adress=rs.getString("dor_address");
                String address=rs.getString("address");
                String location=rs.getString("location");
                String type=rs.getString("type");
                String agency=rs.getString("agency");
                String service=rs.getString("service");
                String net=rs.getString("net");
                String year=rs.getString("year");
                String in_out=rs.getString("in_out");
                String wifi_enviroment=rs.getString("wifi_enviroment");
                String x= rs.getString("x");
                String y=rs.getString("y");
                String date=rs.getString("date");

                WiFI Wifi = new WiFI();

                Wifi.setDistance(distance);
                Wifi.setNumber(number);
                Wifi.setGu(gu);
                Wifi.setWifi(wifi);
                Wifi.setDor_adress(dor_adress);
                Wifi.setAddress(address);
                Wifi.setLocation(location);
                Wifi.setType(type);
                Wifi.setAgency(agency);
                Wifi.setService(service);
                Wifi.setNet(net);
                Wifi.setYear(year);
                Wifi.setIn_out(in_out);
                Wifi.setX(x);
                Wifi.setY(y);
                Wifi.setDate(date);
                WifiList.add(Wifi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return WifiList;
    }
}
