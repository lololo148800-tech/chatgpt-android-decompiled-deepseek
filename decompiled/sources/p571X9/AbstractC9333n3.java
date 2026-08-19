package p571X9;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18235b;
import p1113xn.AbstractC21329w;
import p437Rn.C6951i;
import p437Rn.C6960r;
import p437Rn.C6962t;
import p437Rn.C6968z;
import p437Rn.InterfaceC6943a;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: renamed from: X9.n3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9333n3 {
    /* JADX INFO: renamed from: a */
    public static final C6960r m9930a(Integer num, Integer num2, Integer num3, InterfaceC6943a setter, String name, boolean z6) {
        int iIntValue;
        C17689w c17689w;
        AbstractC16544l.m18094g(setter, "setter");
        AbstractC16544l.m18094g(name, "name");
        int i10 = 1;
        int iIntValue2 = (num != null ? num.intValue() : 1) + (z6 ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z6) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return m9931b(z6, setter, name, iIntValue2, iIntValue);
        }
        C6960r c6960rM9931b = m9931b(z6, setter, name, iIntValue2, iIntValue2);
        while (true) {
            c17689w = C17689w.f56480Y;
            if (iIntValue2 >= iMin) {
                break;
            }
            iIntValue2 += i10;
            c6960rM9931b = new C6960r(c17689w, AbstractC17681o.m19382k(m9931b(z6, setter, name, iIntValue2, iIntValue2), AbstractC9327m3.m9921a(AbstractC17681o.m19382k(new C6960r(AbstractC9393x3.m9974d(new C6962t(Separators.f31991SP)), c17689w), c6960rM9931b))));
            i10 = 1;
        }
        if (iIntValue3 > iIntValue) {
            return AbstractC9327m3.m9921a(AbstractC17681o.m19382k(new C6960r(AbstractC9393x3.m9974d(new C6962t(AbstractC21329w.m21729p(iIntValue3 - iIntValue, Separators.f31991SP))), c17689w), c6960rM9931b));
        }
        return iIntValue3 == iIntValue ? c6960rM9931b : new C6960r(c17689w, AbstractC17681o.m19382k(m9931b(z6, setter, name, iIntValue3 + 1, iIntValue), c6960rM9931b));
    }

    /* JADX INFO: renamed from: b */
    public static final C6960r m9931b(boolean z6, InterfaceC6943a interfaceC6943a, String str, int i10, int i11) {
        if (i11 < (z6 ? 1 : 0) + 1) {
            throw new IllegalStateException("Check failed.");
        }
        C18235b c18235bM9972b = AbstractC9393x3.m9972b();
        if (z6) {
            c18235bM9972b.add(new C6962t("-"));
        }
        c18235bM9972b.add(new C6951i(AbstractC9393x3.m9974d(new C6968z(Integer.valueOf(i10 - (z6 ? 1 : 0)), Integer.valueOf(i11 - (z6 ? 1 : 0)), interfaceC6943a, str, z6))));
        return new C6960r(AbstractC9393x3.m9971a(c18235bM9972b), C17689w.f56480Y);
    }
}
