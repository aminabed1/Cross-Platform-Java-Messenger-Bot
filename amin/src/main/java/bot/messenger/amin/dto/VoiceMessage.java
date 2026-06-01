package bot.messenger.amin.dto;

import bot.messenger.amin.enumerations.MessageType;
import bot.messenger.amin.enumerations.Platform;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Data
public class VoiceMessage extends MediaMessage {
    private int duration;
    private String mimeType;

    public VoiceMessage(String messageId, String chatId, String senderId, Platform platform, long timestamp, boolean isOutgoing,
                        String remoteFileId, String fileUrl, Long fileSize, String caption,
                        int duration, String mimeType) {
        super(messageId, chatId, senderId, MessageType.VOICE, platform, timestamp, isOutgoing, remoteFileId, fileUrl, fileSize, caption);
        this.duration = duration;
        this.mimeType = mimeType;
    }
}
