package p324Mn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p016Ae.C0439a;
import p346Nn.AbstractC5912n;
import p346Nn.C5914o;
import p346Nn.C5920r;
import p463Sn.C7156i;
import p817j$.time.DateTimeException;
import p817j$.time.Instant;

/* JADX INFO: renamed from: Mn.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C5550t {
    /* JADX INFO: renamed from: a */
    public static C5551u m5942a(long j10) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j10);
        AbstractC16544l.m18093f(instantOfEpochMilli, "ofEpochMilli(...)");
        return new C5551u(instantOfEpochMilli);
    }

    /* JADX INFO: renamed from: b */
    public static C5551u m5943b(long j10, long j11) throws Exception {
        try {
            Instant instantOfEpochSecond = Instant.ofEpochSecond(j10, j11);
            AbstractC16544l.m18093f(instantOfEpochSecond, "ofEpochSecond(...)");
            return new C5551u(instantOfEpochSecond);
        } catch (Exception e10) {
            if ((e10 instanceof ArithmeticException) || (e10 instanceof DateTimeException)) {
                return j10 > 0 ? C5551u.f18003q0 : C5551u.f18002p0;
            }
            throw e10;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C5551u m5944c(C5550t c5550t, String input) {
        C5920r format = AbstractC5912n.f19275a;
        c5550t.getClass();
        AbstractC16544l.m18094g(input, "input");
        AbstractC16544l.m18094g(format, "format");
        try {
            return ((C5914o) format.m6312c(input)).m6313a();
        } catch (IllegalArgumentException e10) {
            throw new C0439a("Failed to parse an instant from '" + ((Object) input) + '\'', e10);
        }
    }

    public final KSerializer serializer() {
        return C7156i.f22754a;
    }
}
