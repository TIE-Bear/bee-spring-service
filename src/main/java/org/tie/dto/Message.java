package org.tie.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Demin Daniil
 * @since 04.12.2021
 */
@Getter
@Setter
@ToString
public class Message {

    private String barcode;

    private int operType;

    private int operAttr;

    private String operAddress;

    public Message() {
        this.barcode = "";
        this.operType = -1;
        this.operAttr = -1;
        this.operAddress = "";
    }

    public Message(String barcode, int operType, int operAttr, String operAddress) {
        this.barcode = barcode;
        this.operType = operType;
        this.operAttr = operAttr;
        this.operAddress = operAddress;
    }
}