package p103Dn;

import p129En.C2582B;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2156S0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2158T0 f6605Y;

    /* JADX INFO: renamed from: Z */
    public C2582B f6606Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f6607o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2158T0 f6608p0;

    /* JADX INFO: renamed from: q0 */
    public int f6609q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2156S0(C2158T0 c2158t0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f6608p0 = c2158t0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6607o0 = obj;
        this.f6609q0 |= Integer.MIN_VALUE;
        return this.f6608p0.m3252b(this);
    }
}
