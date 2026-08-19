package p071Ch;

import p275Kn.InterfaceC4814a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ch.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C1666F extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C1669I f4716Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC4814a f4717Z;

    /* JADX INFO: renamed from: o0 */
    public C1669I f4718o0;

    /* JADX INFO: renamed from: p0 */
    public long f4719p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f4720q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C1669I f4721r0;

    /* JADX INFO: renamed from: s0 */
    public int f4722s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1666F(C1669I c1669i, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f4721r0 = c1669i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f4720q0 = obj;
        this.f4722s0 |= Integer.MIN_VALUE;
        return this.f4721r0.m2501d(this);
    }
}
