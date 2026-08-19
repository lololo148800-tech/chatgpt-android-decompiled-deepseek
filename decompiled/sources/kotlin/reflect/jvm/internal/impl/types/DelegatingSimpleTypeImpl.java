package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import pn.C18523j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DelegatingSimpleTypeImpl extends DelegatingSimpleType {

    /* JADX INFO: renamed from: Z */
    public final SimpleType f53155Z;

    public DelegatingSimpleTypeImpl(SimpleType delegate) {
        AbstractC16544l.m18094g(delegate, "delegate");
        this.f53155Z = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType getDelegate() {
        return this.f53155Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z6) {
        return z6 == isMarkedNullable() ? this : this.f53155Z.makeNullableAsSpecified(z6).replaceAttributes(getAttributes());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        AbstractC16544l.m18094g(newAttributes, "newAttributes");
        return newAttributes != getAttributes() ? new C18523j(this, newAttributes) : this;
    }
}
