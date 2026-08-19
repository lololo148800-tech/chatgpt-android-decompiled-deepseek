package p293Lh;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p049Bm.InterfaceC1442q;
import p098Di.InterfaceC2062k;
import p349O0.C6021p;
import p911o0.C17794y;

/* JADX INFO: renamed from: Lh.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C5075u extends AbstractC16546n implements InterfaceC1442q {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1440o f16605Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5075u(InterfaceC1440o interfaceC1440o) {
        super(5);
        this.f16605Y = interfaceC1440o;
    }

    @Override // p049Bm.InterfaceC1442q
    /* JADX INFO: renamed from: j */
    public final Object mo2052j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C17794y ScrollableContentScreenContent = (C17794y) obj;
        InterfaceC2062k anonymous$parameter$0$ = (InterfaceC2062k) obj2;
        InterfaceC1436k anonymous$parameter$1$ = (InterfaceC1436k) obj3;
        int iIntValue = ((Number) obj5).intValue();
        AbstractC16544l.m18094g(ScrollableContentScreenContent, "$this$ScrollableContentScreenContent");
        AbstractC16544l.m18094g(anonymous$parameter$0$, "$anonymous$parameter$0$");
        AbstractC16544l.m18094g(anonymous$parameter$1$, "$anonymous$parameter$1$");
        Integer numValueOf = Integer.valueOf(iIntValue & 14);
        this.f16605Y.invoke(ScrollableContentScreenContent, (C6021p) obj4, numValueOf);
        return C17296C.f55119a;
    }
}
