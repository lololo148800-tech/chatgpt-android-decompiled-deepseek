package p427Rc;

import java.io.Serializable;
import p129En.C2602m;
import p275Kn.InterfaceC4814a;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6845b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public boolean f21950Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC4814a f21951Z;

    /* JADX INFO: renamed from: o0 */
    public Serializable f21952o0;

    /* JADX INFO: renamed from: p0 */
    public Object f21953p0;

    /* JADX INFO: renamed from: q0 */
    public Object f21954q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f21955r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C2602m f21956s0;

    /* JADX INFO: renamed from: t0 */
    public int f21957t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6845b(C2602m c2602m, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f21956s0 = c2602m;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f21955r0 = obj;
        this.f21957t0 |= Integer.MIN_VALUE;
        return this.f21956s0.m3617b(false, this);
    }
}
