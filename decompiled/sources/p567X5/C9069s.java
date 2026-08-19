package p567X5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import io.sentry.internal.debugmeta.C15384c;
import p001A.AbstractC0010F;
import p520V5.C7794w;
import p520V5.InterfaceC7763A;
import p540W5.C8430a;
import p591Y5.AbstractC9653d;
import p591Y5.C9654e;
import p591Y5.C9665p;
import p675c6.C11680o;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: X5.s */
/* JADX INFO: loaded from: classes.dex */
public final class C9069s extends AbstractC9052b {

    /* JADX INFO: renamed from: r */
    public final AbstractC13029b f27764r;

    /* JADX INFO: renamed from: s */
    public final String f27765s;

    /* JADX INFO: renamed from: t */
    public final boolean f27766t;

    /* JADX INFO: renamed from: u */
    public final C9654e f27767u;

    /* JADX INFO: renamed from: v */
    public C9665p f27768v;

    /* JADX WARN: Illegal instructions before constructor call */
    public C9069s(C7794w c7794w, AbstractC13029b abstractC13029b, C11680o c11680o) {
        int iM24h = AbstractC0010F.m24h(c11680o.f35400g);
        Paint.Cap cap = iM24h != 0 ? iM24h != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iM24h2 = AbstractC0010F.m24h(c11680o.f35401h);
        super(c7794w, abstractC13029b, cap, iM24h2 != 0 ? iM24h2 != 1 ? iM24h2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, c11680o.f35402i, c11680o.f35398e, c11680o.f35399f, c11680o.f35396c, c11680o.f35395b);
        this.f27764r = abstractC13029b;
        this.f27765s = c11680o.f35394a;
        this.f27766t = c11680o.f35403j;
        AbstractC9653d abstractC9653dMo10670p = c11680o.f35397d.mo10670p();
        this.f27767u = (C9654e) abstractC9653dMo10670p;
        abstractC9653dMo10670p.m10230a(this);
        abstractC13029b.m14772d(abstractC9653dMo10670p);
    }

    @Override // p567X5.AbstractC9052b, p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: e */
    public final void mo9613e(Canvas canvas, Matrix matrix, int i10) {
        if (this.f27766t) {
            return;
        }
        C9654e c9654e = this.f27767u;
        int iM10240k = c9654e.m10240k(c9654e.f29084c.mo4176k(), c9654e.m10232c());
        C8430a c8430a = this.f27637i;
        c8430a.setColor(iM10240k);
        C9665p c9665p = this.f27768v;
        if (c9665p != null) {
            c8430a.setColorFilter((ColorFilter) c9665p.mo10234e());
        }
        super.mo9613e(canvas, matrix, i10);
    }

    @Override // p567X5.AbstractC9052b, p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public final void mo9614f(C15384c c15384c, Object obj) {
        super.mo9614f(c15384c, obj);
        PointF pointF = InterfaceC7763A.f24513a;
        C9654e c9654e = this.f27767u;
        if (obj == 2) {
            c9654e.m10239j(c15384c);
            return;
        }
        if (obj == InterfaceC7763A.f24507F) {
            C9665p c9665p = this.f27768v;
            AbstractC13029b abstractC13029b = this.f27764r;
            if (c9665p != null) {
                abstractC13029b.m14780p(c9665p);
            }
            C9665p c9665p2 = new C9665p(c15384c, null);
            this.f27768v = c9665p2;
            c9665p2.m10230a(this);
            abstractC13029b.m14772d(c9654e);
        }
    }

    @Override // p567X5.InterfaceC9053c
    public final String getName() {
        return this.f27765s;
    }
}
