package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.g4 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14748g4 implements InterfaceC12151f0 {
    PUBLISHER(0),
    SUBSCRIBER(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46132Y;

    EnumC14748g4(int i10) {
        this.f46132Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46132Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
