package org.debugroom.sample.cloudformation.backend.domain.model.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "usr", schema = "public", catalog="sample")
public class User implements Serializable{

    @Id
    @Column(name = "user_id", nullable = false)
    private long userId;
    @Column(name = "first_name", nullable = true, length = 512)
    private String firstName;
    @Column(name = "family_name", nullable = true, length = 512)
    private String familyName;
    @Column(name = "login_id", nullable = true, length = 32)
    private String loginId;
    @Column(name = "is_login", nullable = true)
    private Boolean isLogin;
    @Column(name = "ver", nullable = true)
    private Integer ver;
    @Column(name = "last_updated_at", nullable = true)
    private Timestamp lastUpdatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstName, familyName, loginId, isLogin, ver, lastUpdatedAt);
    }


}
