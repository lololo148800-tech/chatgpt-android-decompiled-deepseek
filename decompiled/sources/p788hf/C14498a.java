package p788hf;

import p215Ic.C3685b;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: hf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14498a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3685b f45698Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f45699Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3685b f45700o0;

    /* JADX INFO: renamed from: p0 */
    public int f45701p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14498a(C3685b c3685b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f45700o0 = c3685b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f45699Z = obj;
        this.f45701p0 |= Integer.MIN_VALUE;
        return this.f45700o0.mo1965a(this);
    }
}
