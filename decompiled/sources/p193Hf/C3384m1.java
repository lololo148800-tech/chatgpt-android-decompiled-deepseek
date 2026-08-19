package p193Hf;

import p086D6.C1971o;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Hf.m1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3384m1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f10319Y;

    /* JADX INFO: renamed from: Z */
    public int f10320Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1971o f10321o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3384m1(C1971o c1971o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f10321o0 = c1971o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f10319Y = obj;
        this.f10320Z |= Integer.MIN_VALUE;
        return this.f10321o0.mo395a(null, this);
    }
}
