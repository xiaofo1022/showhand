package net.xiaofo1022.showhand.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "hospital_id")
    private Integer hospitalId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "mobile", length = 20)
    private String mobile;

    @Column(name = "sex", nullable = false, length = 1)
    private String sex;

    @Column(name = "position", length = 50)
    private String position;

    @Column(name = "title", length = 50)
    private String title;

    @Column(name = "academic_title", length = 500)
    private String academicTitle;

    @Column(name = "image", length = 200)
    private String image;

    @Column(name = "email", length = 90)
    private String email;

    @Column(name = "memo", length = 100)
    private String memo;

    @ColumnDefault("''")
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "address")
    private String address;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "open_id")
    private String openId;

    @Column(name = "mini_open_id")
    private String miniOpenId;

    @Column(name = "union_id")
    private String unionId;

    @ColumnDefault("0")
    @Column(name = "type", nullable = false)
    private Integer type;

    @ColumnDefault("b'0'")
    @Column(name = "is_check_in_manager", nullable = false)
    private Boolean isCheckInManager;

    @ColumnDefault("1")
    @Column(name = "enabled", nullable = false)
    private Integer enabled;

    @ColumnDefault("b'0'")
    @Column(name = "deleted", nullable = false)
    private Boolean deleted;

    @ColumnDefault("0")
    @Column(name = "version", nullable = false)
    private Integer version;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "create_date", nullable = false)
    private Instant createDate;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "update_date", nullable = false)
    private Instant updateDate;

    @ColumnDefault("1")
    @Column(name = "auto_login_flag")
    private Integer autoLoginFlag;

    @ColumnDefault("0")
    @Column(name = "is_confirm_private_policy")
    private Boolean isConfirmPrivatePolicy;

    @Column(name = "confirm_private_policy_time")
    private Instant confirmPrivatePolicyTime;

    @ColumnDefault("1")
    @Column(name = "is_confirm_self_info")
    private Boolean isConfirmSelfInfo;

    @Column(name = "confirm_self_info_time")
    private Instant confirmSelfInfoTime;

    @ColumnDefault("0")
    @Column(name = "is_confirm_star_level")
    private Boolean isConfirmStarLevel;

    @Column(name = "confirm_star_level_time")
    private Instant confirmStarLevelTime;

    @Column(name = "wx_subscribe_time")
    private String wxSubscribeTime;

    @Column(name = "wx_ewen_open_id")
    private String wxEwenOpenId;

    @Column(name = "apm_wechat_id")
    private String apmWechatId;

    @Column(name = "apm_uid")
    private String apmUid;

    @Column(name = "referer", length = 1000)
    private String referer;

    @Column(name = "id_card_number")
    private String idCardNumber;

    @Column(name = "hospital_name_remark")
    private String hospitalNameRemark;


}