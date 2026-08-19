package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11961h1 implements InterfaceC12033z1 {

    /* JADX INFO: renamed from: b */
    public static final C11961h1 f36273b = new C11961h1(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36274a;

    public /* synthetic */ C11961h1(int i10) {
        this.f36274a = i10;
    }

    /* JADX INFO: renamed from: c */
    public static final C12025x1 m13466c(Object obj, Object obj2) {
        C12025x1 c12025x1M13559b = (C12025x1) obj;
        C12025x1 c12025x1 = (C12025x1) obj2;
        if (!c12025x1.isEmpty()) {
            if (!c12025x1M13559b.f36356Y) {
                c12025x1M13559b = c12025x1M13559b.m13559b();
            }
            c12025x1M13559b.m13562f();
            if (!c12025x1.isEmpty()) {
                c12025x1M13559b.putAll(c12025x1);
            }
        }
        return c12025x1M13559b;
    }

    /* JADX INFO: renamed from: d */
    public static void m13467d(Object obj) {
        C11892M1 c11892m1 = ((AbstractC11969j1) obj).zzc;
        if (c11892m1.f36166e) {
            c11892m1.f36166e = false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC12033z1
    /* JADX INFO: renamed from: a */
    public C11877H1 mo13468a(Class cls) {
        switch (this.f36274a) {
            case 0:
                if (!AbstractC11969j1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C11877H1) AbstractC11969j1.m13474h(cls.asSubclass(AbstractC11969j1.class)).mo13306d(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC12033z1
    /* JADX INFO: renamed from: b */
    public boolean mo13469b(Class cls) {
        switch (this.f36274a) {
            case 0:
                return AbstractC11969j1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
