package p734ep;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import p030B2.C0781s;
import p228J.C3847l0;
import p690cp.C12940z;
import p712dp.C13191g;
import p729ej.C13414e;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: ep.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C13458b {

    /* JADX INFO: renamed from: a */
    public int f42592a;

    /* JADX INFO: renamed from: b */
    public int f42593b;

    /* JADX INFO: renamed from: c */
    public int f42594c;

    /* JADX INFO: renamed from: d */
    public final Serializable f42595d;

    /* JADX INFO: renamed from: e */
    public Object f42596e;

    public C13458b(ArrayList arrayList) {
        this.f42596e = new C13191g("", null);
        this.f42594c = 0;
        this.f42595d = arrayList;
        this.f42592a = 0;
        this.f42593b = 0;
        if (arrayList.isEmpty()) {
            return;
        }
        m14979a(0, 0);
        C13191g c13191g = (C13191g) arrayList.get(0);
        this.f42596e = c13191g;
        this.f42594c = c13191g.f41860a.length();
    }

    /* JADX INFO: renamed from: a */
    public void m14979a(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f42595d;
        if (i10 < 0 || i10 >= arrayList.size()) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("Line index ", i10, arrayList.size(), " out of range, number of lines: "));
        }
        C13191g c13191g = (C13191g) arrayList.get(i10);
        if (i11 < 0 || i11 > c13191g.f41860a.length()) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("Index ", i11, c13191g.f41860a.length(), " out of range, line length: "));
        }
    }

    /* JADX INFO: renamed from: b */
    public int m14980b(char c9) {
        int i10 = 0;
        while (true) {
            char cM14990l = m14990l();
            if (cM14990l == 0) {
                return -1;
            }
            if (cM14990l == c9) {
                return i10;
            }
            i10++;
            m14987i();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m14981c() {
        int i10 = this.f42594c;
        this.f42594c = i10 == Integer.MIN_VALUE ? this.f42592a : i10 + this.f42593b;
        this.f42596e = ((String) this.f42595d) + this.f42594c;
    }

    /* JADX INFO: renamed from: d */
    public C3847l0 m14982d(C0781s c0781s, C0781s c0781s2) {
        int i10 = c0781s.f2192b;
        ArrayList arrayList = (ArrayList) this.f42595d;
        int i11 = c0781s2.f2192b;
        int i12 = c0781s.f2193c;
        int i13 = c0781s2.f2193c;
        if (i10 == i11) {
            C13191g c13191g = (C13191g) arrayList.get(i10);
            CharSequence charSequenceSubSequence = c13191g.f41860a.subSequence(i12, i13);
            C12940z c12940z = c13191g.f41861b;
            C13191g c13191g2 = new C13191g(charSequenceSubSequence, c12940z != null ? c12940z.m14600a(i12, i13) : null);
            C3847l0 c3847l0 = new C3847l0(1);
            c3847l0.f11629a.add(c13191g2);
            return c3847l0;
        }
        C3847l0 c3847l1 = new C3847l0(1);
        int i14 = c0781s.f2192b;
        C13191g c13191g3 = (C13191g) arrayList.get(i14);
        C13191g c13191gM14847a = c13191g3.m14847a(i12, c13191g3.f41860a.length());
        ArrayList arrayList2 = c3847l1.f11629a;
        arrayList2.add(c13191gM14847a);
        while (true) {
            i14++;
            if (i14 >= i11) {
                arrayList2.add(((C13191g) arrayList.get(i11)).m14847a(0, i13));
                return c3847l1;
            }
            arrayList2.add((C13191g) arrayList.get(i14));
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m14983e() {
        return this.f42593b < this.f42594c || this.f42592a < ((ArrayList) this.f42595d).size() - 1;
    }

    /* JADX INFO: renamed from: f */
    public int m14984f(C13414e c13414e) {
        int i10 = 0;
        while (((BitSet) c13414e.f42490Y).get(m14990l())) {
            i10++;
            m14987i();
        }
        return i10;
    }

    /* JADX INFO: renamed from: g */
    public int m14985g(char c9) {
        int i10 = 0;
        while (m14990l() == c9) {
            i10++;
            m14987i();
        }
        return i10;
    }

    /* JADX INFO: renamed from: h */
    public void m14986h() {
        if (this.f42594c == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* JADX INFO: renamed from: i */
    public void m14987i() {
        int i10 = this.f42593b + 1;
        this.f42593b = i10;
        if (i10 > this.f42594c) {
            int i11 = this.f42592a + 1;
            this.f42592a = i11;
            ArrayList arrayList = (ArrayList) this.f42595d;
            if (i11 < arrayList.size()) {
                C13191g c13191g = (C13191g) arrayList.get(this.f42592a);
                this.f42596e = c13191g;
                this.f42594c = c13191g.f41860a.length();
            } else {
                C13191g c13191g2 = new C13191g("", null);
                this.f42596e = c13191g2;
                this.f42594c = c13191g2.f41860a.length();
            }
            this.f42593b = 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m14988j(char c9) {
        if (m14990l() != c9) {
            return false;
        }
        m14987i();
        return true;
    }

    /* JADX INFO: renamed from: k */
    public boolean m14989k(String str) {
        int i10 = this.f42593b;
        if (i10 >= this.f42594c || str.length() + i10 > this.f42594c) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (((C13191g) this.f42596e).f41860a.charAt(this.f42593b + i11) != str.charAt(i11)) {
                return false;
            }
        }
        this.f42593b = str.length() + this.f42593b;
        return true;
    }

    /* JADX INFO: renamed from: l */
    public char m14990l() {
        int i10 = this.f42593b;
        if (i10 < this.f42594c) {
            return ((C13191g) this.f42596e).f41860a.charAt(i10);
        }
        return this.f42592a < ((ArrayList) this.f42595d).size() + (-1) ? '\n' : (char) 0;
    }

    /* JADX INFO: renamed from: m */
    public C0781s m14991m() {
        return new C0781s(this.f42592a, this.f42593b, 5);
    }

    /* JADX INFO: renamed from: n */
    public void m14992n(C0781s c0781s) {
        int i10 = c0781s.f2192b;
        int i11 = c0781s.f2193c;
        m14979a(i10, i11);
        this.f42592a = i10;
        this.f42593b = i11;
        C13191g c13191g = (C13191g) ((ArrayList) this.f42595d).get(i10);
        this.f42596e = c13191g;
        this.f42594c = c13191g.f41860a.length();
    }

    /* JADX INFO: renamed from: o */
    public int m14993o() {
        int i10 = 0;
        while (true) {
            char cM14990l = m14990l();
            if (cM14990l != ' ') {
                switch (cM14990l) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i10;
                }
            }
            i10++;
            m14987i();
        }
    }

    public C13458b(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public C13458b(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + Separators.SLASH;
        } else {
            str = "";
        }
        this.f42595d = str;
        this.f42592a = i11;
        this.f42593b = i12;
        this.f42594c = Integer.MIN_VALUE;
        this.f42596e = "";
    }
}
