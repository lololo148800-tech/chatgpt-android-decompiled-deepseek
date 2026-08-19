package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p1091wn.AbstractC21031l;
import p1091wn.C21025f;
import p1091wn.C21028i;
import p1091wn.C21036q;
import p1091wn.InterfaceC21029j;
import p511Um.C7722a;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            try {
                iArr[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Result isOverridable(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor, ClassDescriptor classDescriptor) {
        AbstractC16544l.m18094g(superDescriptor, "superDescriptor");
        AbstractC16544l.m18094g(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
            List<TypeParameterDescriptor> typeParameters = javaMethodDescriptor.getTypeParameters();
            AbstractC16544l.m18093f(typeParameters, "getTypeParameters(...)");
            if (typeParameters.isEmpty()) {
                OverridingUtil.OverrideCompatibilityInfo basicOverridabilityProblem = OverridingUtil.getBasicOverridabilityProblem(superDescriptor, subDescriptor);
                if ((basicOverridabilityProblem != null ? basicOverridabilityProblem.getResult() : null) != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List<ValueParameterDescriptor> valueParameters = javaMethodDescriptor.getValueParameters();
                AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
                C21036q c21036qM21495s = AbstractC21031l.m21495s(AbstractC17680n.m19329H(valueParameters), C7722a.f24342r0);
                KotlinType returnType = javaMethodDescriptor.getReturnType();
                AbstractC16544l.m18091d(returnType);
                C21028i c21028iM21490n = AbstractC21031l.m21490n(AbstractC17678l.m19297d(new InterfaceC21029j[]{c21036qM21495s, AbstractC17678l.m19297d(new Object[]{returnType})}));
                ReceiverParameterDescriptor extensionReceiverParameter = javaMethodDescriptor.getExtensionReceiverParameter();
                C21025f c21025f = new C21025f(AbstractC21031l.m21490n(AbstractC17678l.m19297d(new InterfaceC21029j[]{c21028iM21490n, AbstractC17680n.m19329H(AbstractC17681o.m19383l(extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null))})));
                while (c21025f.hasNext()) {
                    KotlinType kotlinType = (KotlinType) c21025f.next();
                    if (!kotlinType.getArguments().isEmpty() && !(kotlinType.unwrap() instanceof RawTypeImpl)) {
                        return ExternalOverridabilityCondition.Result.UNKNOWN;
                    }
                }
                CallableDescriptor callableDescriptorSubstitute = superDescriptor.substitute(new RawSubstitution(null, 1, null).buildSubstitutor());
                if (callableDescriptorSubstitute == null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if (callableDescriptorSubstitute instanceof SimpleFunctionDescriptor) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) callableDescriptorSubstitute;
                    List<TypeParameterDescriptor> typeParameters2 = simpleFunctionDescriptor.getTypeParameters();
                    AbstractC16544l.m18093f(typeParameters2, "getTypeParameters(...)");
                    if (!typeParameters2.isEmpty()) {
                        callableDescriptorSubstitute = simpleFunctionDescriptor.newCopyBuilder().setTypeParameters(C17689w.f56480Y).build();
                        AbstractC16544l.m18091d(callableDescriptorSubstitute);
                    }
                }
                OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(callableDescriptorSubstitute, subDescriptor, false).getResult();
                AbstractC16544l.m18093f(result, "getResult(...)");
                return WhenMappings.$EnumSwitchMapping$0[result.ordinal()] == 1 ? ExternalOverridabilityCondition.Result.OVERRIDABLE : ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
