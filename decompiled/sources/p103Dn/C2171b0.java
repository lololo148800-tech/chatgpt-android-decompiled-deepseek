package p103Dn;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2171b0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6655Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1971o f6656Z;

    /* JADX INFO: renamed from: o0 */
    public int f6657o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2171b0(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6656Z = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6655Y = obj;
        this.f6657o0 |= Integer.MIN_VALUE;
        return this.f6656Z.m3142b(null, this);
    }
}
