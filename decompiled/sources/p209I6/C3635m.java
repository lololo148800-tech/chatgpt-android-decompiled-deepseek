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
import p049Bm.InterfaceC1436k;
import p1053v3.p1054lN.IGDwkYw;
import p235J6.C4268e;
import p235J6.C4272i;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9758K4;
import p909nm.AbstractC17659D;
import p917o6.C17852e;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: I6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C3635m extends AbstractC3622B {

    /* JADX INFO: renamed from: c */
    public final long f11080c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1436k f11081d;

    /* JADX INFO: renamed from: e */
    public final EnumC3646x f11082e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3635m(C3624b webSocketConnection, C10808o listener, long j10, InterfaceC1436k connectionPayload, EnumC3646x frameType) {
        super(webSocketConnection, listener);
        AbstractC16544l.m18094g(webSocketConnection, "webSocketConnection");
        AbstractC16544l.m18094g(listener, "listener");
        AbstractC16544l.m18094g(connectionPayload, "connectionPayload");
        AbstractC16544l.m18094g(frameType, "frameType");
        this.f11080c = j10;
        this.f11081d = connectionPayload;
        this.f11082e = frameType;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // p209I6.AbstractC3622B
    /* JADX INFO: renamed from: a */
    public final Object mo4330a(AbstractC19687c abstractC19687c) throws EOFException {
        C3633k c3633k;
        C3635m c3635m;
        LinkedHashMap linkedHashMap;
        if (abstractC19687c instanceof C3633k) {
            c3633k = (C3633k) abstractC19687c;
            int i10 = c3633k.f11077q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3633k.f11077q0 = i10 - Integer.MIN_VALUE;
            } else {
                c3633k = new C3633k(this, abstractC19687c);
            }
        } else {
            c3633k = new C3633k(this, abstractC19687c);
        }
        Object obj = c3633k.f11075o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3633k.f11077q0;
        if (i11 != 0) {
            if (i11 == 1) {
                linkedHashMap = c3633k.f11074Z;
                c3635m = c3633k.f11073Y;
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
        c3633k.f11073Y = this;
        c3633k.f11074Z = linkedHashMapM19246h;
        c3633k.f11077q0 = 1;
        Object objInvoke = this.f11081d.invoke(c3633k);
        if (objInvoke == enumC19250a) {
            return enumC19250a;
        }
        c3635m = this;
        linkedHashMap = linkedHashMapM19246h;
        obj = objInvoke;
        Map map = (Map) obj;
        if (map != null) {
            linkedHashMap.put(IGDwkYw.bSPOPOiLZGCggEx, map);
        }
        c3635m.m4334f(linkedHashMap, c3635m.f11082e);
        C3634l c3634l = new C3634l(c3635m, null);
        c3633k.f11073Y = null;
        c3633k.f11074Z = null;
        c3633k.f11077q0 = 2;
        if (AbstractC0575H.m1169Q(c3635m.f11080c, c3634l, c3633k) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }

    @Override // p209I6.AbstractC3622B
    /* JADX INFO: renamed from: b */
    public final void mo4331b(Map messageMap) {
        AbstractC16544l.m18094g(messageMap, "messageMap");
        Object obj = messageMap.get("type");
        boolean zM18089b = AbstractC16544l.m18089b(obj, "data");
        C10808o c10808o = this.f11044b;
        if (zM18089b) {
            Object obj2 = messageMap.get(ParameterNames.f31999ID);
            AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = messageMap.get("payload");
            AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            c10808o.m11084r((String) obj2, (Map) obj3);
            return;
        }
        if (!AbstractC16544l.m18089b(obj, "error")) {
            if (AbstractC16544l.m18089b(obj, "complete")) {
                Object obj4 = messageMap.get(ParameterNames.f31999ID);
                AbstractC16544l.m18092e(obj4, "null cannot be cast to non-null type kotlin.String");
                c10808o.m11083q((String) obj4);
                return;
            }
            return;
        }
        Object obj5 = messageMap.get(ParameterNames.f31999ID);
        if (!(obj5 instanceof String)) {
            ((C3645w) c10808o.f32040Z).f11124g.mo2524p(new C4268e((Map) messageMap.get("payload")));
            return;
        }
        String id2 = (String) obj5;
        Map map = (Map) messageMap.get("payload");
        c10808o.getClass();
        AbstractC16544l.m18094g(id2, "id");
        ((C3645w) c10808o.f32040Z).f11124g.mo2524p(new C4272i(id2, map));
    }

    @Override // p209I6.AbstractC3622B
    /* JADX INFO: renamed from: g */
    public final void mo4335g(C17852e request) throws EOFException {
        AbstractC16544l.m18094g(request, "request");
        m4334f(AbstractC17659D.m19244f(new C17309l("type", "start"), new C17309l(ParameterNames.f31999ID, request.f56922b.toString()), new C17309l("payload", AbstractC9758K4.m10360a(request))), this.f11082e);
    }

    @Override // p209I6.AbstractC3622B
    /* JADX INFO: renamed from: h */
    public final void mo4336h(C17852e request) throws EOFException {
        AbstractC16544l.m18094g(request, "request");
        m4334f(AbstractC17659D.m19244f(new C17309l("type", "stop"), new C17309l(ParameterNames.f31999ID, request.f56922b.toString())), this.f11082e);
    }
}
