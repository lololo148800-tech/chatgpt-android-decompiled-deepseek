package p324Mn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p016Ae.C0439a;
import p346Nn.C5875O;
import p463Sn.C7158k;
import p817j$.time.LocalDateTime;
import p817j$.time.format.DateTimeParseException;

/* JADX INFO: renamed from: Mn.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C5556z {
    /* JADX INFO: renamed from: a */
    public static C5521B m5949a(C5556z c5556z, String input) {
        C5875O format = AbstractC5520A.f17974a;
        c5556z.getClass();
        AbstractC16544l.m18094g(input, "input");
        AbstractC16544l.m18094g(format, "format");
        try {
            return new C5521B(LocalDateTime.parse(input));
        } catch (DateTimeParseException e10) {
            throw new C0439a(e10);
        }
    }

    public final KSerializer serializer() {
        return C7158k.f22758a;
    }
}
