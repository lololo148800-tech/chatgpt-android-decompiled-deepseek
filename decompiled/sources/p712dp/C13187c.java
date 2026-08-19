package p712dp;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17335b;
import mo.C17349p;
import no.AbstractC17708b;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p438Ro.InterfaceC6969a;
import p571X9.AbstractC9100A3;
import p571X9.AbstractC9306j0;
import p607Yo.C10119h;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: dp.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C13187c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41843a;

    /* JADX INFO: renamed from: b */
    public int f41844b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f41845c;

    /* JADX INFO: renamed from: d */
    public ArrayList f41846d;

    /* JADX INFO: renamed from: e */
    public Serializable f41847e;

    /* JADX INFO: renamed from: f */
    public Serializable f41848f;

    /* JADX INFO: renamed from: g */
    public Serializable f41849g;

    /* JADX INFO: renamed from: h */
    public Serializable f41850h;

    /* JADX INFO: renamed from: i */
    public Serializable f41851i;

    public C13187c(int i10) {
        this.f41843a = i10;
        switch (i10) {
            case 1:
                this.f41848f = "";
                this.f41849g = "";
                this.f41844b = -1;
                ArrayList arrayList = new ArrayList();
                this.f41845c = arrayList;
                arrayList.add("");
                break;
            default:
                this.f41845c = new ArrayList();
                this.f41846d = new ArrayList();
                this.f41847e = new ArrayList();
                this.f41848f = new ArrayList();
                this.f41849g = new ArrayList();
                this.f41850h = new HashSet();
                this.f41851i = C10119h.f29967u;
                this.f41844b = 1;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14839a(String str) {
        m14845g(0, str.length(), str, false, false);
    }

    /* JADX INFO: renamed from: b */
    public void m14840b(String name, String str) {
        AbstractC16544l.m18094g(name, "name");
        if (this.f41846d == null) {
            this.f41846d = new ArrayList();
        }
        ArrayList arrayList = this.f41846d;
        AbstractC16544l.m18091d(arrayList);
        arrayList.add(C17335b.m18994c(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
        ArrayList arrayList2 = this.f41846d;
        AbstractC16544l.m18091d(arrayList2);
        arrayList2.add(str != null ? C17335b.m18994c(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219) : null);
    }

    /* JADX INFO: renamed from: d */
    public int m14842d() {
        int i10 = this.f41844b;
        if (i10 != -1) {
            return i10;
        }
        String str = (String) this.f41847e;
        AbstractC16544l.m18091d(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX INFO: renamed from: e */
    public void m14843e(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC6969a interfaceC6969a = (InterfaceC6969a) it.next();
            if (interfaceC6969a instanceof InterfaceC13188d) {
                ((InterfaceC13188d) interfaceC6969a).mo7540a(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0231  */
    /* JADX WARN: Code duplicated, block: B:103:0x0239 A[LOOP:4: B:103:0x0239->B:209:?, LOOP_START, PHI: r12
      0x0239: PHI (r12v7 int) = (r12v3 int), (r12v8 int) binds: [B:102:0x0237, B:209:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x023d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0249  */
    /* JADX WARN: Code duplicated, block: B:111:0x0250  */
    /* JADX WARN: Code duplicated, block: B:116:0x025c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0295  */
    /* JADX WARN: Code duplicated, block: B:129:0x029b  */
    /* JADX WARN: Code duplicated, block: B:130:0x029f  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:134:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:138:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:142:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:203:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0245 A[EDGE_INSN: B:207:0x0245->B:107:0x0245 BREAK  A[LOOP:4: B:103:0x0239->B:209:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:4:0x002a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0140  */
    /* JADX WARN: Code duplicated, block: B:76:0x014c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0151  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    /* JADX INFO: renamed from: f */
    public void m14844f(C17349p c17349p, String str) {
        int i10;
        byte b;
        byte b10;
        int i11;
        int iM19415g;
        byte bCharAt;
        String str2;
        String str3;
        String str4;
        int i12;
        int i13;
        int i14;
        int i15;
        char c9;
        int i16;
        boolean z6;
        String str5;
        int i17;
        int i18;
        char cCharAt;
        int i19;
        String str6;
        int i20;
        boolean z10;
        int i21;
        boolean z11;
        boolean z12;
        int i22;
        String str7;
        char c10;
        char cCharAt2;
        String input = str;
        AbstractC16544l.m18094g(input, "input");
        byte[] bArr = AbstractC17708b.f56536a;
        int iM19423o = AbstractC17708b.m19423o(0, str.length(), input);
        int iM19424p = AbstractC17708b.m19424p(iM19423o, str.length(), input);
        byte b11 = -1;
        if (iM19424p - iM19423o >= 2) {
            char cCharAt3 = input.charAt(iM19423o);
            char c11 = 'a';
            if ((AbstractC16544l.m18096i(cCharAt3, 97) >= 0 && AbstractC16544l.m18096i(cCharAt3, 122) <= 0) || (AbstractC16544l.m18096i(cCharAt3, 65) >= 0 && AbstractC16544l.m18096i(cCharAt3, 90) <= 0)) {
                i10 = iM19423o + 1;
                while (true) {
                    if (i10 < iM19424p) {
                        char cCharAt4 = input.charAt(i10);
                        if ((c11 > cCharAt4 || cCharAt4 >= '{') && (('A' > cCharAt4 || cCharAt4 >= '[') && !(('0' <= cCharAt4 && cCharAt4 < ':') || cCharAt4 == '+' || cCharAt4 == '-' || cCharAt4 == '.'))) {
                            if (cCharAt4 == ':') {
                                break;
                            } else {
                                break;
                            }
                        } else {
                            i10++;
                            c11 = 'a';
                        }
                    }
                    i10 = -1;
                    break;
                }
            } else {
                i10 = -1;
                break;
            }
        } else {
            i10 = -1;
            break;
        }
        String str8 = "http";
        String str9 = "https";
        String str10 = "this as java.lang.String…ing(startIndex, endIndex)";
        if (i10 != -1) {
            if (AbstractC21329w.m21733t(iM19423o, input, "https:", true)) {
                this.f41847e = "https";
                iM19423o += 6;
            } else {
                if (!AbstractC21329w.m21733t(iM19423o, input, "http:", true)) {
                    StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String strSubstring = input.substring(0, i10);
                    AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(strSubstring);
                    sb2.append('\'');
                    throw new IllegalArgumentException(sb2.toString());
                }
                this.f41847e = "http";
                iM19423o += 5;
            }
        } else {
            if (c17349p == null) {
                throw new IllegalArgumentException(AbstractC9306j0.m9889h("Expected URL scheme 'http' or 'https' but no scheme was found for ", str.length() > 6 ? AbstractC21322p.m21709q0(6, input).concat("...") : input));
            }
            this.f41847e = c17349p.f55286a;
        }
        int i23 = iM19423o;
        int i24 = 0;
        while (true) {
            b = 47;
            b10 = 92;
            if (i23 >= iM19424p || !((cCharAt2 = input.charAt(i23)) == '\\' || cCharAt2 == '/')) {
                break;
            }
            i24++;
            i23++;
        }
        ArrayList arrayList = this.f41845c;
        byte b12 = 35;
        if (i24 >= 2 || c17349p == null) {
            i11 = iM19423o + i24;
            boolean z13 = false;
            boolean z14 = false;
            while (true) {
                iM19415g = AbstractC17708b.m19415g(input, i11, iM19424p, "@/\\?#");
                if (iM19415g != iM19424p) {
                    bCharAt = input.charAt(iM19415g);
                } else {
                    bCharAt = b11;
                }
                if (bCharAt == b11 || bCharAt == b12 || bCharAt == b || bCharAt == b10 || bCharAt == 63) {
                    break;
                }
                if (bCharAt != 64) {
                    b12 = 35;
                } else {
                    if (z13) {
                        str6 = str10;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append((String) this.f41849g);
                        sb3.append("%40");
                        i20 = iM19415g;
                        sb3.append(C17335b.m18994c(str, i11, iM19415g, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240));
                        this.f41849g = sb3.toString();
                        z10 = z13;
                        i21 = 1;
                    } else {
                        int iM19414f = AbstractC17708b.m19414f(input, ':', i11, iM19415g);
                        int i25 = i11;
                        String str11 = str10;
                        boolean z15 = z13;
                        String strM18994c = C17335b.m18994c(str, i25, iM19414f, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                        if (z14) {
                            strM18994c = ((String) this.f41848f) + "%40" + strM18994c;
                        }
                        this.f41848f = strM18994c;
                        i20 = iM19415g;
                        if (iM19414f != i20) {
                            this.f41849g = C17335b.m18994c(str, iM19414f + 1, i20, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            z11 = true;
                        } else {
                            z11 = z15;
                        }
                        i21 = 1;
                        z14 = true;
                        boolean z16 = z11;
                        str6 = str11;
                        z10 = z16;
                    }
                    iM19424p = iM19424p;
                    z13 = z10;
                    str10 = str6;
                    i11 = i20 + i21;
                    str9 = str9;
                    str8 = str8;
                    b10 = 92;
                    b12 = 35;
                    b = 47;
                    b11 = -1;
                }
            }
            str2 = str10;
            str3 = str9;
            str4 = str8;
            i12 = iM19424p;
            i13 = i11;
            while (true) {
                if (i13 >= iM19415g) {
                    i14 = iM19415g;
                    break;
                }
                cCharAt = input.charAt(i13);
                if (cCharAt == '[') {
                    do {
                        i13++;
                        if (i13 < iM19415g) {
                            break;
                        }
                    } while (input.charAt(i13) != ']');
                    i19 = 1;
                } else {
                    if (cCharAt == ':') {
                        i14 = i13;
                        break;
                    }
                    i19 = 1;
                }
                i13 += i19;
            }
            i15 = i14 + 1;
            if (i15 < iM19415g) {
                this.f41850h = AbstractC9100A3.m9630d(C17335b.m18996f(input, i11, i14, false, 4));
                i16 = i14;
                try {
                    i18 = Integer.parseInt(C17335b.m18994c(str, i15, iM19415g, "", false, false, false, false, 248));
                    if (1 <= i18 || i18 >= 65536) {
                        i18 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f41844b = i18;
                if (i18 != -1) {
                    StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = input.substring(i15, iM19415g);
                    AbstractC16544l.m18093f(strSubstring2, str2);
                    sb4.append(strSubstring2);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                c9 = '\"';
                z6 = false;
            } else {
                c9 = '\"';
                i16 = i14;
                z6 = false;
                this.f41850h = AbstractC9100A3.m9630d(C17335b.m18996f(input, i11, i16, false, 4));
                str5 = (String) this.f41847e;
                AbstractC16544l.m18091d(str5);
                if (str5.equals(str4)) {
                    i17 = 80;
                } else if (str5.equals(str3)) {
                    i17 = 443;
                } else {
                    i17 = -1;
                }
                this.f41844b = i17;
            }
            if (((String) this.f41850h) != null) {
                StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = input.substring(i11, i16);
                AbstractC16544l.m18093f(strSubstring3, str2);
                sb5.append(strSubstring3);
                sb5.append(c9);
                throw new IllegalArgumentException(sb5.toString().toString());
            }
            iM19423o = iM19415g;
        } else if (AbstractC16544l.m18089b(c17349p.f55286a, (String) this.f41847e)) {
            this.f41848f = c17349p.m19024e();
            this.f41849g = c17349p.m19020a();
            this.f41850h = c17349p.f55289d;
            this.f41844b = c17349p.f55290e;
            arrayList.clear();
            arrayList.addAll(c17349p.m19022c());
            if (iM19423o == iM19424p || input.charAt(iM19423o) == '#') {
                String strM19023d = c17349p.m19023d();
                this.f41846d = strM19023d != null ? C17335b.m18997g(C17335b.m18994c(strM19023d, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
            }
            arrayList = arrayList;
            i12 = iM19424p;
            z6 = false;
        } else {
            i11 = iM19423o + i24;
            boolean z17 = false;
            boolean z18 = false;
            while (true) {
                iM19415g = AbstractC17708b.m19415g(input, i11, iM19424p, "@/\\?#");
                if (iM19415g != iM19424p) {
                    bCharAt = input.charAt(iM19415g);
                } else {
                    bCharAt = b11;
                }
                if (bCharAt == b11) {
                    break;
                } else {
                    break;
                }
            }
            str2 = str10;
            str3 = str9;
            str4 = str8;
            i12 = iM19424p;
            i13 = i11;
            while (true) {
                if (i13 >= iM19415g) {
                    i14 = iM19415g;
                    break;
                }
                cCharAt = input.charAt(i13);
                if (cCharAt == '[') {
                    do {
                        i13++;
                        if (i13 < iM19415g) {
                            break;
                            break;
                        }
                    } while (input.charAt(i13) != ']');
                    i19 = 1;
                } else {
                    if (cCharAt == ':') {
                        i14 = i13;
                        break;
                    }
                    i19 = 1;
                }
                i13 += i19;
            }
            i15 = i14 + 1;
            if (i15 < iM19415g) {
                this.f41850h = AbstractC9100A3.m9630d(C17335b.m18996f(input, i11, i14, false, 4));
                i16 = i14;
                i18 = Integer.parseInt(C17335b.m18994c(str, i15, iM19415g, "", false, false, false, false, 248));
                if (1 <= i18) {
                    i18 = -1;
                } else {
                    i18 = -1;
                }
                this.f41844b = i18;
                if (i18 != -1) {
                    StringBuilder sb6 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring4 = input.substring(i15, iM19415g);
                    AbstractC16544l.m18093f(strSubstring4, str2);
                    sb6.append(strSubstring4);
                    sb6.append('\"');
                    throw new IllegalArgumentException(sb6.toString().toString());
                }
                c9 = '\"';
                z6 = false;
            } else {
                c9 = '\"';
                i16 = i14;
                z6 = false;
                this.f41850h = AbstractC9100A3.m9630d(C17335b.m18996f(input, i11, i16, false, 4));
                str5 = (String) this.f41847e;
                AbstractC16544l.m18091d(str5);
                if (str5.equals(str4)) {
                    i17 = 80;
                } else if (str5.equals(str3)) {
                    i17 = 443;
                } else {
                    i17 = -1;
                }
                this.f41844b = i17;
            }
            if (((String) this.f41850h) != null) {
                StringBuilder sb7 = new StringBuilder("Invalid URL host: \"");
                String strSubstring5 = input.substring(i11, i16);
                AbstractC16544l.m18093f(strSubstring5, str2);
                sb7.append(strSubstring5);
                sb7.append(c9);
                throw new IllegalArgumentException(sb7.toString().toString());
            }
            iM19423o = iM19415g;
        }
        int iM19415g2 = AbstractC17708b.m19415g(input, iM19423o, i12, "?#");
        if (iM19423o == iM19415g2) {
            i22 = i12;
            str7 = input;
            c10 = '#';
        } else {
            char cCharAt5 = input.charAt(iM19423o);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                ArrayList arrayList2 = arrayList;
                z12 = true;
                arrayList2.clear();
                arrayList2.add("");
                iM19423o++;
            } else {
                z12 = true;
                arrayList.set(arrayList.size() - 1, "");
            }
            int i26 = iM19423o;
            while (i26 < iM19415g2) {
                int iM19415g3 = AbstractC17708b.m19415g(input, i26, iM19415g2, "/\\");
                boolean z19 = iM19415g3 < iM19415g2 ? z12 : z6;
                int i27 = i12;
                boolean z20 = z12;
                String str12 = input;
                m14845g(i26, iM19415g3, str, z19, true);
                i26 = z19 ? iM19415g3 + 1 : iM19415g3;
                input = str12;
                i12 = i27;
                z12 = z20;
            }
            i22 = i12;
            str7 = input;
            c10 = '#';
        }
        if (iM19415g2 < i22 && str7.charAt(iM19415g2) == '?') {
            int iM19414f2 = AbstractC17708b.m19414f(str7, c10, iM19415g2, i22);
            this.f41846d = C17335b.m18997g(C17335b.m18994c(str, iM19415g2 + 1, iM19414f2, " \"'<>#", true, false, true, false, 208));
            iM19415g2 = iM19414f2;
        }
        if (iM19415g2 >= i22 || str7.charAt(iM19415g2) != c10) {
            return;
        }
        this.f41851i = C17335b.m18994c(str, iM19415g2 + 1, i22, "", true, false, false, true, 176);
    }

    /* JADX INFO: renamed from: g */
    public void m14845g(int i10, int i11, String str, boolean z6, boolean z10) {
        String strM18994c = C17335b.m18994c(str, i10, i11, " \"<>^`{}|/\\?#", z10, false, false, false, 240);
        if (strM18994c.equals(Separators.DOT) || strM18994c.equalsIgnoreCase("%2e")) {
            return;
        }
        boolean zEquals = strM18994c.equals("..");
        ArrayList arrayList = this.f41845c;
        if (zEquals || strM18994c.equalsIgnoreCase("%2e.") || strM18994c.equalsIgnoreCase(".%2e") || strM18994c.equalsIgnoreCase("%2e%2e")) {
            if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                arrayList.add("");
                return;
            } else {
                arrayList.set(arrayList.size() - 1, "");
                return;
            }
        }
        if (((CharSequence) AbstractC17792x.m19532o(1, arrayList)).length() == 0) {
            arrayList.set(arrayList.size() - 1, strM18994c);
        } else {
            arrayList.add(strM18994c);
        }
        if (z6) {
            arrayList.add("");
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    public String toString() {
        switch (this.f41843a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                String str = (String) this.f41847e;
                if (str != null) {
                    sb2.append(str);
                    sb2.append("://");
                } else {
                    sb2.append("//");
                }
                if (((String) this.f41848f).length() > 0 || ((String) this.f41849g).length() > 0) {
                    sb2.append((String) this.f41848f);
                    if (((String) this.f41849g).length() > 0) {
                        sb2.append(':');
                        sb2.append((String) this.f41849g);
                    }
                    sb2.append('@');
                }
                String str2 = (String) this.f41850h;
                if (str2 != null) {
                    if (AbstractC21322p.m21668B(str2, ':')) {
                        sb2.append('[');
                        sb2.append((String) this.f41850h);
                        sb2.append(']');
                    } else {
                        sb2.append((String) this.f41850h);
                    }
                }
                int i10 = -1;
                if (this.f41844b != -1 || ((String) this.f41847e) != null) {
                    int iM14842d = m14842d();
                    String str3 = (String) this.f41847e;
                    if (str3 == null) {
                        sb2.append(':');
                        sb2.append(iM14842d);
                    } else {
                        if (str3.equals("http")) {
                            i10 = 80;
                        } else if (str3.equals("https")) {
                            i10 = 443;
                        }
                        if (iM14842d != i10) {
                            sb2.append(':');
                            sb2.append(iM14842d);
                        }
                    }
                }
                ArrayList arrayList = this.f41845c;
                AbstractC16544l.m18094g(arrayList, "<this>");
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    sb2.append('/');
                    sb2.append((String) arrayList.get(i11));
                }
                if (this.f41846d != null) {
                    sb2.append('?');
                    ArrayList arrayList2 = this.f41846d;
                    AbstractC16544l.m18091d(arrayList2);
                    C17335b.m18998h(arrayList2, sb2);
                }
                if (((String) this.f41851i) != null) {
                    sb2.append('#');
                    sb2.append((String) this.f41851i);
                }
                String string = sb2.toString();
                AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: c */
    public C17349p m14841c() {
        ArrayList arrayList;
        String str = (String) this.f41847e;
        if (str == null) {
            throw new IllegalStateException(tpXhEMGxfXFVSh.xjCjzzUloEpGDm);
        }
        String strM18996f = C17335b.m18996f((String) this.f41848f, 0, 0, false, 7);
        String strM18996f2 = C17335b.m18996f((String) this.f41849g, 0, 0, false, 7);
        String str2 = (String) this.f41850h;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iM14842d = m14842d();
        ArrayList arrayList2 = this.f41845c;
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C17335b.m18996f((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = this.f41846d;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC17682p.m19389r(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? C17335b.m18996f(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f41851i;
        return new C17349p(str, strM18996f, strM18996f2, str2, iM14842d, arrayList3, arrayList, str4 != null ? C17335b.m18996f(str4, 0, 0, false, 7) : null, toString());
    }
}
