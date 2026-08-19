package p293Lh;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1442q;
import p098Di.InterfaceC2062k;
import p349O0.C6021p;
import p911o0.C17794y;

/* JADX INFO: renamed from: Lh.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C5068n extends AbstractC16546n implements InterfaceC1442q {

    /* JADX INFO: renamed from: Y */
    public static final C5068n f16574Y = new C5068n(5);

    @Override // p049Bm.InterfaceC1442q
    /* JADX INFO: renamed from: j */
    public final Object mo2052j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        InterfaceC2062k anonymous$parameter$0$ = (InterfaceC2062k) obj2;
        InterfaceC1436k anonymous$parameter$1$ = (InterfaceC1436k) obj3;
        C6021p c6021p = (C6021p) obj4;
        int iIntValue = ((Number) obj5).intValue();
        AbstractC16544l.m18094g((C17794y) obj, "$this$null");
        AbstractC16544l.m18094g(anonymous$parameter$0$, "$anonymous$parameter$0$");
        AbstractC16544l.m18094g(anonymous$parameter$1$, "$anonymous$parameter$1$");
        if ((iIntValue & 1025) == 1024 && c6021p.m6562y()) {
            c6021p.m6517L();
        }
        return C17296C.f55119a;
    }
}
