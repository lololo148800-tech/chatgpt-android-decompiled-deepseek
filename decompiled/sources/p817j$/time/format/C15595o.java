package p817j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: j$.time.format.o */
/* JADX INFO: loaded from: classes4.dex */
class C15595o {

    /* JADX INFO: renamed from: a */
    protected String f48686a;

    /* JADX INFO: renamed from: b */
    protected String f48687b;

    /* JADX INFO: renamed from: c */
    protected char f48688c;

    /* JADX INFO: renamed from: d */
    protected C15595o f48689d;

    /* JADX INFO: renamed from: e */
    protected C15595o f48690e;

    /* synthetic */ C15595o(String str, String str2, C15595o c15595o, int i10) {
        this(str, str2, c15595o);
    }

    /* JADX INFO: renamed from: c */
    protected boolean mo17070c(char c9, char c10) {
        return c9 == c10;
    }

    private C15595o(String str, String str2, C15595o c15595o) {
        this.f48686a = str;
        this.f48687b = str2;
        this.f48689d = c15595o;
        if (str.isEmpty()) {
            this.f48688c = (char) 65535;
        } else {
            this.f48688c = this.f48686a.charAt(0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static C15595o m17074f(C15603w c15603w) {
        return c15603w.m17091k() ? new C15595o("", null, null) : new C15594n("", null, null);
    }

    /* JADX INFO: renamed from: g */
    public static C15595o m17075g(Set set, C15603w c15603w) {
        C15595o c15595oM17074f = m17074f(c15603w);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c15595oM17074f.m17073b(str, str);
        }
        return c15595oM17074f;
    }

    /* JADX INFO: renamed from: a */
    public final void m17076a(String str, String str2) {
        m17073b(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public final String m17077d(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!mo17072h(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f48686a.length() + index;
        C15595o c15595o = this.f48689d;
        if (c15595o != null && length2 != length) {
            while (!mo17070c(c15595o.f48688c, charSequence.charAt(length2))) {
                c15595o = c15595o.f48690e;
                if (c15595o == null) {
                }
            }
            parsePosition.setIndex(length2);
            String strM17077d = c15595o.m17077d(charSequence, parsePosition);
            if (strM17077d != null) {
                return strM17077d;
            }
        }
        parsePosition.setIndex(length2);
        return this.f48687b;
    }

    /* JADX INFO: renamed from: e */
    protected C15595o mo17071e(String str, String str2, C15595o c15595o) {
        return new C15595o(str, str2, c15595o);
    }

    /* JADX INFO: renamed from: h */
    protected boolean mo17072h(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f48686a, i10);
        }
        int length = this.f48686a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!mo17070c(this.f48686a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m17073b(String str, String str2) {
        int i10 = 0;
        while (i10 < str.length() && i10 < this.f48686a.length() && mo17070c(str.charAt(i10), this.f48686a.charAt(i10))) {
            i10++;
        }
        if (i10 == this.f48686a.length()) {
            if (i10 < str.length()) {
                String strSubstring = str.substring(i10);
                for (C15595o c15595o = this.f48689d; c15595o != null; c15595o = c15595o.f48690e) {
                    if (mo17070c(c15595o.f48688c, strSubstring.charAt(0))) {
                        return c15595o.m17073b(strSubstring, str2);
                    }
                }
                C15595o c15595oMo17071e = mo17071e(strSubstring, str2, null);
                c15595oMo17071e.f48690e = this.f48689d;
                this.f48689d = c15595oMo17071e;
                return true;
            }
            this.f48687b = str2;
            return true;
        }
        C15595o c15595oMo17071e2 = mo17071e(this.f48686a.substring(i10), this.f48687b, this.f48689d);
        this.f48686a = str.substring(0, i10);
        this.f48689d = c15595oMo17071e2;
        if (i10 < str.length()) {
            this.f48689d.f48690e = mo17071e(str.substring(i10), str2, null);
            this.f48687b = null;
        } else {
            this.f48687b = str2;
        }
        return true;
    }
}
