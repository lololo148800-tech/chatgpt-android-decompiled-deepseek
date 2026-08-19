package p663b9;

import p1024tb.InterfaceC19831b;

/* JADX INFO: renamed from: b9.c */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC11264c implements InterfaceC19831b {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* JADX INFO: renamed from: Y */
    public final int f34129Y;

    EnumC11264c(int i10) {
        this.f34129Y = i10;
    }

    @Override // p1024tb.InterfaceC19831b
    public final int getNumber() {
        return this.f34129Y;
    }
}
