package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;

/* JADX INFO: loaded from: classes2.dex */
public final class InlineClassesUtilsKt {
    static {
        ClassId.Companion.topLevel(new FqName("kotlin.jvm.JvmInline"));
    }

    public static final boolean isGetterOfUnderlyingPropertyOfValueClass(CallableDescriptor callableDescriptor) {
        AbstractC16544l.m18094g(callableDescriptor, "<this>");
        if (callableDescriptor instanceof PropertyGetterDescriptor) {
            PropertyDescriptor correspondingProperty = ((PropertyGetterDescriptor) callableDescriptor).getCorrespondingProperty();
            AbstractC16544l.m18093f(correspondingProperty, "getCorrespondingProperty(...)");
            if (isUnderlyingPropertyOfValueClass(correspondingProperty)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isInlineClass(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, "<this>");
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).getValueClassRepresentation() instanceof InlineClassRepresentation);
    }

    public static final boolean isInlineClassType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor != null) {
            return isInlineClass(classifierDescriptorMo22589getDeclarationDescriptor);
        }
        return false;
    }

    public static final boolean isMultiFieldValueClass(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, "<this>");
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).getValueClassRepresentation() instanceof MultiFieldValueClassRepresentation);
    }

    public static final boolean isUnderlyingPropertyOfInlineClass(VariableDescriptor variableDescriptor) {
        InlineClassRepresentation<SimpleType> inlineClassRepresentation;
        AbstractC16544l.m18094g(variableDescriptor, "<this>");
        if (variableDescriptor.getExtensionReceiverParameter() == null) {
            DeclarationDescriptor containingDeclaration = variableDescriptor.getContainingDeclaration();
            Name underlyingPropertyName = null;
            ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
            if (classDescriptor != null && (inlineClassRepresentation = DescriptorUtilsKt.getInlineClassRepresentation(classDescriptor)) != null) {
                underlyingPropertyName = inlineClassRepresentation.getUnderlyingPropertyName();
            }
            if (AbstractC16544l.m18089b(underlyingPropertyName, variableDescriptor.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isUnderlyingPropertyOfValueClass(VariableDescriptor variableDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentation;
        AbstractC16544l.m18094g(variableDescriptor, "<this>");
        if (variableDescriptor.getExtensionReceiverParameter() == null) {
            DeclarationDescriptor containingDeclaration = variableDescriptor.getContainingDeclaration();
            ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
            if (classDescriptor != null && (valueClassRepresentation = classDescriptor.getValueClassRepresentation()) != null) {
                Name name = variableDescriptor.getName();
                AbstractC16544l.m18093f(name, "getName(...)");
                if (valueClassRepresentation.containsPropertyWithName(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isValueClass(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, "<this>");
        return isInlineClass(declarationDescriptor) || isMultiFieldValueClass(declarationDescriptor);
    }

    public static final boolean isValueClassType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor != null) {
            return isValueClass(classifierDescriptorMo22589getDeclarationDescriptor);
        }
        return false;
    }

    public static final boolean needsMfvcFlattening(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        return (classifierDescriptorMo22589getDeclarationDescriptor == null || !isMultiFieldValueClass(classifierDescriptorMo22589getDeclarationDescriptor) || SimpleClassicTypeSystemContext.INSTANCE.isNullableType(kotlinType)) ? false : true;
    }

    public static final KotlinType substitutedUnderlyingType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        KotlinType kotlinTypeUnsubstitutedUnderlyingType = unsubstitutedUnderlyingType(kotlinType);
        if (kotlinTypeUnsubstitutedUnderlyingType != null) {
            return TypeSubstitutor.create(kotlinType).substitute(kotlinTypeUnsubstitutedUnderlyingType, Variance.INVARIANT);
        }
        return null;
    }

    public static final KotlinType unsubstitutedUnderlyingType(KotlinType kotlinType) {
        InlineClassRepresentation<SimpleType> inlineClassRepresentation;
        AbstractC16544l.m18094g(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        ClassDescriptor classDescriptor = classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null;
        if (classDescriptor == null || (inlineClassRepresentation = DescriptorUtilsKt.getInlineClassRepresentation(classDescriptor)) == null) {
            return null;
        }
        return (SimpleType) inlineClassRepresentation.getUnderlyingType();
    }
}
