package p1114xp;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: xp.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C21340k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f67787Y;

    /* JADX INFO: renamed from: Z */
    public int f67788Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21346q f67789o0;

    /* JADX INFO: renamed from: p0 */
    public C21346q f67790p0;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC21331b f67791q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21340k(C21346q c21346q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f67789o0 = c21346q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f67787Y = obj;
        this.f67788Z |= Integer.MIN_VALUE;
        return this.f67789o0.m21742d(null, this);
    }
}
