package p823j3;

import p049Bm.InterfaceC1439n;
import p275Kn.C4816c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: j3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C16092n extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f49842Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC1439n f49843Z;

    /* JADX INFO: renamed from: o0 */
    public C4816c f49844o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f49845p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16096r f49846q0;

    /* JADX INFO: renamed from: r0 */
    public int f49847r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16092n(C16096r c16096r, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f49846q0 = c16096r;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f49845p0 = obj;
        this.f49847r0 |= Integer.MIN_VALUE;
        return this.f49846q0.m17652a(null, this);
    }
}
