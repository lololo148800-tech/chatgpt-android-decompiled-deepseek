package p364Oh;

import p499U9.C7591u;
import p556Wk.C8915b0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Oh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6227a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C8915b0 f20277Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f20278Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7591u f20279o0;

    /* JADX INFO: renamed from: p0 */
    public int f20280p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6227a(C7591u c7591u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f20279o0 = c7591u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f20278Z = obj;
        this.f20280p0 |= Integer.MIN_VALUE;
        return this.f20279o0.m7941L(null, this);
    }
}
