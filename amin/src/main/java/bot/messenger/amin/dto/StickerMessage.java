package bot.messenger.amin.dto;

import bot.messenger.amin.enumerations.MessageType;
import bot.messenger.amin.enumerations.Platform;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Data
public class StickerMessage extends MediaMessage {
    @NotBlank
    private String emoji;
    private String setName;

    public StickerMessage(String messageId, String chatId, String senderId, Platform platform, long timestamp, boolean isOutgoing,
                          String remoteFileId, String fileUrl, Long fileSize, String caption,
                          String emoji, String setName) {
        super(messageId, chatId, senderId, MessageType.STICKER, platform, timestamp, isOutgoing, remoteFileId, fileUrl, fileSize, caption);
        this.emoji = emoji;
        this.setName = setName;
    }
}
