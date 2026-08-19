package p556Wk;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import np.AbstractC17712d;
import np.InterfaceC17710b;
import p008A6.C0383c;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p571X9.AbstractC9233X;
import p582Xk.C9526c;
import p594Y9.AbstractC9949p4;
import p754fl.InterfaceC13692b;
import p792hl.AbstractC14527b;
import p996rm.EnumC19250a;
import sl.C19666a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Wk.A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8887A {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC17710b f27204a = AbstractC17712d.m19445b().m19898a().mo19435a("io.ktor.client.plugins.HttpCallValidator");

    /* JADX INFO: renamed from: b */
    public static final C9526c f27205b = AbstractC9949p4.m10607a("HttpResponseValidator", C8938t.f27333Y, new C0383c(14));

    /* JADX INFO: renamed from: c */
    public static final C19666a f27206c;

    static {
        InterfaceC3777y interfaceC3777yM18075c;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(Boolean.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(Boolean.TYPE);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        f27206c = new C19666a("ExpectSuccessAttributeKey", new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final void m9557a(List list, Throwable th2, InterfaceC13692b interfaceC13692b, AbstractC19687c abstractC19687c) {
        C8942x c8942x;
        Iterator it;
        if (abstractC19687c instanceof C8942x) {
            c8942x = (C8942x) abstractC19687c;
            int i10 = c8942x.f27343Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c8942x.f27343Z = i10 - Integer.MIN_VALUE;
            } else {
                c8942x = new C8942x(abstractC19687c);
            }
        } else {
            c8942x = new C8942x(abstractC19687c);
        }
        Object obj = c8942x.f27342Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c8942x.f27343Z;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            f27204a.mo19442g("Processing exception " + th2 + " for request " + interfaceC13692b.mo7300S());
            it = list.iterator();
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            it = null;
        }
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw new C0644w();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m9558b(List list, AbstractC14527b abstractC14527b, AbstractC19687c abstractC19687c) {
        C8943y c8943y;
        Iterator it;
        if (abstractC19687c instanceof C8943y) {
            c8943y = (C8943y) abstractC19687c;
            int i10 = c8943y.f27347p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c8943y.f27347p0 = i10 - Integer.MIN_VALUE;
            } else {
                c8943y = new C8943y(abstractC19687c);
            }
        } else {
            c8943y = new C8943y(abstractC19687c);
        }
        Object obj = c8943y.f27346o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c8943y.f27347p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            f27204a.mo19442g("Validating response for request " + abstractC14527b.mo7303b().m7296c().mo7300S());
            it = list.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c8943y.f27345Z;
            abstractC14527b = c8943y.f27344Y;
            AbstractC9233X.m9807c(obj);
        }
        while (it.hasNext()) {
            InterfaceC1439n interfaceC1439n = (InterfaceC1439n) it.next();
            c8943y.f27344Y = abstractC14527b;
            c8943y.f27345Z = it;
            c8943y.f27347p0 = 1;
            if (interfaceC1439n.invoke(abstractC14527b, c8943y) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
