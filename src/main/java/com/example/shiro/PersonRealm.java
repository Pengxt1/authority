package com.example.shiro;
import com.example.entity.User;
import com.example.service.UserBiz;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonRealm extends AuthorizingRealm{
    @Autowired
    private UserBiz userBizImpl;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("授权开始了！");
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("认证开始了！");
        UsernamePasswordToken usernamePasswordToken= (UsernamePasswordToken) token;
        String username=usernamePasswordToken.getUsername();
        User user=userBizImpl.selectUserByUsername(username);
        if(null==user){
            return null;
        }
        String sqlpassword=user.getPassword();
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user,sqlpassword,"");
        return simpleAuthenticationInfo;
    }
}
