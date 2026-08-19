package p042Bf;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p349O0.C5975S;
import p349O0.C5997d;

/* JADX INFO: renamed from: Bf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1261c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C1261c f3341Z = new C1261c(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C1261c f3342o0 = new C1261c(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3343Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1261c(int i10, int i11) {
        super(i10);
        this.f3343Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f3343Y) {
            case 0:
                return C5997d.m6430Q(Boolean.TRUE, C5975S.f19448r0);
            default:
                return C5997d.m6430Q(null, C5975S.f19448r0);
        }
    }
}
