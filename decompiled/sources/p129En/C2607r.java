package p129En;

import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: En.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C2607r extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f8077Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2608s f8078Z;

    /* JADX INFO: renamed from: o0 */
    public int f8079o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2607r(C2608s c2608s, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f8078Z = c2608s;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f8077Y = obj;
        this.f8079o0 |= Integer.MIN_VALUE;
        return this.f8078Z.mo395a(null, this);
    }
}
