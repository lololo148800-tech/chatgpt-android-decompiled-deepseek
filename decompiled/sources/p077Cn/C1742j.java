package p077Cn;

import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Cn.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C1742j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f4981Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1743k f4982Z;

    /* JADX INFO: renamed from: o0 */
    public int f4983o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742j(C1743k c1743k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f4982Z = c1743k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f4981Y = obj;
        this.f4983o0 |= Integer.MIN_VALUE;
        Object objM2540J = this.f4982Z.m2540J(null, 0, 0L, this);
        return objM2540J == EnumC19250a.f61036Y ? objM2540J : new C1750r(objM2540J);
    }
}
