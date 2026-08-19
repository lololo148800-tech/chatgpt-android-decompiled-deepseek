package io.sentry.util;

import android.os.Build;
import android.view.View;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import bb.C11333z;
import com.withpersona.sdk2.inquiry.InquiryResponse;
import io.sentry.C15134J0;
import io.sentry.C15138K1;
import io.sentry.C15144M1;
import io.sentry.InterfaceC15131I0;
import io.sentry.InterfaceC15145N;
import io.sentry.protocol.C15447t;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p103Dn.C2153Q0;
import p1073w3.InterfaceC20802d;
import p1081wc.C20877X;
import p1081wc.InterfaceC20904w;
import p1084wg.C20949d;
import p1140z1.AbstractC21690f;
import p195Hh.C3430e;
import p310M9.C5311e;
import p349O0.C6016m0;
import p457Sh.C7137e;
import p523V9.AbstractC8160o6;
import p644ab.InterfaceC10532e;
import p746fa.InterfaceC13595d;
import p746fa.InterfaceC13596e;
import p824j4.C16113i;
import p824j4.C16120p;
import p841k.InterfaceC16282b;
import p858ko.C16495N;
import p885m4.C17153c;
import p909nm.AbstractC17660E;
import p909nm.C17690x;
import vg.EnumC20615b;

/* JADX INFO: renamed from: io.sentry.util.i */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15504i implements InterfaceC15131I0, InterfaceC10532e, InterfaceC13596e, InterfaceC13595d, InterfaceC20802d, InterfaceC16282b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f48427Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f48428Z;

    public /* synthetic */ C15504i(Object obj, int i10) {
        this.f48427Y = i10;
        this.f48428Z = obj;
    }

    @Override // io.sentry.InterfaceC15131I0
    /* JADX INFO: renamed from: a */
    public void mo16300a(C5311e c5311e) {
        C5311e c5311e2 = new C5311e(22);
        C15134J0 c15134j0 = (C15134J0) this.f48428Z;
        c15134j0.f47129q = c5311e2;
        C15138K1 c15138k1 = new C15138K1((C15447t) c5311e2.f17484Z, (C15144M1) c5311e2.f17485o0, "default", null, null);
        c15138k1.f47152u0 = "auto";
        Iterator<InterfaceC15145N> it = c15134j0.f47122j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo16313d(c15138k1, c15134j0);
        }
    }

    @Override // p1073w3.InterfaceC20802d
    public void accept(Object obj) {
        ((C11333z) this.f48428Z).m12762a((C17153c) obj);
    }

    @Override // p644ab.InterfaceC10532e
    /* JADX INFO: renamed from: apply */
    public Object mo22421apply(Object obj) {
        C16120p c16120p = (C16120p) obj;
        ((C16113i) this.f48428Z).getClass();
        return c16120p;
    }

    /* JADX INFO: renamed from: b */
    public void m16689b() {
        ((View) AbstractC21690f.m22204i((C16495N) this.f48428Z, AndroidCompositionLocals_androidKt.f32829f)).performHapticFeedback(Build.VERSION.SDK_INT >= 30 ? 13 : 6);
    }

    @Override // p841k.InterfaceC16282b
    /* JADX INFO: renamed from: d */
    public void mo3484d(Object obj) {
        Object value;
        EnumC20615b enumC20615b;
        InquiryResponse result = (InquiryResponse) obj;
        AbstractC16544l.m18094g(result, "result");
        C20949d c20949d = (C20949d) this.f48428Z;
        C2153Q0 c2153q0 = c20949d.f66728p0;
        do {
            value = c2153q0.getValue();
            boolean z6 = result instanceof InquiryResponse.Cancel;
            InterfaceC20904w interfaceC20904w = c20949d.f66725Y;
            Map map = C17690x.f56481Y;
            if (z6) {
                C20877X c20877x = C20877X.f66488y;
                String inquiryId = ((InquiryResponse.Cancel) result).getInquiryId();
                Map mapM535x = inquiryId != null ? AbstractC0168G.m535x("inquiryId", inquiryId) : null;
                if (mapM535x != null) {
                    map = mapM535x;
                }
                interfaceC20904w.mo21447a(c20877x, map);
                enumC20615b = EnumC20615b.f65423Z;
            } else if (result instanceof InquiryResponse.Complete) {
                interfaceC20904w.mo21447a(C20877X.f66486w, AbstractC17660E.m19258c(new C17309l("inquiryId", ((InquiryResponse.Complete) result).getInquiryId())));
                enumC20615b = EnumC20615b.f65427r0;
            } else {
                if (!(result instanceof InquiryResponse.Error)) {
                    throw new C0644w();
                }
                AbstractC8160o6.m8727b(c20949d.f66726Z, "unexpected Persona error : " + ((InquiryResponse.Error) result).getDebugMessage(), null, 6);
                interfaceC20904w.mo21447a(C20877X.f66487x, map);
                enumC20615b = EnumC20615b.f65424o0;
            }
        } while (!c2153q0.m3250k(value, enumC20615b));
    }

    @Override // p746fa.InterfaceC13595d
    public void onFailure(Exception exc) {
        AbstractC8160o6.m8726a((C3430e) this.f48428Z, "OTP retriever failed to start", null, 6);
    }

    @Override // p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        switch (this.f48427Y) {
            case 2:
                ((C7137e) this.f48428Z).invoke(obj);
                break;
            default:
                ((C6016m0) this.f48428Z).invoke(obj);
                break;
        }
    }
}
