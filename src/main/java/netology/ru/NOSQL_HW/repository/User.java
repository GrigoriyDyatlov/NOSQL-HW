package netology.ru.NOSQL_HW.repository;

import jakarta.validation.constraints.*;
import lombok.*;
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

}
