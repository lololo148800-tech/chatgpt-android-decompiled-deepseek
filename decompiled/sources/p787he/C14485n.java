package p787he;

import p1126yd.C21483l0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C14485n extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14459O f45637Y;

    /* JADX INFO: renamed from: Z */
    public C21483l0 f45638Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f45639o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14459O f45640p0;

    /* JADX INFO: renamed from: q0 */
    public int f45641q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14485n(C14459O c14459o, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45640p0 = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45639o0 = obj;
        this.f45641q0 |= Integer.MIN_VALUE;
        return this.f45640p0.m15979h(null, this);
    }
}
