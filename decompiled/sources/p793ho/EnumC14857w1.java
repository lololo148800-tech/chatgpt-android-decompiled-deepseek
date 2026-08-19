package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.w1 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14857w1 implements InterfaceC12151f0 {
    H264_720P_30FPS_3_LAYERS(0),
    H264_1080P_30FPS_3_LAYERS(1),
    H264_540P_25FPS_2_LAYERS(2),
    H264_720P_30FPS_1_LAYER(3),
    H264_1080P_30FPS_1_LAYER(4),
    H264_720P_30FPS_3_LAYERS_HIGH_MOTION(5),
    H264_1080P_30FPS_3_LAYERS_HIGH_MOTION(6),
    H264_540P_25FPS_2_LAYERS_HIGH_MOTION(7),
    H264_720P_30FPS_1_LAYER_HIGH_MOTION(8),
    H264_1080P_30FPS_1_LAYER_HIGH_MOTION(9),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46344Y;

    EnumC14857w1(int i10) {
        this.f46344Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46344Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
