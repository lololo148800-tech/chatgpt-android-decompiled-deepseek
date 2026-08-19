package p787he;

import p364Oh.C6248v;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C14482k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f45624Y;

    /* JADX INFO: renamed from: Z */
    public C6248v f45625Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f45626o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14459O f45627p0;

    /* JADX INFO: renamed from: q0 */
    public int f45628q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14482k(C14459O c14459o, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f45627p0 = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45626o0 = obj;
        this.f45628q0 |= Integer.MIN_VALUE;
        return C14459O.m15972a(this.f45627p0, null, this);
    }
}
