package p214Ib;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import p379Pb.C6381b;
import p379Pb.C6383d;

/* JADX INFO: renamed from: Ib.y */
/* JADX INFO: loaded from: classes.dex */
public final enum C3682y extends EnumC3655A {
    public C3682y() {
        super("LONG_OR_DOUBLE", 2);
    }

    @Override // p214Ib.EnumC3655A
    /* JADX INFO: renamed from: a */
    public final Number mo4357a(C6381b c6381b) throws IOException {
        String strMo5634x = c6381b.mo5634x();
        try {
            try {
                return Long.valueOf(Long.parseLong(strMo5634x));
            } catch (NumberFormatException unused) {
                Double dValueOf = Double.valueOf(strMo5634x);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!c6381b.f20777Z) {
                        throw new C6383d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c6381b.mo5633j0());
                    }
                }
                return dValueOf;
            }
        } catch (NumberFormatException e10) {
            StringBuilder sbM11058p = AbstractC10763a.m11058p("Cannot parse ", strMo5634x, "; at path ");
            sbM11058p.append(c6381b.mo5633j0());
            throw new C3677t(sbM11058p.toString(), e10);
        }
    }
}
