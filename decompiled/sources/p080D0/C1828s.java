package p080D0;

import p1071w0.AbstractC20740b0;
import p544W9.AbstractC8676n;

/* JADX INFO: renamed from: D0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1828s implements InterfaceC1806h {

    /* JADX INFO: renamed from: b */
    public static final C1828s f5264b = new C1828s(0);

    /* JADX INFO: renamed from: c */
    public static final C1828s f5265c = new C1828s(1);

    /* JADX INFO: renamed from: d */
    public static final C1826r f5266d = new C1826r(0);

    /* JADX INFO: renamed from: e */
    public static final C1826r f5267e = new C1826r(1);

    /* JADX INFO: renamed from: f */
    public static final C1826r f5268f = new C1826r(2);

    /* JADX INFO: renamed from: g */
    public static final C1826r f5269g = new C1826r(3);

    /* JADX INFO: renamed from: h */
    public static final C1826r f5270h = new C1826r(4);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5271a;

    public /* synthetic */ C1828s(int i10) {
        this.f5271a = i10;
    }

    @Override // p080D0.InterfaceC1806h
    /* JADX INFO: renamed from: a */
    public long mo2605a(C1820o c1820o, int i10) {
        switch (this.f5271a) {
            case 0:
                String str = c1820o.f5240f.f10892a.f10882a.f10934Y;
                return AbstractC8676n.m9365b(AbstractC20740b0.m21280u(i10, str), AbstractC20740b0.m21279t(i10, str));
            default:
                return c1820o.f5240f.m4263m(i10);
        }
    }
}
