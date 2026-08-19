package p1083we;

import p364Oh.AbstractC6249w;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: we.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20917c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C20921g f66670Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC6249w f66671Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f66672o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C20921g f66673p0;

    /* JADX INFO: renamed from: q0 */
    public int f66674q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20917c(C20921g c20921g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f66673p0 = c20921g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f66672o0 = obj;
        this.f66674q0 |= Integer.MIN_VALUE;
        return this.f66673p0.m21455b(null, this);
    }
}
