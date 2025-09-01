package LibraryManagmentSystem.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookRequest {
    private String bookname;
    private String title;
    private boolean available;
}
