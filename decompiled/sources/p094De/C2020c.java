package p094De;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: De.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2020c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2029l f6194Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6195Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2029l f6196o0;

    /* JADX INFO: renamed from: p0 */
    public int f6197p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2020c(C2029l c2029l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f6196o0 = c2029l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f6195Z = obj;
        this.f6197p0 |= Integer.MIN_VALUE;
        return this.f6196o0.m3174c(this);
    }
}
