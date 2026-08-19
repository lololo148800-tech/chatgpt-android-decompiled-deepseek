package p822j2;

import java.util.Arrays;

/* JADX INFO: renamed from: j2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C16050g {

    /* JADX INFO: renamed from: a */
    public int[] f49584a;

    /* JADX INFO: renamed from: b */
    public int[] f49585b;

    /* JADX INFO: renamed from: c */
    public int f49586c;

    /* JADX INFO: renamed from: d */
    public int[] f49587d;

    /* JADX INFO: renamed from: e */
    public float[] f49588e;

    /* JADX INFO: renamed from: f */
    public int f49589f;

    /* JADX INFO: renamed from: g */
    public int[] f49590g;

    /* JADX INFO: renamed from: h */
    public String[] f49591h;

    /* JADX INFO: renamed from: i */
    public int f49592i;

    /* JADX INFO: renamed from: j */
    public int[] f49593j;

    /* JADX INFO: renamed from: k */
    public boolean[] f49594k;

    /* JADX INFO: renamed from: l */
    public int f49595l;

    /* JADX INFO: renamed from: a */
    public final void m17619a(int i10, float f10) {
        int i11 = this.f49589f;
        int[] iArr = this.f49587d;
        if (i11 >= iArr.length) {
            this.f49587d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f49588e;
            this.f49588e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f49587d;
        int i12 = this.f49589f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f49588e;
        this.f49589f = i12 + 1;
        fArr2[i12] = f10;
    }

    /* JADX INFO: renamed from: b */
    public final void m17620b(int i10, int i11) {
        int i12 = this.f49586c;
        int[] iArr = this.f49584a;
        if (i12 >= iArr.length) {
            this.f49584a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f49585b;
            this.f49585b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f49584a;
        int i13 = this.f49586c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f49585b;
        this.f49586c = i13 + 1;
        iArr4[i13] = i11;
    }

    /* JADX INFO: renamed from: c */
    public final void m17621c(int i10, String str) {
        int i11 = this.f49592i;
        int[] iArr = this.f49590g;
        if (i11 >= iArr.length) {
            this.f49590g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f49591h;
            this.f49591h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f49590g;
        int i12 = this.f49592i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f49591h;
        this.f49592i = i12 + 1;
        strArr2[i12] = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m17622d(int i10, boolean z6) {
        int i11 = this.f49595l;
        int[] iArr = this.f49593j;
        if (i11 >= iArr.length) {
            this.f49593j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f49594k;
            this.f49594k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f49593j;
        int i12 = this.f49595l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f49594k;
        this.f49595l = i12 + 1;
        zArr2[i12] = z6;
    }
}
