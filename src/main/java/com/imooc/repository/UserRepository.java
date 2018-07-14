package com.imooc.repository;

import com.imooc.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author 金陵书生
 * @description
 * @date 2018/7/14 10:55
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
