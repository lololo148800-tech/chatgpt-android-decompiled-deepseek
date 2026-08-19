package p577Xf;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C9507f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f28626Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9508g f28627Z;

    /* JADX INFO: renamed from: o0 */
    public int f28628o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9507f(C9508g c9508g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28627Z = c9508g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28626Y = obj;
        this.f28628o0 |= Integer.MIN_VALUE;
        return this.f28627Z.m10025a(null, null, this);
    }
}
