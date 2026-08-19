package p432Rh;

import ci.C11759b;
import com.auth0.android.result.Credentials;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1149zc.AbstractC21864z;
import p364Oh.AbstractC6241o;
import p364Oh.C6226E;
import p364Oh.C6245s;
import p364Oh.C6246t;
import p404Qe.C6665a;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p857kl.C16447N;
import p905nd.C17589q;
import p948pi.C18422e;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rh.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C6894g {

    /* JADX INFO: renamed from: a */
    public final AbstractC21864z f22100a;

    /* JADX INFO: renamed from: b */
    public final C11759b f22101b;

    /* JADX INFO: renamed from: c */
    public final C6226E f22102c;

    public C6894g(AbstractC21864z abstractC21864z, C11759b c11759b, C6226E c6226e) {
        this.f22100a = abstractC21864z;
        this.f22101b = c11759b;
        this.f22102c = c6226e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7288a(C13693c c13693c, AbstractC19687c abstractC19687c) throws Exception {
        C6893f c6893f;
        String accessToken;
        if (abstractC19687c instanceof C6893f) {
            c6893f = (C6893f) abstractC19687c;
            int i10 = c6893f.f22099p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6893f.f22099p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6893f = new C6893f(this, abstractC19687c);
            }
        } else {
            c6893f = new C6893f(this, abstractC19687c);
        }
        Object objM19219e = c6893f.f22097Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6893f.f22099p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM19219e);
            if (!c13693c.f43200f.m20648b(AbstractC6241o.f20319a)) {
                InterfaceC1436k interfaceC1436k = this.f22102c.f20276h;
                C16447N c16447n = c13693c.f43195a;
                if (((Boolean) interfaceC1436k.invoke(c16447n.f51018a)).booleanValue()) {
                    C17589q c17589q = (C17589q) this.f22100a;
                    Object value = c17589q.f56308o.getValue();
                    C18422e c18422e = value instanceof C18422e ? (C18422e) value : null;
                    if (c18422e != null && c18422e.f58783b) {
                        if (c13693c.f43200f.m20648b(AbstractC6241o.f20320b)) {
                            return c17296c;
                        }
                        this.f22101b.m13053a(new C6245s("Auth configuration is invalid for this request ".concat(c16447n.toString())));
                        throw null;
                    }
                    c6893f.f22096Y = c13693c;
                    c6893f.f22099p0 = 1;
                    objM19219e = c17589q.m19219e(c6893f);
                    if (objM19219e == enumC19250a) {
                        return enumC19250a;
                    }
                }
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c13693c = c6893f.f22096Y;
        AbstractC9233X.m9807c(objM19219e);
        Credentials credentials = (Credentials) objM19219e;
        if (credentials == null || (accessToken = credentials.getAccessToken()) == null) {
            throw new C6246t("Token is missing");
        }
        AbstractC13695e.m15171a(c13693c, new C6665a(accessToken, 1));
        return c17296c;
    }
}
