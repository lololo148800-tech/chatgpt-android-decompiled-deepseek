package p463Sn;

import ao.C11163f0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import mm.C17314q;
import p324Mn.AbstractC5530K;
import p324Mn.C5526G;
import p324Mn.C5527H;
import p346Nn.AbstractC5925t0;
import p346Nn.C5921r0;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;
import p817j$.time.format.DateTimeFormatter;

/* JADX INFO: renamed from: Sn.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C7163p implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C7163p f22768a = new C7163p();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f22769b = AbstractC11336c.m12772b("kotlinx.datetime.UtcOffset", C10104e.f29918j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        C5526G c5526g = C5527H.Companion;
        String input = decoder.mo5479m();
        C17314q c17314q = AbstractC5925t0.f19299a;
        C5921r0 format = (C5921r0) c17314q.getValue();
        c5526g.getClass();
        AbstractC16544l.m18094g(input, "input");
        AbstractC16544l.m18094g(format, "format");
        if (format == ((C5921r0) c17314q.getValue())) {
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) AbstractC5530K.f17983a.getValue();
            AbstractC16544l.m18093f(dateTimeFormatter, "access$getIsoFormat(...)");
            return AbstractC5530K.m5928b(input, dateTimeFormatter);
        }
        if (format == ((C5921r0) AbstractC5925t0.f19300b.getValue())) {
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) AbstractC5530K.f17984b.getValue();
            AbstractC16544l.m18093f(dateTimeFormatter2, "access$getIsoBasicFormat(...)");
            return AbstractC5530K.m5928b(input, dateTimeFormatter2);
        }
        if (format != ((C5921r0) AbstractC5925t0.f19301c.getValue())) {
            return (C5527H) format.m6312c(input);
        }
        DateTimeFormatter dateTimeFormatter3 = (DateTimeFormatter) AbstractC5530K.f17985c.getValue();
        AbstractC16544l.m18093f(dateTimeFormatter3, "access$getFourDigitsFormat(...)");
        return AbstractC5530K.m5928b(input, dateTimeFormatter3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f22769b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5527H value = (C5527H) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        encoder.mo5566G(value.toString());
    }
}
