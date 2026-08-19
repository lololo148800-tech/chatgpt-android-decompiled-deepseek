package p404Qe;

import android.app.Application;
import android.gov.nist.core.Separators;
import be.C11345b;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import me.C17238a;
import mm.C17309l;
import p025An.C0644w;
import p098Di.C2058g;
import p098Di.InterfaceC2061j;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1040ue.InterfaceC20204b;
import p1040ue.InterfaceC20207e;
import p1111xl.C21296a;
import p1113xn.AbstractC21322p;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21920H0;
import p1155zi.C21929J1;
import p1155zi.C21945N1;
import p1155zi.C21949O1;
import p1155zi.C21952P1;
import p195Hh.C3430e;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p314Md.C5320b;
import p314Md.InterfaceC5319a;
import p318Mh.C5435y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p480Te.C7392q;
import p504Ue.C7634d;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.C17690x;
import p929oi.AbstractC18201b;
import p968qi.C18736s;
import p968qi.C18737t;
import p968qi.C18739v;
import p968qi.C18742y;
import p991rh.C19003l;
import p991rh.EnumC18986A;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Qe.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C6675k implements InterfaceC20207e, InterfaceC5319a {

    /* JADX INFO: renamed from: a */
    public final C11345b f21455a;

    /* JADX INFO: renamed from: b */
    public final Application f21456b;

    /* JADX INFO: renamed from: c */
    public final C6667c f21457c;

    /* JADX INFO: renamed from: d */
    public final C7392q f21458d;

    /* JADX INFO: renamed from: e */
    public final C7634d f21459e;

    /* JADX INFO: renamed from: f */
    public final C17238a f21460f;

    /* JADX INFO: renamed from: g */
    public final C3430e f21461g = AbstractC8168p6.m8749b("ConversationSpreadsheetRepository", null);

    /* JADX INFO: renamed from: h */
    public final C2153Q0 f21462h = AbstractC2124C.m3204c(C17690x.f56481Y);

    /* JADX INFO: renamed from: i */
    public C17309l f21463i;

    public C6675k(C11345b c11345b, Application application, C6667c c6667c, C7392q c7392q, C7634d c7634d, C17238a c17238a) {
        this.f21455a = c11345b;
        this.f21456b = application;
        this.f21457c = c6667c;
        this.f21458d = c7392q;
        this.f21459e = c7634d;
        this.f21460f = c17238a;
    }

    /* JADX INFO: renamed from: c */
    public static void m7178c(String str, String str2, StringBuilder sb2) {
        sb2.append(" in the table \"");
        sb2.append(str);
        sb2.append(Separators.DOUBLE_QUOTE);
        if (str2 != null) {
            sb2.append(" in the \"");
            sb2.append(str2);
            sb2.append("\" sheet");
        }
    }

    @Override // p1040ue.InterfaceC20207e
    /* JADX INFO: renamed from: a */
    public final InterfaceC2061j mo4411a(InterfaceC20204b action) {
        AbstractC16544l.m18094g(action, "action");
        if (action instanceof C6683s) {
            C6683s c6683s = (C6683s) action;
            return new C2058g(C5435y.f17770g.m5904d(c6683s.f21492a, c6683s.f21493b, true), true);
        }
        if (action instanceof C6684t) {
            this.f21463i = null;
            String value = ((C6684t) action).f21494a;
            AbstractC16544l.m18094g(value, "value");
            this.f21460f.m18967b(value);
        }
        return null;
    }

    @Override // p314Md.InterfaceC5319a
    /* JADX INFO: renamed from: b */
    public final C5320b mo4412b(C5320b c5320b, boolean z6) {
        C17309l c17309l = this.f21463i;
        if (c17309l == null) {
            return c5320b;
        }
        String value = ((C21920H0) c17309l.f55136Y).f69471a;
        C18739v c18739v = (C18739v) c17309l.f55137Z;
        C6685u c6685u = (C6685u) ((Map) this.f21462h.getValue()).get(new C21920H0(value));
        C17238a c17238a = this.f21460f;
        if (c6685u == null) {
            AbstractC8160o6.m8731f(this.f21461g, "Unable to find spreadsheet model to process outgoing messages.}", null, null, 6);
            this.f21463i = null;
            AbstractC16544l.m18094g(value, "value");
            c17238a.m18967b(value);
            return c5320b;
        }
        int i10 = c18739v.f59609a;
        C18737t c18737t = c6685u.f21496b;
        C18742y c18742y = (C18742y) AbstractC17680n.m19344T(i10, c18737t.f59597a);
        String str = c18742y != null ? c18742y.f59615a : null;
        if (str == null || AbstractC21322p.m21681O(str)) {
            str = null;
        }
        StringBuilder sb2 = new StringBuilder();
        Set set = c18739v.f59611c;
        boolean zIsEmpty = set.isEmpty();
        String str2 = c6685u.f21495a;
        if (!zIsEmpty) {
            sb2.append("The user has selected rows at the following indices: ");
            sb2.append(AbstractC17680n.m19349Y(set, ", ", null, null, 0, null, null, 62));
            m7178c(str2, str, sb2);
            sb2.append('\n');
        }
        Set set2 = c18739v.f59610b;
        if (!set2.isEmpty()) {
            sb2.append("The user has selected columns at the following indices: ");
            sb2.append(AbstractC17680n.m19349Y(set2, ", ", null, null, 0, null, new C6674j(c18737t, 0), 30));
            m7178c(str2, str, sb2);
            sb2.append('\n');
        }
        Set set3 = c18739v.f59612d;
        if (!set3.isEmpty()) {
            sb2.append("The user has selected the cells with the indices: ");
            sb2.append(AbstractC17680n.m19349Y(set3, ", ", null, null, 0, null, new C6674j(c18737t, 1), 30));
            m7178c(str2, str, sb2);
            sb2.append('\n');
        }
        String string = sb2.toString();
        this.f21463i = null;
        AbstractC16544l.m18094g(value, "value");
        c17238a.m18967b(value);
        return C5320b.m5878a(c5320b, string, true, 2);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0202  */
    /* JADX WARN: Code duplicated, block: B:115:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143  */
    /* JADX WARN: Code duplicated, block: B:69:0x014e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0186 A[Catch: Exception -> 0x0190, TryCatch #1 {Exception -> 0x0190, blocks: (B:79:0x0178, B:81:0x0186, B:86:0x01aa, B:85:0x0194, B:88:0x01b1, B:89:0x01b6), top: B:115:0x0178 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0194 A[Catch: Exception -> 0x0190, TryCatch #1 {Exception -> 0x0190, blocks: (B:79:0x0178, B:81:0x0186, B:86:0x01aa, B:85:0x0194, B:88:0x01b1, B:89:0x01b6), top: B:115:0x0178 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b1 A[Catch: Exception -> 0x0190, TryCatch #1 {Exception -> 0x0190, blocks: (B:79:0x0178, B:81:0x0186, B:86:0x01aa, B:85:0x0194, B:88:0x01b1, B:89:0x01b6), top: B:115:0x0178 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ca  */
    /* JADX INFO: renamed from: d */
    public final Object m7179d(String str, AbstractC19687c abstractC19687c) throws Throwable {
        C6673i c6673i;
        C6675k c6675k;
        Object objM6734a;
        C19003l c19003l;
        C6675k c6675k2;
        String str2;
        String str3;
        C19003l c19003l2;
        C6675k c6675k3;
        String str4;
        Object c6223b;
        AbstractC21955Q1 abstractC21955Q1;
        AbstractC21955Q1 c21945n1;
        String string;
        boolean zM21667A;
        C18737t c18737tM20044a;
        C6685u c6685u;
        C2153Q0 c2153q0;
        Object value;
        if (abstractC19687c instanceof C6673i) {
            c6673i = (C6673i) abstractC19687c;
            int i10 = c6673i.f21452s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6673i.f21452s0 = i10 - Integer.MIN_VALUE;
            } else {
                c6673i = new C6673i(this, abstractC19687c);
            }
        } else {
            c6673i = new C6673i(this, abstractC19687c);
        }
        Object objM7792b = c6673i.f21450q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6673i.f21452s0;
        C21929J1 c21929j1 = C21929J1.f69476a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM7792b);
            C6685u c6685u2 = (C6685u) ((Map) this.f21462h.getValue()).get(new C21920H0(str));
            if (c6685u2 != null) {
                return new C21952P1(c6685u2);
            }
            c6673i.f21446Y = this;
            c6673i.f21447Z = str;
            c6673i.f21452s0 = 1;
            objM7792b = this.f21458d.m7792b(str, c6673i);
            if (objM7792b == enumC19250a) {
                return enumC19250a;
            }
            c6675k = this;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    str4 = (String) c6673i.f21448o0;
                    c19003l2 = (C19003l) c6673i.f21447Z;
                    c6675k3 = c6673i.f21446Y;
                    AbstractC9233X.m9807c(objM7792b);
                    c6223b = (AbstractC6224C) objM7792b;
                    if (c6223b instanceof C6223B) {
                        c6223b = new C6223B(new C6685u(c19003l2.m20278a(AbstractC8012V5.m8334g(c6675k3.f21456b)), (C18737t) ((C6223B) c6223b).f20258a, str4));
                    } else if (!(c6223b instanceof C6248v) && !(c6223b instanceof AbstractC6249w)) {
                        throw new C0644w();
                    }
                    if (c6223b instanceof C6223B) {
                        return new C21952P1(((C6223B) c6223b).f20258a);
                    }
                    if (c6223b instanceof C6248v) {
                        return c21929j1;
                    }
                    if (c6223b instanceof AbstractC6249w) {
                        throw new C0644w();
                    }
                    c6223b.getClass();
                    return AbstractC6224C.m6734a((AbstractC6249w) c6223b);
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = c6673i.f21449p0;
                c19003l = (C19003l) c6673i.f21448o0;
                str2 = (String) c6673i.f21447Z;
                c6675k2 = c6673i.f21446Y;
                AbstractC9233X.m9807c(objM7792b);
                abstractC21955Q1 = (AbstractC21955Q1) objM7792b;
                if (abstractC21955Q1 instanceof C21952P1) {
                    try {
                        string = (String) ((C21952P1) abstractC21955Q1).f69511a;
                        zM21667A = AbstractC21322p.m21667A(str3, ".csv", false);
                        if (zM21667A) {
                            C18737t.Companion.getClass();
                            c18737tM20044a = C18736s.m20044a(string);
                        } else {
                            if (!zM21667A) {
                                throw new C0644w();
                            }
                            C18736s c18736s = C18737t.Companion;
                            c18736s.getClass();
                            AbstractC16544l.m18094g(string, "string");
                            c18737tM20044a = (C18737t) AbstractC18201b.f58034a.m12903b(string, c18736s.serializer());
                        }
                        c21945n1 = new C21952P1(c18737tM20044a);
                    } catch (Exception e10) {
                        c21945n1 = new C21945N1(e10);
                    }
                    abstractC21955Q1 = c21945n1;
                } else if (!(abstractC21955Q1 instanceof C21929J1) && !(abstractC21955Q1 instanceof AbstractC21933K1)) {
                    throw new C0644w();
                }
                if (abstractC21955Q1 instanceof C21952P1) {
                    AbstractC16544l.m18092e(abstractC21955Q1, "null cannot be cast to non-null type com.openai.types.Result<com.openai.feature.conversationspreadsheet.impl.SpreadsheetData>");
                    return abstractC21955Q1;
                }
                c6685u = new C6685u(c19003l.m20278a(AbstractC8012V5.m8334g(c6675k2.f21456b)), (C18737t) ((C21952P1) abstractC21955Q1).f69511a, str3);
                do {
                    c2153q0 = c6675k2.f21462h;
                    value = c2153q0.getValue();
                } while (!c2153q0.m3250k(value, AbstractC17659D.m19249k((Map) value, new C17309l(new C21920H0(str2), c6685u))));
                return new C21952P1(c6685u);
            }
            str = (String) c6673i.f21447Z;
            c6675k = c6673i.f21446Y;
            AbstractC9233X.m9807c(objM7792b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM7792b;
        if (abstractC6224C instanceof C6223B) {
            objM6734a = new C21952P1(((C6223B) abstractC6224C).f20258a);
        } else if (abstractC6224C instanceof C6248v) {
            objM6734a = c21929j1;
        } else {
            if (!(abstractC6224C instanceof AbstractC6249w)) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            objM6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        if (!(objM6734a instanceof C21952P1)) {
            return objM6734a;
        }
        C19003l c19003l3 = (C19003l) ((C21952P1) objM6734a).f69511a;
        String str5 = c19003l3.f60582b;
        if (c19003l3.f60581a != EnumC18986A.f60558Z || str5 == null || AbstractC21322p.m21681O(str5)) {
            IllegalStateException illegalStateException = new IllegalStateException(AbstractC9306j0.m9889h("Failed to get download link for file ", str));
            return new C21949O1(illegalStateException.getMessage(), illegalStateException);
        }
        if (AbstractC21322p.m21667A(str5, ".xls", false)) {
            C6667c c6667c = c6675k.f21457c;
            c6673i.f21446Y = c6675k;
            c6673i.f21447Z = c19003l3;
            c6673i.f21448o0 = str5;
            c6673i.f21452s0 = 2;
            InterfaceC3777y interfaceC3777yM18075c = null;
            C6666b c6666b = new C6666b(str, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C18737t.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C18737t.class);
            } catch (Throwable unused) {
            }
            Object objM9690b = AbstractC9144I.m9690b(c6667c.f21438a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c6666b, c6673i);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
            c19003l2 = c19003l3;
            c6675k3 = c6675k;
            objM7792b = objM9690b;
            str4 = str5;
            c6223b = (AbstractC6224C) objM7792b;
            if (c6223b instanceof C6223B) {
                c6223b = new C6223B(new C6685u(c19003l2.m20278a(AbstractC8012V5.m8334g(c6675k3.f21456b)), (C18737t) ((C6223B) c6223b).f20258a, str4));
            } else if (!(c6223b instanceof C6248v)) {
                throw new C0644w();
            }
            if (c6223b instanceof C6223B) {
                return new C21952P1(((C6223B) c6223b).f20258a);
            }
            if (c6223b instanceof C6248v) {
                return c21929j1;
            }
            if (c6223b instanceof AbstractC6249w) {
                throw new C0644w();
            }
            c6223b.getClass();
            return AbstractC6224C.m6734a((AbstractC6249w) c6223b);
        }
        C7634d c7634d = c6675k.f21459e;
        c6673i.f21446Y = c6675k;
        c6673i.f21447Z = str;
        c6673i.f21448o0 = c19003l3;
        c6673i.f21449p0 = str5;
        c6673i.f21452s0 = 3;
        Object objM7968a = c7634d.m7968a(str5, c6673i);
        if (objM7968a == enumC19250a) {
            return enumC19250a;
        }
        c19003l = c19003l3;
        objM7792b = objM7968a;
        c6675k2 = c6675k;
        str2 = str;
        str3 = str5;
        abstractC21955Q1 = (AbstractC21955Q1) objM7792b;
        if (abstractC21955Q1 instanceof C21952P1) {
            string = (String) ((C21952P1) abstractC21955Q1).f69511a;
            zM21667A = AbstractC21322p.m21667A(str3, ".csv", false);
            if (zM21667A) {
                C18737t.Companion.getClass();
                c18737tM20044a = C18736s.m20044a(string);
            } else {
                if (!zM21667A) {
                    throw new C0644w();
                }
                C18736s c18736s2 = C18737t.Companion;
                c18736s2.getClass();
                AbstractC16544l.m18094g(string, "string");
                c18737tM20044a = (C18737t) AbstractC18201b.f58034a.m12903b(string, c18736s2.serializer());
            }
            c21945n1 = new C21952P1(c18737tM20044a);
            abstractC21955Q1 = c21945n1;
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        if (abstractC21955Q1 instanceof C21952P1) {
            AbstractC16544l.m18092e(abstractC21955Q1, "null cannot be cast to non-null type com.openai.types.Result<com.openai.feature.conversationspreadsheet.impl.SpreadsheetData>");
            return abstractC21955Q1;
        }
        c6685u = new C6685u(c19003l.m20278a(AbstractC8012V5.m8334g(c6675k2.f21456b)), (C18737t) ((C21952P1) abstractC21955Q1).f69511a, str3);
        do {
            c2153q0 = c6675k2.f21462h;
            value = c2153q0.getValue();
        } while (!c2153q0.m3250k(value, AbstractC17659D.m19249k((Map) value, new C17309l(new C21920H0(str2), c6685u))));
        return new C21952P1(c6685u);
    }

    /* JADX INFO: renamed from: e */
    public final String m7180e(int i10, int i11) {
        if (i11 == 0) {
            return null;
        }
        return this.f21456b.getResources().getQuantityString(i10, i11, Integer.valueOf(i11));
    }
}
