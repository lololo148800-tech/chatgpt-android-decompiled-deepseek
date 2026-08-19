package p351O2;

import io.sentry.instrumentation.file.C15379d;
import java.io.File;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: O2.F */
/* JADX INFO: loaded from: classes.dex */
public final class C6083F extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C6084G f19802Y;

    /* JADX INFO: renamed from: Z */
    public File f19803Z;

    /* JADX INFO: renamed from: o0 */
    public C15379d f19804o0;

    /* JADX INFO: renamed from: p0 */
    public C15379d f19805p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f19806q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C6084G f19807r0;

    /* JADX INFO: renamed from: s0 */
    public int f19808s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6083F(C6084G c6084g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f19807r0 = c6084g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19806q0 = obj;
        this.f19808s0 |= Integer.MIN_VALUE;
        return this.f19807r0.m6659k(null, this);
    }
}
