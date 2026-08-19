package ph;

import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ph.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C18415c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f58756Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18417e f58757Z;

    /* JADX INFO: renamed from: o0 */
    public int f58758o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18415c(C18417e c18417e, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f58757Z = c18417e;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f58756Y = obj;
        this.f58758o0 |= Integer.MIN_VALUE;
        this.f58757Z.mo12975b(null, this);
        return EnumC19250a.f61036Y;
    }
}
