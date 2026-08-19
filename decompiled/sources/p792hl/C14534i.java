package p792hl;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: hl.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C14534i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f45809Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14535j f45810Z;

    /* JADX INFO: renamed from: o0 */
    public int f45811o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14534i(C14535j c14535j, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45810Z = c14535j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45809Y = obj;
        this.f45811o0 |= Integer.MIN_VALUE;
        return this.f45810Z.m16039d(this);
    }
}
