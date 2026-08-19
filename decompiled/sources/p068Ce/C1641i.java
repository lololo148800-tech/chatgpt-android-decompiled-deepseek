package p068Ce;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p432Rh.C6889b;
import p571X9.AbstractC9144I;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ce.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C1641i {

    /* JADX INFO: renamed from: a */
    public final C6889b f4645a;

    public C1641i(C6889b c6889b) {
        this.f4645a = c6889b;
    }

    /* JADX INFO: renamed from: a */
    public static Object m2487a(C1641i c1641i, String str, Boolean bool, String str2, boolean z6, String str3, AbstractC19687c abstractC19687c, int i10) {
        InterfaceC3777y interfaceC3777yM18075c = null;
        if ((i10 & 2) != 0) {
            bool = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        if ((i10 & 16) != 0) {
            str3 = null;
        }
        C1640h c1640h = new C1640h(new C1635c(bool, Boolean.valueOf(z6), str2, str3), str, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused) {
        }
        return AbstractC9144I.m9690b(c1641i.f4645a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c1640h, abstractC19687c);
    }
}
