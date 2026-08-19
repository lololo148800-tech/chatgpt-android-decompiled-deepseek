package p666bl;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: bl.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11487c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11488d f34761Y;

    /* JADX INFO: renamed from: Z */
    public String f34762Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f34763o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11488d f34764p0;

    /* JADX INFO: renamed from: q0 */
    public int f34765q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11487c(C11488d c11488d, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f34764p0 = c11488d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f34763o0 = obj;
        this.f34765q0 |= Integer.MIN_VALUE;
        return this.f34764p0.m12892e(null, this);
    }
}
