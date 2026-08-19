package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.w */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14855w implements InterfaceC12151f0 {
    WS_AVAILABLE(0),
    WS_FULL(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46331Y;

    EnumC14855w(int i10) {
        this.f46331Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46331Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
