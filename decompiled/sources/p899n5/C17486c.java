package p899n5;

import p275Kn.C4822i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: n5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17486c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f55942Y;

    /* JADX INFO: renamed from: Z */
    public C4822i f55943Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f55944o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17487d f55945p0;

    /* JADX INFO: renamed from: q0 */
    public int f55946q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17486c(C17487d c17487d, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f55945p0 = c17487d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f55944o0 = obj;
        this.f55946q0 |= Integer.MIN_VALUE;
        return this.f55945p0.mo19196a(this);
    }
}
