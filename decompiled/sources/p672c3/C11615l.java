package p672c3;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: c3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C11615l extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11605g f35159Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35160Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11617m f35161o0;

    /* JADX INFO: renamed from: p0 */
    public int f35162p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11615l(C11617m c11617m, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35161o0 = c11617m;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35160Z = obj;
        this.f35162p0 |= Integer.MIN_VALUE;
        return this.f35161o0.m12995f(this);
    }
}
