package p647ak;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8215v5;
import p531Vj.C8340J;
import p729ej.C13421l;

/* JADX INFO: renamed from: ak.b1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10687b1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31737Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10696e1 f31738Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C10701g0 f31739o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C10730t0 f31740p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C13421l f31741q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10687b1(C10696e1 c10696e1, C10701g0 c10701g0, C10730t0 c10730t0, C13421l c13421l, int i10) {
        super(1);
        this.f31737Y = i10;
        this.f31738Z = c10696e1;
        this.f31739o0 = c10701g0;
        this.f31740p0 = c10730t0;
        this.f31741q0 = c13421l;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f31737Y) {
            case 0:
                C8340J it = (C8340J) obj;
                AbstractC16544l.m18094g(it, "it");
                C13421l c13421l = this.f31741q0;
                C10701g0 c10701g0 = this.f31739o0;
                C10730t0 c10730t0 = this.f31740p0;
                C10696e1 c10696e1 = this.f31738Z;
                return AbstractC8215v5.m8839a(c10696e1, new C10684a1(it, c10701g0, c10730t0, c10696e1, c13421l));
            default:
                C8340J it2 = (C8340J) obj;
                AbstractC16544l.m18094g(it2, "it");
                C13421l c13421l2 = this.f31741q0;
                C10701g0 c10701g1 = this.f31739o0;
                C10730t0 c10730t1 = this.f31740p0;
                C10696e1 c10696e2 = this.f31738Z;
                return AbstractC8215v5.m8839a(c10696e2, new C10690c1(it2, c10701g1, c10730t1, c10696e2, c13421l2));
        }
    }
}
