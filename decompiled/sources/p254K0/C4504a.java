package p254K0;

/* JADX INFO: renamed from: K0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4504a {

    /* JADX INFO: renamed from: a */
    public final int f14694a;

    /* JADX INFO: renamed from: b */
    public final float f14695b;

    /* JADX INFO: renamed from: c */
    public final int f14696c;

    /* JADX INFO: renamed from: d */
    public final float f14697d;

    /* JADX INFO: renamed from: e */
    public final int f14698e;

    /* JADX INFO: renamed from: f */
    public final float f14699f;

    /* JADX INFO: renamed from: g */
    public final int f14700g;

    public C4504a(int i10, float f10, int i11, float f11, int i12, float f12, int i13) {
        this.f14694a = i10;
        this.f14695b = f10;
        this.f14696c = i11;
        this.f14697d = f11;
        this.f14698e = i12;
        this.f14699f = f12;
        this.f14700g = i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (r2 > r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r1 <= r0) goto L17;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float m5252a(C4504a c4504a, float f10) {
        float f11 = c4504a.f14695b;
        float f12 = c4504a.f14699f;
        int i10 = c4504a.f14696c;
        int i11 = c4504a.f14700g;
        if (i11 > 0 && i10 > 0 && c4504a.f14698e > 0) {
            float f13 = c4504a.f14697d;
            if (f12 > f13) {
            }
            return Float.MAX_VALUE;
        }
        if (i11 > 0) {
            if (i10 > 0) {
            }
        }
        return c4504a.f14694a * Math.abs(f10 - f12);
    }
}
