package p241Jc;

import java.util.Iterator;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Jc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4326a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Iterator f14102Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f14103Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4327b f14104o0;

    /* JADX INFO: renamed from: p0 */
    public int f14105p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4326a(C4327b c4327b, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f14104o0 = c4327b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f14103Z = obj;
        this.f14105p0 |= Integer.MIN_VALUE;
        return this.f14104o0.m5144a(this);
    }
}
