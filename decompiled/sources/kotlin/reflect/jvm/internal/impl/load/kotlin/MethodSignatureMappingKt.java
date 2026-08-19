package kotlin.reflect.jvm.internal.impl.load.kotlin;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p315Me.Myis.CxcULo;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class MethodSignatureMappingKt {
    public static final String computeJvmDescriptor(FunctionDescriptor functionDescriptor, boolean z6, boolean z10) {
        String strAsString;
        AbstractC16544l.m18094g(functionDescriptor, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            if (functionDescriptor instanceof ConstructorDescriptor) {
                strAsString = "<init>";
            } else {
                strAsString = functionDescriptor.getName().asString();
                AbstractC16544l.m18093f(strAsString, "asString(...)");
            }
            sb2.append(strAsString);
        }
        sb2.append(Separators.LPAREN);
        ReceiverParameterDescriptor extensionReceiverParameter = functionDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            KotlinType type = extensionReceiverParameter.getType();
            AbstractC16544l.m18093f(type, "getType(...)");
            sb2.append(mapToJvmType(type));
        }
        Iterator<ValueParameterDescriptor> it = functionDescriptor.getValueParameters().iterator();
        while (it.hasNext()) {
            KotlinType type2 = it.next().getType();
            AbstractC16544l.m18093f(type2, "getType(...)");
            sb2.append(mapToJvmType(type2));
        }
        sb2.append(Separators.RPAREN);
        if (z6) {
            if (DescriptorBasedTypeSignatureMappingKt.hasVoidReturnType(functionDescriptor)) {
                sb2.append(TokenNames.f32021V);
            } else {
                KotlinType returnType = functionDescriptor.getReturnType();
                AbstractC16544l.m18091d(returnType);
                sb2.append(mapToJvmType(returnType));
            }
        }
        return sb2.toString();
    }

    public static /* synthetic */ String computeJvmDescriptor$default(FunctionDescriptor functionDescriptor, boolean z6, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = true;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return computeJvmDescriptor(functionDescriptor, z6, z10);
    }

    public static final String computeJvmSignature(CallableDescriptor callableDescriptor) {
        AbstractC16544l.m18094g(callableDescriptor, "<this>");
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        if (DescriptorUtils.isLocal(callableDescriptor)) {
            return null;
        }
        DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null || classDescriptor.getName().isSpecial()) {
            return null;
        }
        CallableDescriptor original = callableDescriptor.getOriginal();
        SimpleFunctionDescriptor simpleFunctionDescriptor = original instanceof SimpleFunctionDescriptor ? (SimpleFunctionDescriptor) original : null;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        return MethodSignatureBuildingUtilsKt.signature(signatureBuildingComponents, classDescriptor, computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null));
    }

    public static final String getInternalName(ClassDescriptor classDescriptor) {
        AbstractC16544l.m18094g(classDescriptor, "<this>");
        ClassId classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(DescriptorUtilsKt.getFqNameSafe(classDescriptor).toUnsafe());
        if (classIdMapKotlinToJava == null) {
            return DescriptorBasedTypeSignatureMappingKt.computeInternalName$default(classDescriptor, null, 2, null);
        }
        String strInternalNameByClassId = JvmClassName.internalNameByClassId(classIdMapKotlinToJava);
        AbstractC16544l.m18093f(strInternalNameByClassId, "internalNameByClassId(...)");
        return strInternalNameByClassId;
    }

    public static final JvmType mapToJvmType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return (JvmType) DescriptorBasedTypeSignatureMappingKt.mapType$default(kotlinType, C16572a.f52089a, TypeMappingMode.DEFAULT, TypeMappingConfigurationImpl.INSTANCE, null, null, 32, null);
    }

    public static final boolean forceSingleValueParameterBoxing(CallableDescriptor callableDescriptor) {
        FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava;
        AbstractC16544l.m18094g(callableDescriptor, CxcULo.YJn);
        if (!(callableDescriptor instanceof FunctionDescriptor)) {
            return false;
        }
        FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor;
        if (!AbstractC16544l.m18089b(functionDescriptor.getName().asString(), "remove") || functionDescriptor.getValueParameters().size() != 1 || SpecialBuiltinMembers.isFromJavaOrBuiltins((CallableMemberDescriptor) callableDescriptor)) {
            return false;
        }
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getOriginal().getValueParameters();
        AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
        KotlinType type = ((ValueParameterDescriptor) AbstractC17680n.m19365o0(valueParameters)).getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        JvmType jvmTypeMapToJvmType = mapToJvmType(type);
        JvmType.Primitive primitive = jvmTypeMapToJvmType instanceof JvmType.Primitive ? (JvmType.Primitive) jvmTypeMapToJvmType : null;
        if ((primitive != null ? primitive.getJvmPrimitiveType() : null) != JvmPrimitiveType.INT || (overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(functionDescriptor)) == null) {
            return false;
        }
        List<ValueParameterDescriptor> valueParameters2 = overriddenBuiltinFunctionWithErasedValueParametersInJava.getOriginal().getValueParameters();
        AbstractC16544l.m18093f(valueParameters2, "getValueParameters(...)");
        KotlinType type2 = ((ValueParameterDescriptor) AbstractC17680n.m19365o0(valueParameters2)).getType();
        AbstractC16544l.m18093f(type2, "getType(...)");
        JvmType jvmTypeMapToJvmType2 = mapToJvmType(type2);
        DeclarationDescriptor containingDeclaration = overriddenBuiltinFunctionWithErasedValueParametersInJava.getContainingDeclaration();
        AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
        return AbstractC16544l.m18089b(DescriptorUtilsKt.getFqNameUnsafe(containingDeclaration), StandardNames.FqNames.mutableCollection.toUnsafe()) && (jvmTypeMapToJvmType2 instanceof JvmType.Object) && AbstractC16544l.m18089b(((JvmType.Object) jvmTypeMapToJvmType2).getInternalName(), "java/lang/Object");
    }
}
