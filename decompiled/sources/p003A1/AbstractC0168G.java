package p003A1;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16549q;
import mm.C17309l;
import p001A.AbstractC0010F;
import p001A.C0100z;
import p005A3.C0329p;
import p005A3.InterfaceC0328o;
import p1073w3.AbstractC20800b;
import p1140z1.C21694h;
import p1143z4.C21778h;
import p153Fn.C2925c;
import p178H.C3175v;
import p225Im.InterfaceC3764l;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3835f0;
import p228J.EnumC3803G;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3816S;
import p228J.InterfaceC3818U;
import p228J.InterfaceC3849m0;
import p228J.InterfaceC3854p;
import p253K.C4498i;
import p315Me.Myis.CxcULo;
import p349O0.C6021p;
import p349O0.C6035w;
import p490U.C7530a;
import p490U.C7531b;
import p490U.C7532c;
import p523V9.AbstractC8072d6;
import p736f0.InterfaceC13499q;
import p813ij.C15026j;
import p817j$.util.Objects;
import p894n0.C17407m;
import p909nm.AbstractC17660E;

/* JADX INFO: renamed from: A1.G */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0168G {
    /* JADX INFO: renamed from: A */
    public static void m506A(Number number, InterfaceC13499q interfaceC13499q, String str, C21778h c21778h, String str2) {
        number.intValue();
        AbstractC16544l.m18094g(interfaceC13499q, str);
        AbstractC16544l.m18094g(c21778h, str2);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m507B(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m508C(String str, String str2, String str3) {
        AbstractC20800b.m21332t(str3, str + str2);
    }

    /* JADX INFO: renamed from: D */
    public static C3835f0 m509D(InterfaceC3805H interfaceC3805H, InterfaceC3805H interfaceC3805H2) {
        if (interfaceC3805H == null && interfaceC3805H2 == null) {
            return C3835f0.f11603o0;
        }
        C3825a0 c3825a0M4559o = interfaceC3805H2 != null ? C3825a0.m4559o(interfaceC3805H2) : C3825a0.m4558d();
        if (interfaceC3805H != null) {
            Iterator it = interfaceC3805H.mo44k().iterator();
            while (it.hasNext()) {
                m510E(c3825a0M4559o, interfaceC3805H2, interfaceC3805H, (C3828c) it.next());
            }
        }
        return C3835f0.m4568a(c3825a0M4559o);
    }

    /* JADX INFO: renamed from: E */
    public static void m510E(C3825a0 c3825a0, InterfaceC3805H interfaceC3805H, InterfaceC3805H interfaceC3805H2, C3828c c3828c) {
        if (!Objects.equals(c3828c, InterfaceC3818U.f11571t)) {
            c3825a0.m4560t(c3828c, interfaceC3805H2.mo42h(c3828c), interfaceC3805H2.mo39b(c3828c));
            return;
        }
        C7531b c7531b = (C7531b) interfaceC3805H2.mo36M(c3828c, null);
        C7531b c7531b2 = (C7531b) interfaceC3805H.mo36M(c3828c, null);
        EnumC3803G enumC3803GMo42h = interfaceC3805H2.mo42h(c3828c);
        if (c7531b == null) {
            c7531b = c7531b2;
        } else if (c7531b2 != null) {
            C15026j c15026j = new C15026j();
            c15026j.f46724Y = c7531b2.f23873a;
            c15026j.f46725Z = c7531b2.f23874b;
            C7530a c7530a = c7531b.f23873a;
            if (c7530a != null) {
                c15026j.f46724Y = c7530a;
            }
            C7532c c7532c = c7531b.f23874b;
            if (c7532c != null) {
                c15026j.f46725Z = c7532c;
            }
            c7531b = new C7531b((C7530a) c15026j.f46724Y, (C7532c) c15026j.f46725Z, null);
        }
        c3825a0.m4560t(c3828c, enumC3803GMo42h, c7531b);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ String m511F(int i10) {
        if (i10 == 1) {
            return "CROSSED";
        }
        if (i10 != 2) {
            return i10 != 3 ? CxcULo.tFCpwqOybYDB : "COLLAPSED";
        }
        return "NOT_CROSSED";
    }

    /* JADX INFO: renamed from: a */
    public static boolean m512a(InterfaceC3849m0 interfaceC3849m0, C3828c c3828c) {
        return interfaceC3849m0.getConfig().mo37O(c3828c);
    }

    /* JADX INFO: renamed from: b */
    public static void m513b(InterfaceC3849m0 interfaceC3849m0, C0100z c0100z) {
        interfaceC3849m0.getConfig().mo41e(c0100z);
    }

    /* JADX INFO: renamed from: c */
    public static C3175v m514c(InterfaceC3800E0 interfaceC3800E0) {
        C3175v c3175v = (C3175v) interfaceC3800E0.mo36M(InterfaceC3816S.f11561k, C3175v.f9574c);
        c3175v.getClass();
        return c3175v;
    }

    /* JADX INFO: renamed from: d */
    public static EnumC3803G m515d(InterfaceC3849m0 interfaceC3849m0, C3828c c3828c) {
        return interfaceC3849m0.getConfig().mo42h(c3828c);
    }

    /* JADX INFO: renamed from: e */
    public static Set m516e(InterfaceC3849m0 interfaceC3849m0, C3828c c3828c) {
        return interfaceC3849m0.getConfig().mo34H(c3828c);
    }

    /* JADX INFO: renamed from: f */
    public static Set m517f(InterfaceC3849m0 interfaceC3849m0) {
        return interfaceC3849m0.getConfig().mo44k();
    }

    /* JADX INFO: renamed from: g */
    public static void m518g(InterfaceC3854p interfaceC3854p, C4498i c4498i) {
        int i10;
        String str;
        int iMo4349m = interfaceC3854p.mo4349m();
        if (iMo4349m == 1) {
            return;
        }
        int iM24h = AbstractC0010F.m24h(iMo4349m);
        if (iM24h == 1) {
            i10 = 32;
        } else if (iM24h == 2) {
            i10 = 0;
        } else {
            if (iM24h != 3) {
                if (iMo4349m == 1) {
                    str = "UNKNOWN";
                } else if (iMo4349m == 2) {
                    str = "NONE";
                } else if (iMo4349m != 3) {
                    str = iMo4349m != 4 ? "null" : "FIRED";
                } else {
                    str = "READY";
                }
                AbstractC8072d6.m8492i("ExifData", "Unknown flash state: ".concat(str));
                return;
            }
            i10 = 1;
        }
        int i11 = i10 & 1;
        ArrayList arrayList = c4498i.f14674a;
        if (i11 == 1) {
            c4498i.m5235c("LightSource", String.valueOf(4), arrayList);
        }
        c4498i.m5235c("Flash", String.valueOf(i10), arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static Object m519h(InterfaceC3849m0 interfaceC3849m0, C3828c c3828c) {
        return interfaceC3849m0.getConfig().mo39b(c3828c);
    }

    /* JADX INFO: renamed from: i */
    public static Object m520i(InterfaceC3849m0 interfaceC3849m0, C3828c c3828c, Object obj) {
        return interfaceC3849m0.getConfig().mo36M(c3828c, obj);
    }

    /* JADX INFO: renamed from: j */
    public static Object m521j(InterfaceC3849m0 interfaceC3849m0, C3828c c3828c, EnumC3803G enumC3803G) {
        return interfaceC3849m0.getConfig().mo49q(c3828c, enumC3803G);
    }

    /* JADX INFO: renamed from: k */
    public static int m522k(int i10, int i11, int i12, int i13) {
        return i10 | i11 | i12 | 128 | i13;
    }

    /* JADX INFO: renamed from: l */
    public static long m523l(InterfaceC0328o interfaceC0328o) {
        byte[] bArr = (byte[]) ((C0329p) interfaceC0328o).f1146b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: m */
    public static int m524m(int i10) {
        return i10 & 384;
    }

    /* JADX INFO: renamed from: n */
    public static int m525n(int i10) {
        return i10 & 64;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m526o(int i10, boolean z6) {
        int i11 = i10 & 7;
        return i11 == 4 || (z6 && i11 == 3);
    }

    /* JADX INFO: renamed from: p */
    public static int m527p(int i10, int i11, String str) {
        return (str.hashCode() + i10) * i11;
    }

    /* JADX INFO: renamed from: q */
    public static InterfaceC3764l m528q(Class cls, String str, String str2, int i10, C16527D c16527d) {
        return c16527d.mo5697f(new C16549q(cls, str, str2, i10));
    }

    /* JADX INFO: renamed from: r */
    public static C6035w m529r(C2925c c2925c, C6021p c6021p) {
        C6035w c6035w = new C6035w(c2925c);
        c6021p.m6537c0(c6035w);
        return c6035w;
    }

    /* JADX INFO: renamed from: s */
    public static Object m530s(int i10, C6021p c6021p, boolean z6) {
        c6021p.m6553p(z6);
        c6021p.m6524S(i10);
        return c6021p.m6514H();
    }

    /* JADX INFO: renamed from: t */
    public static String m531t(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.m12255B());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public static String m532u(String str, int i10, String str2, int i11, String str3) {
        return str + i10 + str2 + i11 + str3;
    }

    /* JADX INFO: renamed from: v */
    public static String m533v(String str, long j10, String str2) {
        return str + j10 + str2;
    }

    /* JADX INFO: renamed from: w */
    public static String m534w(Locale locale, String str, String str2, Locale locale2, String str3) {
        AbstractC16544l.m18093f(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        AbstractC16544l.m18093f(lowerCase, str3);
        return lowerCase;
    }

    /* JADX INFO: renamed from: x */
    public static Map m535x(String str, String str2) {
        return AbstractC17660E.m19258c(new C17309l(str, str2));
    }

    /* JADX INFO: renamed from: y */
    public static C17407m m536y(C6021p c6021p) {
        C17407m c17407m = new C17407m();
        c6021p.m6537c0(c17407m);
        return c17407m;
    }

    /* JADX INFO: renamed from: z */
    public static void m537z(int i10, C6021p c6021p, int i11, C21694h c21694h) {
        c6021p.m6537c0(Integer.valueOf(i10));
        c6021p.m6534b(Integer.valueOf(i11), c21694h);
    }
}
