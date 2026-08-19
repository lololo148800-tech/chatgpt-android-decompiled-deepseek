package co;

import p1113xn.AbstractC21322p;
import p372P3.AbstractC6327i;

/* JADX INFO: renamed from: co.I */
/* JADX INFO: loaded from: classes2.dex */
public final class C11808I extends C11807H {
    @Override // co.C11807H, p372P3.AbstractC6327i
    /* JADX INFO: renamed from: D */
    public final int mo6912D() {
        int i10;
        int iM21678L = this.f20528b;
        if (iM21678L == -1) {
            return iM21678L;
        }
        while (true) {
            String str = this.f35795f;
            if (iM21678L >= str.length()) {
                break;
            }
            char cCharAt = str.charAt(iM21678L);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i10 = iM21678L + 1) >= str.length()) {
                    break;
                }
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 == '*') {
                    int iM21679M = AbstractC21322p.m21679M(str, "*/", iM21678L + 2, false, 4);
                    if (iM21679M == -1) {
                        this.f20528b = str.length();
                        AbstractC6327i.m6908r(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6);
                        throw null;
                    }
                    iM21678L = iM21679M + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iM21678L = AbstractC21322p.m21678L(str, '\n', iM21678L + 2, false, 4);
                    if (iM21678L == -1) {
                        iM21678L = str.length();
                    }
                }
            }
            iM21678L++;
        }
        this.f20528b = iM21678L;
        return iM21678L;
    }

    @Override // co.C11807H, p372P3.AbstractC6327i
    /* JADX INFO: renamed from: c */
    public final boolean mo6919c() {
        int iMo6912D = mo6912D();
        String str = this.f35795f;
        if (iMo6912D >= str.length() || iMo6912D == -1) {
            return false;
        }
        return AbstractC6327i.m6909w(str.charAt(iMo6912D));
    }

    @Override // co.C11807H, p372P3.AbstractC6327i
    /* JADX INFO: renamed from: f */
    public final byte mo6922f() {
        int iMo6912D = mo6912D();
        String str = this.f35795f;
        if (iMo6912D >= str.length() || iMo6912D == -1) {
            return (byte) 10;
        }
        this.f20528b = iMo6912D + 1;
        return AbstractC11828r.m13103i(str.charAt(iMo6912D));
    }

    @Override // co.C11807H, p372P3.AbstractC6327i
    /* JADX INFO: renamed from: h */
    public final void mo6924h(char c9) {
        int iMo6912D = mo6912D();
        String str = this.f35795f;
        if (iMo6912D >= str.length() || iMo6912D == -1) {
            this.f20528b = -1;
            m6916H(c9);
            throw null;
        }
        char cCharAt = str.charAt(iMo6912D);
        this.f20528b = iMo6912D + 1;
        if (cCharAt == c9) {
            return;
        }
        m6916H(c9);
        throw null;
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: y */
    public final byte mo6939y() {
        int iMo6912D = mo6912D();
        String str = this.f35795f;
        if (iMo6912D >= str.length() || iMo6912D == -1) {
            return (byte) 10;
        }
        this.f20528b = iMo6912D;
        return AbstractC11828r.m13103i(str.charAt(iMo6912D));
    }
}
