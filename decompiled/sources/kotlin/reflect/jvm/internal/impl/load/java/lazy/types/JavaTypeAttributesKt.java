package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p909nm.AbstractC17665J;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeAttributesKt {
    public static final JavaTypeAttributes toAttributes(TypeUsage typeUsage, boolean z6, boolean z10, TypeParameterDescriptor typeParameterDescriptor) {
        AbstractC16544l.m18094g(typeUsage, "<this>");
        return new JavaTypeAttributes(typeUsage, null, z10, z6, typeParameterDescriptor != null ? AbstractC17665J.m19268h(typeParameterDescriptor) : null, null, 34, null);
    }

    public static /* synthetic */ JavaTypeAttributes toAttributes$default(TypeUsage typeUsage, boolean z6, boolean z10, TypeParameterDescriptor typeParameterDescriptor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            typeParameterDescriptor = null;
        }
        return toAttributes(typeUsage, z6, z10, typeParameterDescriptor);
    }
}
