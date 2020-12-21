package com.example.springdoc.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author CJ (power4j@outlook.com)
 * @date 2020/12/21
 * @since 1.0
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class UserA implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "username", example = "john")
    @Size(min = 6, max = 20, groups = { Groups.Default.class })
    private String username;


    @Schema(description = "password", example = "acb123", accessMode = Schema.AccessMode.WRITE_ONLY)
    @NotNull(groups = { Groups.Default.class })
    @Size(min = 6, max = 20, groups = { Groups.Default.class })
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
}
