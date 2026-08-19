package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.b2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14711b2 implements InterfaceC12151f0 {
    UNKNOWN(0),
    JS(1),
    SWIFT(2),
    ANDROID(3),
    FLUTTER(4),
    GO(5),
    UNITY(6),
    REACT_NATIVE(7),
    RUST(8),
    PYTHON(9),
    CPP(10),
    UNITY_WEB(11),
    NODE(12),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46042Y;

    EnumC14711b2(int i10) {
        this.f46042Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46042Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
