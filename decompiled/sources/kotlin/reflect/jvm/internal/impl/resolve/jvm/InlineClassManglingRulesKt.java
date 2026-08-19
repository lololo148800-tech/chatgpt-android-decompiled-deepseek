package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p279L1.VOxZ.sVoFrD;

/* JADX INFO: loaded from: classes2.dex */
public final class InlineClassManglingRulesKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m18360a(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null;
        if (typeParameterDescriptor == null) {
            return false;
        }
        KotlinType representativeUpperBound = TypeUtilsKt.getRepresentativeUpperBound(typeParameterDescriptor);
        return isValueClassThatRequiresMangling(representativeUpperBound) || m18360a(representativeUpperBound);
    }

    public static final boolean isValueClassThatRequiresMangling(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, sVoFrD.cNIHsnmkwsw);
        return InlineClassesUtilsKt.isValueClass(declarationDescriptor) && !AbstractC16544l.m18089b(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) declarationDescriptor), StandardNames.RESULT_FQ_NAME);
    }

    public static final boolean shouldHideConstructorDueToValueClassTypeValueParameters(CallableMemberDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        ClassConstructorDescriptor classConstructorDescriptor = descriptor instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) descriptor : null;
        if (classConstructorDescriptor == null || DescriptorVisibilities.isPrivate(classConstructorDescriptor.getVisibility())) {
            return false;
        }
        ClassDescriptor constructedClass = classConstructorDescriptor.getConstructedClass();
        AbstractC16544l.m18093f(constructedClass, "getConstructedClass(...)");
        if (InlineClassesUtilsKt.isValueClass(constructedClass) || DescriptorUtils.isSealedClass(classConstructorDescriptor.getConstructedClass())) {
            return false;
        }
        List<ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
        AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            AbstractC16544l.m18093f(type, "getType(...)");
            if (isValueClassThatRequiresMangling(type) || m18360a(type)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isValueClassThatRequiresMangling(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor != null) {
            return (InlineClassesUtilsKt.isInlineClass(classifierDescriptorMo22589getDeclarationDescriptor) && isValueClassThatRequiresMangling(classifierDescriptorMo22589getDeclarationDescriptor)) || InlineClassesUtilsKt.needsMfvcFlattening(kotlinType);
        }
        return false;
    }
}
