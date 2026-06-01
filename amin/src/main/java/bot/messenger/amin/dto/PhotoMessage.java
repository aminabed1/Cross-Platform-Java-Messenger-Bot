package bot.messenger.amin.dto;

import bot.messenger.amin.enumerations.MessageType;
import bot.messenger.amin.enumerations.Platform;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Data
public class PhotoMessage extends MediaMessage {
    private int width ;
    private int height;
    String caption;

    public PhotoMessage(String messageId, String chatId, String senderId,
                        Platform platform, long timestamp, boolean isOutgoing,
                        String remoteFileId, String fileUrl, Long fileSize,
                        int width, int height, String caption) {
        super(messageId, chatId, senderId, MessageType.PHOTO, platform, timestamp, isOutgoing, remoteFileId, fileUrl, fileSize, caption);
        this.width = width;
        this.height = height;
        this.caption = caption;
    }
}
