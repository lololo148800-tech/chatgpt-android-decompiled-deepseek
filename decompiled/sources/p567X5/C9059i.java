package p567X5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import io.sentry.internal.debugmeta.C15384c;
import p001A.AbstractC0010F;
import p520V5.C7794w;
import p520V5.InterfaceC7763A;
import p591Y5.AbstractC9653d;
import p591Y5.C9657h;
import p591Y5.C9665p;
import p675c6.C11668c;
import p675c6.C11670e;
import p692d0.C12977p;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: X5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9059i extends AbstractC9052b {

    /* JADX INFO: renamed from: A */
    public final C9657h f27699A;

    /* JADX INFO: renamed from: B */
    public C9665p f27700B;

    /* JADX INFO: renamed from: r */
    public final String f27701r;

    /* JADX INFO: renamed from: s */
    public final boolean f27702s;

    /* JADX INFO: renamed from: t */
    public final C12977p f27703t;

    /* JADX INFO: renamed from: u */
    public final C12977p f27704u;

    /* JADX INFO: renamed from: v */
    public final RectF f27705v;

    /* JADX INFO: renamed from: w */
    public final int f27706w;

    /* JADX INFO: renamed from: x */
    public final int f27707x;

    /* JADX INFO: renamed from: y */
    public final C9657h f27708y;

    /* JADX INFO: renamed from: z */
    public final C9657h f27709z;

    /* JADX WARN: Illegal instructions before constructor call */
    public C9059i(C7794w c7794w, AbstractC13029b abstractC13029b, C11670e c11670e) {
        Paint.Join join;
        Paint.Join join2;
        int iM24h = AbstractC0010F.m24h(c11670e.f35348h);
        Paint.Cap cap = iM24h != 0 ? iM24h != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iM24h2 = AbstractC0010F.m24h(c11670e.f35349i);
        if (iM24h2 == 0) {
            join = Paint.Join.MITER;
        } else {
            if (iM24h2 != 1) {
                if (iM24h2 != 2) {
                    join2 = null;
                } else {
                    join = Paint.Join.BEVEL;
                }
                super(c7794w, abstractC13029b, cap, join2, c11670e.f35350j, c11670e.f35344d, c11670e.f35347g, c11670e.f35351k, c11670e.f35352l);
                this.f27703t = new C12977p((Object) null);
                this.f27704u = new C12977p((Object) null);
                this.f27705v = new RectF();
                this.f27701r = c11670e.f35341a;
                this.f27706w = c11670e.f35342b;
                this.f27702s = c11670e.f35353m;
                this.f27707x = (int) (c7794w.f24658Y.m8040b() / 32.0f);
                AbstractC9653d abstractC9653dMo10670p = c11670e.f35343c.mo10670p();
                this.f27708y = (C9657h) abstractC9653dMo10670p;
                abstractC9653dMo10670p.m10230a(this);
                abstractC13029b.m14772d(abstractC9653dMo10670p);
                AbstractC9653d abstractC9653dMo10670p2 = c11670e.f35345e.mo10670p();
                this.f27709z = (C9657h) abstractC9653dMo10670p2;
                abstractC9653dMo10670p2.m10230a(this);
                abstractC13029b.m14772d(abstractC9653dMo10670p2);
                AbstractC9653d abstractC9653dMo10670p3 = c11670e.f35346f.mo10670p();
                this.f27699A = (C9657h) abstractC9653dMo10670p3;
                abstractC9653dMo10670p3.m10230a(this);
                abstractC13029b.m14772d(abstractC9653dMo10670p3);
            }
            join = Paint.Join.ROUND;
        }
        join2 = join;
        super(c7794w, abstractC13029b, cap, join2, c11670e.f35350j, c11670e.f35344d, c11670e.f35347g, c11670e.f35351k, c11670e.f35352l);
        this.f27703t = new C12977p((Object) null);
        this.f27704u = new C12977p((Object) null);
        this.f27705v = new RectF();
        this.f27701r = c11670e.f35341a;
        this.f27706w = c11670e.f35342b;
        this.f27702s = c11670e.f35353m;
        this.f27707x = (int) (c7794w.f24658Y.m8040b() / 32.0f);
        AbstractC9653d abstractC9653dMo10670p4 = c11670e.f35343c.mo10670p();
        this.f27708y = (C9657h) abstractC9653dMo10670p4;
        abstractC9653dMo10670p4.m10230a(this);
        abstractC13029b.m14772d(abstractC9653dMo10670p4);
        AbstractC9653d abstractC9653dMo10670p5 = c11670e.f35345e.mo10670p();
        this.f27709z = (C9657h) abstractC9653dMo10670p5;
        abstractC9653dMo10670p5.m10230a(this);
        abstractC13029b.m14772d(abstractC9653dMo10670p5);
        AbstractC9653d abstractC9653dMo10670p6 = c11670e.f35346f.mo10670p();
        this.f27699A = (C9657h) abstractC9653dMo10670p6;
        abstractC9653dMo10670p6.m10230a(this);
        abstractC13029b.m14772d(abstractC9653dMo10670p6);
    }

    /* JADX INFO: renamed from: d */
    public final int[] m9620d(int[] iArr) {
        C9665p c9665p = this.f27700B;
        if (c9665p != null) {
            Integer[] numArr = (Integer[]) c9665p.mo10234e();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    @Override // p567X5.AbstractC9052b, p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: e */
    public final void mo9613e(Canvas canvas, Matrix matrix, int i10) {
        Shader linearGradient;
        if (this.f27702s) {
            return;
        }
        mo9612c(this.f27705v, matrix, false);
        int i11 = this.f27706w;
        C9657h c9657h = this.f27708y;
        C9657h c9657h2 = this.f27699A;
        C9657h c9657h3 = this.f27709z;
        if (i11 == 1) {
            long jM9621h = m9621h();
            C12977p c12977p = this.f27703t;
            linearGradient = (LinearGradient) c12977p.m14664d(jM9621h);
            if (linearGradient == null) {
                PointF pointF = (PointF) c9657h3.mo10234e();
                PointF pointF2 = (PointF) c9657h2.mo10234e();
                C11668c c11668c = (C11668c) c9657h.mo10234e();
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m9620d(c11668c.f35332b), c11668c.f35331a, Shader.TileMode.CLAMP);
                c12977p.m14668h(jM9621h, linearGradient);
            }
        } else {
            long jM9621h2 = m9621h();
            C12977p c12977p2 = this.f27704u;
            linearGradient = (RadialGradient) c12977p2.m14664d(jM9621h2);
            if (linearGradient == null) {
                PointF pointF3 = (PointF) c9657h3.mo10234e();
                PointF pointF4 = (PointF) c9657h2.mo10234e();
                C11668c c11668c2 = (C11668c) c9657h.mo10234e();
                int[] iArrM9620d = m9620d(c11668c2.f35332b);
                float f10 = pointF3.x;
                float f11 = pointF3.y;
                RadialGradient radialGradient = new RadialGradient(f10, f11, (float) Math.hypot(pointF4.x - f10, pointF4.y - f11), iArrM9620d, c11668c2.f35331a, Shader.TileMode.CLAMP);
                c12977p2.m14668h(jM9621h2, radialGradient);
                linearGradient = radialGradient;
            }
        }
        this.f27637i.setShader(linearGradient);
        super.mo9613e(canvas, matrix, i10);
    }

    @Override // p567X5.AbstractC9052b, p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public final void mo9614f(C15384c c15384c, Object obj) {
        super.mo9614f(c15384c, obj);
        if (obj == InterfaceC7763A.f24508G) {
            C9665p c9665p = this.f27700B;
            AbstractC13029b abstractC13029b = this.f27634f;
            if (c9665p != null) {
                abstractC13029b.m14780p(c9665p);
            }
            C9665p c9665p2 = new C9665p(c15384c, null);
            this.f27700B = c9665p2;
            c9665p2.m10230a(this);
            abstractC13029b.m14772d(this.f27700B);
        }
    }

    @Override // p567X5.InterfaceC9053c
    public final String getName() {
        return this.f27701r;
    }

    /* JADX INFO: renamed from: h */
    public final int m9621h() {
        float f10 = this.f27709z.f29085d;
        float f11 = this.f27707x;
        int iRound = Math.round(f10 * f11);
        int iRound2 = Math.round(this.f27699A.f29085d * f11);
        int iRound3 = Math.round(this.f27708y.f29085d * f11);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }
}
