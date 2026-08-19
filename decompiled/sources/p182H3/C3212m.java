package p182H3;

import android.media.MediaCodec;
import p031B3.AbstractC0801e;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: H3.m */
/* JADX INFO: loaded from: classes.dex */
public class C3212m extends AbstractC0801e {

    /* JADX INFO: renamed from: Y */
    public final int f9702Y;

    public C3212m(IllegalStateException illegalStateException, C3213n c3213n) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb2.append(c3213n == null ? null : c3213n.f9703a);
        super(sb2.toString(), illegalStateException);
        int i10 = AbstractC20817s.f66106a;
        if (i10 >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f9702Y = i10 >= 23 ? illegalStateException instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : AbstractC20817s.m21417r(diagnosticInfo);
    }
}
