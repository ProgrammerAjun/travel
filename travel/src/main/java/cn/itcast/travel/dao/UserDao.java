package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {
    /**
     * 通过用户名来查询数据库中的数据
     * @param username
     * @return
     */
    public User findByUsername(String username);

    /**
     *保存数据
     * @param user
     * @return
     */
    public void save(User user);

    /**
     * 根据激活码查询用户对象
     * @param code
     * @return
     */
    User findByCode(String code);

    /***
     * 修改用户激活状态
     * @param user
     */
    void updateStatus(User user);

    /**
     * 登录查询
     * @return
     */
    User findByUsernameAndPassword(String username,String password);

}
