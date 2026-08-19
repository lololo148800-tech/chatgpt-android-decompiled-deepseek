package p193Hf;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Hf.M0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3320M0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3324O0 f10123Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f10124Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3324O0 f10125o0;

    /* JADX INFO: renamed from: p0 */
    public int f10126p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3320M0(C3324O0 c3324o0, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f10125o0 = c3324o0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f10124Z = obj;
        this.f10126p0 |= Integer.MIN_VALUE;
        return this.f10125o0.m4167b(false, null, null, null, null, null, null, this);
    }
}
