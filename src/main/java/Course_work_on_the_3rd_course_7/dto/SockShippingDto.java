package Course_work_on_the_3rd_course_7.dto;


import Course_work_on_the_3rd_course_7.model.Color;
import Course_work_on_the_3rd_course_7.model.SocksSize;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class SockShippingDto {
    @NotNull(message = "Цвет является обязательным полем")
    private Color color;
    @NotNull(message = "Размер является обязательным полем")
    private SocksSize size;
    private Integer cottonContent;
    @Positive(message = "Количество должно быть положительным числом")
    @Setter
    private int quantity;
}
