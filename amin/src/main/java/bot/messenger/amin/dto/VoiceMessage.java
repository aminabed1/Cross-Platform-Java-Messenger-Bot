package bot.messenger.amin.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@JsonTypeName("VOICE")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class VoiceMessage extends MediaMessage {
    @Positive
    private int duration;

    private String mimeType;
}
