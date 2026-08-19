package p672c3;

import android.content.Context;
import p637a3.AbstractC10494k;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: c3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C11607h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f35111Y;

    /* JADX INFO: renamed from: Z */
    public Context f35112Z;

    /* JADX INFO: renamed from: o0 */
    public AbstractC10494k f35113o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f35114p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C11617m f35115q0;

    /* JADX INFO: renamed from: r0 */
    public int f35116r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11607h(C11617m c11617m, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35115q0 = c11617m;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35114p0 = obj;
        this.f35116r0 |= Integer.MIN_VALUE;
        return this.f35115q0.m12991b(null, null, this);
    }
}
