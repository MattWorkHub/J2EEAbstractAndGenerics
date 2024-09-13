package org.example.dto;

public abstract class AbstractDto<T> {
    private Long id;

    public AbstractDto() {
    }

    public AbstractDto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public abstract T toEntity();
}
