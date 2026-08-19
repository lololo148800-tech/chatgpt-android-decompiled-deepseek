package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaFlexibleTypeDeserializer implements FlexibleTypeDeserializer {
    public static final JavaFlexibleTypeDeserializer INSTANCE = new JavaFlexibleTypeDeserializer();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
    public KotlinType create(ProtoBuf.Type proto, String flexibleId, SimpleType lowerBound, SimpleType upperBound) {
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(flexibleId, "flexibleId");
        AbstractC16544l.m18094g(lowerBound, "lowerBound");
        AbstractC16544l.m18094g(upperBound, "upperBound");
        if (flexibleId.equals("kotlin.jvm.PlatformType")) {
            return proto.hasExtension(JvmProtoBuf.isRaw) ? new RawTypeImpl(lowerBound, upperBound) : KotlinTypeFactory.flexibleType(lowerBound, upperBound);
        }
        return ErrorUtils.createErrorType(ErrorTypeKind.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString());
    }
}
