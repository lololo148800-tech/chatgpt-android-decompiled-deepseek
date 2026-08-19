package p1063vf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Map;
import mm.C17314q;
import ni.C17627a;
import p005A3.C0317d;
import p005A3.C0318e;
import p005A3.InterfaceC0315b;
import p025An.AbstractC0575H;
import p025An.C0583L;
import p071Ch.C1692w;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1142z3.C21747o;
import p1142z3.C21750r;
import p1142z3.InterfaceC21739g;
import p1142z3.InterfaceC21740h;
import p1149zc.AbstractC21864z;
import p195Hh.C3430e;
import p364Oh.C6226E;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p823j3.C16084f;
import p909nm.C17690x;
import p948pi.C18418a;
import p972qm.C18777j;
import p996rm.EnumC19250a;
import sk.C19665d;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: vf.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C20608p implements InterfaceC21739g {

    /* JADX INFO: renamed from: Y */
    public final AbstractC21864z f65394Y;

    /* JADX INFO: renamed from: Z */
    public final C1692w f65395Z;

    /* JADX INFO: renamed from: o0 */
    public final C20610r f65396o0;

    /* JADX INFO: renamed from: p0 */
    public final C3430e f65397p0 = AbstractC8168p6.m8749b("CustomDataSourceFactory", null);

    /* JADX INFO: renamed from: q0 */
    public final C2153Q0 f65398q0 = AbstractC2124C.m3204c(C17690x.f56481Y);

    /* JADX INFO: renamed from: r0 */
    public final C17314q f65399r0;

    /* JADX INFO: renamed from: s0 */
    public final C0583L f65400s0;

    public C20608p(C17627a c17627a, AbstractC21864z abstractC21864z, C1692w c1692w, C20610r c20610r, C18418a c18418a, C6226E c6226e) {
        this.f65394Y = abstractC21864z;
        this.f65395Z = c1692w;
        this.f65396o0 = c20610r;
        this.f65399r0 = AbstractC9227W.m9800c(new C16084f(c17627a, 21, this));
        this.f65400s0 = AbstractC0575H.m1177f(c17627a, null, new C20607o(this, c18418a, c6226e, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m21195a(String str, AbstractC19687c abstractC19687c) {
        C20604l c20604l;
        if (abstractC19687c instanceof C20604l) {
            c20604l = (C20604l) abstractC19687c;
            int i10 = c20604l.f65381p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20604l.f65381p0 = i10 - Integer.MIN_VALUE;
            } else {
                c20604l = new C20604l(this, abstractC19687c);
            }
        } else {
            c20604l = new C20604l(this, abstractC19687c);
        }
        Object objM3220s = c20604l.f65379Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20604l.f65381p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3220s);
            C20605m c20605m = new C20605m(str, null);
            c20604l.f65378Y = str;
            c20604l.f65381p0 = 1;
            objM3220s = AbstractC2124C.m3220s(this.f65398q0, c20605m, c20604l);
            if (objM3220s == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c20604l.f65378Y;
            AbstractC9233X.m9807c(objM3220s);
        }
        String str2 = (String) ((Map) objM3220s).get(str);
        return str2 == null ? "" : str2;
    }

    @Override // p1142z3.InterfaceC21739g
    /* JADX INFO: renamed from: c */
    public final InterfaceC21740h mo12896c() {
        Map map = (Map) AbstractC0575H.m1161I(C18777j.f59682Y, new C20606n(this, null));
        if (map == null) {
            map = C17690x.f56481Y;
        }
        C17314q c17314q = this.f65399r0;
        InterfaceC0315b interfaceC0315b = (InterfaceC0315b) c17314q.getValue();
        InterfaceC0315b interfaceC0315b2 = (InterfaceC0315b) c17314q.getValue();
        C21747o c21747o = new C21747o(8000, 8000, new C19665d(7));
        interfaceC0315b.getClass();
        interfaceC0315b2.getClass();
        C0318e c0318e = new C0318e(interfaceC0315b, c21747o, new C21750r(false), new C0317d(interfaceC0315b2), 2);
        AbstractC8160o6.m8726a(this.f65397p0, AbstractC10763a.m11049g(c0318e.f1101Y.mo915a(), "createDataSource "), null, 6);
        return new C20593a(c0318e, map);
    }
}
