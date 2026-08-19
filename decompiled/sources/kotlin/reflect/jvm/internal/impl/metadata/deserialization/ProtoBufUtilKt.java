package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBufUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T getExtensionOrNull(GeneratedMessageLite.ExtendableMessage<M> extendableMessage, GeneratedMessageLite.GeneratedExtension<M, T> extension) {
        AbstractC16544l.m18094g(extendableMessage, "<this>");
        AbstractC16544l.m18094g(extension, "extension");
        if (extendableMessage.hasExtension(extension)) {
            return (T) extendableMessage.getExtension(extension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T getExtensionOrNull(GeneratedMessageLite.ExtendableMessage<M> extendableMessage, GeneratedMessageLite.GeneratedExtension<M, List<T>> extension, int i10) {
        AbstractC16544l.m18094g(extendableMessage, "<this>");
        AbstractC16544l.m18094g(extension, "extension");
        if (i10 < extendableMessage.getExtensionCount(extension)) {
            return (T) extendableMessage.getExtension(extension, i10);
        }
        return null;
    }
}
