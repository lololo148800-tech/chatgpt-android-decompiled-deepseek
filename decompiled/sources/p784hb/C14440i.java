package p784hb;

import gb.AbstractC13835a;
import io.sentry.hints.C15370i;
import p1009s9.C19506i;
import p1061vb.C20513d;
import p140Fa.C2685e;
import p451Sb.C7102a;
import p499U9.C7591u;
import p525Vb.C8258a;
import p959q8.C18639a;

/* JADX INFO: renamed from: hb.i */
/* JADX INFO: loaded from: classes.dex */
public final class C14440i {

    /* JADX INFO: renamed from: b */
    public static final C14440i f45415b;

    /* JADX INFO: renamed from: a */
    public final InterfaceC14439h f45416a;

    static {
        new C14440i(new C7102a(27));
        new C14440i(new C18639a(27));
        new C14440i(new C2685e());
        f45415b = new C14440i(new C20513d());
        new C14440i(new C7591u(27));
        new C14440i(new C15370i(27));
        new C14440i(new C8258a());
    }

    public C14440i(InterfaceC14441j interfaceC14441j) {
        if (AbstractC13835a.f43871a.get()) {
            this.f45416a = new C14438g(interfaceC14441j);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f45416a = new C14437f(interfaceC14441j);
        } else {
            this.f45416a = new C19506i(interfaceC14441j, 28);
        }
    }
}
