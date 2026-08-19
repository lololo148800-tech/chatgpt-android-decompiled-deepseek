package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorUtilKt {
    public static final ClassifierDescriptor getTopLevelContainingClassifier(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, "<this>");
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        if (containingDeclaration == null || (declarationDescriptor instanceof PackageFragmentDescriptor)) {
            return null;
        }
        if (!isTopLevelInPackage(containingDeclaration)) {
            return getTopLevelContainingClassifier(containingDeclaration);
        }
        if (containingDeclaration instanceof ClassifierDescriptor) {
            return (ClassifierDescriptor) containingDeclaration;
        }
        return null;
    }

    public static final boolean isTopLevelInPackage(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, "<this>");
        return declarationDescriptor.getContainingDeclaration() instanceof PackageFragmentDescriptor;
    }

    public static final boolean isTypedEqualsInValueClass(FunctionDescriptor functionDescriptor) {
        SimpleType defaultType;
        KotlinType kotlinTypeReplaceArgumentsWithStarProjections;
        KotlinType returnType;
        AbstractC16544l.m18094g(functionDescriptor, "<this>");
        DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null) {
            return false;
        }
        ClassDescriptor classDescriptor2 = InlineClassesUtilsKt.isValueClass(classDescriptor) ? classDescriptor : null;
        if (classDescriptor2 == null || (defaultType = classDescriptor2.getDefaultType()) == null || (kotlinTypeReplaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) == null || (returnType = functionDescriptor.getReturnType()) == null || !AbstractC16544l.m18089b(functionDescriptor.getName(), OperatorNameConventions.EQUALS)) {
            return false;
        }
        if ((!TypeUtilsKt.isBoolean(returnType) && !TypeUtilsKt.isNothing(returnType)) || functionDescriptor.getValueParameters().size() != 1) {
            return false;
        }
        KotlinType type = functionDescriptor.getValueParameters().get(0).getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        return AbstractC16544l.m18089b(TypeUtilsKt.replaceArgumentsWithStarProjections(type), kotlinTypeReplaceArgumentsWithStarProjections) && functionDescriptor.getContextReceiverParameters().isEmpty() && functionDescriptor.getExtensionReceiverParameter() == null;
    }

    public static final ClassDescriptor resolveClassByFqName(ModuleDescriptor moduleDescriptor, FqName fqName, LookupLocation lookupLocation) {
        MemberScope unsubstitutedInnerClassesScope;
        AbstractC16544l.m18094g(moduleDescriptor, "<this>");
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(lookupLocation, "lookupLocation");
        if (fqName.isRoot()) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier = moduleDescriptor.getPackage(fqName.parent()).getMemberScope().mo22590getContributedClassifier(fqName.shortName(), lookupLocation);
        ClassDescriptor classDescriptor = classifierDescriptorMo22590getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22590getContributedClassifier : null;
        if (classDescriptor != null) {
            return classDescriptor;
        }
        ClassDescriptor classDescriptorResolveClassByFqName = resolveClassByFqName(moduleDescriptor, fqName.parent(), lookupLocation);
        ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier2 = (classDescriptorResolveClassByFqName == null || (unsubstitutedInnerClassesScope = classDescriptorResolveClassByFqName.getUnsubstitutedInnerClassesScope()) == null) ? null : unsubstitutedInnerClassesScope.mo22590getContributedClassifier(fqName.shortName(), lookupLocation);
        if (classifierDescriptorMo22590getContributedClassifier2 instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo22590getContributedClassifier2;
        }
        return null;
    }
}
