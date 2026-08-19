package to;

import java.io.IOException;
import p160G5.p161rK.TVCuK;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: to.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C20035z extends IOException {

    /* JADX INFO: renamed from: Y */
    public final int f63454Y;

    /* JADX WARN: Illegal instructions before constructor call */
    public C20035z(int i10) {
        String str;
        AbstractC14376f.m15825D(i10, "errorCode");
        switch (i10) {
            case 1:
                str = "NO_ERROR";
                break;
            case 2:
                str = TVCuK.qQnqlMpibwbXnm;
                break;
            case 3:
                str = "INTERNAL_ERROR";
                break;
            case 4:
                str = "FLOW_CONTROL_ERROR";
                break;
            case 5:
                str = "SETTINGS_TIMEOUT";
                break;
            case 6:
                str = "STREAM_CLOSED";
                break;
            case 7:
                str = "FRAME_SIZE_ERROR";
                break;
            case 8:
                str = "REFUSED_STREAM";
                break;
            case 9:
                str = "CANCEL";
                break;
            case 10:
                str = "COMPRESSION_ERROR";
                break;
            case 11:
                str = "CONNECT_ERROR";
                break;
            case 12:
                str = "ENHANCE_YOUR_CALM";
                break;
            case 13:
                str = "INADEQUATE_SECURITY";
                break;
            case 14:
                str = "HTTP_1_1_REQUIRED";
                break;
            default:
                str = "null";
                break;
        }
        super("stream was reset: ".concat(str));
        this.f63454Y = i10;
    }
}
