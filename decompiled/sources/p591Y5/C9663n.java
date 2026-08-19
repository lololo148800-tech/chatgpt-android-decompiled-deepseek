package p591Y5;

import android.graphics.PointF;
import io.sentry.internal.debugmeta.C15384c;
import p140Fa.C2700t;
import p640a6.C10507b;

/* JADX INFO: renamed from: Y5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9663n extends C15384c {

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2700t f29123p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C15384c f29124q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C10507b f29125r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9663n(C2700t c2700t, C15384c c15384c, C10507b c10507b) {
        super(23);
        this.f29123p0 = c2700t;
        this.f29124q0 = c15384c;
        this.f29125r0 = c10507b;
    }

    @Override // io.sentry.internal.debugmeta.C15384c
    /* JADX INFO: renamed from: q */
    public final Object mo8038q(C2700t c2700t) {
        float f10 = c2700t.f8305a;
        float f11 = c2700t.f8306b;
        String str = ((C10507b) c2700t.f8310f).f31128a;
        String str2 = ((C10507b) c2700t.f8311g).f31128a;
        float f12 = c2700t.f8307c;
        float f13 = c2700t.f8308d;
        float f14 = c2700t.f8309e;
        C2700t c2700t2 = this.f29123p0;
        c2700t2.f8305a = f10;
        c2700t2.f8306b = f11;
        c2700t2.f8310f = str;
        c2700t2.f8311g = str2;
        c2700t2.f8307c = f12;
        c2700t2.f8308d = f13;
        c2700t2.f8309e = f14;
        String str3 = (String) this.f29124q0.mo8038q(c2700t2);
        C10507b c10507b = (C10507b) (c2700t.f8308d == 1.0f ? c2700t.f8311g : c2700t.f8310f);
        String str4 = c10507b.f31129b;
        float f15 = c10507b.f31130c;
        int i10 = c10507b.f31131d;
        int i11 = c10507b.f31132e;
        float f16 = c10507b.f31133f;
        float f17 = c10507b.f31134g;
        int i12 = c10507b.f31135h;
        int i13 = c10507b.f31136i;
        float f18 = c10507b.f31137j;
        boolean z6 = c10507b.f31138k;
        PointF pointF = c10507b.f31139l;
        PointF pointF2 = c10507b.f31140m;
        C10507b c10507b2 = this.f29125r0;
        c10507b2.f31128a = str3;
        c10507b2.f31129b = str4;
        c10507b2.f31130c = f15;
        c10507b2.f31131d = i10;
        c10507b2.f31132e = i11;
        c10507b2.f31133f = f16;
        c10507b2.f31134g = f17;
        c10507b2.f31135h = i12;
        c10507b2.f31136i = i13;
        c10507b2.f31137j = f18;
        c10507b2.f31138k = z6;
        c10507b2.f31139l = pointF;
        c10507b2.f31140m = pointF2;
        return c10507b2;
    }
}
