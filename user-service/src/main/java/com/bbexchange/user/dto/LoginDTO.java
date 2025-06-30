package com.bbexchange.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor@NoArgsConstructor@Builder
public class LoginDTO {
    String username;
    String password;
}
