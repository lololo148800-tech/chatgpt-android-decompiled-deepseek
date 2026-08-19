package bg;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: bg.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C11419s extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f34478Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11422v f34479Z;

    /* JADX INFO: renamed from: o0 */
    public int f34480o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11419s(C11422v c11422v, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f34479Z = c11422v;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f34478Y = obj;
        this.f34480o0 |= Integer.MIN_VALUE;
        return this.f34479Z.m12790e(null, this);
    }
}
