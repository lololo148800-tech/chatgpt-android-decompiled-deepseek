package p925oe;

import bf.AbstractC11372a0;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import ke.C16382j;
import p041Be.C1222O;
import p103Dn.AbstractC2124C;
import p1042uh.C20263a0;
import p1082wd.C20908a;
import p1155zi.C21936L0;
import p195Hh.C3430e;
import p216Id.C3694b;
import p220Ih.InterfaceC3721c;
import p269Kh.C4688o;
import p405Qf.C6687b;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9150J;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p787he.C14459O;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C18089N {

    /* JADX INFO: renamed from: a */
    public final C1222O f57713a;

    /* JADX INFO: renamed from: b */
    public final C16382j f57714b;

    /* JADX INFO: renamed from: c */
    public final C14459O f57715c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3721c f57716d;

    /* JADX INFO: renamed from: e */
    public final C3430e f57717e = AbstractC8168p6.m8749b("ConversationDetailsTag", null);

    public C18089N(C1222O c1222o, C16382j c16382j, C14459O c14459o, InterfaceC3721c interfaceC3721c) {
        this.f57713a = c1222o;
        this.f57714b = c16382j;
        this.f57715c = c14459o;
        this.f57716d = interfaceC3721c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m19710a(AbstractC19687c abstractC19687c) {
        C18087L c18087l;
        C18089N c18089n;
        String str;
        if (abstractC19687c instanceof C18087L) {
            c18087l = (C18087L) abstractC19687c;
            int i10 = c18087l.f57707q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18087l.f57707q0 = i10 - Integer.MIN_VALUE;
            } else {
                c18087l = new C18087L(this, abstractC19687c);
            }
        } else {
            c18087l = new C18087L(this, abstractC19687c);
        }
        C18087L c18087l2 = c18087l;
        Object objM3221t = c18087l2.f57705o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18087l2.f57707q0;
        if (i11 != 0) {
            if (i11 == 1) {
                String str2 = c18087l2.f57704Z;
                C18089N c18089n2 = c18087l2.f57703Y;
                AbstractC9233X.m9807c(objM3221t);
                str = str2;
                c18089n = c18089n2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM3221t);
            }
        }
        AbstractC9233X.m9807c(objM3221t);
        C20263a0 c20263a0 = ((C20908a) this.f57714b.f50876c.getValue()).f66645a;
        String strM12782a = c20263a0 != null ? AbstractC11372a0.m12782a(c20263a0) : null;
        C14459O c14459o = this.f57715c;
        c18087l2.f57703Y = this;
        c18087l2.f57704Z = strM12782a;
        c18087l2.f57707q0 = 1;
        objM3221t = AbstractC2124C.m3221t(c14459o.f45526y, c18087l2);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        c18089n = this;
        str = strM12782a;
        String str3 = ((C3694b) objM3221t).f11216a;
        String str4 = str3 == null ? null : str3;
        C4688o c4688o = (C4688o) ((C6687b) c18089n.f57716d).f21506f.getValue();
        C3430e c3430e = c18089n.f57717e;
        StringBuilder sbM9896o = AbstractC9306j0.m9896o("ConversationDetailsTag getInitConversation requestedModel=", c4688o != null ? c4688o.f15253b : null, ", gizmoId=", str == null ? VjclRfeKsMflo.ygxnlKWfczBvI : C21936L0.m22338a(str), ", remoteId=");
        sbM9896o.append(str4);
        AbstractC8160o6.m8726a(c3430e, sbM9896o.toString(), null, 6);
        C18088M c18088m = new C18088M(c18089n, str4, str, c4688o, null);
        c18087l2.f57703Y = null;
        c18087l2.f57704Z = null;
        c18087l2.f57707q0 = 2;
        objM3221t = AbstractC9150J.m9699d(0, 0L, null, null, c18088m, c18087l2, 63);
        return objM3221t == enumC19250a ? enumC19250a : objM3221t;
    }
}
