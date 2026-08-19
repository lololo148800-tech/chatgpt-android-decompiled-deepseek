package p214Ib;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import java.math.BigDecimal;
import p379Pb.C6381b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ib.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC3655A {

    /* JADX INFO: renamed from: Y */
    public static final C3680w f11138Y;

    /* JADX INFO: renamed from: Z */
    public static final C3681x f11139Z;

    /* JADX INFO: renamed from: o0 */
    public static final C3682y f11140o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC3655A[] f11141p0;

    static {
        C3680w c3680w = new C3680w();
        f11138Y = c3680w;
        C3681x c3681x = new C3681x();
        f11139Z = c3681x;
        C3682y c3682y = new C3682y();
        f11140o0 = c3682y;
        f11141p0 = new EnumC3655A[]{c3680w, c3681x, c3682y, new EnumC3655A() { // from class: Ib.z
            @Override // p214Ib.EnumC3655A
            /* JADX INFO: renamed from: a */
            public final Number mo4357a(C6381b c6381b) throws IOException {
                String strMo5634x = c6381b.mo5634x();
                try {
                    return new BigDecimal(strMo5634x);
                } catch (NumberFormatException e10) {
                    StringBuilder sbM11058p = AbstractC10763a.m11058p("Cannot parse ", strMo5634x, "; at path ");
                    sbM11058p.append(c6381b.mo5633j0());
                    throw new C3677t(sbM11058p.toString(), e10);
                }
            }
        }};
    }

    public static EnumC3655A valueOf(String str) {
        return (EnumC3655A) Enum.valueOf(EnumC3655A.class, str);
    }

    public static EnumC3655A[] values() {
        return (EnumC3655A[]) f11141p0.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract Number mo4357a(C6381b c6381b);
}
