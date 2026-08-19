package p324Mn;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.WebrtcBuildVersion;
import p1113xn.AbstractC21322p;
import p463Sn.C7151d;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Mn.e */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8975g(with = C7151d.class)
public abstract class AbstractC5535e {
    public static final C5534d Companion = new C5534d();

    /* JADX INFO: renamed from: a */
    public abstract int mo5930a();

    /* JADX INFO: renamed from: b */
    public int mo5931b() {
        return (int) (mo5936g() / 3600000000000L);
    }

    /* JADX INFO: renamed from: c */
    public int mo5932c() {
        return (int) ((mo5936g() % 3600000000000L) / 60000000000L);
    }

    /* JADX INFO: renamed from: d */
    public int mo5933d() {
        return (int) (mo5936g() % ((long) 1000000000));
    }

    /* JADX INFO: renamed from: e */
    public int mo5934e() {
        return (int) ((mo5936g() % 60000000000L) / ((long) 1000000000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5535e)) {
            return false;
        }
        AbstractC5535e abstractC5535e = (AbstractC5535e) obj;
        return mo5935f() == abstractC5535e.mo5935f() && mo5930a() == abstractC5535e.mo5930a() && mo5936g() == abstractC5535e.mo5936g();
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo5935f();

    /* JADX INFO: renamed from: g */
    public abstract long mo5936g();

    public final int hashCode() {
        int iMo5930a = (mo5930a() + (mo5935f() * 31)) * 31;
        long jMo5936g = mo5936g();
        return iMo5930a + ((int) (jMo5936g ^ (jMo5936g >>> 32)));
    }

    public final String toString() {
        int i10;
        Object objValueOf;
        StringBuilder sb2 = new StringBuilder();
        if (mo5935f() > 0 || mo5930a() > 0 || mo5936g() > 0 || ((mo5935f() | mo5930a()) == 0 && mo5936g() == 0)) {
            i10 = 1;
        } else {
            sb2.append('-');
            i10 = -1;
        }
        sb2.append('P');
        if (mo5935f() / 12 != 0) {
            sb2.append((mo5935f() / 12) * i10);
            sb2.append('Y');
        }
        if (mo5935f() % 12 != 0) {
            sb2.append((mo5935f() % 12) * i10);
            sb2.append('M');
        }
        if (mo5930a() != 0) {
            sb2.append(mo5930a() * i10);
            sb2.append('D');
        }
        int iMo5931b = mo5931b();
        String str = "";
        String str2 = TokenNames.f32019T;
        if (iMo5931b != 0) {
            sb2.append(TokenNames.f32019T);
            sb2.append(mo5931b() * i10);
            sb2.append('H');
            str2 = "";
        }
        if (mo5932c() != 0) {
            sb2.append(str2);
            sb2.append(mo5932c() * i10);
            sb2.append('M');
        } else {
            str = str2;
        }
        if ((mo5934e() | mo5933d()) != 0) {
            sb2.append(str);
            if (mo5934e() != 0) {
                objValueOf = Integer.valueOf(mo5934e() * i10);
            } else {
                objValueOf = mo5933d() * i10 < 0 ? "-0" : WebrtcBuildVersion.maint_version;
            }
            sb2.append(objValueOf);
            if (mo5933d() != 0) {
                sb2.append('.');
                sb2.append(AbstractC21322p.m21686T(9, String.valueOf(Math.abs(mo5933d()))));
            }
            sb2.append('S');
        }
        if (sb2.length() == 1) {
            sb2.append("0D");
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
