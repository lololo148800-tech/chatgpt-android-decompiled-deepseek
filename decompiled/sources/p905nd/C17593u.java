package p905nd;

import ao.C11131E;
import ao.C11181o0;
import bo.C11527o;
import fo.C13711h;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p1113xn.C21307a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p409Qk.C6752c;
import p523V9.AbstractC8112i6;
import p541W6.C8432b;
import p541W6.C8433c;
import p544W9.AbstractC8651i4;
import p547Wc.C8805o;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9942o3;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.AbstractC16457e;
import p857kl.C16438E;
import p857kl.C16447N;
import p857kl.C16460h;
import p858ko.C16482A;
import p909nm.AbstractC17660E;
import p929oi.AbstractC18201b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: nd.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C17593u extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f56325Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f56326Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13711h f56327o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f56328p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17593u(C13711h c13711h, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f56327o0 = c13711h;
        this.f56328p0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17593u c17593u = new C17593u(this.f56327o0, this.f56328p0, interfaceC18770c);
        c17593u.f56326Z = obj;
        return c17593u;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17593u) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C16438E c16438e;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f56325Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f56326Z;
            C13693c c13693c = new C13693c();
            String str = this.f56328p0;
            C13711h c13711h = this.f56327o0;
            C8805o c8805o = new C8805o(str, c13711h, false, 23);
            C16447N c16447n = c13693c.f43195a;
            c8805o.invoke(c16447n, c16447n);
            AbstractC9942o3 abstractC9942o3 = (AbstractC9942o3) c13711h.f43259Z;
            C8433c c8433c = C8433c.f26257b;
            if (!abstractC9942o3.equals(c8433c)) {
                C16460h c16460h = AbstractC16457e.f51060a;
                Charset charset = C21307a.f67720a;
                AbstractC16544l.m18094g(c16460h, "<this>");
                AbstractC16544l.m18094g(charset, "charset");
                AbstractC8651i4.m9327e(c13693c, c16460h.m18037q("charset", AbstractC8112i6.m8606d(charset)));
                LinkedHashMap linkedHashMap = (LinkedHashMap) c13711h.f43260o0;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC17660E.m19257b(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
                }
                C11527o c11527o = AbstractC18201b.f58034a;
                c11527o.getClass();
                C11181o0 c11181o0 = C11181o0.f33827a;
                String strM12905d = c11527o.m12905d(new C11131E(c11181o0, c11181o0, 1), linkedHashMap2);
                InterfaceC3777y interfaceC3777yM18075c = null;
                c13693c.f43198d = strM12905d;
                InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(String.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(String.class);
                } catch (Throwable unused) {
                }
                AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c, c13693c);
            }
            AbstractC13695e.m15171a(c13693c, new C16482A(c13711h, 13));
            AbstractC9942o3 abstractC9942o4 = (AbstractC9942o3) c13711h.f43259Z;
            if (abstractC9942o4.equals(c8433c)) {
                c16438e = C16438E.f50984b;
            } else if (abstractC9942o4.equals(C8432b.f26256d)) {
                c16438e = C16438E.f50985c;
            } else if (abstractC9942o4.equals(C8432b.f26254b)) {
                c16438e = C16438E.f50988f;
            } else {
                if (!abstractC9942o4.equals(C8432b.f26255c)) {
                    throw new C0644w();
                }
                c16438e = C16438E.f50987e;
            }
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, c16438e, c13693c, c6752c);
            this.f56325Y = 1;
            obj = c14535jM21254y.m16038c(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
