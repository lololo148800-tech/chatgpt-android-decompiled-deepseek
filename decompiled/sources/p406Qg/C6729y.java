package p406Qg;

import p215Ic.C3685b;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Qg.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C6729y extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3685b f21618Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f21619Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3685b f21620o0;

    /* JADX INFO: renamed from: p0 */
    public int f21621p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6729y(C3685b c3685b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f21620o0 = c3685b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f21619Z = obj;
        this.f21621p0 |= Integer.MIN_VALUE;
        return this.f21620o0.mo1965a(this);
    }
}
