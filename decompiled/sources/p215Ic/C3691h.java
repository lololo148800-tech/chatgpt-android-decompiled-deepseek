package p215Ic;

import p1081wc.C20881a0;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ic.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C3691h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f11205Y;

    /* JADX INFO: renamed from: Z */
    public C20881a0 f11206Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f11207o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3692i f11208p0;

    /* JADX INFO: renamed from: q0 */
    public int f11209q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3691h(C3692i c3692i, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f11208p0 = c3692i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f11207o0 = obj;
        this.f11209q0 |= Integer.MIN_VALUE;
        return this.f11208p0.mo1965a(this);
    }
}
