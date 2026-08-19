package p479Td;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.C0644w;
import p033B5.C0842z;
import p040Bd.AbstractC0985Q1;
import p040Bd.C0919F1;
import p040Bd.C1149q0;
import p049Bm.InterfaceC1426a;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p243Jf.C4331a;
import p548Wd.C8817a;
import p548Wd.C8819c;
import p571X9.AbstractC9280e4;
import p690cp.AbstractC12935u;
import p712dp.C13187c;
import p712dp.C13189e;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Td.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C7319E extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23215Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7320F f23216Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7319E(C7320F c7320f, int i10) {
        super(0);
        this.f23215Y = i10;
        this.f23216Z = c7320f;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C13189e c13189e;
        switch (this.f23215Y) {
            case 0:
                C7320F c7320f = this.f23216Z;
                boolean z6 = c7320f.f23222f;
                boolean z10 = true;
                String strSubstring = c7320f.f23219c;
                if (z6) {
                    return strSubstring;
                }
                if (z6) {
                    throw new C0644w();
                }
                C7320F.Companion.getClass();
                List list = c7320f.f23221e;
                int i10 = 0;
                for (Object obj : AbstractC17680n.m19370t0(list, new C0842z(9))) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC17681o.m19388q();
                        throw null;
                    }
                    AbstractC0985Q1 abstractC0985Q1 = (AbstractC0985Q1) obj;
                    Integer numMo1961c = abstractC0985Q1.mo1961c();
                    if (numMo1961c != null) {
                        int iIntValue = numMo1961c.intValue();
                        Integer numMo1960b = abstractC0985Q1.mo1960b();
                        if (numMo1960b != null) {
                            int iIntValue2 = numMo1960b.intValue();
                            int size = (list.size() - i10) - 1;
                            if (abstractC0985Q1 instanceof C0919F1 ? true : abstractC0985Q1 instanceof C1149q0) {
                                String strMo1963a = abstractC0985Q1.mo1963a();
                                if (strMo1963a == null) {
                                    strMo1963a = "";
                                }
                                strSubstring = AbstractC9280e4.m9854f(strSubstring, iIntValue, iIntValue2, strMo1963a);
                            } else {
                                strSubstring = AbstractC9280e4.m9854f(strSubstring, iIntValue, iIntValue2, "\uea01" + size + (char) 59906);
                            }
                        }
                    }
                    i10 = i11;
                }
                int iM21679M = AbstractC21322p.m21679M(strSubstring, "\\(", 0, false, 6);
                int iM21679M2 = AbstractC21322p.m21679M(strSubstring, "\\[", 0, false, 6);
                if (iM21679M != -1 || iM21679M2 != -1) {
                    int iM21684R = AbstractC21322p.m21684R(strSubstring, 0, 6, "\\]");
                    if (iM21679M > AbstractC21322p.m21684R(strSubstring, 0, 6, "\\)")) {
                        strSubstring = strSubstring.substring(0, iM21679M);
                        AbstractC16544l.m18093f(strSubstring, "substring(...)");
                    } else if (iM21679M2 > iM21684R) {
                        strSubstring = strSubstring.substring(0, iM21679M2);
                        AbstractC16544l.m18093f(strSubstring, "substring(...)");
                    }
                    List listM21697e0 = AbstractC21322p.m21697e0(strSubstring, new String[]{Separators.RETURN}, 0, 6);
                    StringBuilder sb2 = new StringBuilder();
                    int i12 = 0;
                    for (Object obj2 : listM21697e0) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            AbstractC17681o.m19388q();
                            throw null;
                        }
                        String str = (String) obj2;
                        boolean z11 = i12 == listM21697e0.size() + (-1) ? z10 : false;
                        String string = AbstractC21322p.m21711s0(str).toString();
                        if (AbstractC16544l.m18089b(string, "\\[") || AbstractC16544l.m18089b(string, "\\]")) {
                            sb2.append(string);
                        } else {
                            sb2.append(AbstractC21329w.m21731r(AbstractC21329w.m21731r(AbstractC21329w.m21731r(AbstractC21329w.m21731r(AbstractC21329w.m21731r(AbstractC21329w.m21731r(AbstractC21329w.m21731r(AbstractC21329w.m21731r(str, "\\( ", "\ue001"), " \\)", "\ue001"), "\\(", "\ue001"), "\\)", "\ue001"), "\\[ ", "\ue001"), " \\]", "\ue001"), "\\[", "\ue001"), "\\]", "\ue001"));
                        }
                        if (!z11) {
                            sb2.append(Separators.RETURN);
                        }
                        i12 = i13;
                        z10 = true;
                    }
                    strSubstring = sb2.toString();
                }
                int iM21683Q = AbstractC21322p.m21683Q(strSubstring, (char) 57856, 0, 6);
                int iM21683Q2 = AbstractC21322p.m21683Q(strSubstring, (char) 57857, 0, 6);
                if (iM21683Q < 0 || iM21683Q <= iM21683Q2) {
                    return strSubstring;
                }
                String strSubstring2 = strSubstring.substring(0, iM21683Q);
                AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                return strSubstring2;
            case 1:
                C7318D c7318d = C7320F.Companion;
                C7320F c7320f2 = this.f23216Z;
                String strM21731r = (String) c7320f2.f23223g.getValue();
                c7318d.getClass();
                Iterator it = c7320f2.f23221e.iterator();
                int i14 = 0;
                while (true) {
                    String str2 = "";
                    if (!it.hasNext()) {
                        return AbstractC21329w.m21731r(AbstractC21329w.m21731r(strM21731r, ":::contextList", ""), ":::", "");
                    }
                    Object next = it.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        AbstractC17681o.m19388q();
                        throw null;
                    }
                    String str3 = "\uea01" + i14 + (char) 59906;
                    String strMo1963a2 = ((AbstractC0985Q1) next).mo1963a();
                    if (strMo1963a2 != null) {
                        str2 = strMo1963a2;
                    }
                    strM21731r = AbstractC21329w.m21731r(strM21731r, str3, str2);
                    i14 = i15;
                }
                break;
            case 2:
                C7320F c7320f3 = this.f23216Z;
                boolean zIsEmpty = c7320f3.f23221e.isEmpty();
                if (zIsEmpty) {
                    c13189e = C7320F.f23218l;
                } else {
                    if (zIsEmpty) {
                        throw new C0644w();
                    }
                    C13187c c13187cM7775a = C7318D.m7775a(C7320F.Companion);
                    ((ArrayList) c13187cM7775a.f41847e).add(new C8817a(c7320f3.f23221e));
                    ((ArrayList) c13187cM7775a.f41849g).add(new C8819c());
                    c13189e = new C13189e(c13187cM7775a);
                }
                AbstractC12935u abstractC12935uM14846a = c13189e.m14846a((String) c7320f3.f23223g.getValue());
                abstractC12935uM14846a.mo14588a(new C4331a(c7320f3, 2));
                return abstractC12935uM14846a;
            default:
                return Boolean.valueOf(AbstractC21322p.m21681O((String) this.f23216Z.f23223g.getValue()));
        }
    }
}
