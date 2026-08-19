package com.withpersona.sdk2.inquiry.p689ui.network;

import bj.C11447L;
import bj.C11473t;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import dj.AbstractC13178c;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mo.C17328E;
import p026Ao.C0675i;
import p049Bm.InterfaceC1439n;
import p100Dk.C2073A;
import p100Dk.C2095v;
import p100Dk.C2096w;
import p100Dk.C2097x;
import p100Dk.C2098y;
import p1027tp.C20048M;
import p103Dn.InterfaceC2186j;
import p1131yj.InterfaceC21546a;
import p320Mj.C5461n;
import p571X9.AbstractC9233X;
import p770gk.InterfaceC14185a;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p972qm.InterfaceC18770c;
import p994rk.InterfaceC19201o2;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C12909a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f41058Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f41059Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2073A f41060o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12909a(C2073A c2073a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41060o0 = c2073a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C12909a c12909a = new C12909a(this.f41060o0, interfaceC18770c);
        c12909a.f41059Z = obj;
        return c12909a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C12909a) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00fc A[Catch: t -> 0x00ff, IOException -> 0x0102, TRY_LEAVE, TryCatch #2 {t -> 0x00ff, IOException -> 0x0102, blocks: (B:31:0x00db, B:33:0x00df, B:35:0x00fc), top: B:73:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:64:0x015a  */
    /* JADX WARN: Code duplicated, block: B:67:0x016d A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        Object objM3180c;
        Object objM5909b;
        C20048M c20048m;
        UiTransitionErrorResponse uiTransitionErrorResponse;
        C2097x c2097x;
        String str;
        UiTransitionErrorResponse.Error error;
        Map map;
        Collection collectionValues;
        UiTransitionErrorResponse.Error error2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f41058Y;
        C17296C c17296c = C17296C.f55119a;
        C2073A c2073a = this.f41060o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            interfaceC2186j = (InterfaceC2186j) this.f41059Z;
            InterfaceC14185a interfaceC14185a = c2073a.f6405i;
            String fromStep = c2073a.f6400d;
            Map componentParams = c2073a.f6402f;
            interfaceC14185a.mo15507b(new C2095v(fromStep, componentParams));
            InterfaceC21546a interfaceC21546a = c2073a.f6406j;
            boolean z6 = ((C5461n) interfaceC21546a).f17833d != null;
            InterfaceC19201o2 fromComponent = c2073a.f6401e;
            String str2 = c2073a.f6398b;
            if (z6) {
                AbstractC16544l.m18094g(fromComponent, "fromComponent");
                AbstractC16544l.m18094g(componentParams, "componentParams");
                AbstractC16544l.m18094g(fromStep, "fromStep");
                TransitionInquiryRequest transitionInquiryRequest = new TransitionInquiryRequest(new TransitionInquiryRequest.Data(new TransitionInquiryRequest.Attributes(componentParams)), new TransitionInquiryRequest.Meta(fromComponent.getName(), fromStep));
                this.f41059Z = interfaceC2186j;
                this.f41058Y = 1;
                objM5909b = ((C5461n) interfaceC21546a).m5909b(str2, transitionInquiryRequest, this);
                if (objM5909b == enumC19250a) {
                    return enumC19250a;
                }
                c20048m = (C20048M) objM5909b;
            } else {
                AbstractC16544l.m18094g(fromComponent, "fromComponent");
                AbstractC16544l.m18094g(componentParams, "componentParams");
                AbstractC16544l.m18094g(fromStep, "fromStep");
                TransitionInquiryRequest transitionInquiryRequest2 = new TransitionInquiryRequest(new TransitionInquiryRequest.Data(new TransitionInquiryRequest.Attributes(componentParams)), new TransitionInquiryRequest.Meta(fromComponent.getName(), fromStep));
                this.f41059Z = interfaceC2186j;
                this.f41058Y = 2;
                objM3180c = c2073a.f6403g.m3180c(str2, c2073a.f6399c, transitionInquiryRequest2, this);
                if (objM3180c == enumC19250a) {
                    return enumC19250a;
                }
                c20048m = (C20048M) objM3180c;
            }
        } else if (i10 == 1) {
            interfaceC2186j = (InterfaceC2186j) this.f41059Z;
            AbstractC9233X.m9807c(obj);
            objM5909b = obj;
            c20048m = (C20048M) objM5909b;
        } else {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 4) {
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                if (i10 == 5) {
                    AbstractC9233X.m9807c(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2186j = (InterfaceC2186j) this.f41059Z;
            AbstractC9233X.m9807c(obj);
            objM3180c = obj;
            c20048m = (C20048M) objM3180c;
        }
        if (c20048m.f63525a.m18985a()) {
            C2098y c2098y = C2098y.f6447a;
            this.f41059Z = null;
            this.f41058Y = 5;
            return interfaceC2186j.mo395a(c2098y, this) == enumC19250a ? enumC19250a : c17296c;
        }
        try {
            C17328E c17328e = c20048m.f63527c;
            if (c17328e != null) {
                C0675i c0675i = (C0675i) c17328e.f55190p0;
                C11447L c11447l = c2073a.f6404h;
                c11447l.getClass();
                uiTransitionErrorResponse = (UiTransitionErrorResponse) c11447l.m12850b(UiTransitionErrorResponse.class, AbstractC13178c.f41820a, null).fromJson(c0675i.clone());
                if (uiTransitionErrorResponse == null) {
                    uiTransitionErrorResponse = UiTransitionErrorResponse.f41049b;
                }
            } else {
                uiTransitionErrorResponse = UiTransitionErrorResponse.f41049b;
            }
        } catch (C11473t unused) {
            uiTransitionErrorResponse = UiTransitionErrorResponse.f41049b;
        } catch (IOException unused2) {
            uiTransitionErrorResponse = UiTransitionErrorResponse.f41049b;
        }
        boolean zEquals = uiTransitionErrorResponse.equals(UiTransitionErrorResponse.f41049b);
        List list = uiTransitionErrorResponse.f41050a;
        if (zEquals) {
            if (list != null || (error = (UiTransitionErrorResponse.Error) AbstractC17680n.m19343S(list)) == null) {
                str = null;
            } else {
                str = error.f41051a;
            }
            c2097x = new C2097x(str, NetworkUtilsKt.toErrorInfo(c20048m));
            this.f41059Z = null;
            this.f41058Y = 3;
            if (interfaceC2186j.mo395a(c2097x, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (((list == null || (error2 = (UiTransitionErrorResponse.Error) AbstractC17680n.m19343S(list)) == null) ? null : error2.f41052b) == null) {
                if (list != null) {
                    str = null;
                } else {
                    str = null;
                }
                c2097x = new C2097x(str, NetworkUtilsKt.toErrorInfo(c20048m));
                this.f41059Z = null;
                this.f41058Y = 3;
                if (interfaceC2186j.mo395a(c2097x, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                UiTransitionErrorResponse.Error error3 = (UiTransitionErrorResponse.Error) AbstractC17680n.m19343S(list);
                C2096w c2096w = new C2096w((error3 == null || (map = error3.f41052b) == null || (collectionValues = map.values()) == null) ? C17689w.f56480Y : AbstractC17680n.m19322C0(collectionValues));
                this.f41059Z = null;
                this.f41058Y = 4;
                if (interfaceC2186j.mo395a(c2096w, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        }
        return c17296c;
    }
}
