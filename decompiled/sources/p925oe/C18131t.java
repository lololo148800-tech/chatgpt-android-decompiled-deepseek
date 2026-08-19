package p925oe;

import p403Qd.C6636i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C18131t extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18077B f57841Y;

    /* JADX INFO: renamed from: Z */
    public C6636i f57842Z;

    /* JADX INFO: renamed from: o0 */
    public String f57843o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f57844p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C18077B f57845q0;

    /* JADX INFO: renamed from: r0 */
    public int f57846r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18131t(C18077B c18077b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57845q0 = c18077b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57844p0 = obj;
        this.f57846r0 |= Integer.MIN_VALUE;
        return this.f57845q0.m19697b(null, null, this);
    }
}
