package action;

import java.util.Map;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.client.HttpServerErrorException;

import service.UserManage;

import entity.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private User user;
	
	@Resource  
	private UserManage userManage;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request=ServletActionContext.getRequest();
		
		System.out.println(request.getCharacterEncoding());
		
		if(user.getName().equals("admin")&&user.getPassword().equals("admin")){
			Map session=ActionContext.getContext().getSession();
			session.put("user.name", user.getName());
			
			System.out.println("登录成功,用户名="+user.getName());
			return "success";
		}
		else{
			String hql = "from User where name=:name";
			Query query = userManage.getSession().createQuery(hql);
			query.setString ("name" , user.getName());
			List result = query.list();
			if(((User)result.get(0)).getPassword().equals(user.getPassword())){
				Map session=ActionContext.getContext().getSession();
				session.put("user.name", user.getName());
				
				System.out.println("登录成功,用户名="+user.getName());
				return "success";
			}
		}
		
		System.out.println("登录失败，用户名="+user.getName());
		return "fail";
	}
	
}
