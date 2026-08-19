package p995rl;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: rl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C19244d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f61005Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19249i f61006Z;

    /* JADX INFO: renamed from: o0 */
    public int f61007o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19244d(C19249i c19249i, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f61006Z = c19249i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f61005Y = obj;
        this.f61007o0 |= Integer.MIN_VALUE;
        return this.f61006Z.m20331b(null, null, null, this);
    }
}
