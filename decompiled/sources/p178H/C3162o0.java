package p178H;

import android.util.Size;
import android.view.Surface;
import p228J.AbstractC3810L;
import p301M.AbstractC5229k;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: H.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3162o0 extends AbstractC3810L {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f9509o = 0;

    /* JADX INFO: renamed from: p */
    public final Object f9510p;

    public C3162o0(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f9510p = surface;
    }

    @Override // p228J.AbstractC3810L
    /* JADX INFO: renamed from: f */
    public final InterfaceFutureC13608b mo3992f() {
        switch (this.f9509o) {
            case 0:
                return ((C3170s0) this.f9510p).f9539f;
            default:
                return AbstractC5229k.m5779c((Surface) this.f9510p);
        }
    }

    public C3162o0(Surface surface) {
        super(AbstractC3810L.f11522k, 0);
        this.f9510p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3162o0(C3170s0 c3170s0, Size size) {
        super(size, 34);
        this.f9510p = c3170s0;
    }
}
