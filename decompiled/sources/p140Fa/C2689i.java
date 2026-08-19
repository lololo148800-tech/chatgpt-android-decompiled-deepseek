package p140Fa;

import java.util.ArrayList;
import p523V9.AbstractC8143m5;

/* JADX INFO: renamed from: Fa.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2689i extends AbstractC8143m5 {
    @Override // p523V9.AbstractC8143m5
    /* JADX INFO: renamed from: b */
    public final void mo3658b(C2700t c2700t, float f10, float f11) {
        c2700t.m3701d(f11 * f10, 180.0f, 90.0f);
        float f12 = f11 * 2.0f * f10;
        C2696p c2696p = new C2696p(0.0f, 0.0f, f12, f12);
        c2696p.f8298f = 180.0f;
        c2696p.f8299g = 90.0f;
        ((ArrayList) c2700t.f8310f).add(c2696p);
        C2694n c2694n = new C2694n(c2696p);
        c2700t.m3698a(180.0f);
        ((ArrayList) c2700t.f8311g).add(c2694n);
        c2700t.f8308d = 270.0f;
        float f13 = (0.0f + f12) * 0.5f;
        float f14 = (f12 - 0.0f) / 2.0f;
        double d10 = 270.0f;
        c2700t.f8306b = (((float) Math.cos(Math.toRadians(d10))) * f14) + f13;
        c2700t.f8307c = (f14 * ((float) Math.sin(Math.toRadians(d10)))) + f13;
    }
}
