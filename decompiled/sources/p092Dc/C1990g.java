package p092Dc;

import android.app.Application;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17309l;
import p033B5.C0816A;
import p033B5.C0819c;
import p033B5.C0821e;
import p033B5.C0823g;
import p1155zi.C21907E;
import p208I5.C3620a;
import p234J5.C4263a;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p283L5.C4944j;
import p409Qk.C6752c;
import p504Ue.C7635e;
import p571X9.AbstractC9137G4;
import p658b5.C11238i;

/* JADX INFO: renamed from: Dc.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C1990g implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5884a;

    /* JADX INFO: renamed from: b */
    public final C4474e f5885b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4478i f5886c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4478i f5887d;

    public /* synthetic */ C1990g(Object obj, C4474e c4474e, InterfaceC4478i interfaceC4478i, InterfaceC4478i interfaceC4478i2, int i10) {
        this.f5884a = i10;
        this.f5885b = c4474e;
        this.f5886c = interfaceC4478i;
        this.f5887d = interfaceC4478i2;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f5884a) {
            case 0:
                Application context = (Application) this.f5885b.f14617a;
                C7635e fileServiceFetcherFactory = (C7635e) this.f5886c.get();
                C6752c httpClient = (C6752c) this.f5887d.get();
                AbstractC16544l.m18094g(context, "context");
                AbstractC16544l.m18094g(fileServiceFetcherFactory, "fileServiceFetcherFactory");
                AbstractC16544l.m18094g(httpClient, "httpClient");
                C11238i c11238i = new C11238i(context);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                C4944j c4944j = new C4944j(new C0819c(httpClient, 6));
                C16527D c16527d = AbstractC16526C.f51263a;
                arrayList4.add(new C0821e(c4944j, 0, c16527d.mo5693b(C0816A.class)));
                arrayList2.add(new C17309l(new C4263a(5), c16527d.mo5693b(String.class)));
                arrayList3.add(new C17309l(new C3620a(3), c16527d.mo5693b(C21907E.class)));
                arrayList4.add(new C0821e(fileServiceFetcherFactory, 0, c16527d.mo5693b(C21907E.class)));
                c11238i.f34010o0 = new C0823g(AbstractC9137G4.m9680b(arrayList), AbstractC9137G4.m9680b(arrayList2), AbstractC9137G4.m9680b(arrayList3), AbstractC9137G4.m9680b(arrayList4), AbstractC9137G4.m9680b(arrayList5));
                return c11238i.m12549U();
            default:
                Application context2 = (Application) this.f5885b.f14617a;
                C7635e fileServiceFetcherFactory2 = (C7635e) this.f5886c.get();
                C6752c httpClient2 = (C6752c) this.f5887d.get();
                AbstractC16544l.m18094g(context2, "context");
                AbstractC16544l.m18094g(fileServiceFetcherFactory2, "fileServiceFetcherFactory");
                AbstractC16544l.m18094g(httpClient2, "httpClient");
                C11238i c11238i2 = new C11238i(context2);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                C4944j c4944j2 = new C4944j(new C0819c(httpClient2, 6));
                C16527D c16527d2 = AbstractC16526C.f51263a;
                arrayList9.add(new C0821e(c4944j2, 0, c16527d2.mo5693b(C0816A.class)));
                arrayList7.add(new C17309l(new C4263a(5), c16527d2.mo5693b(String.class)));
                arrayList8.add(new C17309l(new C3620a(3), c16527d2.mo5693b(C21907E.class)));
                arrayList9.add(new C0821e(fileServiceFetcherFactory2, 0, c16527d2.mo5693b(C21907E.class)));
                c11238i2.f34010o0 = new C0823g(AbstractC9137G4.m9680b(arrayList6), AbstractC9137G4.m9680b(arrayList7), AbstractC9137G4.m9680b(arrayList8), AbstractC9137G4.m9680b(arrayList9), AbstractC9137G4.m9680b(arrayList10));
                return c11238i2.m12549U();
        }
    }
}
