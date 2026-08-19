package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.j2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14767j2 implements InterfaceC12151f0 {
    UNKNOWN_REASON(0),
    CLIENT_INITIATED(1),
    DUPLICATE_IDENTITY(2),
    SERVER_SHUTDOWN(3),
    PARTICIPANT_REMOVED(4),
    ROOM_DELETED(5),
    STATE_MISMATCH(6),
    JOIN_FAILURE(7),
    MIGRATION(8),
    SIGNAL_CLOSE(9),
    ROOM_CLOSED(10),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46208Y;

    EnumC14767j2(int i10) {
        this.f46208Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14767j2 m16052a(int i10) {
        switch (i10) {
            case 0:
                return UNKNOWN_REASON;
            case 1:
                return CLIENT_INITIATED;
            case 2:
                return DUPLICATE_IDENTITY;
            case 3:
                return SERVER_SHUTDOWN;
            case 4:
                return PARTICIPANT_REMOVED;
            case 5:
                return ROOM_DELETED;
            case 6:
                return STATE_MISMATCH;
            case 7:
                return JOIN_FAILURE;
            case 8:
                return MIGRATION;
            case 9:
                return SIGNAL_CLOSE;
            case 10:
                return ROOM_CLOSED;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46208Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
