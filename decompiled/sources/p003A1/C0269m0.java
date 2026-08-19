package p003A1;

import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: A1.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0269m0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f981Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0275o0 f982Z;

    /* JADX INFO: renamed from: o0 */
    public int f983o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0269m0(C0275o0 c0275o0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f982Z = c0275o0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f981Y = obj;
        this.f983o0 |= Integer.MIN_VALUE;
        this.f982Z.m860a(null, this);
        return EnumC19250a.f61036Y;
    }
}
