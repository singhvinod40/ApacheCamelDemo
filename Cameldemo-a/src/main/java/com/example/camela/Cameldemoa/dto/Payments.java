package com.example.camela.Cameldemoa.dto;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Locale;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",propOrder = {

    "rqUID",
        "appId",
        "direction",
        "bzSrIdr",
        "msgIdr",
        "country",
        "msg"

})
@Getter@Setter
@XmlRootElement(name = "SampleMessage")
public class Payments {





}
