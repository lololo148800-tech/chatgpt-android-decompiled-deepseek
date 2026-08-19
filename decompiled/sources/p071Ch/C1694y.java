package p071Ch;

import java.util.LinkedHashMap;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ch.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1694y extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C1663C f4809Y;

    /* JADX INFO: renamed from: Z */
    public LinkedHashMap f4810Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f4811o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1663C f4812p0;

    /* JADX INFO: renamed from: q0 */
    public int f4813q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1694y(C1663C c1663c, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f4812p0 = c1663c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f4811o0 = obj;
        this.f4813q0 |= Integer.MIN_VALUE;
        return this.f4812p0.m2494a(null, false, this);
    }
}
