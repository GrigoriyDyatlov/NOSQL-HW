package netology.ru.NOSQL_HW.repository;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    private String id;

    @NotBlank
    @Size(min = 3, max = 50, message = "Username must be between 3 an 50")
    private String name;
    @Min(18)
    @Max(100)
    private int age;
    @Email(message = "Email should be valid")
    @NotNull
    private String email;

    public User() {
    }

    public @NotBlank @Size(min = 3, max = 50, message = "Username must be between 3 an 50") String getName() {
        return name;
    }

    public void setName(@NotBlank @Size(min = 3, max = 50, message = "Username must be between 3 an 50") String name) {
        this.name = name;
    }

    @Min(18)
    @Max(100)
    public int getAge() {
        return age;
    }

    public void setAge(@Min(18) @Max(100) int age) {
        this.age = age;
    }

    public @Email(message = "Email should be valid") @NotNull String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "Email should be valid") @NotNull String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }
}
