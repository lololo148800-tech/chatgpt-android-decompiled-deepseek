package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class MethodSignatureBuildingUtilsKt {
    public static final String signature(SignatureBuildingComponents signatureBuildingComponents, ClassDescriptor classDescriptor, String jvmDescriptor) {
        AbstractC16544l.m18094g(signatureBuildingComponents, "<this>");
        AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
        AbstractC16544l.m18094g(jvmDescriptor, "jvmDescriptor");
        return signatureBuildingComponents.signature(MethodSignatureMappingKt.getInternalName(classDescriptor), jvmDescriptor);
    }
}
