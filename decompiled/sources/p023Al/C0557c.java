package p023Al;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Al.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0557c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C0559e f1768Y;

    /* JADX INFO: renamed from: Z */
    public int f1769Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f1770o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0559e f1771p0;

    /* JADX INFO: renamed from: q0 */
    public int f1772q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0557c(C0559e c0559e, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f1771p0 = c0559e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f1770o0 = obj;
        this.f1772q0 |= Integer.MIN_VALUE;
        return this.f1771p0.mo1140d(0, this);
    }
}
