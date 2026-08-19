package p364Oh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p909nm.AbstractC17681o;
import sl.C19666a;

/* JADX INFO: renamed from: Oh.o */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6241o {

    /* JADX INFO: renamed from: a */
    public static final C19666a f20319a;

    /* JADX INFO: renamed from: b */
    public static final C19666a f20320b;

    /* JADX INFO: renamed from: c */
    public static final C19666a f20321c;

    /* JADX INFO: renamed from: d */
    public static final C19666a f20322d;

    /* JADX INFO: renamed from: e */
    public static final List f20323e;

    static {
        InterfaceC3777y interfaceC3777yM18075c;
        InterfaceC3777y interfaceC3777yM18075c2;
        InterfaceC3777y interfaceC3777yM18075c3;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        InterfaceC3777y interfaceC3777yM18075c4 = null;
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        f20319a = new C19666a("NoAuth", new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c));
        InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        try {
            interfaceC3777yM18075c2 = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused2) {
            interfaceC3777yM18075c2 = null;
        }
        f20320b = new C19666a("MixedAuth", new C21296a(interfaceC3756dMo5693b2, interfaceC3777yM18075c2));
        InterfaceC3756d interfaceC3756dMo5693b3 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        try {
            interfaceC3777yM18075c3 = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused3) {
            interfaceC3777yM18075c3 = null;
        }
        f20321c = new C19666a("NoAccountId", new C21296a(interfaceC3756dMo5693b3, interfaceC3777yM18075c3));
        InterfaceC3756d interfaceC3756dMo5693b4 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        try {
            interfaceC3777yM18075c4 = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused4) {
        }
        f20322d = new C19666a("NoIntegrityCheck", new C21296a(interfaceC3756dMo5693b4, interfaceC3777yM18075c4));
        f20323e = AbstractC17681o.m19382k("openai.com", "chatgpt.com", "chatgpt-staging.com", "api.openai.org");
    }
}
