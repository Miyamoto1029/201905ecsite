package com.internousdev.ecsite2.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ecsite2.dao.BuyItemDAO;
import com.internousdev.ecsite2.dao.LoginDAO;
import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.internousdev.ecsite2.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	public Map<String, Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
	private BuyItemDAO buyItemDAO = new BuyItemDAO();

	public String execute(){
		String result = ERROR;
		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser", loginDTO);


		if( ( (LoginDTO) session.get("loginUser") ).getLoginFlg() ){
			result = SUCCESS;
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();

			session.put("login_user_id", loginDTO.getLoginId());
			session.put("id",buyItemDTO.getId());
			session.put("buyItem_name",buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());

			return result;
		}
		return result;

	}

	public String getLoginUserId(){
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}



//package com.internousdev.ecsite2.action;
//
//import java.util.ArrayList;
//import java.util.Map;
//import org.apache.struts2.interceptor.SessionAware;
//import com.internousdev.ecsite2.dao.BuyItemDAO;
//import com.internousdev.ecsite2.dao.LoginDAO;
//import com.internousdev.ecsite2.dto.BuyItemDTO;
//import com.internousdev.ecsite2.dto.LoginDTO;
//import com.opensymphony.xwork2.ActionSupport;
//
//public class LoginAction extends ActionSupport implements SessionAware{
//	private String loginUserId;
//	private String loginPassword;
//	public Map<String, Object> session;
//	private LoginDAO loginDAO = new LoginDAO();
//	private LoginDTO loginDTO = new LoginDTO();
//	private BuyItemDAO buyItemDAO = new BuyItemDAO();
//	private BuyItemDTO buyItemDTO = new BuyItemDTO();
//	private ArrayList<BuyItemDTO> buyitemlist = new ArrayList<BuyItemDTO>();
//
//	public String execute(){
//		String result = ERROR;
//		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);
//		session.put("loginUser", loginDTO);
//
//
//		if( ( (LoginDTO) session.get("loginUser") ).getLoginFlg() ){
//			result = SUCCESS;
//
//			buyitemlist = buyItemDAO.getBuyItemInfo();
//			session.put("login_user_id", loginDTO.getLoginId());
//			session.put("id",buyItemDTO.getId());
//			session.put("buyItem_name",buyItemDTO.getItemName());
//			session.put("buyItem_price", buyItemDTO.getItemPrice());
//
//			return result;
//		}
//		return result;
//
//	}
//
//	public ArrayList<BuyItemDTO> getBuyitemlist(){
//		return buyitemlist;
//	}
//
//	public void setBuyitemlist(ArrayList<BuyItemDTO> buyitemlist){
//		this.buyitemlist = buyitemlist;
//	}
//
//	public String getLoginUserId(){
//		return loginUserId;
//	}
//
//	public void setLoginUserId(String loginUserId){
//		this.loginUserId = loginUserId;
//	}
//
//	public String getLoginPassword(){
//		return loginPassword;
//	}
//
//	public void setLoginPassword(String loginPassword){
//		this.loginPassword = loginPassword;
//	}
//
//	@Override
//	public void setSession(Map<String, Object> session){
//		this.session = session;
//	}
//
//}
