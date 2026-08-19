package p925oe;

import p403Qd.C6636i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C18130s extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18077B f57834Y;

    /* JADX INFO: renamed from: Z */
    public C6636i f57835Z;

    /* JADX INFO: renamed from: o0 */
    public String f57836o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f57837p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f57838q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C18077B f57839r0;

    /* JADX INFO: renamed from: s0 */
    public int f57840s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18130s(C18077B c18077b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57839r0 = c18077b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57838q0 = obj;
        this.f57840s0 |= Integer.MIN_VALUE;
        return this.f57839r0.m19696a(null, null, false, this);
    }
}
