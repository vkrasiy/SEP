package student.enterprise.project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChangeDTO {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private LessonDTO lessonDTO;

    public LessonDTO getLessonDTO() {
        return lessonDTO;
    }

    public void setLessonDTO(LessonDTO lessonDTO) {
        this.lessonDTO = lessonDTO;
    }

    private Long subjectId;

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    private Long lecturerId;

    public Long getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(Long lecturerId) {
        this.lecturerId = lecturerId;
    }

    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDateTime getDateTime() {
        return Objects.nonNull(date) && Objects.nonNull(getLessonDTO()) && Objects.nonNull(getLessonDTO().getTime())
                ? LocalDateTime.of(date, getLessonDTO().getTime())
                : null;
    }
}
