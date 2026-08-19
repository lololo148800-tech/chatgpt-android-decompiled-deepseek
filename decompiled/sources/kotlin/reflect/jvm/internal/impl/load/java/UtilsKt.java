package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public final class UtilsKt {
    public static final AnnotationDescriptor extractNullabilityAnnotationOnBoundedWildcard(LazyJavaResolverContext c9, JavaWildcardType wildcardType) {
        AnnotationDescriptor next;
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(wildcardType, "wildcardType");
        if (wildcardType.getBound() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator<AnnotationDescriptor> it = new LazyJavaAnnotations(c9, wildcardType, false, 4, null).iterator();
        while (it.hasNext()) {
            next = it.next();
            AnnotationDescriptor annotationDescriptor = next;
            for (FqName fqName : JavaNullabilityAnnotationSettingsKt.getRXJAVA3_ANNOTATIONS()) {
                if (AbstractC16544l.m18089b(annotationDescriptor.getFqName(), fqName)) {
                    return next;
                }
            }
        }
        next = null;
        return next;
    }

    public static final boolean hasErasedValueParameters(CallableMemberDescriptor memberDescriptor) {
        AbstractC16544l.m18094g(memberDescriptor, "memberDescriptor");
        return (memberDescriptor instanceof FunctionDescriptor) && AbstractC16544l.m18089b(memberDescriptor.getUserData(JavaMethodDescriptor.HAS_ERASED_VALUE_PARAMETERS), Boolean.TRUE);
    }

    public static final boolean isJspecifyEnabledInStrictMode(JavaTypeEnhancementState javaTypeEnhancementState) {
        AbstractC16544l.m18094g(javaTypeEnhancementState, "javaTypeEnhancementState");
        return javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(JavaNullabilityAnnotationSettingsKt.getJSPECIFY_ANNOTATIONS_PACKAGE()) == ReportLevel.STRICT;
    }

    public static final DescriptorVisibility toDescriptorVisibility(Visibility visibility) {
        AbstractC16544l.m18094g(visibility, "<this>");
        DescriptorVisibility descriptorVisibility = JavaDescriptorVisibilities.toDescriptorVisibility(visibility);
        AbstractC16544l.m18093f(descriptorVisibility, "toDescriptorVisibility(...)");
        return descriptorVisibility;
    }
}
