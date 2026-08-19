package p860l0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16676G0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f53409Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16685J0 f53410Z;

    /* JADX INFO: renamed from: o0 */
    public int f53411o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16676G0(C16685J0 c16685j0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f53410Z = c16685j0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f53409Y = obj;
        this.f53411o0 |= Integer.MIN_VALUE;
        return this.f53410Z.m18501a(this);
    }
}
