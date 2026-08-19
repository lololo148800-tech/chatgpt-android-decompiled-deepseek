package p666bl;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: bl.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11485a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11488d f34752Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f34753Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11488d f34754o0;

    /* JADX INFO: renamed from: p0 */
    public int f34755p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11485a(C11488d c11488d, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f34754o0 = c11488d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f34753Z = obj;
        this.f34755p0 |= Integer.MIN_VALUE;
        return this.f34754o0.m12889b(this);
    }
}
