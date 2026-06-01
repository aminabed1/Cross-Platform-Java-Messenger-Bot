package bot.messenger.amin.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@JsonTypeName("VIDEO")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class VideoMessage extends MediaMessage {
    @Positive
    private int width;

    @Positive
    private int height;

    @Positive
    private int duration;

    private String thumbnailUrl;
}
