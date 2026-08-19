package p103Dn;

import java.util.Iterator;
import p094De.C2025h;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C2188k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6697Y;

    /* JADX INFO: renamed from: Z */
    public int f6698Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2025h f6699o0;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC2186j f6700p0;

    /* JADX INFO: renamed from: q0 */
    public Iterator f6701q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2188k(C2025h c2025h, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f6699o0 = c2025h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6697Y = obj;
        this.f6698Z |= Integer.MIN_VALUE;
        return this.f6699o0.mo3141d(null, this);
    }
}
