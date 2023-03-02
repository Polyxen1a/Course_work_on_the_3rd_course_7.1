package Course_work_on_the_3rd_course_7.dto;

import Course_work_on_the_3rd_course_7.model.Sock;
import jakarta.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2023-02-28",
        comments = "version: 1.5.3.Final, compiler: java, environment: Java 17"
)
@Component
public class SocksMapperImpl implements SocksMapper {

    @Override
    public Sock toSocks(SockShippingDto sockShippingDto) {
        if (sockShippingDto == null) {
            return null;
        }
        Sock.SockBuilder sock = Sock.builder();

        sock.color(sockShippingDto.getColor());
        sock.size(sockShippingDto.getSize());
        if (sockShippingDto.getCottonContent() != null) {
            sock.cottonContent(sockShippingDto.getCottonContent());
        }
        return sock.build();
    }

    @Override
    public SockShippingDto toSocksDto(Sock sock) {
        if (sock == null) {
            return null;
        }
        return null;
    }
}
