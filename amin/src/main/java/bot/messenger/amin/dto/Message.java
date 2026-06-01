package bot.messenger.amin.dto;

import bot.messenger.amin.enumerations.MessageType;
import bot.messenger.amin.enumerations.Platform;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "messageType",
        visible = true

)
@JsonSubTypes({
        @JsonSubTypes.Type(value = TextMessage.class, name = "TEXT"),
        @JsonSubTypes.Type(value = PhotoMessage.class, name = "PHOTO"),
        @JsonSubTypes.Type(value = VideoMessage.class, name = "VIDEO"),
        @JsonSubTypes.Type(value = VoiceMessage.class, name = "VOICE"),
        @JsonSubTypes.Type(value = GifMessage.class, name = "GIF"),
        @JsonSubTypes.Type(value = StickerMessage.class, name = "STICKER"),
        @JsonSubTypes.Type(value = EmojiMessage.class, name = "EMOJI")
})
@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class Message {

    private String messageId;

    @NotBlank(message = "Chat ID cannot be blank")
    private String chatId;

    @NotBlank(message = "Sender ID cannot be blank")
    private String senderId;

    @NotNull(message = "Message type is required")
    private MessageType messageType;

    @NotNull(message = "Platform is required")
    private Platform platform;

    private long timestamp;
    private boolean isOutgoing;
}


