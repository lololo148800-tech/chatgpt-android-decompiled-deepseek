package p958q5;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: q5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C18635j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f59360Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18637l f59361Z;

    /* JADX INFO: renamed from: o0 */
    public int f59362o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18635j(C18637l c18637l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f59361Z = c18637l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f59360Y = obj;
        this.f59362o0 |= Integer.MIN_VALUE;
        return this.f59361Z.m19987b(null, this);
    }
}
