package p857kl;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.google.protobuf.AbstractC12107L1;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p016Ae.C0439a;
import p1113xn.AbstractC21322p;
import p228J.AbstractC3812N;
import p582Xk.HXHG.bQBnquXS;

/* JADX INFO: renamed from: kl.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C16477y extends AbstractC3812N {
    public C16477y() {
        super(8, 10);
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: O */
    public final void mo4524O(String name) {
        AbstractC16544l.m18094g(name, "name");
        List list = AbstractC16435B.f50983a;
        int i10 = 0;
        int i11 = 0;
        while (i10 < name.length()) {
            char cCharAt = name.charAt(i10);
            int i12 = i11 + 1;
            if (AbstractC16544l.m18096i(cCharAt, 32) <= 0 || AbstractC21322p.m21668B("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                StringBuilder sbM11058p = AbstractC10763a.m11058p("Header name '", name, "' contains illegal character '");
                sbM11058p.append(name.charAt(i11));
                sbM11058p.append("' (code ");
                throw new C0439a(AbstractC12107L1.m13826q(sbM11058p, name.charAt(i11) & 255, ')'));
            }
            i10++;
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final C16478z m18047Q() {
        Map values = (Map) this.f11539Z;
        AbstractC16544l.m18094g(values, "values");
        return new C16478z(values);
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: P */
    public final void mo4525P(String value) {
        AbstractC16544l.m18094g(value, "value");
        List list = AbstractC16435B.f50983a;
        int i10 = 0;
        int i11 = 0;
        while (i10 < value.length()) {
            char cCharAt = value.charAt(i10);
            int i12 = i11 + 1;
            if (AbstractC16544l.m18096i(cCharAt, 32) < 0 && cCharAt != '\t') {
                StringBuilder sbM11058p = AbstractC10763a.m11058p("Header value '", value, bQBnquXS.NESpKezoGcNHwVz);
                sbM11058p.append(value.charAt(i11));
                sbM11058p.append("' (code ");
                throw new C0439a(AbstractC12107L1.m13826q(sbM11058p, value.charAt(i11) & 255, ')'));
            }
            i10++;
            i11 = i12;
        }
    }
}
