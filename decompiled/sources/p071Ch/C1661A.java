package p071Ch;

import il.AbstractC15037b;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16556x;
import ml.AbstractC17288f;
import ml.C17284b;
import mm.C17296C;
import mm.C17309l;
import p016Ae.C0439a;
import p025An.AbstractC0575H;
import p025An.C0566C0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p094De.C2025h;
import p103Dn.AbstractC2124C;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1071w0.AbstractC20734X;
import p1089wl.AbstractC21011e;
import p1113xn.AbstractC21323q;
import p1155zi.C22011h0;
import p124Ei.AbstractC2511g1;
import p124Ei.C2489Z;
import p124Ei.C2532n1;
import p124Ei.C2544t0;
import p193Hf.C3399r1;
import p193Hf.C3414w1;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p349O0.InterfaceC5985X;
import p409Qk.C6750a;
import p409Qk.C6752c;
import p425Ra.C6828a;
import p425Ra.C6833f;
import p425Ra.C6836i;
import p425Ra.C6838k;
import p425Ra.C6839l;
import p425Ra.C6842o;
import p434Rk.C6911c;
import p434Rk.C6916h;
import p485Tk.AbstractC7499h;
import p485Tk.InterfaceC7497f;
import p509Uk.C7713f;
import p544W9.AbstractC8651i4;
import p544W9.AbstractC8728v3;
import p556Wk.C8903Q;
import p556Wk.C8904S;
import p556Wk.C8905T;
import p556Wk.InterfaceC8921e0;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9352q4;
import p572Xa.AbstractC9415i;
import p572Xa.C9408b;
import p572Xa.C9417k;
import p572Xa.C9429w;
import p582Xk.C9531h;
import p746fa.C13599h;
import p746fa.C13606o;
import p754fl.C13691a;
import p754fl.C13693c;
import p754fl.C13694d;
import p754fl.C13697g;
import p759g1.C13800b;
import p792hl.AbstractC14527b;
import p857kl.AbstractC16435B;
import p857kl.C16438E;
import p857kl.C16452T;
import p857kl.C16478z;
import p857kl.InterfaceC16437D;
import p860l0.C16685J0;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sl.C19675j;
import sm.AbstractC19694j;
import ye.C21522k;

/* JADX INFO: renamed from: Ch.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C1661A extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4690Y;

    /* JADX INFO: renamed from: Z */
    public int f4691Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f4692o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f4693p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f4694q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f4695r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1661A(C3414w1 c3414w1, String str, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f4690Y = 2;
        this.f4694q0 = c3414w1;
        this.f4695r0 = str;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4690Y) {
            case 0:
                ((Number) obj).intValue();
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4694q0;
                C1661A c1661a = new C1661A((C1663C) this.f4693p0, linkedHashMap, (String) this.f4695r0, (InterfaceC18770c) obj3, 0);
                c1661a.f4692o0 = (Throwable) obj2;
                return c1661a.invokeSuspend(C17296C.f55119a);
            case 1:
                long j10 = ((C13800b) obj2).f43584a;
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f4695r0;
                C16556x c16556x = (C16556x) this.f4694q0;
                C1661A c1661a2 = new C1661A((InterfaceC1436k) this.f4693p0, c16556x, interfaceC5985X, (InterfaceC18770c) obj3, 1);
                c1661a2.f4692o0 = (C16685J0) obj;
                return c1661a2.invokeSuspend(C17296C.f55119a);
            case 2:
                String str = (String) this.f4695r0;
                C1661A c1661a3 = new C1661A((C3414w1) this.f4694q0, str, (InterfaceC18770c) obj3);
                c1661a3.f4692o0 = (InterfaceC2186j) obj;
                c1661a3.f4693p0 = obj2;
                return c1661a3.invokeSuspend(C17296C.f55119a);
            case 3:
                C7713f c7713f = (C7713f) this.f4695r0;
                C1661A c1661a4 = new C1661A((C6752c) this.f4694q0, c7713f, (InterfaceC18770c) obj3, 3);
                c1661a4.f4692o0 = (AbstractC21011e) obj;
                c1661a4.f4693p0 = obj2;
                return c1661a4.invokeSuspend(C17296C.f55119a);
            case 4:
                C1661A c1661a5 = new C1661A((C8905T) this.f4694q0, (C6752c) this.f4695r0, (InterfaceC18770c) obj3, 4);
                c1661a5.f4692o0 = (AbstractC21011e) obj;
                c1661a5.f4693p0 = obj2;
                return c1661a5.invokeSuspend(C17296C.f55119a);
            default:
                C1661A c1661a6 = new C1661A((InterfaceC1440o) this.f4694q0, (C6752c) this.f4695r0, (InterfaceC18770c) obj3, 5);
                c1661a6.f4692o0 = (InterfaceC8921e0) obj;
                c1661a6.f4693p0 = (C13693c) obj2;
                return c1661a6.invokeSuspend(C17296C.f55119a);
        }
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objM2501d;
        Object objM9451a;
        AbstractC21011e abstractC21011e;
        InterfaceC3777y interfaceC3777yM18075c;
        C13694d requestData;
        Object objM9944a;
        InterfaceC3777y interfaceC3777yM18075c2;
        AbstractC21011e abstractC21011e2;
        InterfaceC3777y interfaceC3777yM18075c3;
        Object objMo9562a;
        InterfaceC3777y interfaceC3777yM18075c4;
        Object objInvoke;
        C17284b c17284b = C17284b.f55106a;
        C17296C c17296c = C17296C.f55119a;
        Integer num = null;
        Object obj2 = this.f4694q0;
        Object obj3 = this.f4695r0;
        switch (this.f4690Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.f4691Z;
                C1663C c1663c = (C1663C) this.f4693p0;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            AbstractC9233X.m9807c(obj);
                            objM2501d = obj;
                        } else {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9233X.m9807c(obj);
                            objM9451a = obj;
                        }
                        String str = ((C6838k) objM9451a).f21934a;
                        c1663c.f4707h = 0;
                        return str;
                    }
                    AbstractC9233X.m9807c(obj);
                    Throwable th2 = (Throwable) this.f4692o0;
                    if (th2 != null) {
                        c1663c.f4705f.mo4186a("Failed to generate Play Integrity token", th2, c1663c.m2497d((LinkedHashMap) obj2));
                        if (th2 instanceof C6828a) {
                            num = new Integer(((C6828a) th2).f62870Y.f36052Y);
                        } else if (th2 instanceof C1682m) {
                            num = new Integer(((C1682m) th2).f4762Y.f62870Y.f36052Y);
                        }
                        if (num != null && num.intValue() == -19) {
                            c1663c.f4708i.f4732r0 = C1665E.f4715a;
                        }
                    }
                    C1669I c1669i = c1663c.f4708i;
                    this.f4691Z = 1;
                    objM2501d = c1669i.m2501d(this);
                    if (objM2501d == enumC19250a) {
                        return enumC19250a;
                    }
                    C6839l c6839l = (C6839l) objM2501d;
                    c1663c.f4707h++;
                    int i11 = AbstractC9415i.f28390o0;
                    C9417k c9417k = C9417k.f28395s0;
                    if (c9417k == null) {
                        throw new NullPointerException("Null verdictOptOut");
                    }
                    C6842o c6842o = new C6842o((String) obj3, c9417k);
                    long j10 = c6839l.f21936b;
                    Object[] objArr = {Long.valueOf(j10)};
                    C6836i c6836i = c6839l.f21935a.f21937a;
                    c6836i.f21928a.m10000b("requestExpressIntegrityToken(%s)", objArr);
                    C13599h c13599h = new C13599h();
                    C6833f c6833f = new C6833f(c6836i, c13599h, c6842o, j10, c13599h);
                    C9408b c9408b = c6836i.f21932e;
                    c9408b.getClass();
                    c9408b.m9985a().post(new C9429w(c9408b, c13599h, c13599h, c6833f));
                    C13606o c13606o = c13599h.f42961a;
                    AbstractC16544l.m18093f(c13606o, "request(...)");
                    this.f4691Z = 2;
                    objM9451a = AbstractC8728v3.m9451a(c13606o, this);
                    if (objM9451a == enumC19250a) {
                        return enumC19250a;
                    }
                    String str2 = ((C6838k) objM9451a).f21934a;
                    c1663c.f4707h = 0;
                    return str2;
                } catch (C6828a e10) {
                    throw new C1682m(e10);
                }
            case 1:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i12 = this.f4691Z;
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj3;
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f4693p0;
                if (i12 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C16685J0 c16685j0 = (C16685J0) this.f4692o0;
                    float f10 = AbstractC2511g1.f7806a;
                    interfaceC1436k.invoke(new C2489Z(!((C2532n1) interfaceC5985X.getValue()).f7899f));
                    this.f4691Z = 1;
                    if (c16685j0.m18501a(this) == enumC19250a2) {
                        return enumC19250a2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                C16556x c16556x = (C16556x) obj2;
                if (!c16556x.f51285Y) {
                    return c17296c;
                }
                interfaceC1436k.invoke(new C2544t0(false));
                c16556x.f51285Y = false;
                float f11 = AbstractC2511g1.f7806a;
                interfaceC1436k.invoke(new C2489Z(!((C2532n1) interfaceC5985X.getValue()).f7899f));
                return c17296c;
            case 2:
                EnumC19250a enumC19250a3 = EnumC19250a.f61036Y;
                int i13 = this.f4691Z;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f4692o0;
                C22011h0 c22011h0 = (C22011h0) ((C17309l) this.f4693p0).f55136Y;
                String str3 = c22011h0 != null ? c22011h0.f69652a : null;
                InterfaceC2184i c2025h = str3 == null ? new C2025h(new C21522k[0], 2) : new C2219z0(new C3399r1((C3414w1) obj2, (String) obj3, str3, null));
                this.f4691Z = 1;
                return AbstractC2124C.m3217p(interfaceC2186j, c2025h, this) == enumC19250a3 ? enumC19250a3 : c17296c;
            case 3:
                EnumC19250a enumC19250a4 = EnumC19250a.f61036Y;
                int i14 = this.f4691Z;
                C6752c client = (C6752c) obj2;
                if (i14 == 0) {
                    AbstractC9233X.m9807c(obj);
                    abstractC21011e = (AbstractC21011e) this.f4692o0;
                    Object obj4 = this.f4693p0;
                    C13693c c13693c = new C13693c();
                    c13693c.m15169d((C13693c) abstractC21011e.f66872Y);
                    if (obj4 == null) {
                        c13693c.f43198d = c17284b;
                        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(Object.class);
                        try {
                            interfaceC3777yM18075c2 = AbstractC16526C.m18075c(Object.class);
                        } catch (Throwable unused) {
                            interfaceC3777yM18075c2 = null;
                        }
                        AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c2, c13693c);
                    } else if (obj4 instanceof AbstractC17288f) {
                        c13693c.f43198d = obj4;
                        c13693c.m15167b(null);
                    } else {
                        c13693c.f43198d = obj4;
                        InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(Object.class);
                        try {
                            interfaceC3777yM18075c = AbstractC16526C.m18075c(Object.class);
                        } catch (Throwable unused2) {
                            interfaceC3777yM18075c = null;
                        }
                        AbstractC20734X.m21226C(interfaceC3756dMo5693b2, interfaceC3777yM18075c, c13693c);
                    }
                    client.f21676w0.m15966f(AbstractC15037b.f46753b);
                    C16452T c16452tM18021b = c13693c.f43195a.m18021b();
                    C16438E c16438e = c13693c.f43196b;
                    C16478z c16478zM18047Q = c13693c.f43197c.m18047Q();
                    Object obj5 = c13693c.f43198d;
                    AbstractC17288f abstractC17288f = obj5 instanceof AbstractC17288f ? (AbstractC17288f) obj5 : null;
                    if (abstractC17288f == null) {
                        throw new IllegalStateException(("No request transformation found: " + c13693c.f43198d).toString());
                    }
                    C0566C0 c0566c0 = c13693c.f43199e;
                    C19675j c19675j = c13693c.f43200f;
                    requestData = new C13694d(c16452tM18021b, c16438e, c16478zM18047Q, abstractC17288f, c0566c0, c19675j);
                    c19675j.m20652f(AbstractC7499h.f23801b, client.f21677x0);
                    Set setMo7978b = c16478zM18047Q.mo7978b();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : setMo7978b) {
                        if (AbstractC16435B.f50983a.contains((String) obj6)) {
                            arrayList.add(obj6);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        String header = arrayList.toString();
                        AbstractC16544l.m18094g(header, "header");
                        throw new C0439a("Header(s) " + header + " are controlled by the engine and cannot be set explicitly");
                    }
                    Iterator it = requestData.f43207g.iterator();
                    while (true) {
                        C7713f c7713f = (C7713f) obj3;
                        if (!it.hasNext()) {
                            this.f4692o0 = abstractC21011e;
                            this.f4693p0 = requestData;
                            this.f4691Z = 1;
                            objM9944a = AbstractC9352q4.m9944a(c7713f, requestData, this);
                            if (objM9944a != enumC19250a4) {
                            }
                            return enumC19250a4;
                        }
                        InterfaceC7497f interfaceC7497f = (InterfaceC7497f) it.next();
                        if (!c7713f.f24304q0.contains(interfaceC7497f)) {
                            throw new IllegalArgumentException(("Engine doesn't support " + interfaceC7497f).toString());
                        }
                    }
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj);
                        return c17296c;
                    }
                    requestData = (C13694d) this.f4693p0;
                    AbstractC21011e abstractC21011e3 = (AbstractC21011e) this.f4692o0;
                    AbstractC9233X.m9807c(obj);
                    abstractC21011e = abstractC21011e3;
                    objM9944a = obj;
                }
                C13697g responseData = (C13697g) objM9944a;
                AbstractC16544l.m18094g(client, "client");
                AbstractC16544l.m18094g(requestData, "requestData");
                AbstractC16544l.m18094g(responseData, "responseData");
                C6911c c6911c = new C6911c(client);
                c6911c.f22165Z = new C13691a(c6911c, requestData);
                c6911c.f22166o0 = new C6916h(c6911c, responseData);
                Object obj7 = responseData.f43225e;
                if (!(obj7 instanceof InterfaceC15088n)) {
                    c6911c.m7299k().m20652f(C6911c.f22163q0, obj7);
                }
                AbstractC14527b abstractC14527bM7297d = c6911c.m7297d();
                client.f21676w0.m15966f(AbstractC15037b.f46754c);
                AbstractC0575H.m1192u(abstractC14527bM7297d.getCoroutineContext()).mo1271H0(new C6750a(client, abstractC14527bM7297d));
                this.f4692o0 = null;
                this.f4693p0 = null;
                this.f4691Z = 2;
                if (abstractC21011e.mo21465d(c6911c, this) != enumC19250a4) {
                    return c17296c;
                }
                return enumC19250a4;
            case 4:
                EnumC19250a enumC19250a5 = EnumC19250a.f61036Y;
                int i15 = this.f4691Z;
                if (i15 == 0) {
                    AbstractC9233X.m9807c(obj);
                    abstractC21011e2 = (AbstractC21011e) this.f4692o0;
                    Object obj8 = this.f4693p0;
                    if (!(obj8 instanceof AbstractC17288f)) {
                        throw new IllegalStateException(AbstractC21323q.m21718e("\n|Fail to prepare request body for sending. \n|The body type is: " + AbstractC16526C.f51263a.mo5693b(obj8.getClass()) + ", with Content-Type: " + AbstractC8651i4.m9326d((InterfaceC16437D) abstractC21011e2.f66872Y) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.").toString());
                    }
                    C13693c c13693c2 = (C13693c) abstractC21011e2.f66872Y;
                    if (obj8 != null) {
                        if (obj8 instanceof AbstractC17288f) {
                            c13693c2.getClass();
                            AbstractC16544l.m18094g(obj8, "<set-?>");
                            c13693c2.f43198d = obj8;
                            c13693c2.m15167b(null);
                        } else {
                            c13693c2.getClass();
                            AbstractC16544l.m18094g(obj8, "<set-?>");
                            c13693c2.f43198d = obj8;
                            InterfaceC3756d interfaceC3756dMo5693b3 = AbstractC16526C.f51263a.mo5693b(AbstractC17288f.class);
                            try {
                                interfaceC3777yM18075c3 = AbstractC16526C.m18075c(AbstractC17288f.class);
                            } catch (Throwable unused3) {
                                interfaceC3777yM18075c3 = null;
                            }
                            AbstractC20734X.m21226C(interfaceC3756dMo5693b3, interfaceC3777yM18075c3, c13693c2);
                        }
                        break;
                    } else {
                        c13693c2.getClass();
                        c13693c2.f43198d = c17284b;
                        InterfaceC3756d interfaceC3756dMo5693b4 = AbstractC16526C.f51263a.mo5693b(AbstractC17288f.class);
                        try {
                            interfaceC3777yM18075c4 = AbstractC16526C.m18075c(AbstractC17288f.class);
                        } catch (Throwable unused4) {
                            interfaceC3777yM18075c4 = null;
                        }
                        AbstractC20734X.m21226C(interfaceC3756dMo5693b4, interfaceC3777yM18075c4, c13693c2);
                        break;
                    }
                    C8905T c8905t = (C8905T) obj2;
                    c8905t.getClass();
                    InterfaceC8921e0 c8903q = new C8903Q((C6752c) obj3);
                    Iterator it2 = AbstractC17680n.m19363m0(c8905t.f27256a).iterator();
                    while (it2.hasNext()) {
                        c8903q = new C8904S((InterfaceC1440o) it2.next(), c8903q);
                    }
                    C13693c c13693c3 = (C13693c) abstractC21011e2.f66872Y;
                    this.f4692o0 = abstractC21011e2;
                    this.f4691Z = 1;
                    objMo9562a = c8903q.mo9562a(c13693c3, this);
                    if (objMo9562a != enumC19250a5) {
                    }
                    return enumC19250a5;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC21011e abstractC21011e4 = (AbstractC21011e) this.f4692o0;
                AbstractC9233X.m9807c(obj);
                abstractC21011e2 = abstractC21011e4;
                objMo9562a = obj;
                this.f4692o0 = null;
                this.f4691Z = 2;
                if (abstractC21011e2.mo21465d((C6911c) objMo9562a, this) != enumC19250a5) {
                    return c17296c;
                }
                return enumC19250a5;
            default:
                EnumC19250a enumC19250a6 = EnumC19250a.f61036Y;
                int i16 = this.f4691Z;
                if (i16 == 0) {
                    AbstractC9233X.m9807c(obj);
                    InterfaceC8921e0 interfaceC8921e0 = (InterfaceC8921e0) this.f4692o0;
                    C13693c c13693c4 = (C13693c) this.f4693p0;
                    C9531h c9531h = new C9531h(interfaceC8921e0, ((C6752c) obj3).f21670q0);
                    this.f4692o0 = null;
                    this.f4691Z = 1;
                    objInvoke = ((InterfaceC1440o) obj2).invoke(c9531h, c13693c4, this);
                    if (objInvoke == enumC19250a6) {
                        return enumC19250a6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    objInvoke = obj;
                }
                return objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1661A(Object obj, Serializable serializable, Object obj2, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f4690Y = i10;
        this.f4693p0 = obj;
        this.f4694q0 = serializable;
        this.f4695r0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1661A(Object obj, Object obj2, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f4690Y = i10;
        this.f4694q0 = obj;
        this.f4695r0 = obj2;
    }
}
