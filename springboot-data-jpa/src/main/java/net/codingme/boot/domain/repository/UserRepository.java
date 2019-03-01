package net.codingme.boot.domain.repository;

import net.codingme.boot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2019/1/1114:26
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * 一个自定义方法，根据 username 和 password 查询 User 信息
     */
    User findByUsernameAndPassword(String username, String password);

}
