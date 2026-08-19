package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.m4 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14790m4 implements InterfaceC12151f0 {
    ACTIVE(0),
    PAUSED(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46239Y;

    EnumC14790m4(int i10) {
        this.f46239Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46239Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
