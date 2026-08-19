package p077Cn;

import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Cn.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C1741i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f4978Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1743k f4979Z;

    /* JADX INFO: renamed from: o0 */
    public int f4980o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1741i(C1743k c1743k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f4979Z = c1743k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f4978Y = obj;
        this.f4980o0 |= Integer.MIN_VALUE;
        Object objM2528I = C1743k.m2528I(this.f4979Z, this);
        return objM2528I == EnumC19250a.f61036Y ? objM2528I : new C1750r(objM2528I);
    }
}
