package p1114xp;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: xp.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C21336g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f67772Y;

    /* JADX INFO: renamed from: Z */
    public int f67773Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21346q f67774o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21336g(C21346q c21346q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f67774o0 = c21346q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f67772Y = obj;
        this.f67773Z |= Integer.MIN_VALUE;
        return this.f67774o0.m21739a(null, this);
    }
}
