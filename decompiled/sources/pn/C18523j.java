package pn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;

/* JADX INFO: renamed from: pn.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C18523j extends DelegatingSimpleTypeImpl {

    /* JADX INFO: renamed from: o0 */
    public final TypeAttributes f59024o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18523j(SimpleType delegate, TypeAttributes attributes) {
        super(delegate);
        AbstractC16544l.m18094g(delegate, "delegate");
        AbstractC16544l.m18094g(attributes, "attributes");
        this.f59024o0 = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes getAttributes() {
        return this.f59024o0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType replaceDelegate(SimpleType delegate) {
        AbstractC16544l.m18094g(delegate, "delegate");
        return new C18523j(delegate, this.f59024o0);
    }
}
