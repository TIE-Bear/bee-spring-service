package org.tie.service;

import org.tie.dto.Message;

/**
 * @author Demin Daniil
 * @since 04.12.2021
 */
public interface DataSaver {

    void saveMessage(Message message);
}
