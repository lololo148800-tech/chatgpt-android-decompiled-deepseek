package p797i1;

import cn.UfGr.EhBykzn;
import p561X.C8990d;

/* JADX INFO: renamed from: i1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C14902d {

    /* JADX INFO: renamed from: a */
    public static final float[] f46405a;

    /* JADX INFO: renamed from: b */
    public static final float[] f46406b;

    /* JADX INFO: renamed from: c */
    public static final C14915q f46407c;

    /* JADX INFO: renamed from: d */
    public static final C14915q f46408d;

    /* JADX INFO: renamed from: e */
    public static final C14915q f46409e;

    /* JADX INFO: renamed from: f */
    public static final C14915q f46410f;

    /* JADX INFO: renamed from: g */
    public static final C14915q f46411g;

    /* JADX INFO: renamed from: h */
    public static final C14915q f46412h;

    /* JADX INFO: renamed from: i */
    public static final C14915q f46413i;

    /* JADX INFO: renamed from: j */
    public static final C14915q f46414j;

    /* JADX INFO: renamed from: k */
    public static final C14915q f46415k;

    /* JADX INFO: renamed from: l */
    public static final C14915q f46416l;

    /* JADX INFO: renamed from: m */
    public static final C14915q f46417m;

    /* JADX INFO: renamed from: n */
    public static final C14915q f46418n;

    /* JADX INFO: renamed from: o */
    public static final C14915q f46419o;

    /* JADX INFO: renamed from: p */
    public static final C14915q f46420p;

    /* JADX INFO: renamed from: q */
    public static final C14909k f46421q;

    /* JADX INFO: renamed from: r */
    public static final C14909k f46422r;

    /* JADX INFO: renamed from: s */
    public static final C14915q f46423s;

    /* JADX INFO: renamed from: t */
    public static final C14910l f46424t;

    /* JADX INFO: renamed from: u */
    public static final AbstractC14901c[] f46425u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f46405a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f46406b = fArr2;
        C14916r c14916r = new C14916r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C14916r c14916r2 = new C14916r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C14917s c14917s = AbstractC14908j.f46437d;
        C14915q c14915q = new C14915q("sRGB IEC61966-2.1", fArr, c14917s, c14916r, 0);
        f46407c = c14915q;
        C14915q c14915q2 = new C14915q(EhBykzn.ixOq, fArr, c14917s, 1.0d, 0.0f, 1.0f, 1);
        f46408d = c14915q2;
        C14915q c14915q3 = new C14915q("scRGB-nl IEC 61966-2-2:2003", fArr, c14917s, null, new C8990d(9), new C8990d(10), -0.799f, 2.399f, c14916r, 2);
        f46409e = c14915q3;
        C14915q c14915q4 = new C14915q("scRGB IEC 61966-2-2:2003", fArr, c14917s, 1.0d, -0.5f, 7.499f, 3);
        f46410f = c14915q4;
        C14915q c14915q5 = new C14915q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c14917s, new C14916r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f46411g = c14915q5;
        C14915q c14915q6 = new C14915q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c14917s, new C14916r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f46412h = c14915q6;
        C14915q c14915q7 = new C14915q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C14917s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f46413i = c14915q7;
        C14915q c14915q8 = new C14915q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c14917s, c14916r, 7);
        f46414j = c14915q8;
        C14915q c14915q9 = new C14915q("NTSC (1953)", fArr2, AbstractC14908j.f46434a, new C14916r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f46415k = c14915q9;
        C14915q c14915q10 = new C14915q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c14917s, new C14916r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f46416l = c14915q10;
        C14915q c14915q11 = new C14915q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c14917s, 2.2d, 0.0f, 1.0f, 10);
        f46417m = c14915q11;
        C14915q c14915q12 = new C14915q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC14908j.f46435b, new C14916r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f46418n = c14915q12;
        C14917s c14917s2 = AbstractC14908j.f46436c;
        C14915q c14915q13 = new C14915q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c14917s2, 1.0d, -65504.0f, 65504.0f, 12);
        f46419o = c14915q13;
        C14915q c14915q14 = new C14915q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c14917s2, 1.0d, -65504.0f, 65504.0f, 13);
        f46420p = c14915q14;
        C14909k c14909k = new C14909k(AbstractC14900b.f46398b, "Generic XYZ", 14, 1);
        f46421q = c14909k;
        long j10 = AbstractC14900b.f46399c;
        C14909k c14909k2 = new C14909k(j10, "Generic L*a*b*", 15, 0);
        f46422r = c14909k2;
        C14915q c14915q15 = new C14915q("None", fArr, c14917s, c14916r2, 16);
        f46423s = c14915q15;
        C14910l c14910l = new C14910l(j10, "Oklab", 17);
        f46424t = c14910l;
        f46425u = new AbstractC14901c[]{c14915q, c14915q2, c14915q3, c14915q4, c14915q5, c14915q6, c14915q7, c14915q8, c14915q9, c14915q10, c14915q11, c14915q12, c14915q13, c14915q14, c14909k, c14909k2, c14915q15, c14910l};
    }
}
