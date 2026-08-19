package p1099x6;

import p001A.C0017I0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: x6.n */
/* JADX INFO: loaded from: classes.dex */
public final class C21146n extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f67199Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0017I0 f67200Z;

    /* JADX INFO: renamed from: o0 */
    public int f67201o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21146n(C0017I0 c0017i0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f67200Z = c0017i0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f67199Y = obj;
        this.f67201o0 |= Integer.MIN_VALUE;
        return this.f67200Z.m68G(null, null, null, null, this);
    }
}
