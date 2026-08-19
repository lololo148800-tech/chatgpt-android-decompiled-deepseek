package p594Y9;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p1113xn.AbstractC21329w;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.AbstractC17962d;
import p919o8.C17939U0;

/* JADX INFO: renamed from: Y9.g3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9894g3 {
    /* JADX INFO: renamed from: a */
    public static final String m10544a(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i10;
        if (i17 < 0 || i11 > bArr.length || i17 > i11) {
            throw new IndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i17 + " endIndex=" + i11);
        }
        char[] cArr = new char[i11 - i17];
        int i18 = 0;
        while (i17 < i11) {
            byte b = bArr[i17];
            if (b >= 0) {
                i12 = i18 + 1;
                cArr[i18] = (char) b;
                i17++;
                while (i17 < i11) {
                    byte b10 = bArr[i17];
                    if (b10 < 0) {
                        break;
                    }
                    i17++;
                    cArr[i12] = (char) b10;
                    i12++;
                }
            } else if ((b >> 5) == -2) {
                int i19 = i17 + 1;
                if (i11 <= i19) {
                    i12 = i18 + 1;
                    cArr[i18] = (char) 65533;
                } else {
                    byte b11 = bArr[i19];
                    if ((b11 & 192) == 128) {
                        int i20 = (b << 6) ^ (b11 ^ 3968);
                        if (i20 < 128) {
                            i12 = i18 + 1;
                            cArr[i18] = (char) 65533;
                        } else {
                            i12 = i18 + 1;
                            cArr[i18] = (char) i20;
                        }
                        i17 += i13;
                    } else {
                        i12 = i18 + 1;
                        cArr[i18] = (char) 65533;
                    }
                }
                i17 += i13;
            } else if ((b >> 4) == -2) {
                int i21 = i17 + 2;
                if (i11 <= i21) {
                    i12 = i18 + 1;
                    cArr[i18] = (char) 65533;
                    int i22 = i17 + 1;
                    i13 = (i11 <= i22 || (bArr[i22] & 192) != 128) ? 1 : 2;
                } else {
                    byte b12 = bArr[i17 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i21];
                        if ((b13 & 192) == 128) {
                            int i23 = (b << 12) ^ ((b13 ^ (-123008)) ^ (b12 << 6));
                            if (i23 < 2048) {
                                i12 = i18 + 1;
                                cArr[i18] = (char) 65533;
                            } else if (55296 > i23 || i23 >= 57344) {
                                i12 = i18 + 1;
                                cArr[i18] = (char) i23;
                            } else {
                                i12 = i18 + 1;
                                cArr[i18] = (char) 65533;
                            }
                            i13 = 3;
                        } else {
                            i12 = i18 + 1;
                            cArr[i18] = (char) 65533;
                        }
                    } else {
                        i12 = i18 + 1;
                        cArr[i18] = (char) 65533;
                    }
                }
                i17 += i13;
            } else {
                if ((b >> 3) == -2) {
                    int i24 = i17 + 3;
                    if (i11 <= i24) {
                        i14 = i18 + 1;
                        cArr[i18] = 65533;
                        int i25 = i17 + 1;
                        if (i11 <= i25 || (bArr[i25] & 192) != 128) {
                            i16 = 1;
                        } else {
                            int i26 = i17 + 2;
                            i16 = (i11 <= i26 || (bArr[i26] & 192) != 128) ? 2 : 3;
                        }
                    } else {
                        byte b14 = bArr[i17 + 1];
                        if ((b14 & 192) == 128) {
                            byte b15 = bArr[i17 + 2];
                            if ((b15 & 192) == 128) {
                                byte b16 = bArr[i24];
                                if ((b16 & 192) == 128) {
                                    int i27 = (b << 18) ^ (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12));
                                    if (i27 > 1114111) {
                                        i14 = i18 + 1;
                                        cArr[i18] = 65533;
                                    } else if ((55296 > i27 || i27 >= 57344) && i27 >= 65536) {
                                        if (i27 != 65533) {
                                            cArr[i18] = (char) ((i27 >>> 10) + 55232);
                                            i15 = i18 + 2;
                                            cArr[i18 + 1] = (char) ((i27 & 1023) + 56320);
                                        } else {
                                            cArr[i18] = 65533;
                                            i15 = i18 + 1;
                                        }
                                        i14 = i15;
                                    } else {
                                        i14 = i18 + 1;
                                        cArr[i18] = 65533;
                                    }
                                    i16 = 4;
                                } else {
                                    i14 = i18 + 1;
                                    cArr[i18] = 65533;
                                }
                            } else {
                                i14 = i18 + 1;
                                cArr[i18] = 65533;
                            }
                        } else {
                            i14 = i18 + 1;
                            cArr[i18] = 65533;
                            i16 = 1;
                        }
                    }
                    i17 += i16;
                } else {
                    i14 = i18 + 1;
                    cArr[i18] = 65533;
                    i17++;
                }
                i18 = i14;
            }
            i18 = i12;
        }
        return AbstractC21329w.m21721h(cArr, 0, i18);
    }

    /* JADX INFO: renamed from: b */
    public static C17939U0 m10545b(C3676s c3676s) {
        try {
            String strMo4384r = c3676s.m4395w("type").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"type\").asString");
            for (int i10 : AbstractC0010F.m27k(7)) {
                if (AbstractC17962d.m19658s(i10).equals(strMo4384r)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(DiagnosticsEntry.NAME_KEY);
                    String strMo4384r2 = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("model");
                    String strMo4384r3 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("brand");
                    String strMo4384r4 = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("architecture");
                    return new C17939U0(i10, strMo4384r2, strMo4384r3, strMo4384r4, abstractC3673pM4395w4 != null ? abstractC3673pM4395w4.mo4384r() : null);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Device", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Device", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Device", e12);
        }
    }
}
