package p430Rf;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6879a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f22063Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6881c f22064Z;

    /* JADX INFO: renamed from: o0 */
    public int f22065o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6879a(C6881c c6881c, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f22064Z = c6881c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f22063Y = obj;
        this.f22065o0 |= Integer.MIN_VALUE;
        return this.f22064Z.m7284a(this);
    }
}
