package gh;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p432Rh.C6889b;
import p571X9.AbstractC9144I;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: gh.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C14146n {

    /* JADX INFO: renamed from: a */
    public final C6889b f44506a;

    public C14146n(C6889b c6889b) {
        this.f44506a = c6889b;
    }

    /* JADX INFO: renamed from: a */
    public final Object m15501a(String str, Object obj, AbstractC19687c abstractC19687c) {
        InterfaceC3777y interfaceC3777yM18075c = null;
        C14145m c14145m = new C14145m(str, obj, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused) {
        }
        return AbstractC9144I.m9690b(this.f44506a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c14145m, abstractC19687c);
    }
}
