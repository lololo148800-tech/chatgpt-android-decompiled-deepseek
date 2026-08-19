package co;

import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p372P3.AbstractC6327i;

/* JADX INFO: renamed from: co.H */
/* JADX INFO: loaded from: classes2.dex */
public class C11807H extends AbstractC6327i {

    /* JADX INFO: renamed from: f */
    public final String f35795f;

    public C11807H(String source) {
        AbstractC16544l.m18094g(source, "source");
        this.f35795f = source;
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: A */
    public final int mo6910A(int i10) {
        if (i10 < this.f35795f.length()) {
            return i10;
        }
        return -1;
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: D */
    public int mo6912D() {
        char cCharAt;
        int i10 = this.f20528b;
        if (i10 == -1) {
            return i10;
        }
        while (true) {
            String str = this.f35795f;
            if (i10 >= str.length() || !((cCharAt = str.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i10++;
        }
        this.f20528b = i10;
        return i10;
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: c */
    public boolean mo6919c() {
        int i10 = this.f20528b;
        if (i10 == -1) {
            return false;
        }
        while (true) {
            String str = this.f35795f;
            if (i10 >= str.length()) {
                this.f20528b = i10;
                return false;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f20528b = i10;
                return AbstractC6327i.m6909w(cCharAt);
            }
            i10++;
        }
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: e */
    public final String mo6921e() {
        mo6924h('\"');
        int i10 = this.f20528b;
        String str = this.f35795f;
        int iM21678L = AbstractC21322p.m21678L(str, '\"', i10, false, 4);
        if (iM21678L == -1) {
            m6928l();
            m6934s((byte) 1, false);
            throw null;
        }
        for (int i11 = i10; i11 < iM21678L; i11++) {
            if (str.charAt(i11) == '\\') {
                return m6927k(this.f20528b, i11, str);
            }
        }
        this.f20528b = iM21678L + 1;
        String strSubstring = str.substring(i10, iM21678L);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: f */
    public byte mo6922f() {
        String str;
        int i10 = this.f20528b;
        while (true) {
            str = this.f35795f;
            if (i10 == -1 || i10 >= str.length()) {
                break;
            }
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f20528b = i11;
                return AbstractC11828r.m13103i(cCharAt);
            }
            i10 = i11;
        }
        this.f20528b = str.length();
        return (byte) 10;
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: h */
    public void mo6924h(char c9) {
        int i10 = this.f20528b;
        if (i10 == -1) {
            m6916H(c9);
            throw null;
        }
        while (true) {
            String str = this.f35795f;
            if (i10 >= str.length()) {
                this.f20528b = -1;
                m6916H(c9);
                throw null;
            }
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f20528b = i11;
                if (cCharAt == c9) {
                    return;
                }
                m6916H(c9);
                throw null;
            }
            i10 = i11;
        }
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: u */
    public final CharSequence mo6936u() {
        return this.f35795f;
    }

    @Override // p372P3.AbstractC6327i
    /* JADX INFO: renamed from: x */
    public final String mo6938x(String keyToMatch, boolean z6) {
        AbstractC16544l.m18094g(keyToMatch, "keyToMatch");
        int i10 = this.f20528b;
        try {
            if (mo6922f() != 6) {
                return null;
            }
            if (!AbstractC16544l.m18089b(m6940z(z6), keyToMatch)) {
                return null;
            }
            this.f20530d = null;
            if (mo6922f() != 5) {
                return null;
            }
            return m6940z(z6);
        } finally {
            this.f20528b = i10;
            this.f20530d = null;
        }
    }
}
