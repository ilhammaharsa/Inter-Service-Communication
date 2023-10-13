package com.multipolar.bootcamp.logging.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "access_log")
public class AccessLog implements Serializable {
    @Id
    private String id;
    private String method;
    private String status;
    private String message;
}
