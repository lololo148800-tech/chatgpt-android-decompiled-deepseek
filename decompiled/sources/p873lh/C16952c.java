package p873lh;

import p072Ci.C1708m;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: lh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C16952c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16961l f54405Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f54406Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16961l f54407o0;

    /* JADX INFO: renamed from: p0 */
    public int f54408p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16952c(C16961l c16961l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f54407o0 = c16961l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f54406Z = obj;
        this.f54408p0 |= Integer.MIN_VALUE;
        Object objM18592c = this.f54407o0.m18592c(this);
        if (objM18592c == EnumC19250a.f61036Y) {
            return objM18592c;
        }
        String str = (String) objM18592c;
        if (str != null) {
            return new C1708m(str);
        }
        return null;
    }
}
