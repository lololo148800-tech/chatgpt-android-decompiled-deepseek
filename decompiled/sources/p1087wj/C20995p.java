package p1087wj;

import p787he.C14462S;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: wj.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C20995p extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public AbstractC20994o f66827Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f66828Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14462S f66829o0;

    /* JADX INFO: renamed from: p0 */
    public int f66830p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20995p(C14462S c14462s, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f66829o0 = c14462s;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f66828Z = obj;
        this.f66830p0 |= Integer.MIN_VALUE;
        return this.f66829o0.m15993b(null, this);
    }
}
