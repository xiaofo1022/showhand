package net.xiaofo1022.showhand.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * DTO for {@link net.xiaofo1022.showhand.entity.User}
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto implements Serializable {
    private Integer id;
    private Integer hospitalId;
    private String name;
    private String mobile;
    private String position;
    private String title;
    private String image;
}