package p672c3;

import android.content.Context;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: c3.H */
/* JADX INFO: loaded from: classes.dex */
public final class C11575H extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f34998Y;

    /* JADX INFO: renamed from: Z */
    public Context f34999Z;

    /* JADX INFO: renamed from: o0 */
    public int f35000o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f35001p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC11579L f35002q0;

    /* JADX INFO: renamed from: r0 */
    public int f35003r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11575H(AbstractC11579L abstractC11579L, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f35002q0 = abstractC11579L;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35001p0 = obj;
        this.f35003r0 |= Integer.MIN_VALUE;
        return this.f35002q0.m12974a(null, 0, this);
    }
}
