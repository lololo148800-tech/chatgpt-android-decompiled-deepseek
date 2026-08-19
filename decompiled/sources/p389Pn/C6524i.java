package p389Pn;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18235b;
import p1113xn.AbstractC21322p;
import p369On.AbstractC6273b;
import p412Qn.C6760a;
import p412Qn.InterfaceC6762c;
import p437Rn.C6944b;
import p437Rn.C6951i;
import p437Rn.C6960r;
import p437Rn.C6962t;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9393x3;
import p909nm.C17689w;

/* JADX INFO: renamed from: Pn.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C6524i implements InterfaceC6530o {

    /* JADX INFO: renamed from: a */
    public final String f21135a;

    public C6524i(String string) {
        AbstractC16544l.m18094g(string, "string");
        this.f21135a = string;
    }

    @Override // p389Pn.InterfaceC6527l
    /* JADX INFO: renamed from: a */
    public final InterfaceC6762c mo7085a() {
        return new C6760a(this.f21135a);
    }

    @Override // p389Pn.InterfaceC6527l
    /* JADX INFO: renamed from: b */
    public final C6960r mo7086b() {
        List listM9971a;
        String strSubstring;
        String strSubstring2 = this.f21135a;
        int length = strSubstring2.length();
        C17689w c17689w = C17689w.f56480Y;
        if (length == 0) {
            listM9971a = c17689w;
        } else {
            C18235b c18235bM9972b = AbstractC9393x3.m9972b();
            String strSubstring3 = "";
            if (AbstractC6273b.m6754a(strSubstring2.charAt(0))) {
                int length2 = strSubstring2.length();
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        strSubstring = strSubstring2;
                        break;
                    }
                    if (!AbstractC6273b.m6754a(strSubstring2.charAt(i10))) {
                        strSubstring = strSubstring2.substring(0, i10);
                        AbstractC16544l.m18093f(strSubstring, "substring(...)");
                        break;
                    }
                    i10++;
                }
                c18235bM9972b.add(new C6951i(AbstractC9393x3.m9974d(new C6944b(strSubstring))));
                int length3 = strSubstring2.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length3) {
                        strSubstring2 = "";
                        break;
                    }
                    if (!AbstractC6273b.m6754a(strSubstring2.charAt(i11))) {
                        strSubstring2 = strSubstring2.substring(i11);
                        AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                        break;
                    }
                    i11++;
                }
            }
            if (strSubstring2.length() > 0) {
                if (AbstractC6273b.m6754a(strSubstring2.charAt(strSubstring2.length() - 1))) {
                    for (int iM21674H = AbstractC21322p.m21674H(strSubstring2); -1 < iM21674H; iM21674H--) {
                        if (!AbstractC6273b.m6754a(strSubstring2.charAt(iM21674H))) {
                            strSubstring3 = strSubstring2.substring(0, iM21674H + 1);
                            AbstractC16544l.m18093f(strSubstring3, "substring(...)");
                            break;
                        }
                    }
                    c18235bM9972b.add(new C6962t(strSubstring3));
                    for (int iM21674H2 = AbstractC21322p.m21674H(strSubstring2); -1 < iM21674H2; iM21674H2--) {
                        if (!AbstractC6273b.m6754a(strSubstring2.charAt(iM21674H2))) {
                            strSubstring2 = strSubstring2.substring(iM21674H2 + 1);
                            AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                            break;
                        }
                    }
                    c18235bM9972b.add(new C6951i(AbstractC9393x3.m9974d(new C6944b(strSubstring2))));
                } else {
                    c18235bM9972b.add(new C6962t(strSubstring2));
                }
            }
            listM9971a = AbstractC9393x3.m9971a(c18235bM9972b);
        }
        return new C6960r(listM9971a, c17689w);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6524i) {
            if (AbstractC16544l.m18089b(this.f21135a, ((C6524i) obj).f21135a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21135a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("ConstantFormatStructure("), this.f21135a, ')');
    }
}
