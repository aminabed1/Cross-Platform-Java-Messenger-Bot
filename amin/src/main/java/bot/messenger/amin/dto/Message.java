package bot.messenger.amin.dto;

import bot.messenger.amin.enumerations.MessageType;
import bot.messenger.amin.enumerations.Platform;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "messageType",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = TextMessage.class,    name = "TEXT"),
        @JsonSubTypes.Type(value = PhotoMessage.class,   name = "PHOTO"),
        @JsonSubTypes.Type(value = VideoMessage.class,   name = "VIDEO"),
        @JsonSubTypes.Type(value = VoiceMessage.class,   name = "VOICE"),
        @JsonSubTypes.Type(value = GifMessage.class,     name = "GIF"),
        @JsonSubTypes.Type(value = StickerMessage.class, name = "STICKER"),
        @JsonSubTypes.Type(value = FileMessage.class,    name = "FILE")
})
@Data
@NoArgsConstructor
@SuperBuilder
public abstract class Message {
    @NotBlank
    private String messageId;

    @NotBlank
    private String chatId;

    @NotBlank
    private String senderId;

    @NotNull
    private MessageType messageType;

    @NotNull
    private Platform platform;

    private long timestamp;
    private boolean isOutgoing;
}
