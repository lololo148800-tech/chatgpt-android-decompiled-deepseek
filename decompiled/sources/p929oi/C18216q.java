package p929oi;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import bo.AbstractC11523k;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21328v;
import p1113xn.AbstractC21329w;
import p523V9.AbstractC7966P5;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: oi.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C18216q {

    /* JADX INFO: renamed from: d */
    public static final Object f58050d = AbstractC17659D.m19244f(new C17309l('{', C18211l.f58045Y), new C17309l('[', C18212m.f58046Y), new C17309l('\"', C18200a.f58029o0), new C17309l('f', C18200a.f58030p0), new C17309l('t', C18200a.f58031q0), new C17309l('n', C18200a.f58032r0), new C17309l('-', C18213n.f58047Y), new C17309l('0', C18214o.f58048Y), new C17309l('1', C18215p.f58049Y), new C17309l('2', C18203d.f58037Y), new C17309l('3', C18204e.f58038Y), new C17309l('4', C18205f.f58039Y), new C17309l('5', C18206g.f58040Y), new C17309l('6', C18207h.f58041Y), new C17309l('7', C18208i.f58042Y), new C17309l('8', C18209j.f58043Y), new C17309l('9', C18210k.f58044Y));

    /* JADX INFO: renamed from: a */
    public final String f58051a;

    /* JADX INFO: renamed from: b */
    public int f58052b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f58053c;

    public C18216q(String input) {
        AbstractC16544l.m18094g(input, "input");
        this.f58051a = input;
        this.f58053c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static final void m19721a(C18216q c18216q, String str, AbstractC16645d abstractC16645d) {
        boolean zM21734u;
        int length = str.length() + c18216q.f58052b;
        String str2 = c18216q.f58051a;
        if (length <= str2.length()) {
            String strSubstring = str2.substring(c18216q.f58052b, length);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            zM21734u = strSubstring.equals(str);
        } else {
            String strSubstring2 = str2.substring(c18216q.f58052b);
            AbstractC16544l.m18093f(strSubstring2, "substring(...)");
            zM21734u = AbstractC21329w.m21734u(str, strSubstring2, false);
        }
        if (!zM21734u) {
            throw new IllegalArgumentException("Malformed keyword in partial JSON, parity with web implementation.");
        }
        c18216q.f58052b = length;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC16645d m19722b(C18216q c18216q) {
        String str;
        int i10 = c18216q.f58052b;
        while (true) {
            int i11 = c18216q.f58052b;
            str = c18216q.f58051a;
            if (i11 >= str.length() || !AbstractC21322p.m21668B("0123456789.eE+-", str.charAt(c18216q.f58052b))) {
                break;
            }
            c18216q.f58052b++;
        }
        String strSubstring = str.substring(i10, c18216q.f58052b);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        Number numberM21736w = AbstractC21329w.m21736w(strSubstring);
        if (numberM21736w == null && (numberM21736w = AbstractC21329w.m21738y(strSubstring)) == null && (numberM21736w = AbstractC21328v.m21719f(strSubstring)) == null) {
            numberM21736w = AbstractC21328v.m21720g(strSubstring);
        }
        if (numberM21736w != null) {
            return AbstractC11523k.m12909b(numberM21736w);
        }
        if (c18216q.m19724d()) {
            throw new IllegalArgumentException("Malformed partial JSON number, parity with web implementation.");
        }
        return AbstractC11523k.m12909b(0);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: c */
    public static String m19723c(String str, boolean z6) {
        int i10;
        if (!z6) {
            return str;
        }
        Object obj = AbstractC18218s.f58056a;
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            if (str.charAt(i11) != '\\') {
                i11++;
            } else {
                if (i12 < i11) {
                    String strSubstring = str.substring(i12, i11);
                    AbstractC16544l.m18093f(strSubstring, "substring(...)");
                    sb2.append(strSubstring);
                }
                int i13 = i11 + 1;
                if (i13 >= length) {
                    sb2.append('\\');
                    break;
                }
                char cCharAt = str.charAt(i13);
                Character ch2 = (Character) AbstractC18218s.f58056a.get(Character.valueOf(cCharAt));
                if (ch2 != null) {
                    sb2.append(ch2.charValue());
                } else {
                    Integer numM21735v = null;
                    if (cCharAt == 'x') {
                        if (i11 + 3 < length) {
                            String strSubstring2 = str.substring(i11 + 2, i11 + 4);
                            AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                            numM21735v = AbstractC21329w.m21735v(16, strSubstring2);
                        }
                        if (numM21735v != null) {
                            int iIntValue = numM21735v.intValue();
                            if (iIntValue < 0 || iIntValue > 65535) {
                                throw new IllegalArgumentException(AbstractC10763a.m11048f(iIntValue, "Invalid Char code: "));
                            }
                            sb2.append((char) iIntValue);
                            i10 = i11 + 4;
                        } else {
                            sb2.append("\\x");
                        }
                        i12 = i10;
                        i11 = i12;
                    } else {
                        if (cCharAt == 'u') {
                            int i14 = i11 + 2;
                            if (i14 < length) {
                                if (str.charAt(i14) == '{') {
                                    int i15 = i11 + 3;
                                    int iM21678L = AbstractC21322p.m21678L(str, '}', i15, false, 4);
                                    if (iM21678L != -1) {
                                        String strSubstring3 = str.substring(i15, iM21678L);
                                        AbstractC16544l.m18093f(strSubstring3, "substring(...)");
                                        Integer numM21735v2 = AbstractC21329w.m21735v(16, strSubstring3);
                                        if (numM21735v2 != null && numM21735v2.intValue() < 1114111) {
                                            i13 = iM21678L + 1;
                                            numM21735v = numM21735v2;
                                        }
                                    }
                                } else {
                                    int i16 = i11 + 6;
                                    String strSubstring4 = str.substring(i14, i16);
                                    AbstractC16544l.m18093f(strSubstring4, "substring(...)");
                                    numM21735v = AbstractC21329w.m21735v(16, strSubstring4);
                                    if (numM21735v != null) {
                                        i13 = i16;
                                    }
                                }
                            }
                            if (numM21735v != null) {
                                int iIntValue2 = numM21735v.intValue();
                                if (iIntValue2 < 0 || iIntValue2 > 65535) {
                                    throw new IllegalArgumentException(AbstractC10763a.m11048f(iIntValue2, "Invalid Char code: "));
                                }
                                sb2.append((char) iIntValue2);
                            } else {
                                sb2.append("\\u");
                                i13++;
                            }
                            i12 = i13;
                        } else {
                            sb2.append("\\" + cCharAt);
                        }
                        i11 = i12;
                    }
                }
                i10 = i11 + 2;
                i12 = i10;
                i11 = i12;
            }
        }
        if (i12 < length) {
            String strSubstring5 = str.substring(i12);
            AbstractC16544l.m18093f(strSubstring5, "substring(...)");
            sb2.append(strSubstring5);
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19724d() {
        String str;
        while (true) {
            int i10 = this.f58052b;
            str = this.f58051a;
            if (i10 >= str.length() || !AbstractC7966P5.m8258f(str.charAt(this.f58052b))) {
                break;
            }
            this.f58052b++;
        }
        return this.f58052b < str.length();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: e */
    public final AbstractC16643b m19725e() {
        InterfaceC1436k interfaceC1436k;
        if (!m19724d() || (interfaceC1436k = (InterfaceC1436k) f58050d.get(Character.valueOf(this.f58051a.charAt(this.f58052b)))) == null) {
            throw new IllegalArgumentException("Malformed partial JSON, parity with web implementation.");
        }
        return (AbstractC16643b) interfaceC1436k.invoke(this);
    }

    /* JADX INFO: renamed from: f */
    public final C18217r m19726f(boolean z6) {
        int i10 = this.f58052b + 1;
        this.f58052b = i10;
        boolean z10 = false;
        while (true) {
            int i11 = this.f58052b;
            String str = this.f58051a;
            if (i11 >= str.length()) {
                String strSubstring = str.substring(i10, this.f58052b);
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                return new C18217r(m19723c(strSubstring, z10), false);
            }
            char cCharAt = str.charAt(this.f58052b);
            int i12 = this.f58052b + 1;
            this.f58052b = i12;
            if (cCharAt == '\\') {
                if (i12 == str.length() || (str.charAt(this.f58052b) == 'u' && this.f58052b + 4 >= str.length())) {
                    int i13 = this.f58052b - 1;
                    this.f58052b = str.length();
                    String strSubstring2 = str.substring(i10, i13);
                    AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                    return new C18217r(m19723c(strSubstring2, true), false);
                }
                this.f58052b++;
                z10 = true;
            } else if (cCharAt == '\"') {
                while (i12 < str.length() && AbstractC7966P5.m8258f(str.charAt(i12))) {
                    i12++;
                }
                Character chValueOf = (i12 < 0 || i12 >= str.length()) ? null : Character.valueOf(str.charAt(i12));
                if (chValueOf == null || AbstractC21322p.m21668B(",]}", chValueOf.charValue()) || (z6 && chValueOf.charValue() == ':')) {
                    String strSubstring3 = str.substring(i10, this.f58052b - 1);
                    AbstractC16544l.m18093f(strSubstring3, "substring(...)");
                    return new C18217r(m19723c(strSubstring3, z10), true);
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m19727g(char c9) {
        if (!m19724d() || this.f58051a.charAt(this.f58052b) != c9) {
            return false;
        }
        this.f58052b++;
        return true;
    }
}
