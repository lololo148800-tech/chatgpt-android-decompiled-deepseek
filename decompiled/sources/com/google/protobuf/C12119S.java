package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C12119S implements InterfaceC12085E0 {

    /* JADX INFO: renamed from: b */
    public static final C12119S f36978b = new C12119S(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36979a;

    public /* synthetic */ C12119S(int i10) {
        this.f36979a = i10;
    }

    @Override // com.google.protobuf.InterfaceC12085E0
    /* JADX INFO: renamed from: a */
    public final C12132Y0 mo13735a(Class cls) {
        switch (this.f36979a) {
            case 0:
                if (!AbstractC12133Z.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C12132Y0) AbstractC12133Z.getDefaultInstance(cls.asSubclass(AbstractC12133Z.class)).buildMessageInfo();
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.protobuf.InterfaceC12085E0
    /* JADX INFO: renamed from: b */
    public final boolean mo13736b(Class cls) {
        switch (this.f36979a) {
            case 0:
                return AbstractC12133Z.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
