package ge;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: ge.O0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14044O0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14053T0 f44149Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f44150Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14053T0 f44151o0;

    /* JADX INFO: renamed from: p0 */
    public int f44152p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14044O0(C14053T0 c14053t0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f44151o0 = c14053t0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f44150Z = obj;
        this.f44152p0 |= Integer.MIN_VALUE;
        return this.f44151o0.mo1965a(this);
    }
}
