package p845k3;

import java.io.Serializable;
import p275Kn.InterfaceC4814a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: k3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C16326c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f50645Y;

    /* JADX INFO: renamed from: Z */
    public Object f50646Z;

    /* JADX INFO: renamed from: o0 */
    public Serializable f50647o0;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC4814a f50648p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f50649q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16329f f50650r0;

    /* JADX INFO: renamed from: s0 */
    public int f50651s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16326c(C16329f c16329f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f50650r0 = c16329f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f50649q0 = obj;
        this.f50651s0 |= Integer.MIN_VALUE;
        return this.f50650r0.m17920b(null, null, null, this);
    }
}
