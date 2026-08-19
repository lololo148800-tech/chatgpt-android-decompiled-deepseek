package p556Wk;

import kotlin.jvm.internal.AbstractC16526C;
import p008A6.C0383c;
import p059C5.C1601s;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p480Te.C7390o;
import p582Xk.C9526c;
import p594Y9.AbstractC9949p4;
import sl.C19666a;

/* JADX INFO: renamed from: Wk.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8918d {

    /* JADX INFO: renamed from: a */
    public static final C19666a f27287a;

    /* JADX INFO: renamed from: b */
    public static final C19666a f27288b;

    /* JADX INFO: renamed from: c */
    public static final C9526c f27289c;

    static {
        InterfaceC3777y interfaceC3777yM18075c;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C7390o.class);
        InterfaceC3777y interfaceC3777yM18075c2 = null;
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C7390o.class);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        f27287a = new C19666a("UploadProgressListenerAttributeKey", new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c));
        InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C7390o.class);
        try {
            interfaceC3777yM18075c2 = AbstractC16526C.m18075c(C7390o.class);
        } catch (Throwable unused2) {
        }
        f27288b = new C19666a("DownloadProgressListenerAttributeKey", new C21296a(interfaceC3756dMo5693b2, interfaceC3777yM18075c2));
        f27289c = AbstractC9949p4.m10607a("BodyProgress", new C1601s(11), new C0383c(12));
    }
}
