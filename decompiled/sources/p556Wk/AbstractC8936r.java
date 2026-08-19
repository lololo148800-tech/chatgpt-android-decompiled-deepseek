package p556Wk;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p008A6.C0383c;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p582Xk.C9526c;
import p594Y9.AbstractC9949p4;
import sl.C19666a;

/* JADX INFO: renamed from: Wk.r */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8936r {

    /* JADX INFO: renamed from: a */
    public static final C19666a f27327a;

    /* JADX INFO: renamed from: b */
    public static final C19666a f27328b;

    /* JADX INFO: renamed from: c */
    public static final C9526c f27329c;

    static {
        InterfaceC3777y interfaceC3777yM18075c;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        InterfaceC3777y interfaceC3777yM18075c2 = null;
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        f27327a = new C19666a("SkipSaveBody", new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c));
        InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        try {
            interfaceC3777yM18075c2 = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused2) {
        }
        f27328b = new C19666a("ResponseBodySaved", new C21296a(interfaceC3756dMo5693b2, interfaceC3777yM18075c2));
        f27329c = AbstractC9949p4.m10607a("DoubleReceivePlugin", C8935q.f27326Y, new C0383c(13));
    }
}
