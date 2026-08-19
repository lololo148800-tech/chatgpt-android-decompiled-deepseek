package p873lh;

import p072Ci.C1708m;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: lh.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C16953d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C16961l f54409Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f54410Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16961l f54411o0;

    /* JADX INFO: renamed from: p0 */
    public int f54412p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16953d(C16961l c16961l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f54411o0 = c16961l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f54410Z = obj;
        this.f54412p0 |= Integer.MIN_VALUE;
        Object objM18593d = this.f54411o0.m18593d(this);
        if (objM18593d == EnumC19250a.f61036Y) {
            return objM18593d;
        }
        String str = (String) objM18593d;
        if (str != null) {
            return new C1708m(str);
        }
        return null;
    }
}
