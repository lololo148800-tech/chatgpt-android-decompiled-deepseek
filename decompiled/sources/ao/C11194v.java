package ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p523V9.AbstractC8128k6;
import p606Yn.C10104e;

/* JADX INFO: renamed from: ao.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C11194v implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11194v f33849a = new C11194v();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f33850b = new C11163f0("kotlin.time.Duration", C10104e.f29918j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        C21554a c21554a = C21555b.f68260Z;
        String value = decoder.mo5479m();
        AbstractC16544l.m18094g(value, "value");
        try {
            return new C21555b(AbstractC8128k6.m8636b(value));
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(AbstractC10763a.m11054l("Invalid ISO duration string format: '", value, "'."), e10);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33850b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j10 = ((C21555b) obj).f68263Y;
        AbstractC16544l.m18094g(encoder, "encoder");
        C21554a c21554a = C21555b.f68260Z;
        StringBuilder sb2 = new StringBuilder();
        if (j10 < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jM21843m = j10 < 0 ? C21555b.m21843m(j10) : j10;
        long jM21841k = C21555b.m21841k(jM21843m, EnumC21557d.HOURS);
        boolean z6 = false;
        int iM21841k = C21555b.m21838h(jM21843m) ? 0 : (int) (C21555b.m21841k(jM21843m, EnumC21557d.MINUTES) % ((long) 60));
        int iM21841k2 = C21555b.m21838h(jM21843m) ? 0 : (int) (C21555b.m21841k(jM21843m, EnumC21557d.SECONDS) % ((long) 60));
        int iM21836f = C21555b.m21836f(jM21843m);
        if (C21555b.m21838h(j10)) {
            jM21841k = 9999999999999L;
        }
        boolean z10 = jM21841k != 0;
        boolean z11 = (iM21841k2 == 0 && iM21836f == 0) ? false : true;
        if (iM21841k != 0 || (z11 && z10)) {
            z6 = true;
        }
        if (z10) {
            sb2.append(jM21841k);
            sb2.append('H');
        }
        if (z6) {
            sb2.append(iM21841k);
            sb2.append('M');
        }
        if (z11 || (!z10 && !z6)) {
            C21555b.m21832b(sb2, iM21841k2, iM21836f, 9, TokenNames.f32018S, true);
        }
        encoder.mo5566G(sb2.toString());
    }
}
