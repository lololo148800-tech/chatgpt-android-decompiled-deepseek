package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.Z0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14696Z0 implements InterfaceC12151f0 {
    DEFAULT_PROTOCOL(0),
    RTMP(1),
    SRT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46011Y;

    EnumC14696Z0(int i10) {
        this.f46011Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46011Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
