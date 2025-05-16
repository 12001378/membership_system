package com.chat.membership.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.JdbcType;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.util.UUID;

@Entity
@Data
public class Member{

    @Id
    @GeneratedValue
    @JdbcType(VarcharJdbcType.class)
    private UUID memberID;
    private String memberFirstName;
    private String memberLastName;
    private String memberEmail;
    private String memberMobile;
    @JdbcType(VarcharJdbcType.class)
    private UUID membershipID;
}
