package org.tie.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tie.dto.Message;
import org.tie.dto.OperationResult;
import org.tie.service.DataSaver;
import org.tie.service.MessageCorrector;

/**
 * @author Demin Daniil
 * @since 04.12.2021
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class MessageController {

    private final MessageCorrector corrector;
    private final DataSaver dataSaver;

    @PostMapping("message")
    public OperationResult handleMessage(@RequestBody final Message message) {
        Message correctedMessage = corrector.correctMessage(message);
        dataSaver.saveMessage(correctedMessage);
        return new OperationResult("Done");
    }
}

