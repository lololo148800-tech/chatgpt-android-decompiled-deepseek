package p002A0;

import kotlin.jvm.internal.C16524A;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: A0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0145v extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C0120T f599Y;

    /* JADX INFO: renamed from: Z */
    public C16524A f600Z;

    /* JADX INFO: renamed from: o0 */
    public C16524A f601o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f602p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C0120T f603q0;

    /* JADX INFO: renamed from: r0 */
    public int f604r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0145v(C0120T c0120t, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f603q0 = c0120t;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f602p0 = obj;
        this.f604r0 |= Integer.MIN_VALUE;
        return C0120T.m396a(this.f603q0, null, this);
    }
}
