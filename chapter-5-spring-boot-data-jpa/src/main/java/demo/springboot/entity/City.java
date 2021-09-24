package demo.springboot.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class City {
    private Long id;
    private String name;
    private String writer;
    private String introduction;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "writer", nullable = true, length = 255)
    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Basic
    @Column(name = "introduction", nullable = true, length = 255)
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City book = (City) o;
        return Objects.equals(id, book.id) && Objects.equals(name, book.name) && Objects.equals(writer, book.writer) && Objects.equals(introduction, book.introduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, writer, introduction);
    }
}
