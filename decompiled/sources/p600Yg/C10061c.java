package p600Yg;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p1155zi.AbstractC21955Q1;
import p215Ic.C3688e;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Yg.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C10061c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3688e f29794Y;

    /* JADX INFO: renamed from: Z */
    public List f29795Z;

    /* JADX INFO: renamed from: o0 */
    public AbstractC21955Q1 f29796o0;

    /* JADX INFO: renamed from: p0 */
    public Collection f29797p0;

    /* JADX INFO: renamed from: q0 */
    public Iterator f29798q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f29799r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C3688e f29800s0;

    /* JADX INFO: renamed from: t0 */
    public int f29801t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10061c(C3688e c3688e, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f29800s0 = c3688e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f29799r0 = obj;
        this.f29801t0 |= Integer.MIN_VALUE;
        return this.f29800s0.mo1965a(this);
    }
}
