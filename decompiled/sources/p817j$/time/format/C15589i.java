package p817j$.time.format;

import android.gov.nist.core.Separators;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.temporal.EnumC15621a;

/* JADX INFO: renamed from: j$.time.format.i */
/* JADX INFO: loaded from: classes4.dex */
final class C15589i implements InterfaceC15586f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48666a;

    /* JADX INFO: renamed from: b */
    private final Object f48667b;

    public /* synthetic */ C15589i(int i10, Object obj) {
        this.f48666a = i10;
        this.f48667b = obj;
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: m */
    public final boolean mo17053m(C15605y c15605y, StringBuilder sb2) {
        switch (this.f48666a) {
            case 0:
                Long lM17105e = c15605y.m17105e(EnumC15621a.OFFSET_SECONDS);
                if (lM17105e == null) {
                    return false;
                }
                sb2.append("GMT");
                int iM16744h = AbstractC15529a.m16744h(lM17105e.longValue());
                if (iM16744h != 0) {
                    int iAbs = Math.abs((iM16744h / 3600) % 100);
                    int iAbs2 = Math.abs((iM16744h / 60) % 60);
                    int iAbs3 = Math.abs(iM16744h % 60);
                    sb2.append(iM16744h < 0 ? "-" : "+");
                    if (((TextStyle) this.f48667b) == TextStyle.FULL) {
                        m17059a(sb2, iAbs);
                        sb2.append(':');
                        m17059a(sb2, iAbs2);
                        if (iAbs3 != 0) {
                            sb2.append(':');
                            m17059a(sb2, iAbs3);
                        }
                    } else {
                        if (iAbs >= 10) {
                            sb2.append((char) ((iAbs / 10) + 48));
                        }
                        sb2.append((char) ((iAbs % 10) + 48));
                        if (iAbs2 != 0 || iAbs3 != 0) {
                            sb2.append(':');
                            m17059a(sb2, iAbs2);
                            if (iAbs3 != 0) {
                                sb2.append(':');
                                m17059a(sb2, iAbs3);
                            }
                        }
                    }
                }
                return true;
            default:
                sb2.append((String) this.f48667b);
                return true;
        }
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: o */
    public final int mo17054o(C15603w c15603w, CharSequence charSequence, int i10) {
        int i11;
        int iM17060b;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f48666a) {
            case 0:
                int length = charSequence.length();
                if (c15603w.m17099s(charSequence, i10, "GMT", 0, 3)) {
                    int i16 = i10 + 3;
                    if (i16 == length) {
                        return c15603w.m17095o(EnumC15621a.OFFSET_SECONDS, 0L, i10, i16);
                    }
                    char cCharAt = charSequence.charAt(i16);
                    if (cCharAt == '+') {
                        i11 = 1;
                    } else {
                        if (cCharAt != '-') {
                            return c15603w.m17095o(EnumC15621a.OFFSET_SECONDS, 0L, i10, i16);
                        }
                        i11 = -1;
                    }
                    int i17 = i10 + 4;
                    int i18 = 0;
                    if (((TextStyle) this.f48667b) == TextStyle.FULL) {
                        int iM17060b2 = m17060b(charSequence, i17);
                        int i19 = i10 + 6;
                        int iM17060b3 = m17060b(charSequence, i10 + 5);
                        if (iM17060b2 >= 0 && iM17060b3 >= 0) {
                            int i20 = i10 + 7;
                            if (charSequence.charAt(i19) == ':') {
                                iM17060b = (iM17060b2 * 10) + iM17060b3;
                                int iM17060b4 = m17060b(charSequence, i20);
                                i15 = i10 + 9;
                                int iM17060b5 = m17060b(charSequence, i10 + 8);
                                if (iM17060b4 >= 0 && iM17060b5 >= 0) {
                                    i14 = (iM17060b4 * 10) + iM17060b5;
                                    int i21 = i10 + 11;
                                    if (i21 < length && charSequence.charAt(i15) == ':') {
                                        int iM17060b6 = m17060b(charSequence, i10 + 10);
                                        int iM17060b7 = m17060b(charSequence, i21);
                                        if (iM17060b6 >= 0 && iM17060b7 >= 0) {
                                            i18 = (iM17060b6 * 10) + iM17060b7;
                                            i15 = i10 + 12;
                                        }
                                    }
                                    i12 = i18;
                                    i13 = i15;
                                }
                            }
                        }
                    } else {
                        int i22 = i10 + 5;
                        iM17060b = m17060b(charSequence, i17);
                        if (iM17060b >= 0) {
                            if (i22 < length) {
                                int iM17060b8 = m17060b(charSequence, i22);
                                if (iM17060b8 >= 0) {
                                    iM17060b = (iM17060b * 10) + iM17060b8;
                                    i22 = i10 + 6;
                                }
                                int i23 = i22 + 2;
                                if (i23 < length && charSequence.charAt(i22) == ':' && i23 < length && charSequence.charAt(i22) == ':') {
                                    int iM17060b9 = m17060b(charSequence, i22 + 1);
                                    int iM17060b10 = m17060b(charSequence, i23);
                                    if (iM17060b9 >= 0 && iM17060b10 >= 0) {
                                        i14 = (iM17060b9 * 10) + iM17060b10;
                                        int i24 = i22 + 3;
                                        int i25 = i22 + 5;
                                        if (i25 < length && charSequence.charAt(i24) == ':') {
                                            int iM17060b11 = m17060b(charSequence, i22 + 4);
                                            int iM17060b12 = m17060b(charSequence, i25);
                                            if (iM17060b11 >= 0 && iM17060b12 >= 0) {
                                                i18 = (iM17060b11 * 10) + iM17060b12;
                                                i15 = i22 + 6;
                                                i12 = i18;
                                                i13 = i15;
                                            }
                                        }
                                        i13 = i24;
                                        i12 = 0;
                                    }
                                    return c15603w.m17095o(EnumC15621a.OFFSET_SECONDS, ((((long) i18) * 60) + (((long) iM17060b) * 3600) + ((long) i12)) * ((long) i11), i10, i13);
                                }
                            }
                            i12 = 0;
                            i13 = i22;
                            return c15603w.m17095o(EnumC15621a.OFFSET_SECONDS, ((((long) i18) * 60) + (((long) iM17060b) * 3600) + ((long) i12)) * ((long) i11), i10, i13);
                        }
                    }
                    i18 = i14;
                    return c15603w.m17095o(EnumC15621a.OFFSET_SECONDS, ((((long) i18) * 60) + (((long) iM17060b) * 3600) + ((long) i12)) * ((long) i11), i10, i13);
                }
                return ~i10;
            default:
                if (i10 > charSequence.length() || i10 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                String str = (String) this.f48667b;
                return !c15603w.m17099s(charSequence, i10, str, 0, str.length()) ? ~i10 : str.length() + i10;
        }
    }

    public final String toString() {
        switch (this.f48666a) {
            case 0:
                return "LocalizedOffset(" + ((TextStyle) this.f48667b) + Separators.RPAREN;
            default:
                return Separators.QUOTE + ((String) this.f48667b).replace(Separators.QUOTE, "''") + Separators.QUOTE;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m17059a(StringBuilder sb2, int i10) {
        sb2.append((char) ((i10 / 10) + 48));
        sb2.append((char) ((i10 % 10) + 48));
    }

    /* JADX INFO: renamed from: b */
    static int m17060b(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }
}
