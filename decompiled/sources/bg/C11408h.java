package bg;

import p623Zf.C10327w;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: bg.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C11408h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11422v f34444Y;

    /* JADX INFO: renamed from: Z */
    public C10327w f34445Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f34446o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11422v f34447p0;

    /* JADX INFO: renamed from: q0 */
    public int f34448q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11408h(C11422v c11422v, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f34447p0 = c11422v;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f34446o0 = obj;
        this.f34448q0 |= Integer.MIN_VALUE;
        return this.f34447p0.m12786a(this);
    }
}
