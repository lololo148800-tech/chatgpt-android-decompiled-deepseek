package p594Y9;

import java.io.IOException;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import mo.AbstractC17325B;
import mo.C17349p;
import mo.C17352s;
import mo.C17358y;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17957b0;
import p944p8.C18309a;

/* JADX INFO: renamed from: Y9.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9771N {
    /* JADX INFO: renamed from: a */
    public static final C18309a m10377a(C17358y c17358y, boolean z6) {
        long jMo4142a;
        String str;
        AbstractC16544l.m18094g(c17358y, "<this>");
        UUID uuidRandomUUID = (UUID) UUID.class.cast(c17358y.f55383e.get(UUID.class));
        if (uuidRandomUUID == null) {
            uuidRandomUUID = z6 ? UUID.randomUUID() : null;
        }
        String str2 = c17358y.f55380b;
        C17349p c17349p = c17358y.f55379a;
        AbstractC17325B abstractC17325B = c17358y.f55382d;
        if (abstractC17325B == null) {
            str = str2 + "•" + c17349p;
        } else {
            try {
                jMo4142a = abstractC17325B.mo4142a();
            } catch (IOException unused) {
                jMo4142a = 0;
            }
            C17352s c17352sMo4143b = abstractC17325B.mo4143b();
            if (c17352sMo4143b == null && jMo4142a == 0) {
                str = str2 + "•" + c17349p;
            } else {
                str = str2 + "•" + c17349p + "•" + jMo4142a + "•" + c17352sMo4143b;
            }
        }
        return new C18309a(str, uuidRandomUUID != null ? uuidRandomUUID.toString() : null);
    }

    /* JADX INFO: renamed from: b */
    public static C17957b0 m10378b(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("code_type");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("parent_process");
            String strMo4384r2 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("incident_identifier");
            String strMo4384r3 = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("process");
            String strMo4384r4 = abstractC3673pM4395w4 != null ? abstractC3673pM4395w4.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w5 = c3676s.m4395w("exception_type");
            String strMo4384r5 = abstractC3673pM4395w5 != null ? abstractC3673pM4395w5.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w6 = c3676s.m4395w("exception_codes");
            String strMo4384r6 = abstractC3673pM4395w6 != null ? abstractC3673pM4395w6.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w7 = c3676s.m4395w("path");
            return new C17957b0(strMo4384r, strMo4384r2, strMo4384r3, strMo4384r4, strMo4384r5, strMo4384r6, abstractC3673pM4395w7 != null ? abstractC3673pM4395w7.mo4384r() : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Meta", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Meta", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Meta", e12);
        }
    }
}
