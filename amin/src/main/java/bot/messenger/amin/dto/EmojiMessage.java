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
public class EmojiMessage extends Message {
    @NotBlank
    private String emojiUnicode;

    public EmojiMessage(String messageId, String chatId, String senderId, Platform platform, long timestamp, boolean isOutgoing,
                        String emojiUnicode) {
        super(messageId, chatId, senderId, MessageType.EMOJI, platform, timestamp, isOutgoing);
        this.emojiUnicode = emojiUnicode;
    }
}
