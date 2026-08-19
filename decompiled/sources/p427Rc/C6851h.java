package p427Rc;

import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rc.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C6851h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f21988Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6852i f21989Z;

    /* JADX INFO: renamed from: o0 */
    public int f21990o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6851h(C6852i c6852i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f21989Z = c6852i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f21988Y = obj;
        this.f21990o0 |= Integer.MIN_VALUE;
        this.f21989Z.mo3141d(null, this);
        return EnumC19250a.f61036Y;
    }
}
