package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class FlexibleTypeWithEnhancement extends FlexibleType implements TypeWithEnhancement {

    /* JADX INFO: renamed from: p0 */
    public final FlexibleType f53165p0;

    /* JADX INFO: renamed from: q0 */
    public final KotlinType f53166q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeWithEnhancement(FlexibleType origin, KotlinType enhancement) {
        super(origin.getLowerBound(), origin.getUpperBound());
        AbstractC16544l.m18094g(origin, "origin");
        AbstractC16544l.m18094g(enhancement, "enhancement");
        this.f53165p0 = origin;
        this.f53166q0 = enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public SimpleType getDelegate() {
        return getOrigin().getDelegate();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public KotlinType getEnhancement() {
        return this.f53166q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType makeNullableAsSpecified(boolean z6) {
        return TypeWithEnhancementKt.wrapEnhancement(getOrigin().makeNullableAsSpecified(z6), getEnhancement().unwrap().makeNullableAsSpecified(z6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String render(DescriptorRenderer renderer, DescriptorRendererOptions options) {
        AbstractC16544l.m18094g(renderer, "renderer");
        AbstractC16544l.m18094g(options, "options");
        return options.getEnhancedTypes() ? renderer.renderType(getEnhancement()) : getOrigin().render(renderer, options);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType replaceAttributes(TypeAttributes newAttributes) {
        AbstractC16544l.m18094g(newAttributes, "newAttributes");
        return TypeWithEnhancementKt.wrapEnhancement(getOrigin().replaceAttributes(newAttributes), getEnhancement());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String toString() {
        return "[@EnhancedForWarnings(" + getEnhancement() + ")] " + getOrigin();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public FlexibleType getOrigin() {
        return this.f53165p0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public FlexibleTypeWithEnhancement refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getOrigin());
        AbstractC16544l.m18092e(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new FlexibleTypeWithEnhancement((FlexibleType) kotlinTypeRefineType, kotlinTypeRefiner.refineType((KotlinTypeMarker) getEnhancement()));
    }
}
