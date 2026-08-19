package p628Zk;

import java.util.List;
import np.InterfaceC17710b;
import p409Qk.C6752c;
import p523V9.AbstractC8103h5;
import p556Wk.AbstractC8889C;
import p571X9.AbstractC9233X;
import p857kl.C16452T;
import p909nm.C17689w;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Zk.r */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10419r {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC17710b f30884a = AbstractC8103h5.m8580a("io.ktor.client.plugins.HttpCookies");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m10906a(C6752c c6752c, C16452T c16452t, AbstractC19687c abstractC19687c) {
        C10417p c10417p;
        if (abstractC19687c instanceof C10417p) {
            c10417p = (C10417p) abstractC19687c;
            int i10 = c10417p.f30882Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10417p.f30882Z = i10 - Integer.MIN_VALUE;
            } else {
                c10417p = new C10417p(abstractC19687c);
            }
        } else {
            c10417p = new C10417p(abstractC19687c);
        }
        Object objM10903e = c10417p.f30881Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c10417p.f30882Z;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10903e);
            C10416o c10416o = (C10416o) AbstractC8889C.m9559a(c6752c, C10416o.f30876p0);
            if (c10416o != null) {
                c10417p.f30882Z = 1;
                objM10903e = c10416o.m10903e(c16452t, c10417p);
                if (objM10903e == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17689w.f56480Y;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(objM10903e);
        List list = (List) objM10903e;
        if (list != null) {
            return list;
        }
        return C17689w.f56480Y;
    }
}
