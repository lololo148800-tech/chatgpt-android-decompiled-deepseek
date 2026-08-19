package p463Sn;

import ao.C11163f0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import mm.C17314q;
import p016Ae.C0439a;
import p324Mn.C5522C;
import p324Mn.C5523D;
import p346Nn.AbstractC5879T;
import p346Nn.C5878S;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;
import p817j$.time.LocalTime;
import p817j$.time.format.DateTimeParseException;

/* JADX INFO: renamed from: Sn.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C7159l implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C7159l f22760a = new C7159l();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f22761b = AbstractC11336c.m12772b("kotlinx.datetime.LocalTime", C10104e.f29918j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        C5522C c5522c = C5523D.Companion;
        String input = decoder.mo5479m();
        C17314q c17314q = AbstractC5879T.f19208a;
        C5878S format = (C5878S) c17314q.getValue();
        c5522c.getClass();
        AbstractC16544l.m18094g(input, "input");
        AbstractC16544l.m18094g(format, "format");
        if (format != ((C5878S) c17314q.getValue())) {
            return (C5523D) format.m6312c(input);
        }
        try {
            return new C5523D(LocalTime.parse(input));
        } catch (DateTimeParseException e10) {
            throw new C0439a(e10);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f22761b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5523D value = (C5523D) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        encoder.mo5566G(value.toString());
    }
}
