package p209I6;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.javax.sip.C10808o;
import java.io.EOFException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9758K4;
import p885m4.C17151a;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p917o6.C17852e;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: I6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3630h extends AbstractC3622B {

    /* JADX INFO: renamed from: c */
    public final C3626d f11064c;

    /* JADX INFO: renamed from: d */
    public final long f11065d;

    /* JADX INFO: renamed from: e */
    public final long f11066e;

    /* JADX INFO: renamed from: f */
    public final EnumC3646x f11067f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0571F f11068g;

    /* JADX INFO: renamed from: h */
    public final C17151a f11069h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3630h(C3626d c3626d, C3624b webSocketConnection, C10808o listener, InterfaceC0571F scope, C17151a c17151a) {
        super(webSocketConnection, listener);
        EnumC3646x enumC3646x = EnumC3646x.f11129Y;
        AbstractC16544l.m18094g(webSocketConnection, "webSocketConnection");
        AbstractC16544l.m18094g(listener, "listener");
        AbstractC16544l.m18094g(scope, "scope");
        this.f11064c = c3626d;
        this.f11065d = 10000L;
        this.f11066e = -1L;
        this.f11067f = enumC3646x;
        this.f11068g = scope;
        this.f11069h = c17151a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // p209I6.AbstractC3622B
    /* JADX INFO: renamed from: a */
    public final Object mo4330a(AbstractC19687c abstractC19687c) throws EOFException {
        C3627e c3627e;
        C3630h c3630h;
        LinkedHashMap linkedHashMap;
        if (abstractC19687c instanceof C3627e) {
            c3627e = (C3627e) abstractC19687c;
            int i10 = c3627e.f11058q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3627e.f11058q0 = i10 - Integer.MIN_VALUE;
            } else {
                c3627e = new C3627e(this, abstractC19687c);
            }
        } else {
            c3627e = new C3627e(this, abstractC19687c);
        }
        Object obj = c3627e.f11056o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3627e.f11058q0;
        if (i11 != 0) {
            if (i11 == 1) {
                linkedHashMap = c3627e.f11055Z;
                c3630h = c3627e.f11054Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        LinkedHashMap linkedHashMapM19246h = AbstractC17659D.m19246h(new C17309l("type", "connection_init"));
        c3627e.f11054Y = this;
        c3627e.f11055Z = linkedHashMapM19246h;
        c3627e.f11058q0 = 1;
        this.f11064c.invoke(c3627e);
        c3630h = this;
        linkedHashMap = linkedHashMapM19246h;
        obj = null;
        Map map = (Map) obj;
        if (map != null) {
            linkedHashMap.put("payload", map);
        }
        c3630h.m4334f(linkedHashMap, c3630h.f11067f);
        C3628f c3628f = new C3628f(c3630h, null);
        c3627e.f11054Y = null;
        c3627e.f11055Z = null;
        c3627e.f11058q0 = 2;
        if (AbstractC0575H.m1169Q(c3630h.f11065d, c3628f, c3627e) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }

    @Override // p209I6.AbstractC3622B
    /* JADX INFO: renamed from: b */
    public final void mo4331b(Map messageMap) {
        AbstractC16544l.m18094g(messageMap, "messageMap");
        Object obj = messageMap.get("type");
        boolean zM18089b = AbstractC16544l.m18089b(obj, "next");
        C10808o c10808o = this.f11044b;
        if (zM18089b) {
            Object obj2 = messageMap.get(ParameterNames.f31999ID);
            AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = messageMap.get("payload");
            AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            c10808o.m11084r((String) obj2, (Map) obj3);
            return;
        }
        if (AbstractC16544l.m18089b(obj, "error")) {
            Object obj4 = messageMap.get(ParameterNames.f31999ID);
            AbstractC16544l.m18092e(obj4, "null cannot be cast to non-null type kotlin.String");
            c10808o.m11084r((String) obj4, AbstractC17660E.m19258c(new C17309l("errors", messageMap.get("payload"))));
            Object obj5 = messageMap.get(ParameterNames.f31999ID);
            AbstractC16544l.m18092e(obj5, "null cannot be cast to non-null type kotlin.String");
            c10808o.m11083q((String) obj5);
            return;
        }
        if (AbstractC16544l.m18089b(obj, "complete")) {
            Object obj6 = messageMap.get(ParameterNames.f31999ID);
            AbstractC16544l.m18092e(obj6, "null cannot be cast to non-null type kotlin.String");
            c10808o.m11083q((String) obj6);
        } else if (AbstractC16544l.m18089b(obj, "ping")) {
            m4343i();
        } else {
            AbstractC16544l.m18089b(obj, "pong");
        }
    }

    @Override // p209I6.AbstractC3622B
    /* JADX INFO: renamed from: d */
    public final Object mo4333d(C3643u c3643u) {
        if (this.f11066e > 0) {
            AbstractC0575H.m1156D(this.f11068g, null, null, new C3629g(this, null), 3);
        }
        Object objM4329e = AbstractC3622B.m4329e(this, c3643u);
        return objM4329e == EnumC19250a.f61036Y ? objM4329e : C17296C.f55119a;
    }

    @Override // p209I6.AbstractC3622B
    /* JADX INFO: renamed from: g */
    public final void mo4335g(C17852e request) throws EOFException {
        AbstractC16544l.m18094g(request, "request");
        C17309l c17309l = new C17309l("type", "subscribe");
        C17309l c17309l2 = new C17309l(ParameterNames.f31999ID, request.f56922b.toString());
        this.f11069h.getClass();
        m4334f(AbstractC17659D.m19244f(c17309l, c17309l2, new C17309l("payload", AbstractC9758K4.m10360a(request))), this.f11067f);
    }

    @Override // p209I6.AbstractC3622B
    /* JADX INFO: renamed from: h */
    public final void mo4336h(C17852e request) throws EOFException {
        AbstractC16544l.m18094g(request, "request");
        m4334f(AbstractC17659D.m19244f(new C17309l("type", "complete"), new C17309l(ParameterNames.f31999ID, request.f56922b.toString())), this.f11067f);
    }

    /* JADX INFO: renamed from: i */
    public final void m4343i() {
        m4334f(AbstractC17659D.m19246h(new C17309l("type", "pong")), this.f11067f);
    }
}
