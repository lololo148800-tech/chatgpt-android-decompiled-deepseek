package p708dh;

import p1155zi.C22062u;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C13156j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C22062u f41767Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f41768Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13158l f41769o0;

    /* JADX INFO: renamed from: p0 */
    public int f41770p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13156j(C13158l c13158l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f41769o0 = c13158l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f41768Z = obj;
        this.f41770p0 |= Integer.MIN_VALUE;
        return this.f41769o0.m14824e(null, this);
    }
}
