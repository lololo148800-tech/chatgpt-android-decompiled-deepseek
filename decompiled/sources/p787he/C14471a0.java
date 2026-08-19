package p787he;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14471a0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f45587Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14473b0 f45588Z;

    /* JADX INFO: renamed from: o0 */
    public int f45589o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14471a0(C14473b0 c14473b0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45588Z = c14473b0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45587Y = obj;
        this.f45589o0 |= Integer.MIN_VALUE;
        return this.f45588Z.m15995b(null, null, this);
    }
}
