package p758g0;

import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.InterfaceC5982V0;

/* JADX INFO: renamed from: g0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C13774m implements InterfaceC5982V0 {

    /* JADX INFO: renamed from: Y */
    public final C13783q0 f43501Y;

    /* JADX INFO: renamed from: Z */
    public final C6002f0 f43502Z;

    /* JADX INFO: renamed from: o0 */
    public AbstractC13784r f43503o0;

    /* JADX INFO: renamed from: p0 */
    public long f43504p0;

    /* JADX INFO: renamed from: q0 */
    public long f43505q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f43506r0;

    public /* synthetic */ C13774m(C13783q0 c13783q0, Object obj, AbstractC13784r abstractC13784r, int i10) {
        this(c13783q0, obj, (i10 & 4) != 0 ? null : abstractC13784r, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: c */
    public final Object m15282c() {
        return this.f43501Y.f43527b.invoke(this.f43503o0);
    }

    @Override // p349O0.InterfaceC5982V0
    public final Object getValue() {
        return this.f43502Z.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f43502Z.getValue() + ", velocity=" + m15282c() + ", isRunning=" + this.f43506r0 + ", lastFrameTimeNanos=" + this.f43504p0 + ", finishedTimeNanos=" + this.f43505q0 + ')';
    }

    public C13774m(C13783q0 c13783q0, Object obj, AbstractC13784r abstractC13784r, long j10, long j11, boolean z6) {
        AbstractC13784r abstractC13784rM15247l;
        this.f43501Y = c13783q0;
        this.f43502Z = C5997d.m6430Q(obj, C5975S.f19448r0);
        if (abstractC13784r != null) {
            abstractC13784rM15247l = AbstractC13758e.m15247l(abstractC13784r);
        } else {
            abstractC13784rM15247l = (AbstractC13784r) c13783q0.f43526a.invoke(obj);
            abstractC13784rM15247l.mo15286d();
        }
        this.f43503o0 = abstractC13784rM15247l;
        this.f43504p0 = j10;
        this.f43505q0 = j11;
        this.f43506r0 = z6;
    }
}
