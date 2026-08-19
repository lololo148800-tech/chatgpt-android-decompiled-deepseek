package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p759g1.C13800b;

/* JADX INFO: renamed from: D0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1840y extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5331Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1803f0 f5332Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1840y(C1803f0 c1803f0, int i10) {
        super(0);
        this.f5331Y = i10;
        this.f5332Z = c1803f0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f5331Y) {
            case 0:
                C13800b c13800b = (C13800b) this.f5332Z.f5191n.getValue();
                return new C13800b(c13800b != null ? c13800b.f43584a : 9205357640488583168L);
            case 1:
                C13800b c13800b2 = (C13800b) this.f5332Z.f5192o.getValue();
                return new C13800b(c13800b2 != null ? c13800b2.f43584a : 9205357640488583168L);
            case 2:
                C1803f0 c1803f0 = this.f5332Z;
                c1803f0.f5196s = true;
                c1803f0.m2604p();
                c1803f0.f5193p.setValue(null);
                c1803f0.f5194q.setValue(null);
                return C17296C.f55119a;
            default:
                this.f5332Z.m2597i();
                return C17296C.f55119a;
        }
    }
}
