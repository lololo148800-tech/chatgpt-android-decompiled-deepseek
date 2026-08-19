package pn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: pn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C18516c implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C18516c f59004Z = new C18516c(0);

    /* JADX INFO: renamed from: o0 */
    public static final C18516c f59005o0 = new C18516c(1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59006Y;

    public /* synthetic */ C18516c(int i10) {
        this.f59006Y = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f59006Y) {
            case 0:
                ((Boolean) obj).booleanValue();
                return new C18519f(AbstractC9393x3.m9974d(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes()));
            default:
                KotlinType it = (KotlinType) obj;
                AbstractC16544l.m18094g(it, "it");
                return it.toString();
        }
    }
}
