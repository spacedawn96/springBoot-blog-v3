package top.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserIdentityAvailability {
    private Boolean available;
}
