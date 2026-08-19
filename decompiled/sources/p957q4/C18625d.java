package p957q4;

import android.gov.nist.core.Separators;
import android.graphics.Color;
import p003A1.AbstractC0168G;
import p1073w3.AbstractC20800b;
import p523V9.AbstractC8135l5;

/* JADX INFO: renamed from: q4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C18625d {

    /* JADX INFO: renamed from: a */
    public final String f59336a;

    /* JADX INFO: renamed from: b */
    public final int f59337b;

    /* JADX INFO: renamed from: c */
    public final Integer f59338c;

    /* JADX INFO: renamed from: d */
    public final Integer f59339d;

    /* JADX INFO: renamed from: e */
    public final float f59340e;

    /* JADX INFO: renamed from: f */
    public final boolean f59341f;

    /* JADX INFO: renamed from: g */
    public final boolean f59342g;

    /* JADX INFO: renamed from: h */
    public final boolean f59343h;

    /* JADX INFO: renamed from: i */
    public final boolean f59344i;

    /* JADX INFO: renamed from: j */
    public final int f59345j;

    public C18625d(String str, int i10, Integer num, Integer num2, float f10, boolean z6, boolean z10, boolean z11, boolean z12, int i11) {
        this.f59336a = str;
        this.f59337b = i10;
        this.f59338c = num;
        this.f59339d = num2;
        this.f59340e = f10;
        this.f59341f = z6;
        this.f59342g = z10;
        this.f59343h = z11;
        this.f59344i = z12;
        this.f59345j = i11;
    }

    /* JADX INFO: renamed from: a */
    public static int m19981a(String str) {
        boolean z6;
        try {
            int i10 = Integer.parseInt(str.trim());
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z6 = true;
                    break;
                default:
                    z6 = false;
                    break;
            }
            if (z6) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC0168G.m508C("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m19982b(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            AbstractC20800b.m21333u("SsaStyle", "Failed to parse boolean value: '" + str + Separators.QUOTE, e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Integer m19983c(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC20800b.m21316d(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC8135l5.m8655c(((j10 >> 24) & 255) ^ 255), AbstractC8135l5.m8655c(j10 & 255), AbstractC8135l5.m8655c((j10 >> 8) & 255), AbstractC8135l5.m8655c((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            AbstractC20800b.m21333u("SsaStyle", "Failed to parse color expression: '" + str + Separators.QUOTE, e10);
            return null;
        }
    }
}
