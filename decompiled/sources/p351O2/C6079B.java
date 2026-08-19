package p351O2;

import io.sentry.instrumentation.file.C15378c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: O2.B */
/* JADX INFO: loaded from: classes.dex */
public final class C6079B extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C6084G f19783Y;

    /* JADX INFO: renamed from: Z */
    public C15378c f19784Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f19785o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6084G f19786p0;

    /* JADX INFO: renamed from: q0 */
    public int f19787q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6079B(C6084G c6084g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f19786p0 = c6084g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19785o0 = obj;
        this.f19787q0 |= Integer.MIN_VALUE;
        return this.f19786p0.m6656h(this);
    }
}
