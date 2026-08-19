package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r */
/* JADX INFO: loaded from: classes.dex */
public final class C10981r implements InterfaceC10936O {

    /* JADX INFO: renamed from: b */
    public static final C10981r f33084b = new C10981r(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33085a;

    public /* synthetic */ C10981r(int i10) {
        this.f33085a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10936O
    /* JADX INFO: renamed from: a */
    public final C10946Z mo11438a(Class cls) {
        switch (this.f33085a) {
            case 0:
                if (!AbstractC10987u.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C10946Z) AbstractC10987u.m11715e(cls.asSubclass(AbstractC10987u.class)).mo7129d(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10936O
    /* JADX INFO: renamed from: b */
    public final boolean mo11439b(Class cls) {
        switch (this.f33085a) {
            case 0:
                return AbstractC10987u.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
