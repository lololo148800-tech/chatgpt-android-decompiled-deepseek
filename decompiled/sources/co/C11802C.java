package co;

import java.nio.charset.CharacterCodingException;
import kotlin.jvm.internal.AbstractC16544l;
import p1009s9.C19506i;
import p1113xn.AbstractC21329w;
import p372P3.AbstractC6327i;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: co.C */
/* JADX INFO: loaded from: classes2.dex */
public class C11802C extends AbstractC6327i {

    /* JADX INFO: renamed from: f */
    public final C19506i f35774f;

    /* JADX INFO: renamed from: g */
    public int f35775g = 128;

    /* JADX INFO: renamed from: h */
    public final C11813c f35776h;

    public C11802C(C19506i c19506i, char[] cArr) throws CharacterCodingException {
        this.f35774f = c19506i;
        this.f35776h = new C11813c(cArr);
        m13068I(0);
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: A */
    public final int mo6910A(int i10) throws CharacterCodingException {
        C11813c c11813c = this.f35776h;
        if (i10 < c11813c.f35816Z) {
            return i10;
        }
        this.f20528b = i10;
        mo6931o();
        return (this.f20528b != 0 || c11813c.length() == 0) ? -1 : 0;
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: D */
    public int mo6912D() throws CharacterCodingException {
        int iMo6910A;
        char c9;
        int i10 = this.f20528b;
        while (true) {
            iMo6910A = mo6910A(i10);
            if (iMo6910A == -1 || !((c9 = this.f35776h.f35815Y[iMo6910A]) == ' ' || c9 == '\n' || c9 == '\r' || c9 == '\t')) {
                break;
            }
            i10 = iMo6910A + 1;
        }
        this.f20528b = iMo6910A;
        return iMo6910A;
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: E */
    public final String mo6913E(int i10, int i11) {
        C11813c c11813c = this.f35776h;
        return AbstractC21329w.m21721h(c11813c.f35815Y, i10, Math.min(i11, c11813c.f35816Z));
    }

    /* JADX INFO: renamed from: I */
    public final void m13068I(int i10) throws CharacterCodingException {
        C11813c c11813c = this.f35776h;
        char[] cArr = c11813c.f35815Y;
        if (i10 != 0) {
            int i11 = this.f20528b;
            AbstractC17678l.m19306m(cArr, cArr, 0, i11, i11 + i10);
        }
        int i12 = c11813c.f35816Z;
        while (i10 != i12) {
            C19506i c19506i = this.f35774f;
            c19506i.getClass();
            int iM13094a = ((C11818h) c19506i.f61960Z).m13094a(cArr, i10, i12 - i10);
            if (iM13094a == -1) {
                c11813c.f35816Z = Math.min(c11813c.f35815Y.length, i10);
                this.f35775g = -1;
                break;
            }
            i10 += iM13094a;
        }
        this.f20528b = 0;
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: b */
    public final void mo6918b(int i10, int i11) {
        ((StringBuilder) this.f20531e).append(this.f35776h.f35815Y, i10, i11 - i10);
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: c */
    public boolean mo6919c() throws CharacterCodingException {
        mo6931o();
        int i10 = this.f20528b;
        while (true) {
            int iMo6910A = mo6910A(i10);
            if (iMo6910A == -1) {
                this.f20528b = iMo6910A;
                return false;
            }
            char c9 = this.f35776h.f35815Y[iMo6910A];
            if (c9 != ' ' && c9 != '\n' && c9 != '\r' && c9 != '\t') {
                this.f20528b = iMo6910A;
                return AbstractC6327i.m6909w(c9);
            }
            i10 = iMo6910A + 1;
        }
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: e */
    public final String mo6921e() throws CharacterCodingException {
        char[] cArr;
        mo6924h('\"');
        int i10 = this.f20528b;
        C11813c c11813c = this.f35776h;
        int i11 = c11813c.f35816Z;
        int i12 = i10;
        while (true) {
            cArr = c11813c.f35815Y;
            if (i12 >= i11) {
                i12 = -1;
                break;
            }
            if (cArr[i12] == '\"') {
                break;
            }
            i12++;
        }
        if (i12 == -1) {
            int iMo6910A = mo6910A(i10);
            if (iMo6910A != -1) {
                return m6927k(this.f20528b, iMo6910A, c11813c);
            }
            m6934s((byte) 1, true);
            throw null;
        }
        for (int i13 = i10; i13 < i12; i13++) {
            if (cArr[i13] == '\\') {
                return m6927k(this.f20528b, i13, c11813c);
            }
        }
        this.f20528b = i12 + 1;
        return AbstractC21329w.m21721h(cArr, i10, Math.min(i12, c11813c.f35816Z));
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: f */
    public byte mo6922f() throws CharacterCodingException {
        mo6931o();
        int i10 = this.f20528b;
        while (true) {
            int iMo6910A = mo6910A(i10);
            if (iMo6910A == -1) {
                this.f20528b = iMo6910A;
                return (byte) 10;
            }
            int i11 = iMo6910A + 1;
            byte bM13103i = AbstractC11828r.m13103i(this.f35776h.f35815Y[iMo6910A]);
            if (bM13103i != 3) {
                this.f20528b = i11;
                return bM13103i;
            }
            i10 = i11;
        }
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: h */
    public void mo6924h(char c9) throws CharacterCodingException {
        mo6931o();
        int i10 = this.f20528b;
        while (true) {
            int iMo6910A = mo6910A(i10);
            if (iMo6910A == -1) {
                this.f20528b = iMo6910A;
                m6916H(c9);
                throw null;
            }
            int i11 = iMo6910A + 1;
            char c10 = this.f35776h.f35815Y[iMo6910A];
            if (c10 != ' ' && c10 != '\n' && c10 != '\r' && c10 != '\t') {
                this.f20528b = i11;
                if (c10 == c9) {
                    return;
                }
                m6916H(c9);
                throw null;
            }
            i10 = i11;
        }
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: o */
    public final void mo6931o() throws CharacterCodingException {
        int i10 = this.f35776h.f35816Z - this.f20528b;
        if (i10 > this.f35775g) {
            return;
        }
        m13068I(i10);
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: u */
    public final CharSequence mo6936u() {
        return this.f35776h;
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: x */
    public final String mo6938x(String keyToMatch, boolean z6) {
        AbstractC16544l.m18094g(keyToMatch, "keyToMatch");
        return null;
    }
}
