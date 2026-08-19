package p228J;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p001A.C0018J;
import p003A1.AbstractC0168G;
import p084D4.C1920j;
import p178H.InterfaceC3153k;
import p283L5.AbstractC4941g;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8447A3;

/* JADX INFO: renamed from: J.B */
/* JADX INFO: loaded from: classes.dex */
public final class C3793B {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f11465a = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public final Object f11466b;

    /* JADX INFO: renamed from: c */
    public int f11467c;

    /* JADX INFO: renamed from: d */
    public final C1920j f11468d;

    /* JADX INFO: renamed from: e */
    public final HashMap f11469e;

    /* JADX INFO: renamed from: f */
    public int f11470f;

    public C3793B(C1920j c1920j) {
        Object obj = new Object();
        this.f11466b = obj;
        this.f11469e = new HashMap();
        this.f11467c = 1;
        synchronized (obj) {
            this.f11468d = c1920j;
            this.f11470f = this.f11467c;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m4461c(C0018J c0018j, EnumC3868w enumC3868w) {
        if (AbstractC8447A3.m9051c()) {
            AbstractC8447A3.m9052e(enumC3868w.ordinal(), "CX:State[" + c0018j + "]");
        }
    }

    /* JADX INFO: renamed from: a */
    public final C3791A m4462a(String str) {
        HashMap map = this.f11469e;
        for (InterfaceC3153k interfaceC3153k : map.keySet()) {
            if (str.equals(interfaceC3153k.mo105a().mo137b())) {
                return (C3791A) map.get(interfaceC3153k);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m4463b() {
        boolean zM8489f = AbstractC8072d6.m8489f("CameraStateRegistry");
        StringBuilder sb2 = this.f11465a;
        if (zM8489f) {
            sb2.setLength(0);
            sb2.append("Recalculating open cameras:\n");
            sb2.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb2.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry entry : this.f11469e.entrySet()) {
            if (AbstractC8072d6.m8489f("CameraStateRegistry")) {
                sb2.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC3153k) entry.getKey()).toString(), ((C3791A) entry.getValue()).f11459a != null ? ((C3791A) entry.getValue()).f11459a.toString() : "UNKNOWN"));
            }
            EnumC3868w enumC3868w = ((C3791A) entry.getValue()).f11459a;
            if (enumC3868w != null && enumC3868w.f11694Y) {
                i10++;
            }
        }
        if (AbstractC8072d6.m8489f("CameraStateRegistry")) {
            sb2.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb2.append(AbstractC0168G.m532u("Open count: ", i10, " (Max allowed: ", this.f11467c, Separators.RPAREN));
            AbstractC8072d6.m8486c("CameraStateRegistry", sb2.toString());
        }
        this.f11470f = Math.max(this.f11467c - i10, 0);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4464d(C0018J c0018j) {
        boolean z6;
        synchronized (this.f11466b) {
            try {
                C3791A c3791a = (C3791A) this.f11469e.get(c0018j);
                AbstractC4941g.m5558Q(c3791a, "Camera must first be registered with registerCamera()");
                z6 = true;
                if (AbstractC8072d6.m8489f("CameraStateRegistry")) {
                    this.f11465a.setLength(0);
                    StringBuilder sb2 = this.f11465a;
                    Locale locale = Locale.US;
                    int i10 = this.f11470f;
                    EnumC3868w enumC3868w = c3791a.f11459a;
                    boolean z10 = enumC3868w != null && enumC3868w.f11694Y;
                    sb2.append("tryOpenCamera(" + c0018j + ") [Available Cameras: " + i10 + ", Already Open: " + z10 + " (Previous state: " + c3791a.f11459a + ")]");
                }
                if (this.f11470f > 0) {
                    EnumC3868w enumC3868w2 = EnumC3868w.OPENING;
                    c3791a.f11459a = enumC3868w2;
                    m4461c(c0018j, enumC3868w2);
                } else {
                    EnumC3868w enumC3868w3 = c3791a.f11459a;
                    if (enumC3868w3 != null && enumC3868w3.f11694Y) {
                        EnumC3868w enumC3868w4 = EnumC3868w.OPENING;
                        c3791a.f11459a = enumC3868w4;
                        m4461c(c0018j, enumC3868w4);
                    } else {
                        z6 = false;
                    }
                }
                if (AbstractC8072d6.m8489f("CameraStateRegistry")) {
                    StringBuilder sb3 = this.f11465a;
                    Locale locale2 = Locale.US;
                    sb3.append(" --> ".concat(z6 ? "SUCCESS" : "FAIL"));
                    AbstractC8072d6.m8486c("CameraStateRegistry", this.f11465a.toString());
                }
                if (z6) {
                    m4463b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z6;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4465e(String str, String str2) {
        synchronized (this.f11466b) {
            try {
                boolean z6 = true;
                if (this.f11468d.f5617o0 != 2) {
                    return true;
                }
                C3791A c3791aM4462a = m4462a(str);
                EnumC3868w enumC3868w = c3791aM4462a != null ? c3791aM4462a.f11459a : null;
                C3791A c3791aM4462a2 = str2 != null ? m4462a(str2) : null;
                EnumC3868w enumC3868w2 = c3791aM4462a2 != null ? c3791aM4462a2.f11459a : null;
                EnumC3868w enumC3868w3 = EnumC3868w.OPEN;
                boolean z10 = enumC3868w3.equals(enumC3868w) || EnumC3868w.CONFIGURED.equals(enumC3868w);
                boolean z11 = enumC3868w3.equals(enumC3868w2) || EnumC3868w.CONFIGURED.equals(enumC3868w2);
                if (!z10 || !z11) {
                    z6 = false;
                }
                return z6;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
