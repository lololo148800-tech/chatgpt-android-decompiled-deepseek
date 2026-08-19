package p403Qd;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.C21984a1;
import p381Pe.C6397h;

/* JADX INFO: renamed from: Qd.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6630f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21366Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6397h f21367Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6630f(C6397h c6397h, int i10) {
        super(1);
        this.f21366Y = i10;
        this.f21367Z = c6397h;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f21366Y) {
            case 0:
                C6397h it = (C6397h) obj;
                AbstractC16544l.m18094g(it, "it");
                String str = ((C21984a1) it.f20819a).f69607Y;
                C21984a1 c21984a1 = (C21984a1) this.f21367Z.f20820b;
                String str2 = c21984a1 != null ? c21984a1.f69607Y : null;
                return Boolean.valueOf(str2 == null ? false : AbstractC16544l.m18089b(str, str2));
            default:
                C6397h it2 = (C6397h) obj;
                AbstractC16544l.m18094g(it2, "it");
                return Boolean.valueOf(it2.f20821c.contains(this.f21367Z.f20819a));
        }
    }
}
