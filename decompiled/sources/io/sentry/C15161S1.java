package io.sentry;

import io.sentry.protocol.C15447t;
import io.sentry.protocol.EnumC15423C;
import java.util.UUID;
import p001A.C0093v0;
import p117Eb.C2391u;
import p310M9.C5311e;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8489H3;

/* JADX INFO: renamed from: io.sentry.S1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15161S1 extends C15138K1 {

    /* JADX INFO: renamed from: B0 */
    public static final EnumC15423C f47208B0 = EnumC15423C.CUSTOM;

    /* JADX INFO: renamed from: A0 */
    public EnumC15168V f47209A0;

    /* JADX INFO: renamed from: w0 */
    public String f47210w0;

    /* JADX INFO: renamed from: x0 */
    public EnumC15423C f47211x0;

    /* JADX INFO: renamed from: y0 */
    public C2391u f47212y0;

    /* JADX INFO: renamed from: z0 */
    public C0093v0 f47213z0;

    public C15161S1(String str, EnumC15423C enumC15423C, String str2, C2391u c2391u) {
        super(new C15447t((UUID) null), new C15144M1(), str2, null, null);
        this.f47209A0 = EnumC15168V.SENTRY;
        AbstractC8483G3.m9133c(str, "name is required");
        this.f47210w0 = str;
        this.f47211x0 = enumC15423C;
        this.f47147p0 = c2391u;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX INFO: renamed from: a */
    public static C15161S1 m16342a(C5311e c5311e) {
        Double dValueOf;
        c5311e.getClass();
        C0093v0 c0093v0 = (C0093v0) c5311e.f17486p0;
        C2391u c2391u = null;
        if (c0093v0 != null) {
            c0093v0.f403Z = false;
            String strM346o = c0093v0.m346o("sentry-sample_rate");
            if (strM346o != null) {
                try {
                    double d10 = Double.parseDouble(strM346o);
                    if (AbstractC8489H3.m9146d(Double.valueOf(d10), false)) {
                        dValueOf = Double.valueOf(d10);
                    } else {
                        dValueOf = null;
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                dValueOf = null;
            }
            c2391u = dValueOf != null ? new C2391u((Boolean) false, dValueOf) : new C2391u((Boolean) false, (Double) null);
        }
        C15161S1 c15161s1 = new C15161S1((C15447t) c5311e.f17484Z, (C15144M1) c5311e.f17485o0, "default", null, null);
        c15161s1.f47209A0 = EnumC15168V.SENTRY;
        c15161s1.f47210w0 = "<unlabeled transaction>";
        c15161s1.f47212y0 = c2391u;
        c15161s1.f47211x0 = f47208B0;
        c15161s1.f47213z0 = c0093v0;
        return c15161s1;
    }
}
