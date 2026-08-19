package p571X9;

import kotlin.jvm.internal.AbstractC16544l;
import mo.C17336c;
import mo.C17348o;
import no.AbstractC17708b;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p381Pe.C6397h;

/* JADX INFO: renamed from: X9.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9252a0 {
    /* JADX INFO: renamed from: a */
    public static final String m9826a(C6397h c6397h) {
        return "[id=" + c6397h.f20819a + ", parent=" + c6397h.f20820b + ", children=" + c6397h.f20821c + "]";
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x006a A[EDGE_INSN: B:133:0x006a->B:22:0x006a BREAK  A[LOOP:2: B:16:0x004c->B:20:0x005d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:2: B:16:0x004c->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:64:0x014e  */
    /* JADX WARN: Code duplicated, block: B:67:0x015c  */
    /* JADX WARN: Code duplicated, block: B:79:0x019f  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ad  */
    /* JADX INFO: renamed from: b */
    public static C17336c m9827b(C17348o c17348o) {
        int i10;
        int i11;
        int length;
        int length2;
        String string;
        String string2;
        int i12;
        C17348o headers = c17348o;
        AbstractC16544l.m18094g(headers, "headers");
        int size = c17348o.size();
        int i13 = 0;
        boolean z6 = true;
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        int iM19434z = -1;
        int iM19434z2 = -1;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        int iM19434z3 = -1;
        int iM19434z4 = -1;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        while (i13 < size) {
            String strM19014m = headers.m19014m(i13);
            String strM19018s = headers.m19018s(i13);
            if (AbstractC21329w.m21726m(strM19014m, "Cache-Control")) {
                if (str == null) {
                    str = strM19018s;
                }
                i11 = 0;
                while (i11 < strM19018s.length()) {
                    length = strM19018s.length();
                    length2 = i11;
                    while (true) {
                        if (length2 < length) {
                            size = size;
                            length2 = strM19018s.length();
                            break;
                        }
                        size = size;
                        if (AbstractC21322p.m21668B("=,;", strM19018s.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = size;
                    }
                    String strSubstring = strM19018s.substring(i11, length2);
                    AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = AbstractC21322p.m21711s0(strSubstring).toString();
                    if (length2 != strM19018s.length() || strM19018s.charAt(length2) == ',' || strM19018s.charAt(length2) == ';') {
                        z6 = z6;
                        i11 = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = AbstractC17708b.f56536a;
                        int length4 = strM19018s.length();
                        while (true) {
                            if (length3 >= length4) {
                                i12 = 1;
                                length3 = strM19018s.length();
                                break;
                            }
                            char cCharAt = strM19018s.charAt(length3);
                            int i14 = length4;
                            if (cCharAt != ' ' && cCharAt != '\t') {
                                i12 = 1;
                                break;
                            }
                            length3++;
                            length4 = i14;
                        }
                        if (length3 < strM19018s.length()) {
                            z6 = z6;
                            if (strM19018s.charAt(length3) == '\"') {
                                int i15 = length3 + i12;
                                int iM21678L = AbstractC21322p.m21678L(strM19018s, '\"', i15, false, 4);
                                string2 = strM19018s.substring(i15, iM21678L);
                                AbstractC16544l.m18093f(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                i11 = iM21678L + 1;
                            }
                        } else {
                            z6 = z6;
                        }
                        int length5 = strM19018s.length();
                        int length6 = length3;
                        while (true) {
                            if (length6 >= length5) {
                                length6 = strM19018s.length();
                                break;
                            }
                            int i16 = length5;
                            if (AbstractC21322p.m21668B(",;", strM19018s.charAt(length6))) {
                                break;
                            }
                            length6++;
                            length5 = i16;
                        }
                        String strSubstring2 = strM19018s.substring(length3, length6);
                        AbstractC16544l.m18093f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        string2 = AbstractC21322p.m21711s0(strSubstring2).toString();
                        i11 = length6;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z10 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z11 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iM19434z = AbstractC17708b.m19434z(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iM19434z2 = AbstractC17708b.m19434z(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z12 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z13 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z14 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iM19434z3 = AbstractC17708b.m19434z(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iM19434z4 = AbstractC17708b.m19434z(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z15 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z16 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z17 = true;
                    }
                }
                i10 = size;
                i13++;
                headers = c17348o;
                size = i10;
            } else {
                if (!AbstractC21329w.m21726m(strM19014m, "Pragma")) {
                    i10 = size;
                }
                i13++;
                headers = c17348o;
                size = i10;
            }
            z6 = false;
            i11 = 0;
            while (i11 < strM19018s.length()) {
                length = strM19018s.length();
                length2 = i11;
                while (true) {
                    if (length2 < length) {
                        size = size;
                        length2 = strM19018s.length();
                        break;
                    }
                    size = size;
                    if (AbstractC21322p.m21668B("=,;", strM19018s.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = size;
                }
                String strSubstring3 = strM19018s.substring(i11, length2);
                AbstractC16544l.m18093f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                string = AbstractC21322p.m21711s0(strSubstring3).toString();
                if (length2 != strM19018s.length()) {
                    z6 = z6;
                    i11 = length2 + 1;
                    string2 = null;
                } else {
                    z6 = z6;
                    i11 = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z10 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z11 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iM19434z = AbstractC17708b.m19434z(-1, string2);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iM19434z2 = AbstractC17708b.m19434z(-1, string2);
                } else if ("private".equalsIgnoreCase(string)) {
                    z12 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z13 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z14 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iM19434z3 = AbstractC17708b.m19434z(Integer.MAX_VALUE, string2);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    iM19434z4 = AbstractC17708b.m19434z(-1, string2);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z15 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z16 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z17 = true;
                }
            }
            i10 = size;
            i13++;
            headers = c17348o;
            size = i10;
        }
        return new C17336c(z10, z11, iM19434z, iM19434z2, z12, z13, z14, iM19434z3, iM19434z4, z15, z16, z17, !z6 ? null : str);
    }
}
