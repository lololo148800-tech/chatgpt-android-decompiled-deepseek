package p556Wk;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import np.AbstractC17712d;
import np.InterfaceC17710b;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import sl.C19666a;

/* JADX INFO: renamed from: Wk.k */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8929k {

    /* JADX INFO: renamed from: a */
    public static final C19666a f27305a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC17710b f27306b;

    static {
        InterfaceC3777y interfaceC3777yM18075c;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        f27305a = new C19666a("ValidateMark", new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c));
        f27306b = AbstractC17712d.m19445b().m19898a().mo19435a("io.ktor.client.plugins.DefaultResponseValidation");
    }
}
