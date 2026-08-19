package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.Z3 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14699Z3 implements InterfaceC12151f0 {
    OK(0),
    NOT_FOUND(1),
    NOT_ALLOWED(2),
    LIMIT_EXCEEDED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46018Y;

    EnumC14699Z3(int i10) {
        this.f46018Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46018Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
