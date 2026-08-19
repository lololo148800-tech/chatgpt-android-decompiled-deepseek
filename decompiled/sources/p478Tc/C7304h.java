package p478Tc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p349O0.C6021p;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Tc.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C7304h extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C7304h f23140Y = new C7304h(3);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g((InterfaceC17783s0) obj, "$this$null");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        }
        return C17296C.f55119a;
    }
}
