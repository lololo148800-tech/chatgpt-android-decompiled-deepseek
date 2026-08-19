package p054C0;

import p204I1.C3582M;
import p328N1.InterfaceC5598n;
import p492U1.C7536a;
import p492U1.C7538c;
import p492U1.EnumC7546k;
import p544W9.AbstractC8646i;
import p544W9.AbstractC8682o;
import p571X9.AbstractC9388w4;

/* JADX INFO: renamed from: C0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1489b {

    /* JADX INFO: renamed from: h */
    public static C1489b f3910h;

    /* JADX INFO: renamed from: a */
    public final EnumC7546k f3911a;

    /* JADX INFO: renamed from: b */
    public final C3582M f3912b;

    /* JADX INFO: renamed from: c */
    public final C7538c f3913c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5598n f3914d;

    /* JADX INFO: renamed from: e */
    public final C3582M f3915e;

    /* JADX INFO: renamed from: f */
    public float f3916f = Float.NaN;

    /* JADX INFO: renamed from: g */
    public float f3917g = Float.NaN;

    public C1489b(EnumC7546k enumC7546k, C3582M c3582m, C7538c c7538c, InterfaceC5598n interfaceC5598n) {
        this.f3911a = enumC7546k;
        this.f3912b = c3582m;
        this.f3913c = c7538c;
        this.f3914d = interfaceC5598n;
        this.f3915e = AbstractC8682o.m9379b(c3582m, enumC7546k);
    }

    /* JADX INFO: renamed from: a */
    public final long m2133a(int i10, long j10) {
        int iM7855j;
        float f10 = this.f3917g;
        float fM4282b = this.f3916f;
        if (Float.isNaN(f10) || Float.isNaN(fM4282b)) {
            String str = AbstractC1490c.f3918a;
            long jM9959b = AbstractC9388w4.m9959b(0, 0, 15);
            C7538c c7538c = this.f3913c;
            float fM4282b2 = AbstractC8646i.m9318b(str, this.f3915e, jM9959b, c7538c, this.f3914d, null, 1, 96).m4282b();
            fM4282b = AbstractC8646i.m9318b(AbstractC1490c.f3919b, this.f3915e, AbstractC9388w4.m9959b(0, 0, 15), c7538c, this.f3914d, null, 2, 96).m4282b() - fM4282b2;
            this.f3917g = fM4282b2;
            this.f3916f = fM4282b;
            f10 = fM4282b2;
        }
        if (i10 != 1) {
            int iRound = Math.round((fM4282b * (i10 - 1)) + f10);
            iM7855j = iRound >= 0 ? iRound : 0;
            int iM7853h = C7536a.m7853h(j10);
            if (iM7855j > iM7853h) {
                iM7855j = iM7853h;
            }
        } else {
            iM7855j = C7536a.m7855j(j10);
        }
        return AbstractC9388w4.m9958a(C7536a.m7856k(j10), C7536a.m7854i(j10), iM7855j, C7536a.m7853h(j10));
    }
}
