package p949pj;

import android.media.Image;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import p025An.AbstractC0575H;
import p103Dn.InterfaceC2121A0;
import p103Dn.InterfaceC2186j;
import p103Dn.InterfaceC2211v0;
import p178H.C3152j0;
import p178H.InterfaceC3108A;
import p909nm.C17689w;
import p969qj.AbstractC18749g;
import p969qj.C18743a;
import p969qj.C18744b;
import p969qj.C18745c;
import p969qj.C18746d;
import p969qj.C18747e;
import p969qj.C18748f;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p993rj.InterfaceC19044f;

/* JADX INFO: renamed from: pj.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C18438K implements InterfaceC3108A, InterfaceC2121A0, InterfaceC19044f {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC2211v0 f58824Y;

    /* JADX INFO: renamed from: Z */
    public EnumC18448V f58825Z;

    /* JADX INFO: renamed from: o0 */
    public Object f58826o0;

    /* JADX INFO: renamed from: p0 */
    public List f58827p0;

    /* JADX INFO: renamed from: q0 */
    public C18486q0 f58828q0;

    public C18438K(InterfaceC2211v0 resultFlow) {
        AbstractC16544l.m18094g(resultFlow, "resultFlow");
        this.f58824Y = resultFlow;
        C17689w c17689w = C17689w.f56480Y;
        this.f58826o0 = c17689w;
        this.f58827p0 = c17689w;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0141  */
    /* JADX WARN: Code duplicated, block: B:51:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0167 -> B:52:0x0170). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01b7 -> B:60:0x01c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: h */
    public static final java.lang.Object m19874h(p949pj.C18438K r30, p468T2.C7224p r31, sm.AbstractC19687c r32) {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p949pj.C18438K.m19874h(pj.K, T2.p, sm.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: j */
    public static final void m19875j(C16556x c16556x, C16525B c16525b, C16525B c16525b2, C16525B c16525b3, C16525B c16525b4, C16556x c16556x2, C16525B c16525b5, AbstractC18749g abstractC18749g, boolean z6) {
        C18744b c18744b = C18744b.f59618a;
        if (!AbstractC16544l.m18089b(abstractC18749g, c18744b) && z6) {
            c16556x.f51285Y = true;
        }
        if (abstractC18749g instanceof C18743a) {
            if (c16525b.f51262Y == null) {
                c16525b.f51262Y = ((C18743a) abstractC18749g).f59617a;
                return;
            }
            return;
        }
        if (abstractC18749g instanceof C18746d) {
            c16525b2.f51262Y = ((C18746d) abstractC18749g).f59621a;
            return;
        }
        if (abstractC18749g instanceof C18745c) {
            C18745c c18745c = (C18745c) abstractC18749g;
            m19875j(c16556x, c16525b, c16525b2, c16525b3, c16525b4, c16556x2, c16525b5, c18745c.f59620b, z6);
            c16525b3.f51262Y = c18745c.f59619a;
        } else if (abstractC18749g instanceof C18748f) {
            c16525b4.f51262Y = ((C18748f) abstractC18749g).f59623a;
        } else if (AbstractC16544l.m18089b(abstractC18749g, c18744b)) {
            c16556x2.f51285Y = true;
        } else if (abstractC18749g instanceof C18747e) {
            c16525b5.f51262Y = ((C18747e) abstractC18749g).f59622a;
        }
    }

    @Override // p178H.InterfaceC3108A
    /* JADX INFO: renamed from: c */
    public final void mo255c(C3152j0 c3152j0) throws Throwable {
        AbstractC0575H.m1161I(C18777j.f59682Y, new C18436I(c3152j0, this, null));
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        return this.f58824Y.mo3141d(interfaceC2186j, interfaceC18770c);
    }

    @Override // p993rj.InterfaceC19044f
    /* JADX INFO: renamed from: g */
    public final void mo19876g(Image image, int i10) throws Throwable {
        AbstractC16544l.m18094g(image, "image");
        AbstractC0575H.m1161I(C18777j.f59682Y, new C18437J(image, this, i10, null));
    }
}
