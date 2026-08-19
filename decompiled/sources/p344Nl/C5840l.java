package p344Nl;

import java.util.Iterator;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Nl.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C5840l extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5842n f19093Y;

    /* JADX INFO: renamed from: Z */
    public Iterator f19094Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f19095o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C5842n f19096p0;

    /* JADX INFO: renamed from: q0 */
    public int f19097q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5840l(C5842n c5842n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f19096p0 = c5842n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19095o0 = obj;
        this.f19097q0 |= Integer.MIN_VALUE;
        return this.f19096p0.m6253x(this);
    }
}
