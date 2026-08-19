package p328N1;

import fo.C13711h;
import java.util.List;
import java.util.concurrent.CancellationException;
import p025An.AbstractC0575H;
import p025An.C0565C;
import p025An.InterfaceC0567D;
import p049Bm.InterfaceC1436k;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.InterfaceC5982V0;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: N1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5592h implements InterfaceC5982V0 {

    /* JADX INFO: renamed from: Y */
    public final List f18117Y;

    /* JADX INFO: renamed from: Z */
    public final C5581H f18118Z;

    /* JADX INFO: renamed from: o0 */
    public final C13711h f18119o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC1436k f18120p0;

    /* JADX INFO: renamed from: q0 */
    public final C5586b f18121q0;

    /* JADX INFO: renamed from: r0 */
    public final C6002f0 f18122r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f18123s0 = true;

    public C5592h(List list, Object obj, C5581H c5581h, C13711h c13711h, InterfaceC1436k interfaceC1436k, C5586b c5586b) {
        this.f18117Y = list;
        this.f18118Z = c5581h;
        this.f18119o0 = c13711h;
        this.f18120p0 = interfaceC1436k;
        this.f18121q0 = c5586b;
        this.f18122r0 = C5997d.m6430Q(obj, C5975S.f19448r0);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #2 {all -> 0x003d, blocks: (B:13:0x0038, B:28:0x006c, B:30:0x007a, B:35:0x00a1, B:37:0x00af, B:40:0x00cb), top: B:55:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x007a A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:13:0x0038, B:28:0x006c, B:30:0x007a, B:35:0x00a1, B:37:0x00af, B:40:0x00cb), top: B:55:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #2 {all -> 0x003d, blocks: (B:13:0x0038, B:28:0x006c, B:30:0x007a, B:35:0x00a1, B:37:0x00af, B:40:0x00cb), top: B:55:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb A[Catch: all -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x003d, blocks: (B:13:0x0038, B:28:0x006c, B:30:0x007a, B:35:0x00a1, B:37:0x00af, B:40:0x00cb), top: B:55:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0078 -> B:44:0x00e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00df -> B:43:0x00e2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public final java.lang.Object m5988c(sm.AbstractC19687c r18) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p328N1.C5592h.m5988c(sm.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m5989d(C5576C c5576c, AbstractC19687c abstractC19687c) {
        C5590f c5590f;
        if (abstractC19687c instanceof C5590f) {
            c5590f = (C5590f) abstractC19687c;
            int i10 = c5590f.f18113p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5590f.f18113p0 = i10 - Integer.MIN_VALUE;
            } else {
                c5590f = new C5590f(this, abstractC19687c);
            }
        } else {
            c5590f = new C5590f(this, abstractC19687c);
        }
        Object objM1170R = c5590f.f18111Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5590f.f18113p0;
        Object obj = null;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objM1170R);
                C5591g c5591g = new C5591g(this, c5576c, null);
                c5590f.f18110Y = c5576c;
                c5590f.f18113p0 = 1;
                objM1170R = AbstractC0575H.m1170R(15000L, c5591g, c5590f);
                if (objM1170R == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c5576c = c5590f.f18110Y;
                AbstractC9233X.m9807c(objM1170R);
            }
            obj = objM1170R;
            return obj;
        } catch (CancellationException e10) {
            if (AbstractC0575H.m1197z(c5590f.getContext())) {
                return obj;
            }
            throw e10;
        } catch (Exception e11) {
            InterfaceC0567D interfaceC0567D = (InterfaceC0567D) c5590f.getContext().get(C0565C.f1783Y);
            if (interfaceC0567D == null) {
                return obj;
            }
            interfaceC0567D.handleException(c5590f.getContext(), new IllegalStateException("Unable to load font " + c5576c, e11));
            return obj;
        }
    }

    @Override // p349O0.InterfaceC5982V0
    public final Object getValue() {
        return this.f18122r0.getValue();
    }
}
