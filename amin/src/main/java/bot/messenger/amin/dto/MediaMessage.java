package bot.messenger.amin.dto;

import bot.messenger.amin.enumerations.MessageType;
import bot.messenger.amin.enumerations.Platform;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class MediaMessage extends Message {

    @NotBlank(message = "File ID is required")
    private String remoteFileId;

    private String fileUrl;
    private Long fileSize;
    private String caption;

    public MediaMessage(String messageId, String chatId, String senderId, MessageType messageType,
                        Platform platform, long timestamp, boolean isOutgoing,
                        String remoteFileId, String fileUrl, Long fileSize, String caption) {
        super(messageId, chatId, senderId, messageType, platform, timestamp, isOutgoing);
        this.remoteFileId = remoteFileId;
        this.fileUrl = fileUrl;
        this.fileSize = fileSize;
        this.caption = caption;
    }
}

