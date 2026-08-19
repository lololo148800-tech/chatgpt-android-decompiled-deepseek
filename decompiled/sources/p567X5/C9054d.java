package p567X5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.List;
import p003A1.C0284r0;
import p520V5.C7781j;
import p520V5.C7794w;
import p540W5.C8430a;
import p591Y5.AbstractC9653d;
import p591Y5.C9664o;
import p591Y5.InterfaceC9650a;
import p640a6.C10510e;
import p640a6.InterfaceC10511f;
import p660b6.C11252d;
import p675c6.C11678m;
import p675c6.InterfaceC11667b;
import p698d6.AbstractC13029b;
import p779h6.AbstractC14418g;

/* JADX INFO: renamed from: X5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9054d implements InterfaceC9055e, InterfaceC9063m, InterfaceC9650a, InterfaceC10511f {

    /* JADX INFO: renamed from: a */
    public final C8430a f27646a;

    /* JADX INFO: renamed from: b */
    public final RectF f27647b;

    /* JADX INFO: renamed from: c */
    public final Matrix f27648c;

    /* JADX INFO: renamed from: d */
    public final Path f27649d;

    /* JADX INFO: renamed from: e */
    public final RectF f27650e;

    /* JADX INFO: renamed from: f */
    public final String f27651f;

    /* JADX INFO: renamed from: g */
    public final boolean f27652g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f27653h;

    /* JADX INFO: renamed from: i */
    public final C7794w f27654i;

    /* JADX INFO: renamed from: j */
    public ArrayList f27655j;

    /* JADX INFO: renamed from: k */
    public final C9664o f27656k;

    public C9054d(C7794w c7794w, AbstractC13029b abstractC13029b, C11678m c11678m, C7781j c7781j) {
        C11252d c11252d;
        String str = c11678m.f35387a;
        List list = c11678m.f35388b;
        ArrayList arrayList = new ArrayList(list.size());
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            InterfaceC9053c interfaceC9053cMo12679a = ((InterfaceC11667b) list.get(i11)).mo12679a(c7794w, c7781j, abstractC13029b);
            if (interfaceC9053cMo12679a != null) {
                arrayList.add(interfaceC9053cMo12679a);
            }
        }
        while (true) {
            if (i10 >= list.size()) {
                c11252d = null;
                break;
            }
            InterfaceC11667b interfaceC11667b = (InterfaceC11667b) list.get(i10);
            if (interfaceC11667b instanceof C11252d) {
                c11252d = (C11252d) interfaceC11667b;
                break;
            }
            i10++;
        }
        this(c7794w, abstractC13029b, str, c11678m.f35389c, arrayList, c11252d);
    }

    @Override // p591Y5.InterfaceC9650a
    /* JADX INFO: renamed from: a */
    public final void mo9610a() {
        this.f27654i.invalidateSelf();
    }

    @Override // p567X5.InterfaceC9053c
    /* JADX INFO: renamed from: b */
    public final void mo9611b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f27653h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            InterfaceC9053c interfaceC9053c = (InterfaceC9053c) arrayList.get(size2);
            interfaceC9053c.mo9611b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(interfaceC9053c);
        }
    }

    @Override // p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: c */
    public final void mo9612c(RectF rectF, Matrix matrix, boolean z6) {
        Matrix matrix2 = this.f27648c;
        matrix2.set(matrix);
        C9664o c9664o = this.f27656k;
        if (c9664o != null) {
            matrix2.preConcat(c9664o.m10252e());
        }
        RectF rectF2 = this.f27650e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f27653h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC9053c interfaceC9053c = (InterfaceC9053c) arrayList.get(size);
            if (interfaceC9053c instanceof InterfaceC9055e) {
                ((InterfaceC9055e) interfaceC9053c).mo9612c(rectF2, matrix2, z6);
                rectF.union(rectF2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final List m9616d() {
        if (this.f27655j == null) {
            this.f27655j = new ArrayList();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f27653h;
                if (i10 >= arrayList.size()) {
                    break;
                }
                InterfaceC9053c interfaceC9053c = (InterfaceC9053c) arrayList.get(i10);
                if (interfaceC9053c instanceof InterfaceC9063m) {
                    this.f27655j.add((InterfaceC9063m) interfaceC9053c);
                }
                i10++;
            }
        }
        return this.f27655j;
    }

    @Override // p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: e */
    public final void mo9613e(Canvas canvas, Matrix matrix, int i10) {
        if (this.f27652g) {
            return;
        }
        Matrix matrix2 = this.f27648c;
        matrix2.set(matrix);
        C9664o c9664o = this.f27656k;
        if (c9664o != null) {
            matrix2.preConcat(c9664o.m10252e());
            AbstractC9653d abstractC9653d = c9664o.f29135j;
            i10 = (int) (((((abstractC9653d == null ? 100 : ((Integer) abstractC9653d.mo10234e()).intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z6 = this.f27654i.f24638E0;
        ArrayList arrayList = this.f27653h;
        boolean z10 = false;
        if (z6) {
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if ((arrayList.get(i12) instanceof InterfaceC9055e) && (i11 = i11 + 1) >= 2) {
                    if (i10 == 255) {
                        break;
                    }
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            RectF rectF = this.f27647b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo9612c(rectF, matrix2, true);
            C8430a c8430a = this.f27646a;
            c8430a.setAlpha(i10);
            C0284r0 c0284r0 = AbstractC14418g.f45308a;
            canvas.saveLayer(rectF, c8430a);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof InterfaceC9055e) {
                ((InterfaceC9055e) obj).mo9613e(canvas, matrix2, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public final void mo9614f(C15384c c15384c, Object obj) {
        C9664o c9664o = this.f27656k;
        if (c9664o != null) {
            c9664o.m10250c(c15384c, obj);
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: g */
    public final void mo9615g(C10510e c10510e, int i10, ArrayList arrayList, C10510e c10510e2) {
        String str = this.f27651f;
        if (!c10510e.m10968c(i10, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            c10510e2.getClass();
            C10510e c10510e3 = new C10510e(c10510e2);
            c10510e3.f31151a.add(str);
            if (c10510e.m10966a(i10, str)) {
                C10510e c10510e4 = new C10510e(c10510e3);
                c10510e4.f31152b = this;
                arrayList.add(c10510e4);
            }
            c10510e2 = c10510e3;
        }
        if (!c10510e.m10969d(i10, str)) {
            return;
        }
        int iM10967b = c10510e.m10967b(i10, str) + i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.f27653h;
            if (i11 >= arrayList2.size()) {
                return;
            }
            InterfaceC9053c interfaceC9053c = (InterfaceC9053c) arrayList2.get(i11);
            if (interfaceC9053c instanceof InterfaceC10511f) {
                ((InterfaceC10511f) interfaceC9053c).mo9615g(c10510e, iM10967b, arrayList, c10510e2);
            }
            i11++;
        }
    }

    @Override // p567X5.InterfaceC9053c
    public final String getName() {
        throw null;
    }

    @Override // p567X5.InterfaceC9063m
    /* JADX INFO: renamed from: n */
    public final Path mo9617n() {
        Matrix matrix = this.f27648c;
        matrix.reset();
        C9664o c9664o = this.f27656k;
        if (c9664o != null) {
            matrix.set(c9664o.m10252e());
        }
        Path path = this.f27649d;
        path.reset();
        if (this.f27652g) {
            return path;
        }
        ArrayList arrayList = this.f27653h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC9053c interfaceC9053c = (InterfaceC9053c) arrayList.get(size);
            if (interfaceC9053c instanceof InterfaceC9063m) {
                path.addPath(((InterfaceC9063m) interfaceC9053c).mo9617n(), matrix);
            }
        }
        return path;
    }

    public C9054d(C7794w c7794w, AbstractC13029b abstractC13029b, String str, boolean z6, ArrayList arrayList, C11252d c11252d) {
        this.f27646a = new C8430a();
        this.f27647b = new RectF();
        this.f27648c = new Matrix();
        this.f27649d = new Path();
        this.f27650e = new RectF();
        this.f27651f = str;
        this.f27654i = c7794w;
        this.f27652g = z6;
        this.f27653h = arrayList;
        if (c11252d != null) {
            C9664o c9664o = new C9664o(c11252d);
            this.f27656k = c9664o;
            c9664o.m10248a(abstractC13029b);
            c9664o.m10249b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC9053c interfaceC9053c = (InterfaceC9053c) arrayList.get(size);
            if (interfaceC9053c instanceof InterfaceC9060j) {
                arrayList2.add((InterfaceC9060j) interfaceC9053c);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC9060j) arrayList2.get(size2)).mo9622d(arrayList.listIterator(arrayList.size()));
        }
    }
}
