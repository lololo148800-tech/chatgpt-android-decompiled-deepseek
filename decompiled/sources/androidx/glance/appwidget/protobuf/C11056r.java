package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.r */
/* JADX INFO: loaded from: classes.dex */
public final class C11056r implements InterfaceC11016L {

    /* JADX INFO: renamed from: b */
    public static final C11056r f33339b = new C11056r(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33340a;

    public /* synthetic */ C11056r(int i10) {
        this.f33340a = i10;
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11016L
    /* JADX INFO: renamed from: a */
    public final C11025V mo11851a(Class cls) {
        switch (this.f33340a) {
            case 0:
                if (!AbstractC11059u.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C11025V) AbstractC11059u.m12095e(cls.asSubclass(AbstractC11059u.class)).mo12101d(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11016L
    /* JADX INFO: renamed from: b */
    public final boolean mo11852b(Class cls) {
        switch (this.f33340a) {
            case 0:
                return AbstractC11059u.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
