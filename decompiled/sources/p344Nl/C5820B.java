package p344Nl;

import p002A0.C0132i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Nl.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C5820B extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f18990Y;

    /* JADX INFO: renamed from: Z */
    public int f18991Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0132i f18992o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5820B(C0132i c0132i, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f18992o0 = c0132i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18990Y = obj;
        this.f18991Z |= Integer.MIN_VALUE;
        return this.f18992o0.mo395a(null, this);
    }
}
