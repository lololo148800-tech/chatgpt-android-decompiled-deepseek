package p403Qd;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p381Pe.C6397h;
import p479Td.C7351f0;

/* JADX INFO: renamed from: Qd.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C6634h extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C6634h f21374Z = new C6634h(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C6634h f21375o0 = new C6634h(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21376Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6634h(int i10, int i11) {
        super(i10);
        this.f21376Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f21376Y) {
            case 0:
                C6397h it = (C6397h) obj;
                AbstractC16544l.m18094g(it, "it");
                return (C7351f0) it.f20822d;
            default:
                C6397h it2 = (C6397h) obj;
                AbstractC16544l.m18094g(it2, "it");
                return Boolean.valueOf(((C7351f0) it2.f20822d).f23271G != null);
        }
    }
}
