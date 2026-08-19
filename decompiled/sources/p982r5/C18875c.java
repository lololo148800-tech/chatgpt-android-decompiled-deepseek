package p982r5;

import kotlin.jvm.internal.C16525B;
import p1075w5.C20831i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: r5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18875c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18880h f60134Y;

    /* JADX INFO: renamed from: Z */
    public C20831i f60135Z;

    /* JADX INFO: renamed from: o0 */
    public Object f60136o0;

    /* JADX INFO: renamed from: p0 */
    public Object f60137p0;

    /* JADX INFO: renamed from: q0 */
    public C16525B f60138q0;

    /* JADX INFO: renamed from: r0 */
    public C16525B f60139r0;

    /* JADX INFO: renamed from: s0 */
    public C16525B f60140s0;

    /* JADX INFO: renamed from: t0 */
    public C16525B f60141t0;

    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ Object f60142u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ C18880h f60143v0;

    /* JADX INFO: renamed from: w0 */
    public int f60144w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18875c(C18880h c18880h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f60143v0 = c18880h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f60142u0 = obj;
        this.f60144w0 |= Integer.MIN_VALUE;
        return C18880h.m20197b(this.f60143v0, null, null, null, null, this);
    }
}
