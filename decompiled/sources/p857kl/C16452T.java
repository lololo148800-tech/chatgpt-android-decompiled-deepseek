package p857kl;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p033B5.C0821e;
import p049Bm.InterfaceC1426a;
import p1113xn.AbstractC21322p;
import p559Wn.C8979k;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: kl.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C16452T {

    /* JADX INFO: renamed from: a */
    public final String f51035a;

    /* JADX INFO: renamed from: b */
    public final int f51036b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC16443J f51037c;

    /* JADX INFO: renamed from: d */
    public final String f51038d;

    /* JADX INFO: renamed from: e */
    public final String f51039e;

    /* JADX INFO: renamed from: f */
    public final boolean f51040f;

    /* JADX INFO: renamed from: g */
    public final String f51041g;

    /* JADX INFO: renamed from: h */
    public final C16450Q f51042h;

    /* JADX INFO: renamed from: i */
    public final C16450Q f51043i;

    /* JADX INFO: renamed from: j */
    public final C17314q f51044j;

    /* JADX INFO: renamed from: k */
    public final C17314q f51045k;

    /* JADX INFO: renamed from: l */
    public final C17314q f51046l;

    /* JADX INFO: renamed from: m */
    public final C17314q f51047m;

    /* JADX INFO: renamed from: n */
    public final C17314q f51048n;

    public C16452T(C16450Q c16450q, String host, int i10, ArrayList arrayList, InterfaceC16443J parameters, String fragment, String str, String str2, boolean z6, String str3) {
        AbstractC16544l.m18094g(host, "host");
        AbstractC16544l.m18094g(parameters, "parameters");
        AbstractC16544l.m18094g(fragment, "fragment");
        this.f51035a = host;
        this.f51036b = i10;
        this.f51037c = parameters;
        this.f51038d = str;
        this.f51039e = str2;
        this.f51040f = z6;
        this.f51041g = str3;
        if (i10 < 0 || i10 >= 65536) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Port must be between 0 and 65535, or 0 if not set. Provided: ").toString());
        }
        AbstractC9227W.m9800c(new C8979k(1, arrayList));
        this.f51042h = c16450q;
        this.f51043i = c16450q == null ? C16450Q.f51029c : c16450q;
        this.f51044j = AbstractC9227W.m9800c(new C0821e(arrayList, 6, this));
        final int i11 = 0;
        this.f51045k = AbstractC9227W.m9800c(new InterfaceC1426a(this) { // from class: kl.S

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C16452T f51034Z;

            {
                this.f51034Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                C16452T c16452t = this.f51034Z;
                switch (i11) {
                    case 0:
                        int iM21678L = AbstractC21322p.m21678L(c16452t.f51041g, '?', 0, false, 6) + 1;
                        if (iM21678L == 0) {
                            return "";
                        }
                        String str4 = c16452t.f51041g;
                        int iM21678L2 = AbstractC21322p.m21678L(str4, '#', iM21678L, false, 4);
                        if (iM21678L2 == -1) {
                            String strSubstring = str4.substring(iM21678L);
                            AbstractC16544l.m18093f(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iM21678L, iM21678L2);
                        AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iM21678L3 = AbstractC21322p.m21678L(c16452t.f51041g, '/', c16452t.f51043i.f51031a.length() + 3, false, 4);
                        if (iM21678L3 == -1) {
                            return "";
                        }
                        String str5 = c16452t.f51041g;
                        int iM21678L4 = AbstractC21322p.m21678L(str5, '#', iM21678L3, false, 4);
                        if (iM21678L4 == -1) {
                            String strSubstring3 = str5.substring(iM21678L3);
                            AbstractC16544l.m18093f(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iM21678L3, iM21678L4);
                        AbstractC16544l.m18093f(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = c16452t.f51038d;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = c16452t.f51043i.f51031a.length() + 3;
                        String str7 = c16452t.f51041g;
                        String strSubstring5 = str7.substring(length, AbstractC21322p.m21680N(str7, new char[]{':', '@'}, length, false));
                        AbstractC16544l.m18093f(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = c16452t.f51039e;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = c16452t.f51043i.f51031a.length() + 3;
                        String str9 = c16452t.f51041g;
                        String strSubstring6 = str9.substring(AbstractC21322p.m21678L(str9, ':', length2, false, 4) + 1, AbstractC21322p.m21678L(str9, '@', 0, false, 6));
                        AbstractC16544l.m18093f(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iM21678L5 = AbstractC21322p.m21678L(c16452t.f51041g, '#', 0, false, 6) + 1;
                        if (iM21678L5 == 0) {
                            return "";
                        }
                        String strSubstring7 = c16452t.f51041g.substring(iM21678L5);
                        AbstractC16544l.m18093f(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i12 = 1;
        AbstractC9227W.m9800c(new InterfaceC1426a(this) { // from class: kl.S

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C16452T f51034Z;

            {
                this.f51034Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                C16452T c16452t = this.f51034Z;
                switch (i12) {
                    case 0:
                        int iM21678L = AbstractC21322p.m21678L(c16452t.f51041g, '?', 0, false, 6) + 1;
                        if (iM21678L == 0) {
                            return "";
                        }
                        String str4 = c16452t.f51041g;
                        int iM21678L2 = AbstractC21322p.m21678L(str4, '#', iM21678L, false, 4);
                        if (iM21678L2 == -1) {
                            String strSubstring = str4.substring(iM21678L);
                            AbstractC16544l.m18093f(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iM21678L, iM21678L2);
                        AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iM21678L3 = AbstractC21322p.m21678L(c16452t.f51041g, '/', c16452t.f51043i.f51031a.length() + 3, false, 4);
                        if (iM21678L3 == -1) {
                            return "";
                        }
                        String str5 = c16452t.f51041g;
                        int iM21678L4 = AbstractC21322p.m21678L(str5, '#', iM21678L3, false, 4);
                        if (iM21678L4 == -1) {
                            String strSubstring3 = str5.substring(iM21678L3);
                            AbstractC16544l.m18093f(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iM21678L3, iM21678L4);
                        AbstractC16544l.m18093f(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = c16452t.f51038d;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = c16452t.f51043i.f51031a.length() + 3;
                        String str7 = c16452t.f51041g;
                        String strSubstring5 = str7.substring(length, AbstractC21322p.m21680N(str7, new char[]{':', '@'}, length, false));
                        AbstractC16544l.m18093f(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = c16452t.f51039e;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = c16452t.f51043i.f51031a.length() + 3;
                        String str9 = c16452t.f51041g;
                        String strSubstring6 = str9.substring(AbstractC21322p.m21678L(str9, ':', length2, false, 4) + 1, AbstractC21322p.m21678L(str9, '@', 0, false, 6));
                        AbstractC16544l.m18093f(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iM21678L5 = AbstractC21322p.m21678L(c16452t.f51041g, '#', 0, false, 6) + 1;
                        if (iM21678L5 == 0) {
                            return "";
                        }
                        String strSubstring7 = c16452t.f51041g.substring(iM21678L5);
                        AbstractC16544l.m18093f(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i13 = 2;
        this.f51046l = AbstractC9227W.m9800c(new InterfaceC1426a(this) { // from class: kl.S

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C16452T f51034Z;

            {
                this.f51034Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                C16452T c16452t = this.f51034Z;
                switch (i13) {
                    case 0:
                        int iM21678L = AbstractC21322p.m21678L(c16452t.f51041g, '?', 0, false, 6) + 1;
                        if (iM21678L == 0) {
                            return "";
                        }
                        String str4 = c16452t.f51041g;
                        int iM21678L2 = AbstractC21322p.m21678L(str4, '#', iM21678L, false, 4);
                        if (iM21678L2 == -1) {
                            String strSubstring = str4.substring(iM21678L);
                            AbstractC16544l.m18093f(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iM21678L, iM21678L2);
                        AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iM21678L3 = AbstractC21322p.m21678L(c16452t.f51041g, '/', c16452t.f51043i.f51031a.length() + 3, false, 4);
                        if (iM21678L3 == -1) {
                            return "";
                        }
                        String str5 = c16452t.f51041g;
                        int iM21678L4 = AbstractC21322p.m21678L(str5, '#', iM21678L3, false, 4);
                        if (iM21678L4 == -1) {
                            String strSubstring3 = str5.substring(iM21678L3);
                            AbstractC16544l.m18093f(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iM21678L3, iM21678L4);
                        AbstractC16544l.m18093f(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = c16452t.f51038d;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = c16452t.f51043i.f51031a.length() + 3;
                        String str7 = c16452t.f51041g;
                        String strSubstring5 = str7.substring(length, AbstractC21322p.m21680N(str7, new char[]{':', '@'}, length, false));
                        AbstractC16544l.m18093f(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = c16452t.f51039e;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = c16452t.f51043i.f51031a.length() + 3;
                        String str9 = c16452t.f51041g;
                        String strSubstring6 = str9.substring(AbstractC21322p.m21678L(str9, ':', length2, false, 4) + 1, AbstractC21322p.m21678L(str9, '@', 0, false, 6));
                        AbstractC16544l.m18093f(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iM21678L5 = AbstractC21322p.m21678L(c16452t.f51041g, '#', 0, false, 6) + 1;
                        if (iM21678L5 == 0) {
                            return "";
                        }
                        String strSubstring7 = c16452t.f51041g.substring(iM21678L5);
                        AbstractC16544l.m18093f(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i14 = 3;
        this.f51047m = AbstractC9227W.m9800c(new InterfaceC1426a(this) { // from class: kl.S

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C16452T f51034Z;

            {
                this.f51034Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                C16452T c16452t = this.f51034Z;
                switch (i14) {
                    case 0:
                        int iM21678L = AbstractC21322p.m21678L(c16452t.f51041g, '?', 0, false, 6) + 1;
                        if (iM21678L == 0) {
                            return "";
                        }
                        String str4 = c16452t.f51041g;
                        int iM21678L2 = AbstractC21322p.m21678L(str4, '#', iM21678L, false, 4);
                        if (iM21678L2 == -1) {
                            String strSubstring = str4.substring(iM21678L);
                            AbstractC16544l.m18093f(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iM21678L, iM21678L2);
                        AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iM21678L3 = AbstractC21322p.m21678L(c16452t.f51041g, '/', c16452t.f51043i.f51031a.length() + 3, false, 4);
                        if (iM21678L3 == -1) {
                            return "";
                        }
                        String str5 = c16452t.f51041g;
                        int iM21678L4 = AbstractC21322p.m21678L(str5, '#', iM21678L3, false, 4);
                        if (iM21678L4 == -1) {
                            String strSubstring3 = str5.substring(iM21678L3);
                            AbstractC16544l.m18093f(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iM21678L3, iM21678L4);
                        AbstractC16544l.m18093f(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = c16452t.f51038d;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = c16452t.f51043i.f51031a.length() + 3;
                        String str7 = c16452t.f51041g;
                        String strSubstring5 = str7.substring(length, AbstractC21322p.m21680N(str7, new char[]{':', '@'}, length, false));
                        AbstractC16544l.m18093f(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = c16452t.f51039e;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = c16452t.f51043i.f51031a.length() + 3;
                        String str9 = c16452t.f51041g;
                        String strSubstring6 = str9.substring(AbstractC21322p.m21678L(str9, ':', length2, false, 4) + 1, AbstractC21322p.m21678L(str9, '@', 0, false, 6));
                        AbstractC16544l.m18093f(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iM21678L5 = AbstractC21322p.m21678L(c16452t.f51041g, '#', 0, false, 6) + 1;
                        if (iM21678L5 == 0) {
                            return "";
                        }
                        String strSubstring7 = c16452t.f51041g.substring(iM21678L5);
                        AbstractC16544l.m18093f(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i15 = 4;
        this.f51048n = AbstractC9227W.m9800c(new InterfaceC1426a(this) { // from class: kl.S

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C16452T f51034Z;

            {
                this.f51034Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                C16452T c16452t = this.f51034Z;
                switch (i15) {
                    case 0:
                        int iM21678L = AbstractC21322p.m21678L(c16452t.f51041g, '?', 0, false, 6) + 1;
                        if (iM21678L == 0) {
                            return "";
                        }
                        String str4 = c16452t.f51041g;
                        int iM21678L2 = AbstractC21322p.m21678L(str4, '#', iM21678L, false, 4);
                        if (iM21678L2 == -1) {
                            String strSubstring = str4.substring(iM21678L);
                            AbstractC16544l.m18093f(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iM21678L, iM21678L2);
                        AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iM21678L3 = AbstractC21322p.m21678L(c16452t.f51041g, '/', c16452t.f51043i.f51031a.length() + 3, false, 4);
                        if (iM21678L3 == -1) {
                            return "";
                        }
                        String str5 = c16452t.f51041g;
                        int iM21678L4 = AbstractC21322p.m21678L(str5, '#', iM21678L3, false, 4);
                        if (iM21678L4 == -1) {
                            String strSubstring3 = str5.substring(iM21678L3);
                            AbstractC16544l.m18093f(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iM21678L3, iM21678L4);
                        AbstractC16544l.m18093f(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = c16452t.f51038d;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = c16452t.f51043i.f51031a.length() + 3;
                        String str7 = c16452t.f51041g;
                        String strSubstring5 = str7.substring(length, AbstractC21322p.m21680N(str7, new char[]{':', '@'}, length, false));
                        AbstractC16544l.m18093f(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = c16452t.f51039e;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = c16452t.f51043i.f51031a.length() + 3;
                        String str9 = c16452t.f51041g;
                        String strSubstring6 = str9.substring(AbstractC21322p.m21678L(str9, ':', length2, false, 4) + 1, AbstractC21322p.m21678L(str9, '@', 0, false, 6));
                        AbstractC16544l.m18093f(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iM21678L5 = AbstractC21322p.m21678L(c16452t.f51041g, '#', 0, false, 6) + 1;
                        if (iM21678L5 == 0) {
                            return "";
                        }
                        String strSubstring7 = c16452t.f51041g.substring(iM21678L5);
                        AbstractC16544l.m18093f(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16452T.class != obj.getClass()) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f51041g, ((C16452T) obj).f51041g);
    }

    public final int hashCode() {
        return this.f51041g.hashCode();
    }

    public final String toString() {
        return this.f51041g;
    }
}
