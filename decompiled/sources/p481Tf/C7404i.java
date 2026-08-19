package p481Tf;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Tf.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C7404i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f23452Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7409n f23453Z;

    /* JADX INFO: renamed from: o0 */
    public int f23454o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7404i(C7409n c7409n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f23453Z = c7409n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f23452Y = obj;
        this.f23454o0 |= Integer.MIN_VALUE;
        return this.f23453Z.m7795a(null, this);
    }
}
