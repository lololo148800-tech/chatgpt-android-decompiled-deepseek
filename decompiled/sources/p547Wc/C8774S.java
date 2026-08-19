package p547Wc;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p349O0.C5975S;
import p349O0.C5997d;

/* JADX INFO: renamed from: Wc.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C8774S extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C8774S f26762Z = new C8774S(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C8774S f26763o0 = new C8774S(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C8774S f26764p0 = new C8774S(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26765Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8774S(int i10, int i11) {
        super(i10);
        this.f26765Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f26765Y) {
            case 0:
                return Float.valueOf(0.0f);
            case 1:
                return C5997d.m6430Q("", C5975S.f19448r0);
            default:
                return Float.valueOf(0.0f);
        }
    }
}
