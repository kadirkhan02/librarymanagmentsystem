package LibraryManagmentSystem.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookRequest {
    @NotBlank(message = "Bookname is mandatory")
    private String bookname;
    @Size(min=3,max=50,message = "Title must be in 3 to 50 words")
    private String title;
    private boolean available;
}
