package spring.dto;

import lombok.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class PageResponce<T> {
    List<T> content;
    Metadata metadata;

    public static <T> PageResponce<T> of(Page<T> page) {
        var metadata = new Metadata(page.getNumber(), page.getSize(), page.getTotalElements());
        return new PageResponce<>();
    }

    @Value
    public static class Metadata {
        int page;
        int size;
        long totalElements;
    }
}
