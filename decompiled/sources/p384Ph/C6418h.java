package p384Ph;

import p1061vb.C20513d;
import p556Wk.C8915b0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ph.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C6418h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C8915b0 f20865Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f20866Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20513d f20867o0;

    /* JADX INFO: renamed from: p0 */
    public int f20868p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6418h(C20513d c20513d, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f20867o0 = c20513d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f20866Z = obj;
        this.f20868p0 |= Integer.MIN_VALUE;
        return this.f20867o0.m21171m(null, this);
    }
}
