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
public class SimpleMessageCorrector implements MessageCorrector {

    @Override
    public Message correctMessage(Message message) {
        Integer correctedOperAttr = message.getOperAttr();
        if (message.getOperType() > 0) {
            switch (message.getOperType()) {
                case (1):
                    correctedOperAttr = correctOperAttrForOperTypex1(message.getOperAttr());
                    break;
                case (2):
                    correctedOperAttr = correctOperAttrForOperTypex2(message.getOperAttr());
                    break;
                case (3):
                    correctedOperAttr = correctOperAttrForOperTypex3(message.getOperAttr());
                    break;
                case (4):
                    correctedOperAttr = correctOperAttrForOperTypex4(message.getOperAttr());
                    break;
                default:
                    correctedOperAttr = message.getOperAttr();
            }
        }
        return new Message(
                message.getBarcode(),
                message.getOperType(),
                correctedOperAttr,
                message.getOperAddress());
    }

    private Integer correctOperAttrForOperTypex1(Integer curOperAttr) {
        if (curOperAttr < 1) {
            return 9;
        }
        return curOperAttr;
    }

    private Integer correctOperAttrForOperTypex2(Integer curOperAttr) {
        Integer resultOperAttr = null;
        if (curOperAttr > 0 && curOperAttr < 5) {
            resultOperAttr = 57;
        } else if (curOperAttr > 5) {
            resultOperAttr = 9;
        } else if (curOperAttr == 0) {
            resultOperAttr = 10;
        } else if (curOperAttr == 10) {
            resultOperAttr = 11;
        } else {
            //TODO TP-11: Пока не ясно как обрабатывать, а в прод надо. Добавить, когда уточненят.
        }
        return resultOperAttr;
    }

    private Integer correctOperAttrForOperTypex3(Integer curOperAttr) {
        if (curOperAttr < 2 && curOperAttr > -2) {
            return 1052;
        }
        return curOperAttr;
    }

    private Integer correctOperAttrForOperTypex4(Integer curOperAttr) {
        if (curOperAttr < 1) {
            return 12;
        }
        return curOperAttr;
    }
}
