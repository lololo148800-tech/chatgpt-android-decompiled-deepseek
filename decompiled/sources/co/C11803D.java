package co;

import java.nio.charset.CharacterCodingException;
import mm.C17309l;
import p1113xn.AbstractC21322p;
import p372P3.AbstractC6327i;

/* JADX INFO: renamed from: co.D */
/* JADX INFO: loaded from: classes2.dex */
public final class C11803D extends C11802C {
    @Override // co.C11802C, p372P3.AbstractC6327i
    /* JADX INFO: renamed from: D */
    public final int mo6912D() throws CharacterCodingException {
        int i10;
        C17309l c17309l;
        int iMo6910A = this.f20528b;
        while (true) {
            iMo6910A = mo6910A(iMo6910A);
            if (iMo6910A == -1) {
                break;
            }
            C11813c c11813c = this.f35776h;
            char[] cArr = c11813c.f35815Y;
            char c9 = cArr[iMo6910A];
            if (c9 == ' ' || c9 == '\n' || c9 == '\r' || c9 == '\t') {
                iMo6910A++;
            } else {
                if (c9 != '/' || (i10 = iMo6910A + 1) >= c11813c.f35816Z) {
                    break;
                }
                int iMo6910A2 = iMo6910A + 2;
                char c10 = cArr[i10];
                if (c10 == '*') {
                    boolean z6 = false;
                    while (true) {
                        if (iMo6910A != -1) {
                            int iM21679M = AbstractC21322p.m21679M(c11813c, "*/", iMo6910A2, false, 4);
                            if (iM21679M != -1) {
                                c17309l = new C17309l(Integer.valueOf(iM21679M + 2), Boolean.TRUE);
                                break;
                            }
                            int i11 = c11813c.f35816Z;
                            int i12 = i11 - 1;
                            if (c11813c.f35815Y[i12] != '*') {
                                iMo6910A2 = mo6910A(i11);
                            } else {
                                if (i11 - i12 > this.f35775g) {
                                    iMo6910A2 = i12;
                                } else {
                                    this.f20528b = i12;
                                    mo6931o();
                                    iMo6910A2 = (this.f20528b != 0 || c11813c.f35816Z == 0) ? -1 : 0;
                                }
                                if (!z6) {
                                    z6 = true;
                                }
                            }
                            iMo6910A = iMo6910A2;
                        }
                        this.f20528b = c11813c.f35816Z;
                        AbstractC6327i.m6908r(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6);
                        throw null;
                    }
                }
                if (c10 == '/') {
                    while (true) {
                        if (iMo6910A != -1) {
                            int iM21678L = AbstractC21322p.m21678L(c11813c, '\n', iMo6910A2, false, 4);
                            if (iM21678L != -1) {
                                c17309l = new C17309l(Integer.valueOf(iM21678L + 1), Boolean.TRUE);
                                break;
                            }
                            iMo6910A2 = mo6910A(c11813c.f35816Z);
                            iMo6910A = iMo6910A2;
                        } else {
                            c17309l = new C17309l(-1, Boolean.TRUE);
                            break;
                        }
                    }
                } else {
                    c17309l = new C17309l(Integer.valueOf(iMo6910A), Boolean.FALSE);
                }
                iMo6910A = ((Number) c17309l.f55136Y).intValue();
                if (!((Boolean) c17309l.f55137Z).booleanValue()) {
                    break;
                }
            }
        }
        this.f20528b = iMo6910A;
        return iMo6910A;
    }

    @Override // co.C11802C, p372P3.AbstractC6327i
    /* JADX INFO: renamed from: c */
    public final boolean mo6919c() throws CharacterCodingException {
        mo6931o();
        int iMo6912D = mo6912D();
        C11813c c11813c = this.f35776h;
        if (iMo6912D >= c11813c.f35816Z || iMo6912D == -1) {
            return false;
        }
        return AbstractC6327i.m6909w(c11813c.f35815Y[iMo6912D]);
    }

    @Override // co.C11802C, p372P3.AbstractC6327i
    /* JADX INFO: renamed from: f */
    public final byte mo6922f() throws CharacterCodingException {
        mo6931o();
        int iMo6912D = mo6912D();
        C11813c c11813c = this.f35776h;
        if (iMo6912D >= c11813c.f35816Z || iMo6912D == -1) {
            return (byte) 10;
        }
        this.f20528b = iMo6912D + 1;
        return AbstractC11828r.m13103i(c11813c.f35815Y[iMo6912D]);
    }

    @Override // co.C11802C, p372P3.AbstractC6327i
    /* JADX INFO: renamed from: h */
    public final void mo6924h(char c9) throws CharacterCodingException {
        mo6931o();
        int iMo6912D = mo6912D();
        C11813c c11813c = this.f35776h;
        if (iMo6912D >= c11813c.f35816Z || iMo6912D == -1) {
            this.f20528b = -1;
            m6916H(c9);
            throw null;
        }
        char c10 = c11813c.f35815Y[iMo6912D];
        this.f20528b = iMo6912D + 1;
        if (c10 == c9) {
            return;
        }
        m6916H(c9);
        throw null;
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: y */
    public final byte mo6939y() throws CharacterCodingException {
        mo6931o();
        int iMo6912D = mo6912D();
        C11813c c11813c = this.f35776h;
        if (iMo6912D >= c11813c.f35816Z || iMo6912D == -1) {
            return (byte) 10;
        }
        this.f20528b = iMo6912D;
        return AbstractC11828r.m13103i(c11813c.f35815Y[iMo6912D]);
    }
}
