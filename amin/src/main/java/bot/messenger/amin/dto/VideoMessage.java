package bot.messenger.amin.dto;

import bot.messenger.amin.enumerations.MessageType;
import bot.messenger.amin.enumerations.Platform;
import lombok.EqualsAndHashCode;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Data
public class VideoMessage extends MediaMessage {
    private int width;
    private int height;
    private int duration;
    private String thumbnailUrl;

    public VideoMessage(String messageId, String chatId, String senderId, Platform platform, long timestamp, boolean isOutgoing,
                        String remoteFileId, String fileUrl, Long fileSize, String caption,
                        int width, int height, int duration, String thumbnailUrl) {
        super(messageId, chatId, senderId, MessageType.VIDEO, platform, timestamp, isOutgoing, remoteFileId, fileUrl, fileSize, caption);
        this.width = width;
        this.height = height;
        this.duration = duration;
        this.thumbnailUrl = thumbnailUrl;
    }
}
