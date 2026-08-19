package p485Tk;

import kotlin.jvm.internal.AbstractC16526C;
import p025An.C0569E;
import p1111xl.C21296a;
import p225Im.C3743B;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p409Qk.C6754e;
import sl.C19666a;

/* JADX INFO: renamed from: Tk.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7499h {

    /* JADX INFO: renamed from: a */
    public static final C0569E f23800a = new C0569E("call-context");

    /* JADX INFO: renamed from: b */
    public static final C19666a f23801b;

    static {
        InterfaceC3777y interfaceC3777yM18076d;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C6754e.class);
        try {
            interfaceC3777yM18076d = AbstractC16526C.m18076d(C6754e.class, C3743B.f11391c);
        } catch (Throwable unused) {
            interfaceC3777yM18076d = null;
        }
        f23801b = new C19666a("client-config", new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18076d));
    }
}
