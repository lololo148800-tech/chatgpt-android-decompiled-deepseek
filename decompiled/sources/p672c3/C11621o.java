package p672c3;

import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: c3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C11621o extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f35215Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11623p f35216Z;

    /* JADX INFO: renamed from: o0 */
    public int f35217o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11621o(C11623p c11623p, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35216Z = c11623p;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35215Y = obj;
        this.f35217o0 |= Integer.MIN_VALUE;
        this.f35216Z.m12998b(null, this);
        return EnumC19250a.f61036Y;
    }
}
