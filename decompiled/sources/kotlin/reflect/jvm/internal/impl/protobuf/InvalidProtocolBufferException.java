package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: Y */
    public MessageLite f52743Y;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f52743Y = null;
    }

    /* JADX INFO: renamed from: a */
    public static InvalidProtocolBufferException m18290a() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public MessageLite getUnfinishedMessage() {
        return this.f52743Y;
    }

    public InvalidProtocolBufferException setUnfinishedMessage(MessageLite messageLite) {
        this.f52743Y = messageLite;
        return this;
    }
}
