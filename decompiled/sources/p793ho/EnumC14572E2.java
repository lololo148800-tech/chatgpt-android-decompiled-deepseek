package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.E2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14572E2 implements InterfaceC12151f0 {
    RR_UNKNOWN(0),
    RR_SIGNAL_DISCONNECTED(1),
    RR_PUBLISHER_FAILED(2),
    RR_SUBSCRIBER_FAILED(3),
    RR_SWITCH_CANDIDATE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45841Y;

    EnumC14572E2(int i10) {
        this.f45841Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14572E2 m16042a(int i10) {
        if (i10 == 0) {
            return RR_UNKNOWN;
        }
        if (i10 == 1) {
            return RR_SIGNAL_DISCONNECTED;
        }
        if (i10 == 2) {
            return RR_PUBLISHER_FAILED;
        }
        if (i10 == 3) {
            return RR_SUBSCRIBER_FAILED;
        }
        if (i10 != 4) {
            return null;
        }
        return RR_SWITCH_CANDIDATE;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45841Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
