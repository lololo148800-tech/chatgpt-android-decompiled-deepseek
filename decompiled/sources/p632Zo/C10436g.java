package p632Zo;

import java.util.BitSet;
import p030B2.C0781s;
import p594Y9.C9895g4;
import p607Yo.C10124m;
import p667bp.AbstractC11539b;
import p690cp.C12912C;
import p729ej.C13414e;
import p734ep.C13458b;
import p734ep.InterfaceC13457a;

/* JADX INFO: renamed from: Zo.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C10436g implements InterfaceC13457a {

    /* JADX INFO: renamed from: a */
    public static final C13414e f30908a;

    /* JADX INFO: renamed from: b */
    public static final C13414e f30909b;

    /* JADX INFO: renamed from: c */
    public static final C13414e f30910c;

    /* JADX INFO: renamed from: d */
    public static final C13414e f30911d;

    static {
        C9895g4 c9895g4M14951D = C13414e.m14951D();
        c9895g4M14951D.m10551C('0', '9');
        c9895g4M14951D.m10551C('A', 'F');
        c9895g4M14951D.m10551C('a', 'f');
        f30908a = new C13414e(c9895g4M14951D);
        C9895g4 c9895g4M14951D2 = C13414e.m14951D();
        c9895g4M14951D2.m10551C('0', '9');
        f30909b = new C13414e(c9895g4M14951D2);
        C9895g4 c9895g4M14951D3 = C13414e.m14951D();
        c9895g4M14951D3.m10551C('A', 'Z');
        c9895g4M14951D3.m10551C('a', 'z');
        C13414e c13414e = new C13414e(c9895g4M14951D3);
        f30910c = c13414e;
        C9895g4 c9895g4M14953E = c13414e.m14953E();
        c9895g4M14953E.m10551C('0', '9');
        f30911d = new C13414e(c9895g4M14953E);
    }

    /* JADX INFO: renamed from: b */
    public static C10439j m10918b(C0781s c0781s, C13458b c13458b) {
        return new C10439j(new C12912C(AbstractC11539b.m12931a(c13458b.m14982d(c0781s, c13458b.m14991m()).m4580g())), c13458b.m14991m());
    }

    @Override // p734ep.InterfaceC13457a
    /* JADX INFO: renamed from: a */
    public final C10439j mo10916a(C10124m c10124m) {
        C13458b c13458b = c10124m.f30009h;
        C0781s c0781sM14991m = c13458b.m14991m();
        c13458b.m14987i();
        char cM14990l = c13458b.m14990l();
        if (cM14990l != '#') {
            if (!((BitSet) f30910c.f42490Y).get(cM14990l)) {
                return null;
            }
            c13458b.m14984f(f30911d);
            if (c13458b.m14988j(';')) {
                return m10918b(c0781sM14991m, c13458b);
            }
            return null;
        }
        c13458b.m14987i();
        if (c13458b.m14988j('x') || c13458b.m14988j('X')) {
            int iM14984f = c13458b.m14984f(f30908a);
            if (1 > iM14984f || iM14984f > 6 || !c13458b.m14988j(';')) {
                return null;
            }
            return m10918b(c0781sM14991m, c13458b);
        }
        int iM14984f2 = c13458b.m14984f(f30909b);
        if (1 > iM14984f2 || iM14984f2 > 7 || !c13458b.m14988j(';')) {
            return null;
        }
        return m10918b(c0781sM14991m, c13458b);
    }
}
