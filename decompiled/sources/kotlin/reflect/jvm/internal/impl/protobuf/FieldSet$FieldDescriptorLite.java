package kotlin.reflect.jvm.internal.impl.protobuf;

import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite;

/* JADX INFO: loaded from: classes2.dex */
public interface FieldSet$FieldDescriptorLite<T extends FieldSet$FieldDescriptorLite<T>> extends Comparable<T> {
    WireFormat.JavaType getLiteJavaType();

    WireFormat.FieldType getLiteType();

    int getNumber();

    MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

    boolean isPacked();

    boolean isRepeated();
}
