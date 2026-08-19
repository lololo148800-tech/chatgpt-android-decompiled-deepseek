package p817j$.time.format;

import android.gov.nist.core.Separators;
import livekit.org.webrtc.WebrtcBuildVersion;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.DateTimeException;
import p817j$.time.temporal.EnumC15621a;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.format.l */
/* JADX INFO: loaded from: classes4.dex */
final class C15592l implements InterfaceC15586f {

    /* JADX INFO: renamed from: d */
    static final String[] f48677d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e */
    static final C15592l f48678e = new C15592l("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: f */
    static final C15592l f48679f = new C15592l("+HH:MM:ss", WebrtcBuildVersion.maint_version);

    /* JADX INFO: renamed from: a */
    private final String f48680a;

    /* JADX INFO: renamed from: b */
    private final int f48681b;

    /* JADX INFO: renamed from: c */
    private final int f48682c;

    C15592l(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        int i10 = 0;
        while (true) {
            String[] strArr = f48677d;
            if (i10 < strArr.length) {
                if (strArr[i10].equals(str)) {
                    this.f48681b = i10;
                    this.f48682c = i10 % 11;
                    this.f48680a = str2;
                    return;
                }
                i10++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
            }
        }
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: m */
    public final boolean mo17053m(C15605y c15605y, StringBuilder sb2) {
        Long lM17105e = c15605y.m17105e(EnumC15621a.OFFSET_SECONDS);
        boolean z6 = false;
        if (lM17105e == null) {
            return false;
        }
        int iM16744h = AbstractC15529a.m16744h(lM17105e.longValue());
        String str = this.f48680a;
        if (iM16744h == 0) {
            sb2.append(str);
        } else {
            int iAbs = Math.abs((iM16744h / 3600) % 100);
            int iAbs2 = Math.abs((iM16744h / 60) % 60);
            int iAbs3 = Math.abs(iM16744h % 60);
            int length = sb2.length();
            sb2.append(iM16744h < 0 ? "-" : "+");
            if (this.f48681b < 11 || iAbs >= 10) {
                m17065a(false, iAbs, sb2);
            } else {
                sb2.append((char) (iAbs + 48));
            }
            int i10 = this.f48682c;
            if ((i10 >= 3 && i10 <= 8) || ((i10 >= 9 && iAbs3 > 0) || (i10 >= 1 && iAbs2 > 0))) {
                m17065a(i10 > 0 && i10 % 2 == 0, iAbs2, sb2);
                iAbs += iAbs2;
                if (i10 == 7 || i10 == 8 || (i10 >= 5 && iAbs3 > 0)) {
                    if (i10 > 0 && i10 % 2 == 0) {
                        z6 = true;
                    }
                    m17065a(z6, iAbs3, sb2);
                    iAbs += iAbs3;
                }
            }
            if (iAbs == 0) {
                sb2.setLength(length);
                sb2.append(str);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static void m17065a(boolean z6, int i10, StringBuilder sb2) {
        sb2.append(z6 ? ":" : "");
        sb2.append((char) ((i10 / 10) + 48));
        sb2.append((char) ((i10 % 10) + 48));
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: o */
    public final int mo17054o(C15603w c15603w, CharSequence charSequence, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int length = charSequence.length();
        int length2 = this.f48680a.length();
        if (length2 != 0) {
            if (i10 == length) {
                return ~i10;
            }
            if (c15603w.m17099s(charSequence, i10, this.f48680a, 0, length2)) {
                return c15603w.m17095o(EnumC15621a.OFFSET_SECONDS, 0L, i10, i10 + length2);
            }
        } else if (i10 == length) {
            return c15603w.m17095o(EnumC15621a.OFFSET_SECONDS, 0L, i10, i10);
        }
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == '+' || cCharAt == '-') {
            int i15 = cCharAt == '-' ? -1 : 1;
            int i16 = this.f48682c;
            boolean z6 = i16 > 0 && i16 % 2 == 0;
            int i17 = this.f48681b;
            boolean z10 = i17 < 11;
            int[] iArr = new int[4];
            iArr[0] = i10 + 1;
            if (!c15603w.m17092l()) {
                if (z10) {
                    if (z6 || (i17 == 0 && length > (i14 = i10 + 3) && charSequence.charAt(i14) == ':')) {
                        i17 = 10;
                        z6 = true;
                    } else {
                        i17 = 9;
                    }
                } else if (z6 || (i17 == 11 && length > (i13 = i10 + 3) && (charSequence.charAt(i10 + 2) == ':' || charSequence.charAt(i13) == ':'))) {
                    i17 = 21;
                    z6 = true;
                } else {
                    i17 = 20;
                }
            }
            switch (i17) {
                case 0:
                case 11:
                    m17067c(charSequence, z10, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    m17067c(charSequence, z10, iArr);
                    m17068d(charSequence, z6, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    m17067c(charSequence, z10, iArr);
                    m17068d(charSequence, z6, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    m17067c(charSequence, z10, iArr);
                    m17068d(charSequence, z6, true, iArr);
                    m17066b(charSequence, z6, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    m17067c(charSequence, z10, iArr);
                    m17068d(charSequence, z6, true, iArr);
                    if (!m17066b(charSequence, z6, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    m17067c(charSequence, z10, iArr);
                    if (m17066b(charSequence, z6, 2, iArr)) {
                        m17066b(charSequence, z6, 3, iArr);
                    }
                    break;
                case 12:
                    m17069e(charSequence, 1, 4, iArr);
                    break;
                case 14:
                    m17069e(charSequence, 3, 4, iArr);
                    break;
                case 16:
                    m17069e(charSequence, 3, 6, iArr);
                    break;
                case 18:
                    m17069e(charSequence, 5, 6, iArr);
                    break;
                case 20:
                    m17069e(charSequence, 1, 6, iArr);
                    break;
            }
            int i18 = iArr[0];
            if (i18 > 0) {
                int i19 = iArr[1];
                if (i19 > 23 || (i11 = iArr[2]) > 59 || (i12 = iArr[3]) > 59) {
                    throw new DateTimeException("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return c15603w.m17095o(EnumC15621a.OFFSET_SECONDS, ((((long) i11) * 60) + (((long) i19) * 3600) + ((long) i12)) * ((long) i15), i10, i18);
            }
        }
        return length2 == 0 ? c15603w.m17095o(EnumC15621a.OFFSET_SECONDS, 0L, i10, i10) : ~i10;
    }

    /* JADX INFO: renamed from: c */
    private static void m17067c(CharSequence charSequence, boolean z6, int[] iArr) {
        if (z6) {
            if (m17066b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        m17069e(charSequence, 1, 2, iArr);
    }

    /* JADX INFO: renamed from: d */
    private static void m17068d(CharSequence charSequence, boolean z6, boolean z10, int[] iArr) {
        if (m17066b(charSequence, z6, 2, iArr) || !z10) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    /* JADX INFO: renamed from: b */
    private static boolean m17066b(CharSequence charSequence, boolean z6, int i10, int[] iArr) {
        int i11 = iArr[0];
        if (i11 < 0) {
            return true;
        }
        if (z6 && i10 != 1) {
            int i12 = i11 + 1;
            if (i12 > charSequence.length() || charSequence.charAt(i11) != ':') {
                return false;
            }
            i11 = i12;
        }
        int i13 = i11 + 2;
        if (i13 > charSequence.length()) {
            return false;
        }
        int i14 = i11 + 1;
        char cCharAt = charSequence.charAt(i11);
        char cCharAt2 = charSequence.charAt(i14);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            int i15 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
            if (i15 >= 0 && i15 <= 59) {
                iArr[i10] = i15;
                iArr[0] = i13;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    private static void m17069e(CharSequence charSequence, int i10, int i11, int[] iArr) {
        int i12;
        char cCharAt;
        int i13 = iArr[0];
        char[] cArr = new char[i11];
        int i14 = 0;
        int i15 = 0;
        while (i14 < i11 && (i12 = i13 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i13)) >= '0' && cCharAt <= '9') {
            cArr[i14] = cCharAt;
            i15++;
            i14++;
            i13 = i12;
        }
        if (i15 < i10) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i15) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i13;
    }

    public final String toString() {
        String strReplace = this.f48680a.replace(Separators.QUOTE, "''");
        return "Offset(" + f48677d[this.f48681b] + ",'" + strReplace + "')";
    }
}
