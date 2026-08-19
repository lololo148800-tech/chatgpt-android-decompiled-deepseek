package p594Y9;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.AbstractC11002c;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import androidx.lifecycle.EnumC11104m;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p017Af.C0491v;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1081wc.C20893l;
import p1081wc.InterfaceC20904w;
import p1155zi.C21980Z0;
import p1155zi.C21984a1;
import p1155zi.C22020j1;
import p318Mh.C5431w;
import p360Od.C6172d;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p479Td.C7326L;
import p479Td.C7351f0;
import p479Td.EnumC7355h0;
import p479Td.EnumC7359j0;
import p550We.C8833n;
import p571X9.AbstractC9233X;
import p575Xd.C9433B;
import p575Xd.C9440I;
import p575Xd.C9449h;
import p575Xd.C9452k;
import p575Xd.C9457p;
import p575Xd.C9460s;
import p575Xd.InterfaceC9461t;
import p576Xe.C9473F;
import p588Y2.C9603G;
import p909nm.AbstractC17659D;
import p926of.C18172i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Y9.v4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9985v4 {
    /* JADX INFO: renamed from: a */
    public static final Object m10624a(C6172d c6172d, InterfaceC9461t interfaceC9461t, String str, C9473F c9473f, String str2, InterfaceC20904w interfaceC20904w, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1436k interfaceC1436k3, AbstractC19694j abstractC19694j) {
        Object objM10627d;
        boolean z6 = interfaceC9461t instanceof C9449h;
        C17296C c17296c = C17296C.f55119a;
        if (z6) {
            C9449h c9449h = (C9449h) interfaceC9461t;
            m10625b(c9449h.f28455a, c6172d.f20092b, c9449h.f28457c, null, str, str2, interfaceC1436k, interfaceC20904w);
        } else if (interfaceC9461t instanceof C9452k) {
            C9452k c9452k = (C9452k) interfaceC9461t;
            m10625b(c9452k.f28459a, c6172d.f20092b, c9452k.f28460b, c9452k.f28461c, str, str2, interfaceC1436k, interfaceC20904w);
        } else if (interfaceC9461t instanceof C9457p) {
            C9457p c9457p = (C9457p) interfaceC9461t;
            m10625b(c9457p.f28469a, c6172d.f20092b, c9457p.f28471c, null, str, str2, interfaceC1436k, interfaceC20904w);
        } else if ((interfaceC9461t instanceof C9460s) && (objM10627d = m10627d((C9460s) interfaceC9461t, str, c9473f, interfaceC1436k2, interfaceC1436k3, interfaceC20904w, abstractC19694j)) == EnumC19250a.f61036Y) {
            return objM10627d;
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: b */
    public static final void m10625b(String str, String str2, String str3, String str4, String str5, String str6, InterfaceC1436k interfaceC1436k, InterfaceC20904w interfaceC20904w) {
        interfaceC20904w.mo21447a(C20893l.f66566d, AbstractC17659D.m19244f(new C17309l("conversation_id", str5), new C17309l("tool_role", str2 == null ? "" : str2), new C17309l("action_name", str != null ? str : "")));
        interfaceC1436k.invoke(m10626c(str, str2, str3, str4, str5, str6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final C7351f0 m10626c(String str, String str2, String str3, String str4, String conversationId, String str5) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        C21984a1.Companion.getClass();
        String strM22340b = C21980Z0.m22340b();
        C7326L c7326l = new C7326L("");
        C22020j1.Companion.getClass();
        return new C7351f0(strM22340b, null, conversationId, null, EnumC7359j0.f23349t0, c7326l, "gpt-4o-mini", EnumC7355h0.f23320Z, str2, null, null, null, null, new C9440I(new C9433B(str, str3, str4), null, 0 == true ? 1 : 0, 2031), null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str5, false, null, null, null, false, -16886, 509);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX INFO: renamed from: d */
    public static final Object m10627d(C9460s c9460s, String remoteId, C9473F c9473f, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC20904w interfaceC20904w, AbstractC19687c abstractC19687c) {
        C18172i c18172i;
        if (abstractC19687c instanceof C18172i) {
            c18172i = (C18172i) abstractC19687c;
            int i10 = c18172i.f57967p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18172i.f57967p0 = i10 - Integer.MIN_VALUE;
            } else {
                c18172i = new C18172i(abstractC19687c);
            }
        } else {
            c18172i = new C18172i(abstractC19687c);
        }
        C18172i c18172i2 = c18172i;
        Object objM10013l = c18172i2.f57966o0;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c18172i2.f57967p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10013l);
            C20893l c20893l = C20893l.f66569g;
            C17309l c17309l = new C17309l("conversation_id", remoteId);
            String str = c9460s.f28474b;
            if (str == null) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            C17309l c17309l2 = new C17309l("gizmo_id", str);
            String str2 = c9460s.f28476d;
            if (str2 == null) {
                str2 = "";
            }
            C17309l c17309l3 = new C17309l("domain", str2);
            String str3 = c9460s.f28475c;
            interfaceC20904w.mo21447a(c20893l, AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, new C17309l("action_id", str3 != null ? str3 : "")));
            C5431w c5431w = C5431w.f17746g;
            c5431w.getClass();
            AbstractC16544l.m18094g(remoteId, "remoteId");
            String strM5885a = c5431w.m5885a(new C0491v(remoteId, 22));
            c18172i2.f57964Y = interfaceC1436k;
            c18172i2.f57965Z = interfaceC1436k2;
            c18172i2.f57967p0 = 1;
            objM10013l = c9473f.m10013l(c9460s.f28474b, c9460s.f28475c, c9460s.f28476d, strM5885a, c18172i2);
            if (objM10013l == obj) {
                return obj;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1436k2 = c18172i2.f57965Z;
            interfaceC1436k = c18172i2.f57964Y;
            AbstractC9233X.m9807c(objM10013l);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM10013l;
        if (abstractC6224C instanceof C6223B) {
            interfaceC1436k.invoke((C8833n) ((C6223B) abstractC6224C).f20258a);
        } else if (abstractC6224C instanceof AbstractC6249w) {
            interfaceC1436k2.invoke((AbstractC6249w) abstractC6224C);
        } else if (!(abstractC6224C instanceof C6248v)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX INFO: renamed from: e */
    public static final void m10628e(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a, String str, Bundle bundle) {
        AbstractC16544l.m18094g(abstractComponentCallbacksC11000a, "<this>");
        AbstractC11002c abstractC11002cM11754q = abstractComponentCallbacksC11000a.m11754q();
        C9603G c9603g = (C9603G) abstractC11002cM11754q.f33195l.get(str);
        if (c9603g != null) {
            if (c9603g.f28900a.mo7807b().compareTo(EnumC11104m.f33477p0) >= 0) {
                c9603g.f28901b.m5058j(str, bundle);
            } else {
                abstractC11002cM11754q.f33194k.put(str, bundle);
            }
        } else {
            abstractC11002cM11754q.f33194k.put(str, bundle);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }
}
