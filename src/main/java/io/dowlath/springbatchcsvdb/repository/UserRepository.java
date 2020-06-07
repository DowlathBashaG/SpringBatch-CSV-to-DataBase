package io.dowlath.springbatchcsvdb.repository;

import io.dowlath.springbatchcsvdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Dowlath
 * @create 6/7/2020 5:45 PM
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
