package bot.messenger.amin.dto;

import bot.messenger.amin.enumerations.MessageType;
import bot.messenger.amin.enumerations.Platform;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Data
public class GifMessage extends MediaMessage {
    private int width;
    private int height;

    public GifMessage(String messageId, String chatId, String senderId, Platform platform, long timestamp, boolean isOutgoing,
                      String remoteFileId, String fileUrl, Long fileSize, String caption,
                      int width, int height) {
        super(messageId, chatId, senderId, MessageType.GIF, platform, timestamp, isOutgoing, remoteFileId, fileUrl, fileSize, caption);
        this.width = width;
        this.height = height;
    }
}
