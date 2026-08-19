package p787he;

import p403Qd.C6636i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C14468Y extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14473b0 f45572Y;

    /* JADX INFO: renamed from: Z */
    public C6636i f45573Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f45574o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14473b0 f45575p0;

    /* JADX INFO: renamed from: q0 */
    public int f45576q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14468Y(C14473b0 c14473b0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45575p0 = c14473b0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45574o0 = obj;
        this.f45576q0 |= Integer.MIN_VALUE;
        return this.f45575p0.m15994a(null, null, null, this);
    }
}
