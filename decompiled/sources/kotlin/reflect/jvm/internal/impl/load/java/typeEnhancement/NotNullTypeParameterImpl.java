package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p025An.C0644w;
import p379Pb.LVf.efyhmdM;

/* JADX INFO: loaded from: classes2.dex */
public final class NotNullTypeParameterImpl extends DelegatingSimpleType implements NotNullTypeParameter {

    /* JADX INFO: renamed from: Z */
    public final SimpleType f51985Z;

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType getDelegate() {
        return this.f51985Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean isTypeParameter() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public KotlinType substitutionResult(KotlinType replacement) {
        AbstractC16544l.m18094g(replacement, "replacement");
        UnwrappedType unwrappedTypeUnwrap = replacement.unwrap();
        if (!TypeUtilsKt.isTypeParameter(unwrappedTypeUnwrap) && !TypeUtils.isNullableType(unwrappedTypeUnwrap)) {
            return unwrappedTypeUnwrap;
        }
        if (unwrappedTypeUnwrap instanceof SimpleType) {
            SimpleType simpleType = (SimpleType) unwrappedTypeUnwrap;
            SimpleType simpleTypeMakeNullableAsSpecified = simpleType.makeNullableAsSpecified(false);
            return !TypeUtilsKt.isTypeParameter(simpleType) ? simpleTypeMakeNullableAsSpecified : new NotNullTypeParameterImpl(simpleTypeMakeNullableAsSpecified);
        }
        if (!(unwrappedTypeUnwrap instanceof FlexibleType)) {
            throw new C0644w();
        }
        FlexibleType flexibleType = (FlexibleType) unwrappedTypeUnwrap;
        SimpleType lowerBound = flexibleType.getLowerBound();
        SimpleType simpleTypeMakeNullableAsSpecified2 = lowerBound.makeNullableAsSpecified(false);
        if (TypeUtilsKt.isTypeParameter(lowerBound)) {
            simpleTypeMakeNullableAsSpecified2 = new NotNullTypeParameterImpl(simpleTypeMakeNullableAsSpecified2);
        }
        SimpleType upperBound = flexibleType.getUpperBound();
        SimpleType simpleTypeMakeNullableAsSpecified3 = upperBound.makeNullableAsSpecified(false);
        if (TypeUtilsKt.isTypeParameter(upperBound)) {
            simpleTypeMakeNullableAsSpecified3 = new NotNullTypeParameterImpl(simpleTypeMakeNullableAsSpecified3);
        }
        return TypeWithEnhancementKt.wrapEnhancement(KotlinTypeFactory.flexibleType(simpleTypeMakeNullableAsSpecified2, simpleTypeMakeNullableAsSpecified3), TypeWithEnhancementKt.getEnhancement(unwrappedTypeUnwrap));
    }

    public NotNullTypeParameterImpl(SimpleType simpleType) {
        AbstractC16544l.m18094g(simpleType, efyhmdM.ETMx);
        this.f51985Z = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z6) {
        return z6 ? this.f51985Z.makeNullableAsSpecified(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public NotNullTypeParameterImpl replaceDelegate(SimpleType delegate) {
        AbstractC16544l.m18094g(delegate, "delegate");
        return new NotNullTypeParameterImpl(delegate);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public NotNullTypeParameterImpl replaceAttributes(TypeAttributes newAttributes) {
        AbstractC16544l.m18094g(newAttributes, "newAttributes");
        return new NotNullTypeParameterImpl(this.f51985Z.replaceAttributes(newAttributes));
    }
}
