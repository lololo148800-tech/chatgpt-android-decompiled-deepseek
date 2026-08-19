package p708dh;

import p072Ci.EnumC1711p;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C13125C extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f41655Y;

    /* JADX INFO: renamed from: Z */
    public EnumC1711p f41656Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f41657o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13132J f41658p0;

    /* JADX INFO: renamed from: q0 */
    public int f41659q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13125C(C13132J c13132j, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f41658p0 = c13132j;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f41657o0 = obj;
        this.f41659q0 |= Integer.MIN_VALUE;
        return this.f41658p0.m14810g(null, this);
    }
}
