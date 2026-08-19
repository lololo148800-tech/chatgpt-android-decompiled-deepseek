package p071Ch;

import p948pi.C18426i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ch.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C1691v extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f4790Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1692w f4791Z;

    /* JADX INFO: renamed from: o0 */
    public int f4792o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1691v(C1692w c1692w, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f4791Z = c1692w;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f4790Y = obj;
        this.f4792o0 |= Integer.MIN_VALUE;
        Object objM2510d = this.f4791Z.m2510d(false, this);
        if (objM2510d == EnumC19250a.f61036Y) {
            return objM2510d;
        }
        String str = (String) objM2510d;
        if (str != null) {
            return new C18426i(str);
        }
        return null;
    }
}
