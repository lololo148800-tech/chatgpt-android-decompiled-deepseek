package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class AbbreviatedType extends DelegatingSimpleType {

    /* JADX INFO: renamed from: Z */
    public final SimpleType f53139Z;

    /* JADX INFO: renamed from: o0 */
    public final SimpleType f53140o0;

    public AbbreviatedType(SimpleType delegate, SimpleType abbreviation) {
        AbstractC16544l.m18094g(delegate, "delegate");
        AbstractC16544l.m18094g(abbreviation, "abbreviation");
        this.f53139Z = delegate;
        this.f53140o0 = abbreviation;
    }

    public final SimpleType getAbbreviation() {
        return this.f53140o0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType getDelegate() {
        return this.f53139Z;
    }

    public final SimpleType getExpandedType() {
        return this.f53139Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        AbstractC16544l.m18094g(newAttributes, "newAttributes");
        return new AbbreviatedType(this.f53139Z.replaceAttributes(newAttributes), this.f53140o0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public AbbreviatedType replaceDelegate(SimpleType delegate) {
        AbstractC16544l.m18094g(delegate, "delegate");
        return new AbbreviatedType(delegate, this.f53140o0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public AbbreviatedType makeNullableAsSpecified(boolean z6) {
        return new AbbreviatedType(this.f53139Z.makeNullableAsSpecified(z6), this.f53140o0.makeNullableAsSpecified(z6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public AbbreviatedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) this.f53139Z);
        AbstractC16544l.m18092e(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinTypeRefineType2 = kotlinTypeRefiner.refineType((KotlinTypeMarker) this.f53140o0);
        AbstractC16544l.m18092e(kotlinTypeRefineType2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new AbbreviatedType((SimpleType) kotlinTypeRefineType, (SimpleType) kotlinTypeRefineType2);
    }
}
