package p567X5;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.List;
import p520V5.C7794w;
import p520V5.InterfaceC7763A;
import p540W5.C8430a;
import p591Y5.AbstractC9653d;
import p591Y5.C9654e;
import p591Y5.C9655f;
import p591Y5.C9656g;
import p591Y5.C9665p;
import p591Y5.InterfaceC9650a;
import p640a6.C10510e;
import p660b6.C11249a;
import p660b6.C11250b;
import p698d6.AbstractC13029b;
import p779h6.AbstractC14417f;
import p779h6.AbstractC14418g;

/* JADX INFO: renamed from: X5.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9052b implements InterfaceC9650a, InterfaceC9061k, InterfaceC9055e {

    /* JADX INFO: renamed from: e */
    public final C7794w f27633e;

    /* JADX INFO: renamed from: f */
    public final AbstractC13029b f27634f;

    /* JADX INFO: renamed from: h */
    public final float[] f27636h;

    /* JADX INFO: renamed from: i */
    public final C8430a f27637i;

    /* JADX INFO: renamed from: j */
    public final C9656g f27638j;

    /* JADX INFO: renamed from: k */
    public final C9654e f27639k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f27640l;

    /* JADX INFO: renamed from: m */
    public final C9656g f27641m;

    /* JADX INFO: renamed from: n */
    public C9665p f27642n;

    /* JADX INFO: renamed from: o */
    public AbstractC9653d f27643o;

    /* JADX INFO: renamed from: p */
    public float f27644p;

    /* JADX INFO: renamed from: q */
    public final C9655f f27645q;

    /* JADX INFO: renamed from: a */
    public final PathMeasure f27629a = new PathMeasure();

    /* JADX INFO: renamed from: b */
    public final Path f27630b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f27631c = new Path();

    /* JADX INFO: renamed from: d */
    public final RectF f27632d = new RectF();

    /* JADX INFO: renamed from: g */
    public final ArrayList f27635g = new ArrayList();

    public AbstractC9052b(C7794w c7794w, AbstractC13029b abstractC13029b, Paint.Cap cap, Paint.Join join, float f10, C11249a c11249a, C11250b c11250b, ArrayList arrayList, C11250b c11250b2) {
        C8430a c8430a = new C8430a(1, 0);
        this.f27637i = c8430a;
        this.f27644p = 0.0f;
        this.f27633e = c7794w;
        this.f27634f = abstractC13029b;
        c8430a.setStyle(Paint.Style.STROKE);
        c8430a.setStrokeCap(cap);
        c8430a.setStrokeJoin(join);
        c8430a.setStrokeMiter(f10);
        this.f27639k = (C9654e) c11249a.mo10670p();
        this.f27638j = c11250b.mo10670p();
        if (c11250b2 == null) {
            this.f27641m = null;
        } else {
            this.f27641m = c11250b2.mo10670p();
        }
        this.f27640l = new ArrayList(arrayList.size());
        this.f27636h = new float[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f27640l.add(((C11250b) arrayList.get(i10)).mo10670p());
        }
        abstractC13029b.m14772d(this.f27639k);
        abstractC13029b.m14772d(this.f27638j);
        for (int i11 = 0; i11 < this.f27640l.size(); i11++) {
            abstractC13029b.m14772d((AbstractC9653d) this.f27640l.get(i11));
        }
        C9656g c9656g = this.f27641m;
        if (c9656g != null) {
            abstractC13029b.m14772d(c9656g);
        }
        this.f27639k.m10230a(this);
        this.f27638j.m10230a(this);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((AbstractC9653d) this.f27640l.get(i12)).m10230a(this);
        }
        C9656g c9656g2 = this.f27641m;
        if (c9656g2 != null) {
            c9656g2.m10230a(this);
        }
        if (abstractC13029b.mo14776k() != null) {
            C9656g c9656gMo10670p = ((C11250b) abstractC13029b.mo14776k().f29833Z).mo10670p();
            this.f27643o = c9656gMo10670p;
            c9656gMo10670p.m10230a(this);
            abstractC13029b.m14772d(this.f27643o);
        }
        if (abstractC13029b.mo14777l() != null) {
            this.f27645q = new C9655f(this, abstractC13029b, abstractC13029b.mo14777l());
        }
    }

    @Override // p591Y5.InterfaceC9650a
    /* JADX INFO: renamed from: a */
    public final void mo9610a() {
        this.f27633e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[SYNTHETIC] */
    @Override // p567X5.InterfaceC9053c
    /* JADX INFO: renamed from: b */
    public final void mo9611b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C9051a c9051a = null;
        C9070t c9070t = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            InterfaceC9053c interfaceC9053c = (InterfaceC9053c) arrayList2.get(size);
            if (interfaceC9053c instanceof C9070t) {
                C9070t c9070t2 = (C9070t) interfaceC9053c;
                if (c9070t2.f27771c == 2) {
                    c9070t = c9070t2;
                }
            }
        }
        if (c9070t != null) {
            c9070t.m9625d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f27635g;
            if (size2 < 0) {
                break;
            }
            InterfaceC9053c interfaceC9053c2 = (InterfaceC9053c) list2.get(size2);
            if (interfaceC9053c2 instanceof C9070t) {
                C9070t c9070t3 = (C9070t) interfaceC9053c2;
                if (c9070t3.f27771c == 2) {
                    if (c9051a != null) {
                        arrayList.add(c9051a);
                    }
                    C9051a c9051a2 = new C9051a(c9070t3);
                    c9070t3.m9625d(this);
                    c9051a = c9051a2;
                } else if (!(interfaceC9053c2 instanceof InterfaceC9063m)) {
                    if (c9051a == null) {
                        c9051a = new C9051a(c9070t);
                    }
                    c9051a.f27627a.add((InterfaceC9063m) interfaceC9053c2);
                }
            } else if (!(interfaceC9053c2 instanceof InterfaceC9063m)) {
                if (c9051a == null) {
                    c9051a = new C9051a(c9070t);
                }
                c9051a.f27627a.add((InterfaceC9063m) interfaceC9053c2);
            }
        }
        if (c9051a != null) {
            arrayList.add(c9051a);
        }
    }

    @Override // p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: c */
    public final void mo9612c(RectF rectF, Matrix matrix, boolean z6) {
        Path path = this.f27630b;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27635g;
            if (i10 >= arrayList.size()) {
                RectF rectF2 = this.f27632d;
                path.computeBounds(rectF2, false);
                float fM10243k = this.f27638j.m10243k() / 2.0f;
                rectF2.set(rectF2.left - fM10243k, rectF2.top - fM10243k, rectF2.right + fM10243k, rectF2.bottom + fM10243k);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            C9051a c9051a = (C9051a) arrayList.get(i10);
            for (int i11 = 0; i11 < c9051a.f27627a.size(); i11++) {
                path.addPath(((InterfaceC9063m) c9051a.f27627a.get(i11)).mo9617n(), matrix);
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0200  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: e */
    public void mo9613e(Canvas canvas, Matrix matrix, int i10) {
        float f10;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        int i11 = 1;
        float[] fArr2 = (float[]) AbstractC14418g.f45311d.get();
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f11 = i10 / 255.0f;
        C9654e c9654e = this.f27639k;
        float f12 = 100.0f;
        int iM10240k = (int) (((c9654e.m10240k(c9654e.f29084c.mo4176k(), c9654e.m10232c()) * f11) / 100.0f) * 255.0f);
        PointF pointF = AbstractC14417f.f45307a;
        int iMax = Math.max(0, Math.min(255, iM10240k));
        C8430a c8430a = this.f27637i;
        c8430a.setAlpha(iMax);
        c8430a.setStrokeWidth(this.f27638j.m10243k());
        if (c8430a.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = this.f27640l;
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = this.f27636h;
                if (i12 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((AbstractC9653d) arrayList.get(i12)).mo10234e()).floatValue();
                fArr[i12] = fFloatValue;
                if (i12 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i12] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i12] = 0.1f;
                }
                i12++;
            }
            C9656g c9656g = this.f27641m;
            c8430a.setPathEffect(new DashPathEffect(fArr, c9656g == null ? 0.0f : ((Float) c9656g.mo10234e()).floatValue()));
        }
        C9665p c9665p = this.f27642n;
        if (c9665p != null) {
            c8430a.setColorFilter((ColorFilter) c9665p.mo10234e());
        }
        AbstractC9653d abstractC9653d = this.f27643o;
        if (abstractC9653d != null) {
            float fFloatValue2 = ((Float) abstractC9653d.mo10234e()).floatValue();
            if (fFloatValue2 == 0.0f) {
                c8430a.setMaskFilter(null);
            } else if (fFloatValue2 != this.f27644p) {
                AbstractC13029b abstractC13029b = this.f27634f;
                if (abstractC13029b.f41332A == fFloatValue2) {
                    blurMaskFilter = abstractC13029b.f41333B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC13029b.f41333B = blurMaskFilter2;
                    abstractC13029b.f41332A = fFloatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                c8430a.setMaskFilter(blurMaskFilter);
            }
            this.f27644p = fFloatValue2;
        }
        C9655f c9655f = this.f27645q;
        if (c9655f != null) {
            c9655f.m10241b(c8430a, matrix, (int) (((f11 * iM10240k) / 255.0f) * 255.0f));
        }
        canvas.save();
        canvas.concat(matrix);
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f27635g;
            if (i13 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            C9051a c9051a = (C9051a) arrayList2.get(i13);
            C9070t c9070t = c9051a.f27628b;
            Path path = this.f27630b;
            ArrayList arrayList3 = c9051a.f27627a;
            if (c9070t != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i11; size2 >= 0; size2--) {
                    path.addPath(((InterfaceC9063m) arrayList3.get(size2)).mo9617n());
                }
                C9070t c9070t2 = c9051a.f27628b;
                float fFloatValue3 = ((Float) c9070t2.f27772d.mo10234e()).floatValue() / f12;
                float fFloatValue4 = ((Float) c9070t2.f27773e.mo10234e()).floatValue() / f12;
                float fFloatValue5 = ((Float) c9070t2.f27774f.mo10234e()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = this.f27629a;
                    pathMeasure.setPath(path, false);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f13 = fFloatValue5 * length;
                    float f14 = (fFloatValue3 * length) + f13;
                    float fMin = Math.min((fFloatValue4 * length) + f13, (f14 + length) - 1.0f);
                    float f15 = 0.0f;
                    for (int size3 = arrayList3.size() - i11; size3 >= 0; size3--) {
                        Path path2 = this.f27631c;
                        path2.set(((InterfaceC9063m) arrayList3.get(size3)).mo9617n());
                        pathMeasure.setPath(path2, false);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f16 = fMin - length;
                            if (f16 >= f15 + length2 || f15 >= f16) {
                                f10 = f15 + length2;
                                if (f10 < f14 && f15 <= fMin) {
                                    if (f10 > fMin || f14 >= f15) {
                                        AbstractC14418g.m15930a(path2, f14 < f15 ? 0.0f : (f14 - f15) / length2, fMin > f10 ? 1.0f : (fMin - f15) / length2, 0.0f);
                                        canvas.drawPath(path2, c8430a);
                                    } else {
                                        canvas.drawPath(path2, c8430a);
                                    }
                                }
                            } else {
                                AbstractC14418g.m15930a(path2, f14 > length ? (f14 - length) / length2 : 0.0f, Math.min(f16 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, c8430a);
                            }
                        } else {
                            f10 = f15 + length2;
                            if (f10 < f14) {
                            }
                        }
                        f15 += length2;
                    }
                } else {
                    canvas.drawPath(path, c8430a);
                }
            } else {
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((InterfaceC9063m) arrayList3.get(size4)).mo9617n());
                }
                canvas.drawPath(path, c8430a);
            }
            i13++;
            i11 = 1;
            f12 = 100.0f;
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public void mo9614f(C15384c c15384c, Object obj) {
        PointF pointF = InterfaceC7763A.f24513a;
        if (obj == 4) {
            this.f27639k.m10239j(c15384c);
            return;
        }
        if (obj == InterfaceC7763A.f24526n) {
            this.f27638j.m10239j(c15384c);
            return;
        }
        ColorFilter colorFilter = InterfaceC7763A.f24507F;
        AbstractC13029b abstractC13029b = this.f27634f;
        if (obj == colorFilter) {
            C9665p c9665p = this.f27642n;
            if (c9665p != null) {
                abstractC13029b.m14780p(c9665p);
            }
            C9665p c9665p2 = new C9665p(c15384c, null);
            this.f27642n = c9665p2;
            c9665p2.m10230a(this);
            abstractC13029b.m14772d(this.f27642n);
            return;
        }
        if (obj == InterfaceC7763A.f24517e) {
            AbstractC9653d abstractC9653d = this.f27643o;
            if (abstractC9653d != null) {
                abstractC9653d.m10239j(c15384c);
                return;
            }
            C9665p c9665p3 = new C9665p(c15384c, null);
            this.f27643o = c9665p3;
            c9665p3.m10230a(this);
            abstractC13029b.m14772d(this.f27643o);
            return;
        }
        C9655f c9655f = this.f27645q;
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
}
