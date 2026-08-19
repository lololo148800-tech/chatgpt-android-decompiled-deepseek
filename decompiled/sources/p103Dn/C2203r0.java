package p103Dn;

import kotlin.jvm.internal.C16525B;
import p086D6.C1970n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.r0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2203r0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6755Y;

    /* JADX INFO: renamed from: Z */
    public int f6756Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1970n f6757o0;

    /* JADX INFO: renamed from: p0 */
    public C1970n f6758p0;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC2186j f6759q0;

    /* JADX INFO: renamed from: r0 */
    public C16525B f6760r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2203r0(C1970n c1970n, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6757o0 = c1970n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6755Y = obj;
        this.f6756Z |= Integer.MIN_VALUE;
        return this.f6757o0.mo3141d(null, this);
    }
}
