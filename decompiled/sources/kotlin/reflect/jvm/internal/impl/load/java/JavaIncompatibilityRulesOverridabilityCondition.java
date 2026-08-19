package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mm.C17309l;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        
            if (kotlin.jvm.internal.AbstractC16544l.m18089b(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r0), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r3)) == false) goto L23;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static JvmType m18175a(FunctionDescriptor functionDescriptor, ValueParameterDescriptor valueParameterDescriptor) {
            if (!MethodSignatureMappingKt.forceSingleValueParameterBoxing(functionDescriptor)) {
                if (functionDescriptor.getValueParameters().size() == 1) {
                    DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
                    ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
                    if (classDescriptor != null) {
                        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
                        AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
                        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((ValueParameterDescriptor) AbstractC17680n.m19365o0(valueParameters)).getType().getConstructor().mo22589getDeclarationDescriptor();
                        ClassDescriptor classDescriptor2 = classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null;
                        if (classDescriptor2 != null) {
                            if (KotlinBuiltIns.isPrimitiveClass(classDescriptor)) {
                            }
                        }
                    }
                }
                KotlinType type = valueParameterDescriptor.getType();
                AbstractC16544l.m18093f(type, "getType(...)");
                return MethodSignatureMappingKt.mapToJvmType(type);
            }
            KotlinType type2 = valueParameterDescriptor.getType();
            AbstractC16544l.m18093f(type2, "getType(...)");
            return MethodSignatureMappingKt.mapToJvmType(TypeUtilsKt.makeNullable(type2));
        }

        public final boolean doesJavaOverrideHaveIncompatibleValueParameterKinds(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor) {
            AbstractC16544l.m18094g(superDescriptor, "superDescriptor");
            AbstractC16544l.m18094g(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof JavaMethodDescriptor) && (superDescriptor instanceof FunctionDescriptor)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
                javaMethodDescriptor.getValueParameters().size();
                FunctionDescriptor functionDescriptor = (FunctionDescriptor) superDescriptor;
                functionDescriptor.getValueParameters().size();
                List<ValueParameterDescriptor> valueParameters = javaMethodDescriptor.getOriginal().getValueParameters();
                AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
                List<ValueParameterDescriptor> valueParameters2 = functionDescriptor.getOriginal().getValueParameters();
                AbstractC16544l.m18093f(valueParameters2, "getValueParameters(...)");
                for (C17309l c17309l : AbstractC17680n.m19334J0(valueParameters, valueParameters2)) {
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) c17309l.f55136Y;
                    ValueParameterDescriptor valueParameterDescriptor2 = (ValueParameterDescriptor) c17309l.f55137Z;
                    AbstractC16544l.m18091d(valueParameterDescriptor);
                    boolean z6 = m18175a((FunctionDescriptor) subDescriptor, valueParameterDescriptor) instanceof JvmType.Primitive;
                    AbstractC16544l.m18091d(valueParameterDescriptor2);
                    if (z6 != (m18175a(functionDescriptor, valueParameterDescriptor2) instanceof JvmType.Primitive)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        if (kotlin.jvm.internal.AbstractC16544l.m18089b(r1, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(r2, false, false, 2, null)) != false) goto L45;
     */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExternalOverridabilityCondition.Result isOverridable(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor, ClassDescriptor classDescriptor) {
        CallableMemberDescriptor overriddenSpecialBuiltin;
        boolean z6;
        FunctionDescriptor functionDescriptor;
        AbstractC16544l.m18094g(superDescriptor, "superDescriptor");
        AbstractC16544l.m18094g(subDescriptor, "subDescriptor");
        if ((superDescriptor instanceof CallableMemberDescriptor) && (subDescriptor instanceof FunctionDescriptor) && !KotlinBuiltIns.isBuiltIn(subDescriptor)) {
            BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
            FunctionDescriptor functionDescriptor2 = (FunctionDescriptor) subDescriptor;
            Name name = functionDescriptor2.getName();
            AbstractC16544l.m18093f(name, "getName(...)");
            if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
                overriddenSpecialBuiltin = SpecialBuiltinMembers.getOverriddenSpecialBuiltin((CallableMemberDescriptor) superDescriptor);
                z6 = superDescriptor instanceof FunctionDescriptor;
                if (z6) {
                    functionDescriptor = (FunctionDescriptor) superDescriptor;
                } else {
                    functionDescriptor = null;
                }
                if (functionDescriptor == null) {
                    if (classDescriptor instanceof JavaClassDescriptor) {
                        if (overriddenSpecialBuiltin instanceof FunctionDescriptor) {
                            String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor2, false, false, 2, null);
                            FunctionDescriptor original = ((FunctionDescriptor) superDescriptor).getOriginal();
                            AbstractC16544l.m18093f(original, "getOriginal(...)");
                        }
                    }
                } else if (classDescriptor instanceof JavaClassDescriptor) {
                    if (overriddenSpecialBuiltin instanceof FunctionDescriptor) {
                        String strComputeJvmDescriptor$default2 = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor2, false, false, 2, null);
                        FunctionDescriptor original2 = ((FunctionDescriptor) superDescriptor).getOriginal();
                        AbstractC16544l.m18093f(original2, "getOriginal(...)");
                    }
                }
                return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
            }
            SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
            Name name2 = functionDescriptor2.getName();
            AbstractC16544l.m18093f(name2, "getName(...)");
            if (companion.getSameAsRenamedInJvmBuiltin(name2)) {
                overriddenSpecialBuiltin = SpecialBuiltinMembers.getOverriddenSpecialBuiltin((CallableMemberDescriptor) superDescriptor);
                z6 = superDescriptor instanceof FunctionDescriptor;
                if (z6) {
                    functionDescriptor = (FunctionDescriptor) superDescriptor;
                } else {
                    functionDescriptor = null;
                }
                if ((functionDescriptor == null && functionDescriptor2.isHiddenToOvercomeSignatureClash() == functionDescriptor.isHiddenToOvercomeSignatureClash()) || (overriddenSpecialBuiltin != null && functionDescriptor2.isHiddenToOvercomeSignatureClash())) {
                    if ((classDescriptor instanceof JavaClassDescriptor) && functionDescriptor2.getInitialSignatureDescriptor() == null && overriddenSpecialBuiltin != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(classDescriptor, overriddenSpecialBuiltin)) {
                        if ((overriddenSpecialBuiltin instanceof FunctionDescriptor) && z6 && BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((FunctionDescriptor) overriddenSpecialBuiltin) != null) {
                            String strComputeJvmDescriptor$default3 = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor2, false, false, 2, null);
                            FunctionDescriptor original3 = ((FunctionDescriptor) superDescriptor).getOriginal();
                            AbstractC16544l.m18093f(original3, "getOriginal(...)");
                        }
                    }
                }
                return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
            }
        }
        return Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(superDescriptor, subDescriptor) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
