package p003A1;

import android.graphics.Matrix;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;
import p774h1.AbstractC14334L;
import p774h1.C14328F;

/* JADX INFO: renamed from: A1.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0241d1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC16546n f894a;

    /* JADX INFO: renamed from: b */
    public Matrix f895b;

    /* JADX INFO: renamed from: c */
    public Matrix f896c;

    /* JADX INFO: renamed from: d */
    public float[] f897d;

    /* JADX INFO: renamed from: e */
    public float[] f898e;

    /* JADX INFO: renamed from: f */
    public boolean f899f = true;

    /* JADX INFO: renamed from: g */
    public boolean f900g = true;

    /* JADX INFO: renamed from: h */
    public boolean f901h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C0241d1(InterfaceC1439n interfaceC1439n) {
        this.f894a = (AbstractC16546n) interfaceC1439n;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m809a(Object obj) {
        float[] fArrM15602a = this.f898e;
        if (fArrM15602a == null) {
            fArrM15602a = C14328F.m15602a();
            this.f898e = fArrM15602a;
        }
        if (this.f900g) {
            this.f901h = AbstractC0240d0.m798i(m810b(obj), fArrM15602a);
            this.f900g = false;
        }
        if (this.f901h) {
            return fArrM15602a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.n, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: b */
    public final float[] m810b(Object obj) {
        float[] fArrM15602a = this.f897d;
        if (fArrM15602a == null) {
            fArrM15602a = C14328F.m15602a();
            this.f897d = fArrM15602a;
        }
        if (!this.f899f) {
            return fArrM15602a;
        }
        Matrix matrix = this.f895b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f895b = matrix;
        }
        this.f894a.invoke(obj, matrix);
        Matrix matrix2 = this.f896c;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            AbstractC14334L.m15612A(matrix, fArrM15602a);
            this.f895b = matrix2;
            this.f896c = matrix;
        }
        this.f899f = false;
        return fArrM15602a;
    }

    /* JADX INFO: renamed from: c */
    public final void m811c() {
        this.f899f = true;
        this.f900g = true;
    }
}
