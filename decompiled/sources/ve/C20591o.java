package ve;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: ve.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C20591o extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C20592p f65337Y;

    /* JADX INFO: renamed from: Z */
    public EnumC20582f f65338Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f65339o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f65340p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C20592p f65341q0;

    /* JADX INFO: renamed from: r0 */
    public int f65342r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20591o(C20592p c20592p, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f65341q0 = c20592p;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f65340p0 = obj;
        this.f65342r0 |= Integer.MIN_VALUE;
        return this.f65341q0.m21192f(null, false, this);
    }
}
