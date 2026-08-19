package kotlin.reflect.jvm.internal.impl.types;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p025An.C0644w;

/* JADX INFO: loaded from: classes2.dex */
public final class FlexibleTypeImpl extends FlexibleType implements CustomTypeParameter {
    public static final Companion Companion = new Companion(null);
    public static boolean RUN_SLOW_ASSERTIONS;

    /* JADX INFO: renamed from: p0 */
    public boolean f53164p0;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeImpl(SimpleType lowerBound, SimpleType upperBound) {
        super(lowerBound, upperBound);
        AbstractC16544l.m18094g(lowerBound, "lowerBound");
        AbstractC16544l.m18094g(upperBound, "upperBound");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public SimpleType getDelegate() {
        if (RUN_SLOW_ASSERTIONS && !this.f53164p0) {
            this.f53164p0 = true;
            FlexibleTypesKt.isFlexible(getLowerBound());
            FlexibleTypesKt.isFlexible(getUpperBound());
            AbstractC16544l.m18089b(getLowerBound(), getUpperBound());
            KotlinTypeChecker.DEFAULT.isSubtypeOf(getLowerBound(), getUpperBound());
        }
        return getLowerBound();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean isTypeParameter() {
        return (getLowerBound().getConstructor().mo22589getDeclarationDescriptor() instanceof TypeParameterDescriptor) && AbstractC16544l.m18089b(getLowerBound().getConstructor(), getUpperBound().getConstructor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType makeNullableAsSpecified(boolean z6) {
        return KotlinTypeFactory.flexibleType(getLowerBound().makeNullableAsSpecified(z6), getUpperBound().makeNullableAsSpecified(z6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String render(DescriptorRenderer renderer, DescriptorRendererOptions options) {
        AbstractC16544l.m18094g(renderer, "renderer");
        AbstractC16544l.m18094g(options, "options");
        if (!options.getDebugMode()) {
            return renderer.renderFlexibleType(renderer.renderType(getLowerBound()), renderer.renderType(getUpperBound()), TypeUtilsKt.getBuiltIns(this));
        }
        return Separators.LPAREN + renderer.renderType(getLowerBound()) + ".." + renderer.renderType(getUpperBound()) + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType replaceAttributes(TypeAttributes newAttributes) {
        AbstractC16544l.m18094g(newAttributes, "newAttributes");
        return KotlinTypeFactory.flexibleType(getLowerBound().replaceAttributes(newAttributes), getUpperBound().replaceAttributes(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public KotlinType substitutionResult(KotlinType replacement) {
        UnwrappedType unwrappedTypeFlexibleType;
        AbstractC16544l.m18094g(replacement, "replacement");
        UnwrappedType unwrappedTypeUnwrap = replacement.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            unwrappedTypeFlexibleType = unwrappedTypeUnwrap;
        } else {
            if (!(unwrappedTypeUnwrap instanceof SimpleType)) {
                throw new C0644w();
            }
            SimpleType simpleType = (SimpleType) unwrappedTypeUnwrap;
            unwrappedTypeFlexibleType = KotlinTypeFactory.flexibleType(simpleType, simpleType.makeNullableAsSpecified(true));
        }
        return TypeWithEnhancementKt.inheritEnhancement(unwrappedTypeFlexibleType, unwrappedTypeUnwrap);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String toString() {
        return Separators.LPAREN + getLowerBound() + ".." + getUpperBound() + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public FlexibleType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getLowerBound());
        AbstractC16544l.m18092e(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinTypeRefineType2 = kotlinTypeRefiner.refineType((KotlinTypeMarker) getUpperBound());
        AbstractC16544l.m18092e(kotlinTypeRefineType2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new FlexibleTypeImpl((SimpleType) kotlinTypeRefineType, (SimpleType) kotlinTypeRefineType2);
    }
}
