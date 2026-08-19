package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FlexibleType extends UnwrappedType implements FlexibleTypeMarker {

    /* JADX INFO: renamed from: Z */
    public final SimpleType f53162Z;

    /* JADX INFO: renamed from: o0 */
    public final SimpleType f53163o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleType(SimpleType lowerBound, SimpleType upperBound) {
        super(null);
        AbstractC16544l.m18094g(lowerBound, "lowerBound");
        AbstractC16544l.m18094g(upperBound, "upperBound");
        this.f53162Z = lowerBound;
        this.f53163o0 = upperBound;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return getDelegate().getArguments();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return getDelegate().getAttributes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return getDelegate().getConstructor();
    }

    public abstract SimpleType getDelegate();

    public final SimpleType getLowerBound() {
        return this.f53162Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return getDelegate().getMemberScope();
    }

    public final SimpleType getUpperBound() {
        return this.f53163o0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }

    public abstract String render(DescriptorRenderer descriptorRenderer, DescriptorRendererOptions descriptorRendererOptions);

    public String toString() {
        return DescriptorRenderer.DEBUG_TEXT.renderType(this);
    }
}
