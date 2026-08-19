package p567X5;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.List;
import p003A1.C0284r0;
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
import p675c6.C11677l;
import p698d6.AbstractC13029b;
import p779h6.AbstractC14417f;
import p779h6.AbstractC14418g;

/* JADX INFO: renamed from: X5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9057g implements InterfaceC9055e, InterfaceC9650a, InterfaceC9061k {

    /* JADX INFO: renamed from: a */
    public final Path f27665a;

    /* JADX INFO: renamed from: b */
    public final C8430a f27666b;

    /* JADX INFO: renamed from: c */
    public final AbstractC13029b f27667c;

    /* JADX INFO: renamed from: d */
    public final String f27668d;

    /* JADX INFO: renamed from: e */
    public final boolean f27669e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f27670f;

    /* JADX INFO: renamed from: g */
    public final C9654e f27671g;

    /* JADX INFO: renamed from: h */
    public final C9654e f27672h;

    /* JADX INFO: renamed from: i */
    public C9665p f27673i;

    /* JADX INFO: renamed from: j */
    public final C7794w f27674j;

    /* JADX INFO: renamed from: k */
    public AbstractC9653d f27675k;

    /* JADX INFO: renamed from: l */
    public float f27676l;

    /* JADX INFO: renamed from: m */
    public final C9655f f27677m;

    public C9057g(C7794w c7794w, AbstractC13029b abstractC13029b, C11677l c11677l) {
        Path path = new Path();
        this.f27665a = path;
        this.f27666b = new C8430a(1, 0);
        this.f27670f = new ArrayList();
        this.f27667c = abstractC13029b;
        this.f27668d = c11677l.f35383c;
        this.f27669e = c11677l.f35386f;
        this.f27674j = c7794w;
        if (abstractC13029b.mo14776k() != null) {
            C9656g c9656gMo10670p = ((C11250b) abstractC13029b.mo14776k().f29833Z).mo10670p();
            this.f27675k = c9656gMo10670p;
            c9656gMo10670p.m10230a(this);
            abstractC13029b.m14772d(this.f27675k);
        }
        if (abstractC13029b.mo14777l() != null) {
            this.f27677m = new C9655f(this, abstractC13029b, abstractC13029b.mo14777l());
        }
        C11249a c11249a = c11677l.f35384d;
        if (c11249a == null) {
            this.f27671g = null;
            this.f27672h = null;
            return;
        }
        C11249a c11249a2 = c11677l.f35385e;
        path.setFillType(c11677l.f35382b);
        AbstractC9653d abstractC9653dMo10670p = c11249a.mo10670p();
        this.f27671g = (C9654e) abstractC9653dMo10670p;
        abstractC9653dMo10670p.m10230a(this);
        abstractC13029b.m14772d(abstractC9653dMo10670p);
        AbstractC9653d abstractC9653dMo10670p2 = c11249a2.mo10670p();
        this.f27672h = (C9654e) abstractC9653dMo10670p2;
        abstractC9653dMo10670p2.m10230a(this);
        abstractC13029b.m14772d(abstractC9653dMo10670p2);
    }

    @Override // p591Y5.InterfaceC9650a
    /* JADX INFO: renamed from: a */
    public final void mo9610a() {
        this.f27674j.invalidateSelf();
    }

    @Override // p567X5.InterfaceC9053c
    /* JADX INFO: renamed from: b */
    public final void mo9611b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            InterfaceC9053c interfaceC9053c = (InterfaceC9053c) list2.get(i10);
            if (interfaceC9053c instanceof InterfaceC9063m) {
                this.f27670f.add((InterfaceC9063m) interfaceC9053c);
            }
        }
    }

    @Override // p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: c */
    public final void mo9612c(RectF rectF, Matrix matrix, boolean z6) {
        Path path = this.f27665a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27670f;
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
    public final void mo9613e(Canvas canvas, Matrix matrix, int i10) {
        BlurMaskFilter blurMaskFilter;
        if (this.f27669e) {
            return;
        }
        C9654e c9654e = this.f27671g;
        int iM10240k = c9654e.m10240k(c9654e.f29084c.mo4176k(), c9654e.m10232c());
        float f10 = i10 / 255.0f;
        int iIntValue = (int) (((((Integer) this.f27672h.mo10234e()).intValue() * f10) / 100.0f) * 255.0f);
        PointF pointF = AbstractC14417f.f45307a;
        int i11 = 0;
        int iMax = (iM10240k & 16777215) | (Math.max(0, Math.min(255, iIntValue)) << 24);
        C8430a c8430a = this.f27666b;
        c8430a.setColor(iMax);
        C9665p c9665p = this.f27673i;
        if (c9665p != null) {
            c8430a.setColorFilter((ColorFilter) c9665p.mo10234e());
        }
        AbstractC9653d abstractC9653d = this.f27675k;
        if (abstractC9653d != null) {
            float fFloatValue = ((Float) abstractC9653d.mo10234e()).floatValue();
            if (fFloatValue == 0.0f) {
                c8430a.setMaskFilter(null);
            } else if (fFloatValue != this.f27676l) {
                AbstractC13029b abstractC13029b = this.f27667c;
                if (abstractC13029b.f41332A == fFloatValue) {
                    blurMaskFilter = abstractC13029b.f41333B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC13029b.f41333B = blurMaskFilter2;
                    abstractC13029b.f41332A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                c8430a.setMaskFilter(blurMaskFilter);
            }
            this.f27676l = fFloatValue;
        }
        C9655f c9655f = this.f27677m;
        if (c9655f != null) {
            C0284r0 c0284r0 = AbstractC14418g.f45308a;
            c9655f.m10241b(c8430a, matrix, (int) (((f10 * iIntValue) / 255.0f) * 255.0f));
        }
        Path path = this.f27665a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f27670f;
            if (i11 >= arrayList.size()) {
                canvas.drawPath(path, c8430a);
                return;
            } else {
                path.addPath(((InterfaceC9063m) arrayList.get(i11)).mo9617n(), matrix);
                i11++;
            }
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public final void mo9614f(C15384c c15384c, Object obj) {
        PointF pointF = InterfaceC7763A.f24513a;
        if (obj == 1) {
            this.f27671g.m10239j(c15384c);
            return;
        }
        if (obj == 4) {
            this.f27672h.m10239j(c15384c);
            return;
        }
        ColorFilter colorFilter = InterfaceC7763A.f24507F;
        AbstractC13029b abstractC13029b = this.f27667c;
        if (obj == colorFilter) {
            C9665p c9665p = this.f27673i;
            if (c9665p != null) {
                abstractC13029b.m14780p(c9665p);
            }
            C9665p c9665p2 = new C9665p(c15384c, null);
            this.f27673i = c9665p2;
            c9665p2.m10230a(this);
            abstractC13029b.m14772d(this.f27673i);
            return;
        }
        if (obj == InterfaceC7763A.f24517e) {
            AbstractC9653d abstractC9653d = this.f27675k;
            if (abstractC9653d != null) {
                abstractC9653d.m10239j(c15384c);
                return;
            }
            C9665p c9665p3 = new C9665p(c15384c, null);
            this.f27675k = c9665p3;
            c9665p3.m10230a(this);
            abstractC13029b.m14772d(this.f27675k);
            return;
        }
        C9655f c9655f = this.f27677m;
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
        return this.f27668d;
    }
}
