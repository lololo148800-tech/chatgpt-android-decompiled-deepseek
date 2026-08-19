package p1114xp;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: xp.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C21337h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f67775Y;

    /* JADX INFO: renamed from: Z */
    public int f67776Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21346q f67777o0;

    /* JADX INFO: renamed from: p0 */
    public C21346q f67778p0;

    /* JADX INFO: renamed from: q0 */
    public Object f67779q0;

    /* JADX INFO: renamed from: r0 */
    public Object f67780r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21337h(C21346q c21346q, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f67777o0 = c21346q;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f67775Y = obj;
        this.f67776Z |= Integer.MIN_VALUE;
        return this.f67777o0.m21740b(null, null, this);
    }
}
