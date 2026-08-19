package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class AbstractBinaryClassAnnotationLoaderKt {
    public static final MemberSignature getPropertySignature(ProtoBuf.Property proto, NameResolver nameResolver, TypeTable typeTable, boolean z6, boolean z10, boolean z11) {
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.propertySignature;
        AbstractC16544l.m18093f(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (z6) {
            JvmMemberSignature.Field jvmFieldSignature = JvmProtoBufUtil.INSTANCE.getJvmFieldSignature(proto, nameResolver, typeTable, z11);
            if (jvmFieldSignature == null) {
                return null;
            }
            return MemberSignature.Companion.fromJvmMemberSignature(jvmFieldSignature);
        }
        if (!z10 || !jvmPropertySignature.hasSyntheticMethod()) {
            return null;
        }
        MemberSignature.Companion companion = MemberSignature.Companion;
        JvmProtoBuf.JvmMethodSignature syntheticMethod = jvmPropertySignature.getSyntheticMethod();
        AbstractC16544l.m18093f(syntheticMethod, "getSyntheticMethod(...)");
        return companion.fromMethod(nameResolver, syntheticMethod);
    }

    public static /* synthetic */ MemberSignature getPropertySignature$default(ProtoBuf.Property property, NameResolver nameResolver, TypeTable typeTable, boolean z6, boolean z10, boolean z11, int i10, Object obj) {
        boolean z12 = (i10 & 8) != 0 ? false : z6;
        boolean z13 = (i10 & 16) != 0 ? false : z10;
        if ((i10 & 32) != 0) {
            z11 = true;
        }
        return getPropertySignature(property, nameResolver, typeTable, z12, z13, z11);
    }
}
