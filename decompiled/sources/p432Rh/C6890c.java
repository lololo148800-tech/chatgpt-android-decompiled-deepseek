package p432Rh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6890c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C6892e f22084Y;

    /* JADX INFO: renamed from: Z */
    public Throwable f22085Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f22086o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6892e f22087p0;

    /* JADX INFO: renamed from: q0 */
    public int f22088q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6890c(C6892e c6892e, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f22087p0 = c6892e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f22086o0 = obj;
        this.f22088q0 |= Integer.MIN_VALUE;
        return this.f22087p0.mo6741a(null, this);
    }
}
