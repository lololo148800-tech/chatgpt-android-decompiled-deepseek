package p567X5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p520V5.C7794w;
import p520V5.InterfaceC7763A;
import p591Y5.C9656g;
import p591Y5.C9664o;
import p591Y5.InterfaceC9650a;
import p640a6.C10510e;
import p660b6.C11250b;
import p660b6.C11252d;
import p675c6.C11674i;
import p698d6.AbstractC13029b;
import p779h6.AbstractC14417f;

/* JADX INFO: renamed from: X5.p */
/* JADX INFO: loaded from: classes.dex */
public final class C9066p implements InterfaceC9055e, InterfaceC9063m, InterfaceC9060j, InterfaceC9650a, InterfaceC9061k {

    /* JADX INFO: renamed from: a */
    public final Matrix f27744a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Path f27745b = new Path();

    /* JADX INFO: renamed from: c */
    public final C7794w f27746c;

    /* JADX INFO: renamed from: d */
    public final AbstractC13029b f27747d;

    /* JADX INFO: renamed from: e */
    public final String f27748e;

    /* JADX INFO: renamed from: f */
    public final boolean f27749f;

    /* JADX INFO: renamed from: g */
    public final C9656g f27750g;

    /* JADX INFO: renamed from: h */
    public final C9656g f27751h;

    /* JADX INFO: renamed from: i */
    public final C9664o f27752i;

    /* JADX INFO: renamed from: j */
    public C9054d f27753j;

    public C9066p(C7794w c7794w, AbstractC13029b abstractC13029b, C11674i c11674i) {
        this.f27746c = c7794w;
        this.f27747d = abstractC13029b;
        this.f27748e = c11674i.f35372b;
        this.f27749f = c11674i.f35374d;
        C9656g c9656gMo10670p = c11674i.f35373c.mo10670p();
        this.f27750g = c9656gMo10670p;
        abstractC13029b.m14772d(c9656gMo10670p);
        c9656gMo10670p.m10230a(this);
        C9656g c9656gMo10670p2 = ((C11250b) c11674i.f35375e).mo10670p();
        this.f27751h = c9656gMo10670p2;
        abstractC13029b.m14772d(c9656gMo10670p2);
        c9656gMo10670p2.m10230a(this);
        C11252d c11252d = (C11252d) c11674i.f35376f;
        c11252d.getClass();
        C9664o c9664o = new C9664o(c11252d);
        this.f27752i = c9664o;
        c9664o.m10248a(abstractC13029b);
        c9664o.m10249b(this);
    }

    @Override // p591Y5.InterfaceC9650a
    /* JADX INFO: renamed from: a */
    public final void mo9610a() {
        this.f27746c.invalidateSelf();
    }

    @Override // p567X5.InterfaceC9053c
    /* JADX INFO: renamed from: b */
    public final void mo9611b(List list, List list2) {
        this.f27753j.mo9611b(list, list2);
    }

    @Override // p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: c */
    public final void mo9612c(RectF rectF, Matrix matrix, boolean z6) {
        this.f27753j.mo9612c(rectF, matrix, z6);
    }

    @Override // p567X5.InterfaceC9060j
    /* JADX INFO: renamed from: d */
    public final void mo9622d(ListIterator listIterator) {
        if (this.f27753j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((InterfaceC9053c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f27753j = new C9054d(this.f27746c, this.f27747d, "Repeater", this.f27749f, arrayList, null);
    }

    @Override // p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: e */
    public final void mo9613e(Canvas canvas, Matrix matrix, int i10) {
        float fFloatValue = ((Float) this.f27750g.mo10234e()).floatValue();
        float fFloatValue2 = ((Float) this.f27751h.mo10234e()).floatValue();
        C9664o c9664o = this.f27752i;
        float fFloatValue3 = ((Float) c9664o.f29138m.mo10234e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) c9664o.f29139n.mo10234e()).floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            Matrix matrix2 = this.f27744a;
            matrix2.set(matrix);
            float f10 = i11;
            matrix2.preConcat(c9664o.m10253f(f10 + fFloatValue2));
            this.f27753j.mo9613e(canvas, matrix2, (int) (AbstractC14417f.m15928e(fFloatValue3, fFloatValue4, f10 / fFloatValue) * i10));
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public final void mo9614f(C15384c c15384c, Object obj) {
        if (this.f27752i.m10250c(c15384c, obj)) {
            return;
        }
        if (obj == InterfaceC7763A.f24528p) {
            this.f27750g.m10239j(c15384c);
        } else if (obj == InterfaceC7763A.f24529q) {
            this.f27751h.m10239j(c15384c);
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: g */
    public final void mo9615g(C10510e c10510e, int i10, ArrayList arrayList, C10510e c10510e2) {
        AbstractC14417f.m15929f(c10510e, i10, arrayList, c10510e2, this);
        for (int i11 = 0; i11 < this.f27753j.f27653h.size(); i11++) {
            InterfaceC9053c interfaceC9053c = (InterfaceC9053c) this.f27753j.f27653h.get(i11);
            if (interfaceC9053c instanceof InterfaceC9061k) {
                AbstractC14417f.m15929f(c10510e, i10, arrayList, c10510e2, (InterfaceC9061k) interfaceC9053c);
            }
        }
    }

    @Override // p567X5.InterfaceC9053c
    public final String getName() {
        return this.f27748e;
    }

    @Override // p567X5.InterfaceC9063m
    /* JADX INFO: renamed from: n */
    public final Path mo9617n() {
        Path pathMo9617n = this.f27753j.mo9617n();
        Path path = this.f27745b;
        path.reset();
        float fFloatValue = ((Float) this.f27750g.mo10234e()).floatValue();
        float fFloatValue2 = ((Float) this.f27751h.mo10234e()).floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            Matrix matrix = this.f27744a;
            matrix.set(this.f27752i.m10253f(i10 + fFloatValue2));
            path.addPath(pathMo9617n, matrix);
        }
        return path;
    }
}
