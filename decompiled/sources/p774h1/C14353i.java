package p774h1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC16544l;
import p759g1.C13800b;
import p759g1.C13801c;

/* JADX INFO: renamed from: h1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C14353i implements InterfaceC14333K {

    /* JADX INFO: renamed from: a */
    public final Path f45039a;

    /* JADX INFO: renamed from: b */
    public RectF f45040b;

    /* JADX INFO: renamed from: c */
    public float[] f45041c;

    /* JADX INFO: renamed from: d */
    public Matrix f45042d;

    public C14353i(Path path) {
        this.f45039a = path;
    }

    /* JADX INFO: renamed from: a */
    public final C13801c m15729a() {
        if (this.f45040b == null) {
            this.f45040b = new RectF();
        }
        RectF rectF = this.f45040b;
        AbstractC16544l.m18091d(rectF);
        this.f45039a.computeBounds(rectF, true);
        return new C13801c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: b */
    public final void m15730b(float f10, float f11) {
        this.f45039a.lineTo(f10, f11);
    }

    /* JADX INFO: renamed from: c */
    public final void m15731c(float f10, float f11) {
        this.f45039a.moveTo(f10, f11);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15732d(InterfaceC14333K interfaceC14333K, InterfaceC14333K interfaceC14333K2, int i10) {
        Path.Op op2;
        if (i10 == 0) {
            op2 = Path.Op.DIFFERENCE;
        } else if (i10 == 1) {
            op2 = Path.Op.INTERSECT;
        } else if (i10 == 4) {
            op2 = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op2 = i10 == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(interfaceC14333K instanceof C14353i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C14353i) interfaceC14333K).f45039a;
        if (interfaceC14333K2 instanceof C14353i) {
            return this.f45039a.op(path, ((C14353i) interfaceC14333K2).f45039a, op2);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* JADX INFO: renamed from: e */
    public final void m15733e() {
        this.f45039a.reset();
    }

    /* JADX INFO: renamed from: f */
    public final void m15734f(int i10) {
        this.f45039a.setFillType(i10 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    /* JADX INFO: renamed from: g */
    public final void m15735g(long j10) {
        Matrix matrix = this.f45042d;
        if (matrix == null) {
            this.f45042d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.f45042d;
        AbstractC16544l.m18091d(matrix2);
        matrix2.setTranslate(C13800b.m15306g(j10), C13800b.m15307h(j10));
        Matrix matrix3 = this.f45042d;
        AbstractC16544l.m18091d(matrix3);
        this.f45039a.transform(matrix3);
    }
}
