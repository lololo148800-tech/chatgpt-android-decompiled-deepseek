package p316Mf;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p349O0.C5975S;
import p349O0.C5997d;
import p586Y0.C9566r;

/* JADX INFO: renamed from: Mf.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C5338e extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C5338e f17555Z = new C5338e(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5338e f17556o0 = new C5338e(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f17557Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5338e(int i10, int i11) {
        super(i10);
        this.f17557Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f17557Y) {
            case 0:
                return C5997d.m6430Q("", C5975S.f19448r0);
            default:
                return new C9566r();
        }
    }
}
