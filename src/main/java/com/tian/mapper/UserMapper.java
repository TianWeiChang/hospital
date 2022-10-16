package com.tian.mapper;

import com.tian.entity.DataGridView;
import com.tian.entity.Role;
import com.tian.entity.RoleMenu;
import com.tian.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectAllUser(User user);
    int updateUser(User user);
    //查询
    List<Role> initUserRole(Role role);
    //添加用户
    int addUser(User user);
    //删除用户所拥有的角色
    void deleteUser(Integer userid);
    int deleteUserById(Integer userid);
    int deleteRoleUser(Integer userid);
    //重置密码
    int resetUserPwd(User user);
    //查询所有用户角色
    DataGridView queryUserRole(Integer userid);
    //查询所有角色
    List<Role> queryAllRole();
    //按照用户id查询角色
    List<Role> queryRoleById(Integer uid);
    //保存角色和菜单
    void saveRoleMenu(RoleMenu roleMenu);
   //保存用户和角色
    void insertUserRole(@Param("uid")Integer userid, @Param("rid")Integer rid);


    List<User> updateLogin(User user);
    int editLogin(User user);
    int editPwd(User user);
    //检查唯一
    int checkUser(User user);

}
