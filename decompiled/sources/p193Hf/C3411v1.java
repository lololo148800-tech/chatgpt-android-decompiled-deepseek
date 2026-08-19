package p193Hf;

import p094De.C2027j;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Hf.v1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3411v1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f10390Y;

    /* JADX INFO: renamed from: Z */
    public int f10391Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2027j f10392o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3411v1(C2027j c2027j, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f10392o0 = c2027j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f10390Y = obj;
        this.f10391Z |= Integer.MIN_VALUE;
        return this.f10392o0.mo395a(null, this);
    }
}
