package bh;

import ch.C11757k;
import com.openai.chatgpt.R;
import gd.C13943h0;
import gd.C13984r1;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p017Af.C0491v;
import p025An.C0644w;
import p092Dc.C1991h;
import p1155zi.C21891A;
import p1155zi.C21975X1;
import p1155zi.C22038o;
import p1155zi.EnumC21989b2;
import p1155zi.EnumC22026l;
import p1155zi.EnumC22080y1;
import p292Lg.C5034f;
import p318Mh.C5388a0;
import p318Mh.C5391c;
import p318Mh.C5426t0;
import p318Mh.C5428u0;
import p318Mh.EnumC5424s0;
import p571X9.AbstractC9233X;
import p948pi.C18418a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: bh.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C11434h {

    /* JADX INFO: renamed from: a */
    public final C18418a f34547a;

    /* JADX INFO: renamed from: b */
    public final C11431e f34548b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13849E f34549c;

    /* JADX INFO: renamed from: d */
    public final C1991h f34550d;

    public C11434h(C18418a c18418a, C11431e c11431e, InterfaceC13849E interfaceC13849E, C1991h c1991h) {
        this.f34547a = c18418a;
        this.f34548b = c11431e;
        this.f34549c = interfaceC13849E;
        this.f34550d = c1991h;
    }

    /* JADX INFO: renamed from: a */
    public final String m12796a() {
        C22038o c22038o = this.f34547a.f58774b.f69415a;
        C1991h c1991h = this.f34550d;
        if (c22038o != null && c22038o.m22346c()) {
            return c1991h.m3160b(R.string.subscription_access_check_workspace_error);
        }
        C21975X1 c21975x1M22344a = c22038o != null ? c22038o.m22344a() : null;
        if (c21975x1M22344a != null) {
            if (c21975x1M22344a.f69572b != EnumC21989b2.f69617o0) {
                return c1991h.m3160b(R.string.subscription_access_check_on_other_platform_error);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m12797b(AbstractC19687c abstractC19687c) {
        C11432f c11432f;
        C11434h c11434h;
        C22038o c22038o;
        Set set;
        if (abstractC19687c instanceof C11432f) {
            c11432f = (C11432f) abstractC19687c;
            int i10 = c11432f.f34541p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11432f.f34541p0 = i10 - Integer.MIN_VALUE;
            } else {
                c11432f = new C11432f(this, abstractC19687c);
            }
        } else {
            c11432f = new C11432f(this, abstractC19687c);
        }
        Object objM13050a = c11432f.f34539Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11432f.f34541p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM13050a);
            String strM12796a = m12796a();
            if (strM12796a != null) {
                return strM12796a;
            }
            C13984r1 c13984r1 = C13984r1.f44044c;
            if (!((C14005w2) this.f34549c).m15481a(c13984r1)) {
                return this.f34550d.m3160b(R.string.subscriptions_access_check_coming_soon);
            }
            c11432f.f34538Y = this;
            c11432f.f34541p0 = 1;
            C11431e c11431e = this.f34548b;
            C21891A c21891a = c11431e.f34531Z.f58774b;
            objM13050a = (c21891a == null || c21891a.m22331j() || (c22038o = c21891a.f69415a) == null || (set = c22038o.f69717g) == null || set.contains(EnumC22026l.DisableUpgradeUi) || !((C14005w2) c11431e.f34533p0).m15481a(c13984r1)) ? Boolean.FALSE : ((C11757k) c11431e.f34530Y).m13050a(c11432f);
            if (objM13050a == enumC19250a) {
                return enumC19250a;
            }
            c11434h = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11434h = c11432f.f34538Y;
            AbstractC9233X.m9807c(objM13050a);
        }
        if (((Boolean) objM13050a).booleanValue()) {
            return null;
        }
        return c11434h.f34550d.m3160b(R.string.subscriptions_access_check_purchase_disabled_error);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m12798c(EnumC5424s0 entryPoint, AbstractC19687c abstractC19687c) {
        C11433g c11433g;
        C11434h c11434h;
        EnumC22080y1 enumC22080y1;
        if (abstractC19687c instanceof C11433g) {
            c11433g = (C11433g) abstractC19687c;
            int i10 = c11433g.f34546q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11433g.f34546q0 = i10 - Integer.MIN_VALUE;
            } else {
                c11433g = new C11433g(this, abstractC19687c);
            }
        } else {
            c11433g = new C11433g(this, abstractC19687c);
        }
        Object objM12797b = c11433g.f34544o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11433g.f34546q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM12797b);
            if (this.f34547a.f58774b.f69416b.f69656b == null) {
                if (((C14005w2) this.f34549c).m15481a(C13943h0.f43993c)) {
                    C5388a0 c5388a0 = C5388a0.f17642h;
                    c5388a0.getClass();
                    return c5388a0.m5885a(C5391c.f17646Z);
                }
            }
            c11433g.f34542Y = this;
            c11433g.f34543Z = entryPoint;
            c11433g.f34546q0 = 1;
            objM12797b = m12797b(c11433g);
            if (objM12797b == enumC19250a) {
                return enumC19250a;
            }
            c11434h = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            entryPoint = c11433g.f34543Z;
            c11434h = c11433g.f34542Y;
            AbstractC9233X.m9807c(objM12797b);
        }
        String str = (String) objM12797b;
        if (str != null) {
            C5428u0 c5428u0 = C5428u0.f17738g;
            c5428u0.getClass();
            return c5428u0.m5885a(new C0491v(str, 28));
        }
        switch (c11434h.f34547a.f58774b.m22327f().ordinal()) {
            case 0:
            case 6:
                enumC22080y1 = EnumC22080y1.f69795p0;
                break;
            case 1:
                enumC22080y1 = EnumC22080y1.f69796q0;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                enumC22080y1 = null;
                break;
            default:
                throw new C0644w();
        }
        if (enumC22080y1 == null) {
            String strM3160b = c11434h.f34550d.m3160b(R.string.subscription_access_check_on_other_platform_error);
            C5428u0 c5428u1 = C5428u0.f17738g;
            c5428u1.getClass();
            return c5428u1.m5885a(new C0491v(strM3160b, 28));
        }
        C5426t0 c5426t0 = C5426t0.f17732g;
        c5426t0.getClass();
        AbstractC16544l.m18094g(entryPoint, "entryPoint");
        return c5426t0.m5885a(new C5034f(enumC22080y1, 3, entryPoint));
    }
}
