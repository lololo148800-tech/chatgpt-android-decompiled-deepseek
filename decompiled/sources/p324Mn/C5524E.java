package p324Mn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p016Ae.C0439a;
import p463Sn.C7162o;
import p817j$.time.DateTimeException;
import p817j$.time.ZoneId;
import p817j$.time.ZoneOffset;

/* JADX INFO: renamed from: Mn.E */
/* JADX INFO: loaded from: classes2.dex */
public final class C5524E {
    /* JADX INFO: renamed from: a */
    public static C5525F m5924a() {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        AbstractC16544l.m18093f(zoneIdSystemDefault, "systemDefault(...)");
        return m5926c(zoneIdSystemDefault);
    }

    /* JADX INFO: renamed from: b */
    public static C5525F m5925b(String zoneId) throws Exception {
        AbstractC16544l.m18094g(zoneId, "zoneId");
        try {
            ZoneId zoneIdM16881of = ZoneId.m16881of(zoneId);
            AbstractC16544l.m18093f(zoneIdM16881of, "of(...)");
            return m5926c(zoneIdM16881of);
        } catch (Exception e10) {
            if (e10 instanceof DateTimeException) {
                throw new C0439a(e10);
            }
            throw e10;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C5525F m5926c(ZoneId zoneId) {
        boolean zIsFixedOffset;
        if (zoneId instanceof ZoneOffset) {
            return new C5549s(new C5527H((ZoneOffset) zoneId));
        }
        try {
            zIsFixedOffset = zoneId.getRules().isFixedOffset();
        } catch (ArrayIndexOutOfBoundsException unused) {
            zIsFixedOffset = false;
        }
        if (!zIsFixedOffset) {
            return new C5525F(zoneId);
        }
        ZoneId zoneIdNormalized = zoneId.normalized();
        AbstractC16544l.m18092e(zoneIdNormalized, "null cannot be cast to non-null type java.time.ZoneOffset");
        new C5527H((ZoneOffset) zoneIdNormalized);
        return new C5549s(zoneId);
    }

    public final KSerializer serializer() {
        return C7162o.f22766a;
    }
}
