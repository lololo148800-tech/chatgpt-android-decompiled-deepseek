package p141Fb;

import p1024tb.InterfaceC19831b;

/* JADX INFO: renamed from: Fb.c */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2704c implements InterfaceC19831b {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* JADX INFO: renamed from: Y */
    public final int f8321Y;

    EnumC2704c(int i10) {
        this.f8321Y = i10;
    }

    @Override // p1024tb.InterfaceC19831b
    public final int getNumber() {
        return this.f8321Y;
    }
}
