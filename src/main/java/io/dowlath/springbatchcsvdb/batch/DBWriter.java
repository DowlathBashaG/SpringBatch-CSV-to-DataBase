package io.dowlath.springbatchcsvdb.batch;

import io.dowlath.springbatchcsvdb.model.User;
import io.dowlath.springbatchcsvdb.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author Dowlath
 * @create 6/7/2020 6:27 PM
 */

@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {
        System.out.println("Data Saved for Users "+ users);
        userRepository.save(users);
    }
}
