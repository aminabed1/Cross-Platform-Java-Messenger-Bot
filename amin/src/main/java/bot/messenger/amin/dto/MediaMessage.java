package bot.messenger.amin.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public abstract class MediaMessage extends Message {
    @NotBlank
    private String remoteFileId;

    private String fileUrl;
    private Long fileSize;

    private String caption;
}
