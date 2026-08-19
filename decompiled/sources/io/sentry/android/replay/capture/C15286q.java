package io.sentry.android.replay.capture;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C15286q extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47747Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15287r f47748Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15286q(C15287r c15287r, int i10) {
        super(1);
        this.f47747Y = i10;
        this.f47748Z = c15287r;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f47747Y) {
            case 0:
                AbstractC15283n segment = (AbstractC15283n) obj;
                AbstractC16544l.m18094g(segment, "segment");
                if (segment instanceof C15281l) {
                    C15281l c15281l = (C15281l) segment;
                    C15287r c15287r = this.f47748Z;
                    C15281l.m16511a(c15281l, c15287r.f47750t);
                    c15287r.m16501m(c15287r.m16499k() + 1);
                    c15287r.m16503o(c15281l.f47739a.f47011G0);
                }
                break;
            default:
                AbstractC15283n segment2 = (AbstractC15283n) obj;
                AbstractC16544l.m18094g(segment2, "segment");
                if (segment2 instanceof C15281l) {
                    C15287r c15287r2 = this.f47748Z;
                    C15281l.m16511a((C15281l) segment2, c15287r2.f47750t);
                    c15287r2.m16501m(c15287r2.m16499k() + 1);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
