package p1141z2;

import android.text.SpannableStringBuilder;
import p001A.C0095w0;

/* JADX INFO: renamed from: z2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21723b {

    /* JADX INFO: renamed from: b */
    public static final String f68912b;

    /* JADX INFO: renamed from: c */
    public static final String f68913c;

    /* JADX INFO: renamed from: d */
    public static final C21723b f68914d;

    /* JADX INFO: renamed from: e */
    public static final C21723b f68915e;

    /* JADX INFO: renamed from: a */
    public final boolean f68916a;

    static {
        C0095w0 c0095w0 = AbstractC21727f.f68924c;
        f68912b = Character.toString((char) 8206);
        f68913c = Character.toString((char) 8207);
        f68914d = new C21723b(false);
        f68915e = new C21723b(true);
    }

    public C21723b(boolean z6) {
        C0095w0 c0095w0 = AbstractC21727f.f68922a;
        this.f68916a = z6;
    }

    /* JADX INFO: renamed from: a */
    public static int m22232a(CharSequence charSequence) {
        byte directionality;
        C21722a c21722a = new C21722a(charSequence);
        c21722a.f68910c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = c21722a.f68910c;
            if (i13 < c21722a.f68909b && i10 == 0) {
                CharSequence charSequence2 = c21722a.f68908a;
                char cCharAt = charSequence2.charAt(i13);
                c21722a.f68911d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c21722a.f68910c);
                    c21722a.f68910c = Character.charCount(iCodePointAt) + c21722a.f68910c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c21722a.f68910c++;
                    char c9 = c21722a.f68911d;
                    directionality = c9 < 1792 ? C21722a.f68907e[c9] : Character.getDirectionality(c9);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        if (i11 != 0) {
            return i11;
        }
        while (c21722a.f68910c > 0) {
            switch (c21722a.m22231a()) {
                case 14:
                case 15:
                    if (i10 == i12) {
                        return -1;
                    }
                    i12--;
                    break;
                case 16:
                case 17:
                    if (i10 == i12) {
                        return 1;
                    }
                    i12--;
                    break;
                case 18:
                    i12++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m22233b(CharSequence charSequence) {
        C21722a c21722a = new C21722a(charSequence);
        c21722a.f68910c = c21722a.f68909b;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            while (c21722a.f68910c > 0) {
                byte bM22231a = c21722a.m22231a();
                if (bM22231a == 0) {
                    if (i10 == 0) {
                        return -1;
                    }
                    if (i11 == 0) {
                    }
                } else if (bM22231a == 1 || bM22231a == 2) {
                    if (i10 == 0) {
                        return 1;
                    }
                    if (i11 == 0) {
                    }
                } else if (bM22231a != 9) {
                    switch (bM22231a) {
                        case 14:
                        case 15:
                            if (i11 == i10) {
                                return -1;
                            }
                            i10--;
                            break;
                        case 16:
                        case 17:
                            if (i11 == i10) {
                                return 1;
                            }
                            i10--;
                            break;
                        case 18:
                            i10++;
                            break;
                        default:
                            if (i11 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public final SpannableStringBuilder m22234c(CharSequence charSequence) {
        String str;
        C0095w0 c0095w0 = AbstractC21727f.f68924c;
        if (charSequence == null) {
            return null;
        }
        boolean zM376m = c0095w0.m376m(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM376m2 = (zM376m ? AbstractC21727f.f68923b : AbstractC21727f.f68922a).m376m(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f68913c;
        String str4 = f68912b;
        boolean z6 = this.f68916a;
        if (z6 || !(zM376m2 || m22232a(charSequence) == 1)) {
            str = (!z6 || (zM376m2 && m22232a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zM376m != z6) {
            spannableStringBuilder.append(zM376m ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM376m3 = (zM376m ? AbstractC21727f.f68923b : AbstractC21727f.f68922a).m376m(charSequence.length(), charSequence);
        if (!z6 && (zM376m3 || m22233b(charSequence) == 1)) {
            str2 = str4;
        } else if (z6 && (!zM376m3 || m22233b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
