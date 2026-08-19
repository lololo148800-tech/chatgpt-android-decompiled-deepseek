package p591Y5;

import android.graphics.Matrix;
import android.graphics.PointF;
import io.sentry.internal.debugmeta.C15384c;
import java.util.Collections;
import p520V5.InterfaceC7763A;
import p604Yk.C10077b;
import p660b6.C11249a;
import p660b6.C11250b;
import p660b6.C11252d;
import p660b6.InterfaceC11253e;
import p698d6.AbstractC13029b;
import p802i6.C14935a;
import p802i6.C14936b;

/* JADX INFO: renamed from: Y5.o */
/* JADX INFO: loaded from: classes.dex */
public final class C9664o {

    /* JADX INFO: renamed from: a */
    public final Matrix f29126a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Matrix f29127b;

    /* JADX INFO: renamed from: c */
    public final Matrix f29128c;

    /* JADX INFO: renamed from: d */
    public final Matrix f29129d;

    /* JADX INFO: renamed from: e */
    public final float[] f29130e;

    /* JADX INFO: renamed from: f */
    public AbstractC9653d f29131f;

    /* JADX INFO: renamed from: g */
    public AbstractC9653d f29132g;

    /* JADX INFO: renamed from: h */
    public AbstractC9653d f29133h;

    /* JADX INFO: renamed from: i */
    public AbstractC9653d f29134i;

    /* JADX INFO: renamed from: j */
    public AbstractC9653d f29135j;

    /* JADX INFO: renamed from: k */
    public C9656g f29136k;

    /* JADX INFO: renamed from: l */
    public C9656g f29137l;

    /* JADX INFO: renamed from: m */
    public AbstractC9653d f29138m;

    /* JADX INFO: renamed from: n */
    public AbstractC9653d f29139n;

    /* JADX INFO: renamed from: o */
    public final boolean f29140o;

    public C9664o(C11252d c11252d) {
        C10077b c10077b = c11252d.f34086a;
        this.f29131f = c10077b == null ? null : c10077b.mo10670p();
        InterfaceC11253e interfaceC11253e = c11252d.f34087b;
        this.f29132g = interfaceC11253e == null ? null : interfaceC11253e.mo10670p();
        C11249a c11249a = c11252d.f34088c;
        this.f29133h = c11249a == null ? null : c11249a.mo10670p();
        C11250b c11250b = c11252d.f34089d;
        this.f29134i = c11250b == null ? null : c11250b.mo10670p();
        C11250b c11250b2 = c11252d.f34091f;
        C9656g c9656gMo10670p = c11250b2 == null ? null : c11250b2.mo10670p();
        this.f29136k = c9656gMo10670p;
        this.f29140o = c11252d.f34095j;
        if (c9656gMo10670p != null) {
            this.f29127b = new Matrix();
            this.f29128c = new Matrix();
            this.f29129d = new Matrix();
            this.f29130e = new float[9];
        } else {
            this.f29127b = null;
            this.f29128c = null;
            this.f29129d = null;
            this.f29130e = null;
        }
        C11250b c11250b3 = c11252d.f34092g;
        this.f29137l = c11250b3 == null ? null : c11250b3.mo10670p();
        C11249a c11249a2 = c11252d.f34090e;
        if (c11249a2 != null) {
            this.f29135j = c11249a2.mo10670p();
        }
        C11250b c11250b4 = c11252d.f34093h;
        if (c11250b4 != null) {
            this.f29138m = c11250b4.mo10670p();
        } else {
            this.f29138m = null;
        }
        C11250b c11250b5 = c11252d.f34094i;
        if (c11250b5 != null) {
            this.f29139n = c11250b5.mo10670p();
        } else {
            this.f29139n = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10248a(AbstractC13029b abstractC13029b) {
        abstractC13029b.m14772d(this.f29135j);
        abstractC13029b.m14772d(this.f29138m);
        abstractC13029b.m14772d(this.f29139n);
        abstractC13029b.m14772d(this.f29131f);
        abstractC13029b.m14772d(this.f29132g);
        abstractC13029b.m14772d(this.f29133h);
        abstractC13029b.m14772d(this.f29134i);
        abstractC13029b.m14772d(this.f29136k);
        abstractC13029b.m14772d(this.f29137l);
    }

    /* JADX INFO: renamed from: b */
    public final void m10249b(InterfaceC9650a interfaceC9650a) {
        AbstractC9653d abstractC9653d = this.f29135j;
        if (abstractC9653d != null) {
            abstractC9653d.m10230a(interfaceC9650a);
        }
        AbstractC9653d abstractC9653d2 = this.f29138m;
        if (abstractC9653d2 != null) {
            abstractC9653d2.m10230a(interfaceC9650a);
        }
        AbstractC9653d abstractC9653d3 = this.f29139n;
        if (abstractC9653d3 != null) {
            abstractC9653d3.m10230a(interfaceC9650a);
        }
        AbstractC9653d abstractC9653d4 = this.f29131f;
        if (abstractC9653d4 != null) {
            abstractC9653d4.m10230a(interfaceC9650a);
        }
        AbstractC9653d abstractC9653d5 = this.f29132g;
        if (abstractC9653d5 != null) {
            abstractC9653d5.m10230a(interfaceC9650a);
        }
        AbstractC9653d abstractC9653d6 = this.f29133h;
        if (abstractC9653d6 != null) {
            abstractC9653d6.m10230a(interfaceC9650a);
        }
        AbstractC9653d abstractC9653d7 = this.f29134i;
        if (abstractC9653d7 != null) {
            abstractC9653d7.m10230a(interfaceC9650a);
        }
        C9656g c9656g = this.f29136k;
        if (c9656g != null) {
            c9656g.m10230a(interfaceC9650a);
        }
        C9656g c9656g2 = this.f29137l;
        if (c9656g2 != null) {
            c9656g2.m10230a(interfaceC9650a);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10250c(C15384c c15384c, Object obj) {
        if (obj == InterfaceC7763A.f24513a) {
            AbstractC9653d abstractC9653d = this.f29131f;
            if (abstractC9653d == null) {
                this.f29131f = new C9665p(c15384c, new PointF());
                return true;
            }
            abstractC9653d.m10239j(c15384c);
            return true;
        }
        if (obj == InterfaceC7763A.f24514b) {
            AbstractC9653d abstractC9653d2 = this.f29132g;
            if (abstractC9653d2 == null) {
                this.f29132g = new C9665p(c15384c, new PointF());
                return true;
            }
            abstractC9653d2.m10239j(c15384c);
            return true;
        }
        if (obj == InterfaceC7763A.f24515c) {
            AbstractC9653d abstractC9653d3 = this.f29132g;
            if (abstractC9653d3 instanceof C9662m) {
                C9662m c9662m = (C9662m) abstractC9653d3;
                C15384c c15384c2 = c9662m.f29121m;
                c9662m.f29121m = c15384c;
                return true;
            }
        }
        if (obj == InterfaceC7763A.f24516d) {
            AbstractC9653d abstractC9653d4 = this.f29132g;
            if (abstractC9653d4 instanceof C9662m) {
                C9662m c9662m2 = (C9662m) abstractC9653d4;
                C15384c c15384c3 = c9662m2.f29122n;
                c9662m2.f29122n = c15384c;
                return true;
            }
        }
        if (obj == InterfaceC7763A.f24522j) {
            AbstractC9653d abstractC9653d5 = this.f29133h;
            if (abstractC9653d5 == null) {
                this.f29133h = new C9665p(c15384c, new C14936b());
                return true;
            }
            abstractC9653d5.m10239j(c15384c);
            return true;
        }
        if (obj == InterfaceC7763A.f24523k) {
            AbstractC9653d abstractC9653d6 = this.f29134i;
            if (abstractC9653d6 == null) {
                this.f29134i = new C9665p(c15384c, Float.valueOf(0.0f));
                return true;
            }
            abstractC9653d6.m10239j(c15384c);
            return true;
        }
        if (obj == 3) {
            AbstractC9653d abstractC9653d7 = this.f29135j;
            if (abstractC9653d7 == null) {
                this.f29135j = new C9665p(c15384c, 100);
                return true;
            }
            abstractC9653d7.m10239j(c15384c);
            return true;
        }
        if (obj == InterfaceC7763A.f24536x) {
            AbstractC9653d abstractC9653d8 = this.f29138m;
            if (abstractC9653d8 == null) {
                this.f29138m = new C9665p(c15384c, Float.valueOf(100.0f));
                return true;
            }
            abstractC9653d8.m10239j(c15384c);
            return true;
        }
        if (obj == InterfaceC7763A.f24537y) {
            AbstractC9653d abstractC9653d9 = this.f29139n;
            if (abstractC9653d9 == null) {
                this.f29139n = new C9665p(c15384c, Float.valueOf(100.0f));
                return true;
            }
            abstractC9653d9.m10239j(c15384c);
            return true;
        }
        if (obj == InterfaceC7763A.f24524l) {
            if (this.f29136k == null) {
                this.f29136k = new C9656g(Collections.singletonList(new C14935a(Float.valueOf(0.0f))));
            }
            this.f29136k.m10239j(c15384c);
            return true;
        }
        if (obj != InterfaceC7763A.f24525m) {
            return false;
        }
        if (this.f29137l == null) {
            this.f29137l = new C9656g(Collections.singletonList(new C14935a(Float.valueOf(0.0f))));
        }
        this.f29137l.m10239j(c15384c);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m10251d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f29130e[i10] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Matrix m10252e() {
        PointF pointF;
        C14936b c14936b;
        PointF pointF2;
        Matrix matrix = this.f29126a;
        matrix.reset();
        AbstractC9653d abstractC9653d = this.f29132g;
        if (abstractC9653d != null && (pointF2 = (PointF) abstractC9653d.mo10234e()) != null) {
            float f10 = pointF2.x;
            if (f10 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f10, pointF2.y);
            }
        }
        if (!this.f29140o) {
            AbstractC9653d abstractC9653d2 = this.f29134i;
            if (abstractC9653d2 != null) {
                float fFloatValue = abstractC9653d2 instanceof C9665p ? ((Float) abstractC9653d2.mo10234e()).floatValue() : ((C9656g) abstractC9653d2).m10243k();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (abstractC9653d != null) {
            float f11 = abstractC9653d.f29085d;
            PointF pointF3 = (PointF) abstractC9653d.mo10234e();
            float f12 = pointF3.x;
            float f13 = pointF3.y;
            abstractC9653d.mo10238i(1.0E-4f + f11);
            PointF pointF4 = (PointF) abstractC9653d.mo10234e();
            abstractC9653d.mo10238i(f11);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f13, pointF4.x - f12)));
        }
        C9656g c9656g = this.f29136k;
        if (c9656g != null) {
            C9656g c9656g2 = this.f29137l;
            float fCos = c9656g2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-c9656g2.m10243k()) + 90.0f));
            C9656g c9656g3 = this.f29137l;
            float fSin = c9656g3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-c9656g3.m10243k()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(c9656g.m10243k()));
            m10251d();
            float[] fArr = this.f29130e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f14 = -fSin;
            fArr[3] = f14;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f29127b;
            matrix2.setValues(fArr);
            m10251d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f29128c;
            matrix3.setValues(fArr);
            m10251d();
            fArr[0] = fCos;
            fArr[1] = f14;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f29129d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        AbstractC9653d abstractC9653d3 = this.f29133h;
        if (abstractC9653d3 != null && (c14936b = (C14936b) abstractC9653d3.mo10234e()) != null) {
            float f15 = c14936b.f46540a;
            if (f15 != 1.0f || c14936b.f46541b != 1.0f) {
                matrix.preScale(f15, c14936b.f46541b);
            }
        }
        AbstractC9653d abstractC9653d4 = this.f29131f;
        if (abstractC9653d4 != null && (pointF = (PointF) abstractC9653d4.mo10234e()) != null) {
            float f16 = pointF.x;
            if (f16 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f16, -pointF.y);
            }
        }
        return matrix;
    }

    /* JADX INFO: renamed from: f */
    public final Matrix m10253f(float f10) {
        AbstractC9653d abstractC9653d = this.f29132g;
        PointF pointF = abstractC9653d == null ? null : (PointF) abstractC9653d.mo10234e();
        AbstractC9653d abstractC9653d2 = this.f29133h;
        C14936b c14936b = abstractC9653d2 == null ? null : (C14936b) abstractC9653d2.mo10234e();
        Matrix matrix = this.f29126a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        if (c14936b != null) {
            double d10 = f10;
            matrix.preScale((float) Math.pow(c14936b.f46540a, d10), (float) Math.pow(c14936b.f46541b, d10));
        }
        AbstractC9653d abstractC9653d3 = this.f29134i;
        if (abstractC9653d3 != null) {
            float fFloatValue = ((Float) abstractC9653d3.mo10234e()).floatValue();
            AbstractC9653d abstractC9653d4 = this.f29131f;
            PointF pointF2 = abstractC9653d4 != null ? (PointF) abstractC9653d4.mo10234e() : null;
            matrix.preRotate(fFloatValue * f10, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }
}
