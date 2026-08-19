package p463Sn;

import ao.C11163f0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import mm.C17314q;
import p016Ae.C0439a;
import p324Mn.AbstractC5553w;
import p324Mn.C5552v;
import p324Mn.C5554x;
import p346Nn.AbstractC5873M;
import p346Nn.AbstractC5886a;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;
import p817j$.time.LocalDate;
import p817j$.time.format.DateTimeParseException;

/* JADX INFO: renamed from: Sn.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C7157j implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C7157j f22756a = new C7157j();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f22757b = AbstractC11336c.m12772b("kotlinx.datetime.LocalDate", C10104e.f29918j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        C5552v c5552v = C5554x.Companion;
        String input = decoder.mo5479m();
        int i10 = AbstractC5553w.f18005a;
        C17314q c17314q = AbstractC5873M.f19199a;
        AbstractC5886a format = (AbstractC5886a) c17314q.getValue();
        c5552v.getClass();
        AbstractC16544l.m18094g(input, "input");
        AbstractC16544l.m18094g(format, "format");
        if (format != ((AbstractC5886a) c17314q.getValue())) {
            return (C5554x) format.m6312c(input);
        }
        try {
            return new C5554x(LocalDate.parse(input));
        } catch (DateTimeParseException e10) {
            throw new C0439a(e10);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f22757b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5554x value = (C5554x) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        encoder.mo5566G(value.toString());
    }
}
