package p698d6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001A.AbstractC0010F;
import p003A1.C0284r0;
import p520V5.C7781j;
import p520V5.C7794w;
import p520V5.InterfaceC7763A;
import p591Y5.AbstractC9653d;
import p591Y5.C9656g;
import p591Y5.C9665p;
import p640a6.C10510e;
import p660b6.C11250b;
import p692d0.C12977p;
import p779h6.AbstractC14413b;
import p779h6.AbstractC14418g;

/* JADX INFO: renamed from: d6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13030c extends AbstractC13029b {

    /* JADX INFO: renamed from: D */
    public AbstractC9653d f41361D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f41362E;

    /* JADX INFO: renamed from: F */
    public final RectF f41363F;

    /* JADX INFO: renamed from: G */
    public final RectF f41364G;

    /* JADX INFO: renamed from: H */
    public final Paint f41365H;

    /* JADX INFO: renamed from: I */
    public float f41366I;

    /* JADX INFO: renamed from: J */
    public boolean f41367J;

    public C13030c(C7794w c7794w, C13032e c13032e, List list, C7781j c7781j) {
        AbstractC13029b abstractC13029b;
        AbstractC13029b c13030c;
        String str;
        super(c7794w, c13032e);
        this.f41362E = new ArrayList();
        this.f41363F = new RectF();
        this.f41364G = new RectF();
        this.f41365H = new Paint();
        this.f41367J = true;
        C11250b c11250b = c13032e.f41394s;
        if (c11250b != null) {
            C9656g c9656gMo10670p = c11250b.mo10670p();
            this.f41361D = c9656gMo10670p;
            m14772d(c9656gMo10670p);
            this.f41361D.m10230a(this);
        } else {
            this.f41361D = null;
        }
        C12977p c12977p = new C12977p(c7781j.f24589j.size());
        int size = list.size() - 1;
        AbstractC13029b abstractC13029b2 = null;
        while (true) {
            if (size < 0) {
                for (int i10 = 0; i10 < c12977p.m14670j(); i10++) {
                    AbstractC13029b abstractC13029b3 = (AbstractC13029b) c12977p.m14664d(c12977p.m14667g(i10));
                    if (abstractC13029b3 != null && (abstractC13029b = (AbstractC13029b) c12977p.m14664d(abstractC13029b3.f41350p.f41381f)) != null) {
                        abstractC13029b3.f41354t = abstractC13029b;
                    }
                }
                return;
            }
            C13032e c13032e2 = (C13032e) list.get(size);
            int iM24h = AbstractC0010F.m24h(c13032e2.f41380e);
            if (iM24h == 0) {
                c13030c = new C13030c(c7794w, c13032e2, (List) c7781j.f24582c.get(c13032e2.f41382g), c7781j);
            } else if (iM24h == 1) {
                c13030c = new C13031d(c7794w, c13032e2, 1);
            } else if (iM24h == 2) {
                c13030c = new C13031d(c7794w, c13032e2, 0);
            } else if (iM24h == 3) {
                c13030c = new C13033f(c7794w, c13032e2);
            } else if (iM24h == 4) {
                c13030c = new C13034g(c7794w, c13032e2, this, c7781j);
            } else if (iM24h != 5) {
                switch (c13032e2.f41380e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                AbstractC14413b.m15913b("Unknown layer type ".concat(str));
                c13030c = null;
            } else {
                c13030c = new C13036i(c7794w, c13032e2);
            }
            if (c13030c != null) {
                c12977p.m14668h(c13030c.f41350p.f41379d, c13030c);
                if (abstractC13029b2 != null) {
                    abstractC13029b2.f41353s = c13030c;
                    abstractC13029b2 = null;
                } else {
                    this.f41362E.add(0, c13030c);
                    int iM24h2 = AbstractC0010F.m24h(c13032e2.f41396u);
                    if (iM24h2 == 1 || iM24h2 == 2) {
                        abstractC13029b2 = c13030c;
                    }
                }
            }
            size--;
        }
    }

    @Override // p698d6.AbstractC13029b, p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: c */
    public final void mo9612c(RectF rectF, Matrix matrix, boolean z6) {
        super.mo9612c(rectF, matrix, z6);
        ArrayList arrayList = this.f41362E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f41363F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((AbstractC13029b) arrayList.get(size)).mo9612c(rectF2, this.f41348n, true);
            rectF.union(rectF2);
        }
    }

    @Override // p698d6.AbstractC13029b, p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public final void mo9614f(C15384c c15384c, Object obj) {
        super.mo9614f(c15384c, obj);
        if (obj == InterfaceC7763A.f24538z) {
            C9665p c9665p = new C9665p(c15384c, null);
            this.f41361D = c9665p;
            c9665p.m10230a(this);
            m14772d(this.f41361D);
        }
    }

    @Override // p698d6.AbstractC13029b
    /* JADX INFO: renamed from: j */
    public final void mo14775j(Canvas canvas, Matrix matrix, int i10) {
        RectF rectF = this.f41364G;
        C13032e c13032e = this.f41350p;
        rectF.set(0.0f, 0.0f, c13032e.f41390o, c13032e.f41391p);
        matrix.mapRect(rectF);
        boolean z6 = this.f41349o.f24638E0;
        ArrayList arrayList = this.f41362E;
        boolean z10 = z6 && arrayList.size() > 1 && i10 != 255;
        if (z10) {
            Paint paint = this.f41365H;
            paint.setAlpha(i10);
            C0284r0 c0284r0 = AbstractC14418g.f45308a;
            canvas.saveLayer(rectF, paint);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((this.f41367J || !"__container".equals(c13032e.f41378c)) && !rectF.isEmpty()) ? canvas.clipRect(rectF) : true) {
                ((AbstractC13029b) arrayList.get(size)).mo9613e(canvas, matrix, i10);
            }
        }
        canvas.restore();
    }

    @Override // p698d6.AbstractC13029b
    /* JADX INFO: renamed from: q */
    public final void mo14781q(C10510e c10510e, int i10, ArrayList arrayList, C10510e c10510e2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.f41362E;
            if (i11 >= arrayList2.size()) {
                return;
            }
            ((AbstractC13029b) arrayList2.get(i11)).mo9615g(c10510e, i10, arrayList, c10510e2);
            i11++;
        }
    }

    @Override // p698d6.AbstractC13029b
    /* JADX INFO: renamed from: r */
    public final void mo14782r(boolean z6) {
        super.mo14782r(z6);
        Iterator it = this.f41362E.iterator();
        while (it.hasNext()) {
            ((AbstractC13029b) it.next()).mo14782r(z6);
        }
    }

    @Override // p698d6.AbstractC13029b
    /* JADX INFO: renamed from: s */
    public final void mo14783s(float f10) {
        this.f41366I = f10;
        super.mo14783s(f10);
        AbstractC9653d abstractC9653d = this.f41361D;
        C13032e c13032e = this.f41350p;
        if (abstractC9653d != null) {
            C7781j c7781j = this.f41349o.f24658Y;
            f10 = ((((Float) abstractC9653d.mo10234e()).floatValue() * c13032e.f41377b.f24593n) - c13032e.f41377b.f24591l) / ((c7781j.f24592m - c7781j.f24591l) + 0.01f);
        }
        if (this.f41361D == null) {
            C7781j c7781j2 = c13032e.f41377b;
            f10 -= c13032e.f41389n / (c7781j2.f24592m - c7781j2.f24591l);
        }
        if (c13032e.f41388m != 0.0f && !"__container".equals(c13032e.f41378c)) {
            f10 /= c13032e.f41388m;
        }
        ArrayList arrayList = this.f41362E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC13029b) arrayList.get(size)).mo14783s(f10);
        }
    }
}
