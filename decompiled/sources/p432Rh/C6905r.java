package p432Rh;

import p275Kn.InterfaceC4814a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rh.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C6905r extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f22137Y;

    /* JADX INFO: renamed from: Z */
    public Object f22138Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC4814a f22139o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f22140p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C6906s f22141q0;

    /* JADX INFO: renamed from: r0 */
    public int f22142r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6905r(C6906s c6906s, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f22141q0 = c6906s;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f22140p0 = obj;
        this.f22142r0 |= Integer.MIN_VALUE;
        return this.f22141q0.m7293e(null, this);
    }
}
