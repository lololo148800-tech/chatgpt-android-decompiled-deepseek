package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes2.dex */
public interface FlexibleTypeDeserializer {

    public static final class ThrowException implements FlexibleTypeDeserializer {
        public static final ThrowException INSTANCE = new ThrowException();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
        public KotlinType create(ProtoBuf.Type proto, String flexibleId, SimpleType lowerBound, SimpleType upperBound) {
            AbstractC16544l.m18094g(proto, "proto");
            AbstractC16544l.m18094g(flexibleId, "flexibleId");
            AbstractC16544l.m18094g(lowerBound, "lowerBound");
            AbstractC16544l.m18094g(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    KotlinType create(ProtoBuf.Type type, String str, SimpleType simpleType, SimpleType simpleType2);
}
