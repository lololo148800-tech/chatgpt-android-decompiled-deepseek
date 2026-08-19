package p790hh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: hh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14512a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f45738Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14514c f45739Z;

    /* JADX INFO: renamed from: o0 */
    public int f45740o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14512a(C14514c c14514c, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45739Z = c14514c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45738Y = obj;
        this.f45740o0 |= Integer.MIN_VALUE;
        return this.f45739Z.m16006a(this);
    }
}
