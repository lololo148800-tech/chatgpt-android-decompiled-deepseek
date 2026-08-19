package p103Dn;

import kotlin.jvm.internal.C16525B;
import p066Cc.C1625b;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.s0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2205s0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C1625b f6764Y;

    /* JADX INFO: renamed from: Z */
    public C16525B f6765Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f6766o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1625b f6767p0;

    /* JADX INFO: renamed from: q0 */
    public int f6768q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2205s0(C1625b c1625b, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6767p0 = c1625b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6766o0 = obj;
        this.f6768q0 |= Integer.MIN_VALUE;
        return this.f6767p0.mo395a(null, this);
    }
}
