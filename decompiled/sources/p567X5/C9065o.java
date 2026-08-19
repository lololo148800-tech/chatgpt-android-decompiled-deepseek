package p567X5;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.List;
import p349O0.C5980U0;
import p520V5.C7794w;
import p520V5.InterfaceC7763A;
import p591Y5.AbstractC9653d;
import p591Y5.C9656g;
import p591Y5.InterfaceC9650a;
import p640a6.C10510e;
import p660b6.C11249a;
import p675c6.C11674i;
import p698d6.AbstractC13029b;
import p779h6.AbstractC14417f;

/* JADX INFO: renamed from: X5.o */
/* JADX INFO: loaded from: classes.dex */
public final class C9065o implements InterfaceC9650a, InterfaceC9061k, InterfaceC9063m {

    /* JADX INFO: renamed from: c */
    public final String f27735c;

    /* JADX INFO: renamed from: d */
    public final boolean f27736d;

    /* JADX INFO: renamed from: e */
    public final C7794w f27737e;

    /* JADX INFO: renamed from: f */
    public final AbstractC9653d f27738f;

    /* JADX INFO: renamed from: g */
    public final AbstractC9653d f27739g;

    /* JADX INFO: renamed from: h */
    public final C9656g f27740h;

    /* JADX INFO: renamed from: k */
    public boolean f27743k;

    /* JADX INFO: renamed from: a */
    public final Path f27733a = new Path();

    /* JADX INFO: renamed from: b */
    public final RectF f27734b = new RectF();

    /* JADX INFO: renamed from: i */
    public final C5980U0 f27741i = new C5980U0(1);

    /* JADX INFO: renamed from: j */
    public AbstractC9653d f27742j = null;

    public C9065o(C7794w c7794w, AbstractC13029b abstractC13029b, C11674i c11674i) {
        this.f27735c = c11674i.f35372b;
        this.f27736d = c11674i.f35374d;
        this.f27737e = c7794w;
        AbstractC9653d abstractC9653dMo10670p = c11674i.f35375e.mo10670p();
        this.f27738f = abstractC9653dMo10670p;
        AbstractC9653d abstractC9653dMo10670p2 = ((C11249a) c11674i.f35376f).mo10670p();
        this.f27739g = abstractC9653dMo10670p2;
        C9656g c9656gMo10670p = c11674i.f35373c.mo10670p();
        this.f27740h = c9656gMo10670p;
        abstractC13029b.m14772d(abstractC9653dMo10670p);
        abstractC13029b.m14772d(abstractC9653dMo10670p2);
        abstractC13029b.m14772d(c9656gMo10670p);
        abstractC9653dMo10670p.m10230a(this);
        abstractC9653dMo10670p2.m10230a(this);
        c9656gMo10670p.m10230a(this);
    }

    @Override // p591Y5.InterfaceC9650a
    /* JADX INFO: renamed from: a */
    public final void mo9610a() {
        this.f27743k = false;
        this.f27737e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // p567X5.InterfaceC9053c
    /* JADX INFO: renamed from: b */
    public final void mo9611b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 >= arrayList.size()) {
                return;
            }
            InterfaceC9053c interfaceC9053c = (InterfaceC9053c) arrayList.get(i10);
            if (interfaceC9053c instanceof C9070t) {
                C9070t c9070t = (C9070t) interfaceC9053c;
                if (c9070t.f27771c == 1) {
                    this.f27741i.f19461a.add(c9070t);
                    c9070t.m9625d(this);
                } else if (interfaceC9053c instanceof C9067q) {
                    this.f27742j = ((C9067q) interfaceC9053c).f27755b;
                }
            } else if (interfaceC9053c instanceof C9067q) {
                this.f27742j = ((C9067q) interfaceC9053c).f27755b;
            }
            i10++;
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public final void mo9614f(C15384c c15384c, Object obj) {
        if (obj == InterfaceC7763A.f24519g) {
            this.f27739g.m10239j(c15384c);
        } else if (obj == InterfaceC7763A.f24521i) {
            this.f27738f.m10239j(c15384c);
        } else if (obj == InterfaceC7763A.f24520h) {
            this.f27740h.m10239j(c15384c);
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: g */
    public final void mo9615g(C10510e c10510e, int i10, ArrayList arrayList, C10510e c10510e2) {
        AbstractC14417f.m15929f(c10510e, i10, arrayList, c10510e2, this);
    }

    @Override // p567X5.InterfaceC9053c
    public final String getName() {
        return this.f27735c;
    }

    @Override // p567X5.InterfaceC9063m
    /* JADX INFO: renamed from: n */
    public final Path mo9617n() {
        AbstractC9653d abstractC9653d;
        boolean z6 = this.f27743k;
        Path path = this.f27733a;
        if (z6) {
            return path;
        }
        path.reset();
        if (this.f27736d) {
            this.f27743k = true;
            return path;
        }
        PointF pointF = (PointF) this.f27739g.mo10234e();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        C9656g c9656g = this.f27740h;
        float fM10243k = c9656g == null ? 0.0f : c9656g.m10243k();
        if (fM10243k == 0.0f && (abstractC9653d = this.f27742j) != null) {
            fM10243k = Math.min(((Float) abstractC9653d.mo10234e()).floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fM10243k > fMin) {
            fM10243k = fMin;
        }
        PointF pointF2 = (PointF) this.f27738f.mo10234e();
        path.moveTo(pointF2.x + f10, (pointF2.y - f11) + fM10243k);
        path.lineTo(pointF2.x + f10, (pointF2.y + f11) - fM10243k);
        RectF rectF = this.f27734b;
        if (fM10243k > 0.0f) {
            float f12 = pointF2.x + f10;
            float f13 = fM10243k * 2.0f;
            float f14 = pointF2.y + f11;
            rectF.set(f12 - f13, f14 - f13, f12, f14);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x - f10) + fM10243k, pointF2.y + f11);
        if (fM10243k > 0.0f) {
            float f15 = pointF2.x - f10;
            float f16 = pointF2.y + f11;
            float f17 = fM10243k * 2.0f;
            rectF.set(f15, f16 - f17, f17 + f15, f16);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f10, (pointF2.y - f11) + fM10243k);
        if (fM10243k > 0.0f) {
            float f18 = pointF2.x - f10;
            float f19 = pointF2.y - f11;
            float f20 = fM10243k * 2.0f;
            rectF.set(f18, f19, f18 + f20, f20 + f19);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f10) - fM10243k, pointF2.y - f11);
        if (fM10243k > 0.0f) {
            float f21 = pointF2.x + f10;
            float f22 = fM10243k * 2.0f;
            float f23 = pointF2.y - f11;
            rectF.set(f21 - f22, f23, f21, f22 + f23);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f27741i.m6404a(path);
        this.f27743k = true;
        return path;
    }
}
