package p097Dh;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p556Wk.C8907V;

/* JADX INFO: renamed from: Dh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2048a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C2048a f6265Y = new C2048a(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C8907V timeout = (C8907V) obj;
        AbstractC16544l.m18094g(timeout, "$this$timeout");
        C8907V.m9563a(5000L);
        timeout.f27258a = 5000L;
        return C17296C.f55119a;
    }
}
