package com.internousdev.webproj6.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj6.dto.LoginDTO;
import com.internousdev.webproj6.util.DBConnector;

		//↑色々な便利なものを使えるようにしてる(その中に自分で作ったパッケージもある)


public class LoginDAO {

	public String username;

	public String password;

//		↑username と password をString型で定義してる



//				↓? LoginDTO型とは
	public List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();
//		↑ loginDTOlist という ArrayList を作成してる。(これがオブジェクト化？)



	public List<LoginDTO> select(String username, String password){
//		↑ 恐らく、 loginDTOのArrayListから、 select文で String型のusername と String型のpasswordを探してきてと指示してる


		DBConnector db = new DBConnector();
//		↑ DBConnector から db にインスタンス化してる


		Connection con = db.getConnection();
//		↑ Connection から con にインスタンス化してる


		String sql = "select * from users where user_name=? and password=?";
//		↑ SQL文を、String型で sql という変数に代入してる。

		try{

			PreparedStatement ps = con.prepareStatement(sql);
//			↑ps の中にSQL文が入っていてそれを実行。(恐らく、PreparedStatement は SQL文を実行できるなんかすごい型。)

			ps.setString(1, username);
			ps.setString(2, password);
//			↑さっきのSQLで探してきた結果を、psの中に入れてる。

			ResultSet rs = ps.executeQuery();
//			↑変数 rs の中に、先ほどのpsの内容を実行する内容をいれている。


			while (rs.next()) {
//				↑もし、次の行があったら、

				LoginDTO dto = new LoginDTO();

				dto.setUsername(rs.getString("user_name"));

				dto.setPassword(rs.getString("password"));

				loginDTOList.add(dto);
//			dtoをインスタンス化して、user_name と password をいれて、loginDTOListにaddメソッドでdtoの内容を入れてる。

			}


			if(loginDTOList.size() <= 0) {

				LoginDTO dto = new LoginDTO();

				dto.setUsername("該当なし");

				dto.setPassword("該当なし");

				loginDTOList.add(dto);

			}

		}catch (SQLException e){
			e.printStackTrace();
		}


		try{
			con.close();

		}catch(SQLException e){

			e.printStackTrace();
		}


		return loginDTOList;
//      ↑これはなに？...⇒「戻り値」を返している。※今回は検索なので。

	}

}




