package p591Y5;

import android.graphics.PointF;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Collections;
import p802i6.C14935a;

/* JADX INFO: renamed from: Y5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9662m extends AbstractC9653d {

    /* JADX INFO: renamed from: i */
    public final PointF f29117i;

    /* JADX INFO: renamed from: j */
    public final PointF f29118j;

    /* JADX INFO: renamed from: k */
    public final C9656g f29119k;

    /* JADX INFO: renamed from: l */
    public final C9656g f29120l;

    /* JADX INFO: renamed from: m */
    public C15384c f29121m;

    /* JADX INFO: renamed from: n */
    public C15384c f29122n;

    public C9662m(C9656g c9656g, C9656g c9656g2) {
        super(Collections.emptyList());
        this.f29117i = new PointF();
        this.f29118j = new PointF();
        this.f29119k = c9656g;
        this.f29120l = c9656g2;
        mo10238i(this.f29085d);
    }

    @Override // p591Y5.AbstractC9653d
    /* JADX INFO: renamed from: e */
    public final Object mo10234e() {
        return m10247k();
    }

    @Override // p591Y5.AbstractC9653d
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo10235f(C14935a c14935a, float f10) {
        return m10247k();
    }

    @Override // p591Y5.AbstractC9653d
    /* JADX INFO: renamed from: i */
    public final void mo10238i(float f10) {
        C9656g c9656g = this.f29119k;
        c9656g.mo10238i(f10);
        C9656g c9656g2 = this.f29120l;
        c9656g2.mo10238i(f10);
        this.f29117i.set(((Float) c9656g.mo10234e()).floatValue(), ((Float) c9656g2.mo10234e()).floatValue());
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29082a;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((InterfaceC9650a) arrayList.get(i10)).mo9610a();
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX INFO: renamed from: k */
    public final PointF m10247k() {
        Float f10;
        Float f11 = null;
        if (this.f29121m != null) {
            C9656g c9656g = this.f29119k;
            C14935a c14935aMo4176k = c9656g.f29084c.mo4176k();
            if (c14935aMo4176k != null) {
                Float f12 = c14935aMo4176k.f46531h;
                C15384c c15384c = this.f29121m;
                float f13 = c14935aMo4176k.f46530g;
                f10 = (Float) c15384c.m16641r(f13, f12 == null ? f13 : f12.floatValue(), (Float) c14935aMo4176k.f46525b, (Float) c14935aMo4176k.f46526c, c9656g.m10232c(), c9656g.m10233d(), c9656g.f29085d);
            } else {
                f10 = null;
            }
        } else {
            f10 = null;
        }
        if (this.f29122n != null) {
            C9656g c9656g2 = this.f29120l;
            C14935a c14935aMo4176k2 = c9656g2.f29084c.mo4176k();
            if (c14935aMo4176k2 != null) {
                Float f14 = c14935aMo4176k2.f46531h;
                C15384c c15384c2 = this.f29122n;
                float f15 = c14935aMo4176k2.f46530g;
                f11 = (Float) c15384c2.m16641r(f15, f14 == null ? f15 : f14.floatValue(), (Float) c14935aMo4176k2.f46525b, (Float) c14935aMo4176k2.f46526c, c9656g2.m10232c(), c9656g2.m10233d(), c9656g2.f29085d);
            }
        }
        PointF pointF = this.f29117i;
        PointF pointF2 = this.f29118j;
        if (f10 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f10.floatValue(), 0.0f);
        }
        if (f11 == null) {
            pointF2.set(pointF2.x, pointF.y);
        } else {
            pointF2.set(pointF2.x, f11.floatValue());
        }
        return pointF2;
    }
}
