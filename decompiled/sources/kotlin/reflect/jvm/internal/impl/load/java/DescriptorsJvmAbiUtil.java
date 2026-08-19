package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorsJvmAbiUtil {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18169a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "companionObject";
        } else if (i10 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i10 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i10 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i10 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean hasJvmFieldAnnotation(CallableMemberDescriptor callableMemberDescriptor) {
        FieldDescriptor backingField;
        if (callableMemberDescriptor == null) {
            m18169a(3);
            throw null;
        }
        if ((callableMemberDescriptor instanceof PropertyDescriptor) && (backingField = ((PropertyDescriptor) callableMemberDescriptor).getBackingField()) != null && backingField.getAnnotations().hasAnnotation(JvmAbi.JVM_FIELD_ANNOTATION_FQ_NAME)) {
            return true;
        }
        return callableMemberDescriptor.getAnnotations().hasAnnotation(JvmAbi.JVM_FIELD_ANNOTATION_FQ_NAME);
    }

    public static boolean isClassCompanionObjectWithBackingFieldsInOuter(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return DescriptorUtils.isCompanionObject(declarationDescriptor) && DescriptorUtils.isClassOrEnumClass(declarationDescriptor.getContainingDeclaration()) && !isMappedIntrinsicCompanionObject((ClassDescriptor) declarationDescriptor);
        }
        m18169a(1);
        throw null;
    }

    public static boolean isMappedIntrinsicCompanionObject(ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return CompanionObjectMappingUtilsKt.isMappedIntrinsicCompanionObject(CompanionObjectMapping.INSTANCE, classDescriptor);
        }
        m18169a(2);
        throw null;
    }

    public static boolean isPropertyWithBackingFieldInOuterClass(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor == null) {
            m18169a(0);
            throw null;
        }
        if (propertyDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return false;
        }
        if (isClassCompanionObjectWithBackingFieldsInOuter(propertyDescriptor.getContainingDeclaration())) {
            return true;
        }
        return DescriptorUtils.isCompanionObject(propertyDescriptor.getContainingDeclaration()) && hasJvmFieldAnnotation(propertyDescriptor);
    }
}
