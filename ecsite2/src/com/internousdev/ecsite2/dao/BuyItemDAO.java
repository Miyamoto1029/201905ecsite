package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class BuyItemDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();

	public BuyItemDTO getBuyItemInfo(){
		String sql = "SELECT id, item_name, item_price FROM item_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

				if(resultSet.next()){
					buyItemDTO.setId(resultSet.getInt("id"));
					buyItemDTO.setItemName(resultSet.getString("item_name"));
					buyItemDTO.setItemPrice(resultSet.getString("item_price"));
				}

		}catch(Exception e){
			e.printStackTrace();
		}

		return buyItemDTO;
	}

}



//package com.internousdev.ecsite2.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//
//import com.internousdev.ecsite2.dto.BuyItemDTO;
//import com.internousdev.ecsite2.util.DBConnector;
//
//public class BuyItemDAO {
//	private DBConnector dbConnector = new DBConnector();
//	private Connection connection = dbConnector.getConnection();
//	ArrayList<BuyItemDTO> buyitemlist = new ArrayList<BuyItemDTO>();
//
//	public ArrayList<BuyItemDTO> getBuyItemInfo(){
//		String sql = "SELECT * FROM item_info_transaction";
//
//		try{
//			PreparedStatement preparedStatement = connection.prepareStatement(sql);
//			ResultSet resultSet = preparedStatement.executeQuery();
//
//				while(resultSet.next()){
//					BuyItemDTO buyItemDTO = new BuyItemDTO();
//					buyItemDTO.setId(resultSet.getInt("id"));
//					buyItemDTO.setItemName(resultSet.getString("item_name"));
//					buyItemDTO.setItemPrice(resultSet.getString("item_price"));
//					buyitemlist.add(buyItemDTO);
//				}
//
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//
//		return buyitemlist;
//	}
//
//}
