package p141Fb;

import p1024tb.InterfaceC19831b;

/* JADX INFO: renamed from: Fb.b */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2703b implements InterfaceC19831b {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* JADX INFO: renamed from: Y */
    public final int f8318Y;

    EnumC2703b(int i10) {
        this.f8318Y = i10;
    }

    @Override // p1024tb.InterfaceC19831b
    public final int getNumber() {
        return this.f8318Y;
    }
}
