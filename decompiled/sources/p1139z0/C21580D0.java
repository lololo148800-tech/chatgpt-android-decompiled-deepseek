package p1139z0;

import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: z0.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21580D0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f68334Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21582E0 f68335Z;

    /* JADX INFO: renamed from: o0 */
    public int f68336o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21580D0(C21582E0 c21582e0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f68335Z = c21582e0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f68334Y = obj;
        this.f68336o0 |= Integer.MIN_VALUE;
        this.f68335Z.m21880b(null, this);
        return EnumC19250a.f61036Y;
    }
}
