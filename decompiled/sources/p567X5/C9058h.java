package p567X5;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.List;
import p003A1.C0284r0;
import p520V5.C7781j;
import p520V5.C7794w;
import p520V5.InterfaceC7763A;
import p540W5.C8430a;
import p591Y5.AbstractC9653d;
import p591Y5.C9654e;
import p591Y5.C9655f;
import p591Y5.C9656g;
import p591Y5.C9657h;
import p591Y5.C9665p;
import p591Y5.InterfaceC9650a;
import p640a6.C10510e;
import p660b6.C11250b;
import p675c6.C11668c;
import p675c6.C11669d;
import p692d0.C12977p;
import p698d6.AbstractC13029b;
import p779h6.AbstractC14417f;
import p779h6.AbstractC14418g;

/* JADX INFO: renamed from: X5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9058h implements InterfaceC9055e, InterfaceC9650a, InterfaceC9061k {

    /* JADX INFO: renamed from: a */
    public final String f27678a;

    /* JADX INFO: renamed from: b */
    public final boolean f27679b;

    /* JADX INFO: renamed from: c */
    public final AbstractC13029b f27680c;

    /* JADX INFO: renamed from: d */
    public final C12977p f27681d = new C12977p((Object) null);

    /* JADX INFO: renamed from: e */
    public final C12977p f27682e = new C12977p((Object) null);

    /* JADX INFO: renamed from: f */
    public final Path f27683f;

    /* JADX INFO: renamed from: g */
    public final C8430a f27684g;

    /* JADX INFO: renamed from: h */
    public final RectF f27685h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f27686i;

    /* JADX INFO: renamed from: j */
    public final int f27687j;

    /* JADX INFO: renamed from: k */
    public final C9657h f27688k;

    /* JADX INFO: renamed from: l */
    public final C9654e f27689l;

    /* JADX INFO: renamed from: m */
    public final C9657h f27690m;

    /* JADX INFO: renamed from: n */
    public final C9657h f27691n;

    /* JADX INFO: renamed from: o */
    public C9665p f27692o;

    /* JADX INFO: renamed from: p */
    public C9665p f27693p;

    /* JADX INFO: renamed from: q */
    public final C7794w f27694q;

    /* JADX INFO: renamed from: r */
    public final int f27695r;

    /* JADX INFO: renamed from: s */
    public AbstractC9653d f27696s;

    /* JADX INFO: renamed from: t */
    public float f27697t;

    /* JADX INFO: renamed from: u */
    public final C9655f f27698u;

    public C9058h(C7794w c7794w, C7781j c7781j, AbstractC13029b abstractC13029b, C11669d c11669d) {
        Path path = new Path();
        this.f27683f = path;
        this.f27684g = new C8430a(1, 0);
        this.f27685h = new RectF();
        this.f27686i = new ArrayList();
        this.f27697t = 0.0f;
        this.f27680c = abstractC13029b;
        this.f27678a = c11669d.f35339g;
        this.f27679b = c11669d.f35340h;
        this.f27694q = c7794w;
        this.f27687j = c11669d.f35333a;
        path.setFillType(c11669d.f35334b);
        this.f27695r = (int) (c7781j.m8040b() / 32.0f);
        AbstractC9653d abstractC9653dMo10670p = c11669d.f35335c.mo10670p();
        this.f27688k = (C9657h) abstractC9653dMo10670p;
        abstractC9653dMo10670p.m10230a(this);
        abstractC13029b.m14772d(abstractC9653dMo10670p);
        AbstractC9653d abstractC9653dMo10670p2 = c11669d.f35336d.mo10670p();
        this.f27689l = (C9654e) abstractC9653dMo10670p2;
        abstractC9653dMo10670p2.m10230a(this);
        abstractC13029b.m14772d(abstractC9653dMo10670p2);
        AbstractC9653d abstractC9653dMo10670p3 = c11669d.f35337e.mo10670p();
        this.f27690m = (C9657h) abstractC9653dMo10670p3;
        abstractC9653dMo10670p3.m10230a(this);
        abstractC13029b.m14772d(abstractC9653dMo10670p3);
        AbstractC9653d abstractC9653dMo10670p4 = c11669d.f35338f.mo10670p();
        this.f27691n = (C9657h) abstractC9653dMo10670p4;
        abstractC9653dMo10670p4.m10230a(this);
        abstractC13029b.m14772d(abstractC9653dMo10670p4);
        if (abstractC13029b.mo14776k() != null) {
            C9656g c9656gMo10670p = ((C11250b) abstractC13029b.mo14776k().f29833Z).mo10670p();
            this.f27696s = c9656gMo10670p;
            c9656gMo10670p.m10230a(this);
            abstractC13029b.m14772d(this.f27696s);
        }
        if (abstractC13029b.mo14777l() != null) {
            this.f27698u = new C9655f(this, abstractC13029b, abstractC13029b.mo14777l());
        }
    }

    @Override // p591Y5.InterfaceC9650a
    /* JADX INFO: renamed from: a */
    public final void mo9610a() {
        this.f27694q.invalidateSelf();
    }

    @Override // p567X5.InterfaceC9053c
    /* JADX INFO: renamed from: b */
    public final void mo9611b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            InterfaceC9053c interfaceC9053c = (InterfaceC9053c) list2.get(i10);
            if (interfaceC9053c instanceof InterfaceC9063m) {
                this.f27686i.add((InterfaceC9063m) interfaceC9053c);
            }
        }
    }

    @Override // p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: c */
    public final void mo9612c(RectF rectF, Matrix matrix, boolean z6) {
        Path path = this.f27683f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27686i;
            if (i10 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((InterfaceC9063m) arrayList.get(i10)).mo9617n(), matrix);
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int[] m9618d(int[] iArr) {
        C9665p c9665p = this.f27693p;
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

    @Override // p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: e */
    public final void mo9613e(Canvas canvas, Matrix matrix, int i10) {
        Shader shader;
        if (this.f27679b) {
            return;
        }
        Path path = this.f27683f;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f27686i;
            if (i11 >= arrayList.size()) {
                break;
            }
            path.addPath(((InterfaceC9063m) arrayList.get(i11)).mo9617n(), matrix);
            i11++;
        }
        path.computeBounds(this.f27685h, false);
        int i12 = this.f27687j;
        C9657h c9657h = this.f27688k;
        C9657h c9657h2 = this.f27691n;
        C9657h c9657h3 = this.f27690m;
        if (i12 == 1) {
            long jM9619h = m9619h();
            C12977p c12977p = this.f27681d;
            shader = (LinearGradient) c12977p.m14664d(jM9619h);
            if (shader == null) {
                PointF pointF = (PointF) c9657h3.mo10234e();
                PointF pointF2 = (PointF) c9657h2.mo10234e();
                C11668c c11668c = (C11668c) c9657h.mo10234e();
                LinearGradient linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m9618d(c11668c.f35332b), c11668c.f35331a, Shader.TileMode.CLAMP);
                c12977p.m14668h(jM9619h, linearGradient);
                shader = linearGradient;
            }
        } else {
            long jM9619h2 = m9619h();
            C12977p c12977p2 = this.f27682e;
            shader = (RadialGradient) c12977p2.m14664d(jM9619h2);
            if (shader == null) {
                PointF pointF3 = (PointF) c9657h3.mo10234e();
                PointF pointF4 = (PointF) c9657h2.mo10234e();
                C11668c c11668c2 = (C11668c) c9657h.mo10234e();
                int[] iArrM9618d = m9618d(c11668c2.f35332b);
                float f10 = pointF3.x;
                float f11 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f10, pointF4.y - f11);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient = new RadialGradient(f10, f11, fHypot, iArrM9618d, c11668c2.f35331a, Shader.TileMode.CLAMP);
                c12977p2.m14668h(jM9619h2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        C8430a c8430a = this.f27684g;
        c8430a.setShader(shader);
        C9665p c9665p = this.f27692o;
        if (c9665p != null) {
            c8430a.setColorFilter((ColorFilter) c9665p.mo10234e());
        }
        AbstractC9653d abstractC9653d = this.f27696s;
        if (abstractC9653d != null) {
            float fFloatValue = ((Float) abstractC9653d.mo10234e()).floatValue();
            if (fFloatValue == 0.0f) {
                c8430a.setMaskFilter(null);
            } else if (fFloatValue != this.f27697t) {
                c8430a.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f27697t = fFloatValue;
        }
        float f12 = i10 / 255.0f;
        int iIntValue = (int) (((((Integer) this.f27689l.mo10234e()).intValue() * f12) / 100.0f) * 255.0f);
        PointF pointF5 = AbstractC14417f.f45307a;
        c8430a.setAlpha(Math.max(0, Math.min(255, iIntValue)));
        C9655f c9655f = this.f27698u;
        if (c9655f != null) {
            C0284r0 c0284r0 = AbstractC14418g.f45308a;
            c9655f.m10241b(c8430a, matrix, (int) (((f12 * iIntValue) / 255.0f) * 255.0f));
        }
        canvas.drawPath(path, c8430a);
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public final void mo9614f(C15384c c15384c, Object obj) {
        PointF pointF = InterfaceC7763A.f24513a;
        if (obj == 4) {
            this.f27689l.m10239j(c15384c);
            return;
        }
        ColorFilter colorFilter = InterfaceC7763A.f24507F;
        AbstractC13029b abstractC13029b = this.f27680c;
        if (obj == colorFilter) {
            C9665p c9665p = this.f27692o;
            if (c9665p != null) {
                abstractC13029b.m14780p(c9665p);
            }
            C9665p c9665p2 = new C9665p(c15384c, null);
            this.f27692o = c9665p2;
            c9665p2.m10230a(this);
            abstractC13029b.m14772d(this.f27692o);
            return;
        }
        if (obj == InterfaceC7763A.f24508G) {
            C9665p c9665p3 = this.f27693p;
            if (c9665p3 != null) {
                abstractC13029b.m14780p(c9665p3);
            }
            this.f27681d.m14662b();
            this.f27682e.m14662b();
            C9665p c9665p4 = new C9665p(c15384c, null);
            this.f27693p = c9665p4;
            c9665p4.m10230a(this);
            abstractC13029b.m14772d(this.f27693p);
            return;
        }
        if (obj == InterfaceC7763A.f24517e) {
            AbstractC9653d abstractC9653d = this.f27696s;
            if (abstractC9653d != null) {
                abstractC9653d.m10239j(c15384c);
                return;
            }
            C9665p c9665p5 = new C9665p(c15384c, null);
            this.f27696s = c9665p5;
            c9665p5.m10230a(this);
            abstractC13029b.m14772d(this.f27696s);
            return;
        }
        C9655f c9655f = this.f27698u;
        if (obj == 5 && c9655f != null) {
            c9655f.f29093c.m10239j(c15384c);
            return;
        }
        if (obj == InterfaceC7763A.f24503B && c9655f != null) {
            c9655f.m10242c(c15384c);
            return;
        }
        if (obj == InterfaceC7763A.f24504C && c9655f != null) {
            c9655f.f29095e.m10239j(c15384c);
            return;
        }
        if (obj == InterfaceC7763A.f24505D && c9655f != null) {
            c9655f.f29096f.m10239j(c15384c);
        } else {
            if (obj != InterfaceC7763A.f24506E || c9655f == null) {
                return;
            }
            c9655f.f29097g.m10239j(c15384c);
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: g */
    public final void mo9615g(C10510e c10510e, int i10, ArrayList arrayList, C10510e c10510e2) {
        AbstractC14417f.m15929f(c10510e, i10, arrayList, c10510e2, this);
    }

    @Override // p567X5.InterfaceC9053c
    public final String getName() {
        return this.f27678a;
    }

    /* JADX INFO: renamed from: h */
    public final int m9619h() {
        float f10 = this.f27690m.f29085d;
        float f11 = this.f27695r;
        int iRound = Math.round(f10 * f11);
        int iRound2 = Math.round(this.f27691n.f29085d * f11);
        int iRound3 = Math.round(this.f27688k.f29085d * f11);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }
}
