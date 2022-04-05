package BookSoureSystem.LogIn.LoginTools;

import BookSoureSystem.LogIn.Login;

import java.sql.*;

/**
 * @version 1.0
 * @Author 作者名
 * @Date 2022/4/5 14:55
 */
public class MysqlCompare {
    public void MysqlPass(Login login){
        //测试数据库连接
        //测试数据库
        Connection conn = null;
        String name = "root";
        String passworddb="123456";
        String url = "jdbc:mysql://localhost:3306/booksystemdb?useSSL" +
                "=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        try {
            conn = DriverManager.getConnection(url,name,passworddb);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("数据库连接到: "+conn);

        //查询模块与登录验证
        String username = login.getTextField1().getText();
        String password = login.getTextField2().getText();
        String sql="SELECT * FROM logtable WHERE name='"+username+"' AND password='"+password+"'";
        Statement statement = null;  //语句对象
        ResultSet rs = null;    //利用获得的语句对象得到数据库游标对象

        try {
            statement = conn.createStatement();  //连接对象获取语句对象
            rs = statement.executeQuery(sql);   //语句对象使用查询语句得到游标对象
            //执行完查询时，游标不指向任何记录
            if(rs.next()){
                System.out.println("登陆成功");
            }else{
                System.out.println("登录失败");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
