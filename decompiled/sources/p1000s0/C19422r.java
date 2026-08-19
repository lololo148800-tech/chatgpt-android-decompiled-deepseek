package p1000s0;

import kotlin.jvm.internal.AbstractC16546n;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p153Fn.C2925c;

/* JADX INFO: renamed from: s0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C19422r extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f61563Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19408d f61564Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2925c f61565o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19422r(C19408d c19408d, C2925c c2925c, int i10) {
        super(0);
        this.f61563Y = i10;
        this.f61564Z = c19408d;
        this.f61565o0 = c2925c;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f61563Y) {
            case 0:
                C2925c c2925c = this.f61565o0;
                C19408d c19408d = this.f61564Z;
                if (c19408d.mo5257c()) {
                    AbstractC0575H.m1156D(c2925c, null, null, new C19423s(c19408d, null), 3);
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 1:
                C2925c c2925c2 = this.f61565o0;
                C19408d c19408d2 = this.f61564Z;
                if (c19408d2.mo5258d()) {
                    AbstractC0575H.m1156D(c2925c2, null, null, new C19424t(c19408d2, null), 3);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 2:
                C2925c c2925c3 = this.f61565o0;
                C19408d c19408d3 = this.f61564Z;
                if (c19408d3.mo5257c()) {
                    AbstractC0575H.m1156D(c2925c3, null, null, new C19423s(c19408d3, null), 3);
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            default:
                C2925c c2925c4 = this.f61565o0;
                C19408d c19408d4 = this.f61564Z;
                if (c19408d4.mo5258d()) {
                    AbstractC0575H.m1156D(c2925c4, null, null, new C19424t(c19408d4, null), 3);
                    z12 = true;
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
        }
    }
}
