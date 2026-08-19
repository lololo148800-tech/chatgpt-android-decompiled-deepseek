package p242Je;

import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import p1111xl.C21296a;
import p1150zd.C21870f;
import p1150zd.C21873i;
import p1150zd.EnumC21867c;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p571X9.AbstractC9144I;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Je.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4330c {

    /* JADX INFO: renamed from: a */
    public final C4329b f14111a;

    public C4330c(C4329b c4329b) {
        this.f14111a = c4329b;
    }

    /* JADX INFO: renamed from: a */
    public final Object m5145a(String str, String str2, EnumC21867c enumC21867c, String str3, List list, AbstractC19694j abstractC19694j) {
        C21870f c21870f = new C21870f(str, str2, enumC21867c, str3, list);
        C4329b c4329b = this.f14111a;
        InterfaceC3777y interfaceC3777yM18075c = null;
        C4328a c4328a = new C4328a(c21870f, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C21873i.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C21873i.class);
        } catch (Throwable unused) {
        }
        return AbstractC9144I.m9690b(c4329b.f14110a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c4328a, abstractC19694j);
    }
}
