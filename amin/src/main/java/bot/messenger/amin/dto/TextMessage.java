package bot.messenger.amin.dto;

import bot.messenger.amin.enumerations.MessageType;
import bot.messenger.amin.enumerations.Platform;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class TextMessage extends Message {
    private String text;

    public TextMessage(String messageId, String chatId, String senderId, Platform platform, long timestamp, boolean isOutgoing, String text) {
        super(messageId, chatId, senderId, MessageType.TEXT, platform, timestamp, isOutgoing);
        this.text = text;
    }
}
