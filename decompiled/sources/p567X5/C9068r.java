package p567X5;

import android.graphics.Path;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.List;
import p349O0.C5980U0;
import p520V5.C7794w;
import p520V5.InterfaceC7763A;
import p591Y5.C9661l;
import p591Y5.InterfaceC9650a;
import p640a6.C10510e;
import p675c6.C11679n;
import p698d6.AbstractC13029b;
import p779h6.AbstractC14417f;

/* JADX INFO: renamed from: X5.r */
/* JADX INFO: loaded from: classes.dex */
public final class C9068r implements InterfaceC9063m, InterfaceC9650a, InterfaceC9061k {

    /* JADX INFO: renamed from: b */
    public final String f27758b;

    /* JADX INFO: renamed from: c */
    public final boolean f27759c;

    /* JADX INFO: renamed from: d */
    public final C7794w f27760d;

    /* JADX INFO: renamed from: e */
    public final C9661l f27761e;

    /* JADX INFO: renamed from: f */
    public boolean f27762f;

    /* JADX INFO: renamed from: a */
    public final Path f27757a = new Path();

    /* JADX INFO: renamed from: g */
    public final C5980U0 f27763g = new C5980U0(1);

    public C9068r(C7794w c7794w, AbstractC13029b abstractC13029b, C11679n c11679n) {
        this.f27758b = c11679n.f35390a;
        this.f27759c = c11679n.f35393d;
        this.f27760d = c7794w;
        C9661l c9661l = new C9661l((List) c11679n.f35392c.f11539Z);
        this.f27761e = c9661l;
        abstractC13029b.m14772d(c9661l);
        c9661l.m10230a(this);
    }

    @Override // p591Y5.InterfaceC9650a
    /* JADX INFO: renamed from: a */
    public final void mo9610a() {
        this.f27762f = false;
        this.f27760d.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038 A[SYNTHETIC] */
    @Override // p567X5.InterfaceC9053c
    /* JADX INFO: renamed from: b */
    public final void mo9611b(List list, List list2) {
        ArrayList arrayList = null;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i10 >= arrayList2.size()) {
                this.f27761e.f29116m = arrayList;
                return;
            }
            InterfaceC9053c interfaceC9053c = (InterfaceC9053c) arrayList2.get(i10);
            if (interfaceC9053c instanceof C9070t) {
                C9070t c9070t = (C9070t) interfaceC9053c;
                if (c9070t.f27771c == 1) {
                    this.f27763g.f19461a.add(c9070t);
                    c9070t.m9625d(this);
                } else if (!(interfaceC9053c instanceof C9067q)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((C9067q) interfaceC9053c);
                }
            } else if (!(interfaceC9053c instanceof C9067q)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((C9067q) interfaceC9053c);
            }
            i10++;
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public final void mo9614f(C15384c c15384c, Object obj) {
        if (obj == InterfaceC7763A.f24512K) {
            this.f27761e.m10239j(c15384c);
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: g */
    public final void mo9615g(C10510e c10510e, int i10, ArrayList arrayList, C10510e c10510e2) {
        AbstractC14417f.m15929f(c10510e, i10, arrayList, c10510e2, this);
    }

    @Override // p567X5.InterfaceC9053c
    public final String getName() {
        return this.f27758b;
    }

    @Override // p567X5.InterfaceC9063m
    /* JADX INFO: renamed from: n */
    public final Path mo9617n() {
        boolean z6 = this.f27762f;
        Path path = this.f27757a;
        C9661l c9661l = this.f27761e;
        if (z6 && c9661l.f29086e == null) {
            return path;
        }
        path.reset();
        if (this.f27759c) {
            this.f27762f = true;
            return path;
        }
        Path path2 = (Path) c9661l.mo10234e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f27763g.m6404a(path);
        this.f27762f = true;
        return path;
    }
}
