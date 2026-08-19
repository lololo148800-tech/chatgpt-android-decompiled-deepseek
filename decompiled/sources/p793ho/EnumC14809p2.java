package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.p2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14809p2 implements InterfaceC12151f0 {
    STANDARD(0),
    INGRESS(1),
    EGRESS(2),
    SIP(3),
    AGENT(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46277Y;

    EnumC14809p2(int i10) {
        this.f46277Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46277Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
