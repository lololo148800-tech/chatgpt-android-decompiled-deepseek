package p226In;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: In.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C3784f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3785g f11432Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f11433Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3785g f11434o0;

    /* JADX INFO: renamed from: p0 */
    public int f11435p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3784f(C3785g c3785g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f11434o0 = c3785g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f11433Z = obj;
        this.f11435p0 |= Integer.MIN_VALUE;
        return this.f11434o0.m4455d(this);
    }
}
