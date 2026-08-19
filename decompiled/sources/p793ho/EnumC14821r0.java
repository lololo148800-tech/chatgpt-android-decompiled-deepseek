package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.r0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14821r0 implements InterfaceC12151f0 {
    H264_720P_30(0),
    H264_720P_60(1),
    H264_1080P_30(2),
    H264_1080P_60(3),
    PORTRAIT_H264_720P_30(4),
    PORTRAIT_H264_720P_60(5),
    PORTRAIT_H264_1080P_30(6),
    PORTRAIT_H264_1080P_60(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46295Y;

    EnumC14821r0(int i10) {
        this.f46295Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14821r0 m16055a(int i10) {
        switch (i10) {
            case 0:
                return H264_720P_30;
            case 1:
                return H264_720P_60;
            case 2:
                return H264_1080P_30;
            case 3:
                return H264_1080P_60;
            case 4:
                return PORTRAIT_H264_720P_30;
            case 5:
                return PORTRAIT_H264_720P_60;
            case 6:
                return PORTRAIT_H264_1080P_30;
            case 7:
                return PORTRAIT_H264_1080P_60;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46295Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
