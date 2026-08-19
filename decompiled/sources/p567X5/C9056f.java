package p567X5;

import android.graphics.Path;
import android.graphics.PointF;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.List;
import p349O0.C5980U0;
import p520V5.C7794w;
import p520V5.InterfaceC7763A;
import p591Y5.AbstractC9653d;
import p591Y5.C9657h;
import p591Y5.InterfaceC9650a;
import p640a6.C10510e;
import p675c6.C11666a;
import p698d6.AbstractC13029b;
import p779h6.AbstractC14417f;

/* JADX INFO: renamed from: X5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9056f implements InterfaceC9063m, InterfaceC9650a, InterfaceC9061k {

    /* JADX INFO: renamed from: b */
    public final String f27658b;

    /* JADX INFO: renamed from: c */
    public final C7794w f27659c;

    /* JADX INFO: renamed from: d */
    public final C9657h f27660d;

    /* JADX INFO: renamed from: e */
    public final AbstractC9653d f27661e;

    /* JADX INFO: renamed from: f */
    public final C11666a f27662f;

    /* JADX INFO: renamed from: h */
    public boolean f27664h;

    /* JADX INFO: renamed from: a */
    public final Path f27657a = new Path();

    /* JADX INFO: renamed from: g */
    public final C5980U0 f27663g = new C5980U0(1);

    public C9056f(C7794w c7794w, AbstractC13029b abstractC13029b, C11666a c11666a) {
        this.f27658b = c11666a.f35326a;
        this.f27659c = c7794w;
        AbstractC9653d abstractC9653dMo10670p = c11666a.f35328c.mo10670p();
        this.f27660d = (C9657h) abstractC9653dMo10670p;
        AbstractC9653d abstractC9653dMo10670p2 = c11666a.f35327b.mo10670p();
        this.f27661e = abstractC9653dMo10670p2;
        this.f27662f = c11666a;
        abstractC13029b.m14772d(abstractC9653dMo10670p);
        abstractC13029b.m14772d(abstractC9653dMo10670p2);
        abstractC9653dMo10670p.m10230a(this);
        abstractC9653dMo10670p2.m10230a(this);
    }

    @Override // p591Y5.InterfaceC9650a
    /* JADX INFO: renamed from: a */
    public final void mo9610a() {
        this.f27664h = false;
        this.f27659c.invalidateSelf();
    }

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
                    this.f27663g.f19461a.add(c9070t);
                    c9070t.m9625d(this);
                }
            }
            i10++;
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public final void mo9614f(C15384c c15384c, Object obj) {
        if (obj == InterfaceC7763A.f24518f) {
            this.f27660d.m10239j(c15384c);
        } else if (obj == InterfaceC7763A.f24521i) {
            this.f27661e.m10239j(c15384c);
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: g */
    public final void mo9615g(C10510e c10510e, int i10, ArrayList arrayList, C10510e c10510e2) {
        AbstractC14417f.m15929f(c10510e, i10, arrayList, c10510e2, this);
    }

    @Override // p567X5.InterfaceC9053c
    public final String getName() {
        return this.f27658b;
    }

    @Override // p567X5.InterfaceC9063m
    /* JADX INFO: renamed from: n */
    public final Path mo9617n() {
        boolean z6 = this.f27664h;
        Path path = this.f27657a;
        if (z6) {
            return path;
        }
        path.reset();
        C11666a c11666a = this.f27662f;
        if (c11666a.f35330e) {
            this.f27664h = true;
            return path;
        }
        PointF pointF = (PointF) this.f27660d.mo10234e();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = f11 * 0.55228f;
        path.reset();
        if (c11666a.f35329d) {
            float f14 = -f11;
            path.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            path.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            path.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            path.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            path.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            path.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            path.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            path.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            path.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            path.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointF2 = (PointF) this.f27661e.mo10234e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f27663g.m6404a(path);
        this.f27664h = true;
        return path;
    }
}
