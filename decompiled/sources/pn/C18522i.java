package pn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: renamed from: pn.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C18522i extends DelegatingSimpleTypeImpl {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f59023o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18522i(SimpleType simpleType, int i10) {
        super(simpleType);
        this.f59023o0 = i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean isMarkedNullable() {
        switch (this.f59023o0) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType replaceDelegate(SimpleType delegate) {
        switch (this.f59023o0) {
            case 0:
                AbstractC16544l.m18094g(delegate, "delegate");
                return new C18522i(delegate, 0);
            default:
                AbstractC16544l.m18094g(delegate, "delegate");
                return new C18522i(delegate, 1);
        }
    }
}
