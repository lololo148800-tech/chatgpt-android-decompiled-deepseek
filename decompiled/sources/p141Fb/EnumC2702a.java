package p141Fb;

import p1024tb.InterfaceC19831b;

/* JADX INFO: renamed from: Fb.a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2702a implements InterfaceC19831b {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* JADX INFO: renamed from: Y */
    public final int f8314Y;

    EnumC2702a(int i10) {
        this.f8314Y = i10;
    }

    @Override // p1024tb.InterfaceC19831b
    public final int getNumber() {
        return this.f8314Y;
    }
}
