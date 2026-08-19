package p787he;

import p479Td.C7351f0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C14451G extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14459O f45453Y;

    /* JADX INFO: renamed from: Z */
    public C7351f0 f45454Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f45455o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14459O f45456p0;

    /* JADX INFO: renamed from: q0 */
    public int f45457q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14451G(C14459O c14459o, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45456p0 = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45455o0 = obj;
        this.f45457q0 |= Integer.MIN_VALUE;
        return this.f45456p0.m15987p(null, this);
    }
}
