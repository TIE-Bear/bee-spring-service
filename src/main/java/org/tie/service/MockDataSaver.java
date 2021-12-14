package org.tie.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.tie.dto.Message;

/**
 * @author Demin Daniil
 * @since 04.12.2021
 */
@Slf4j
@Service
public class MockDataSaver implements DataSaver{

    @Override
    public void saveMessage(Message message) {
        log.info("Next message is recorded: \n\t\t{}", message.toString());
    }
}
