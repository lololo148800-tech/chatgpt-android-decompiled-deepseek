package p672c3;

import android.content.Context;
import com.openai.feature.widget.impl.WidgetReceiver;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.T */
/* JADX INFO: loaded from: classes.dex */
public final class C11586T extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public WidgetReceiver f35044Y;

    /* JADX INFO: renamed from: Z */
    public Context f35045Z;

    /* JADX INFO: renamed from: o0 */
    public int f35046o0;

    /* JADX INFO: renamed from: p0 */
    public int f35047p0;

    /* JADX INFO: renamed from: q0 */
    public int f35048q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f35049r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ WidgetReceiver f35050s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Context f35051t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ int[] f35052u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11586T(WidgetReceiver widgetReceiver, Context context, int[] iArr, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35050s0 = widgetReceiver;
        this.f35051t0 = context;
        this.f35052u0 = iArr;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11586T c11586t = new C11586T(this.f35050s0, this.f35051t0, this.f35052u0, interfaceC18770c);
        c11586t.f35049r0 = obj;
        return c11586t;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11586T) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0051 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004f -> B:13:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r9.f35048q0
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            int r1 = r9.f35047p0
            int r3 = r9.f35046o0
            android.content.Context r4 = r9.f35045Z
            com.openai.feature.widget.impl.WidgetReceiver r5 = r9.f35044Y
            java.lang.Object r6 = r9.f35049r0
            int[] r6 = (int[]) r6
            p571X9.AbstractC9233X.m9807c(r10)
            goto L52
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            p571X9.AbstractC9233X.m9807c(r10)
            java.lang.Object r10 = r9.f35049r0
            An.F r10 = (p025An.InterfaceC0571F) r10
            com.openai.feature.widget.impl.WidgetReceiver r1 = r9.f35050s0
            android.content.Context r3 = r9.f35051t0
            com.openai.feature.widget.impl.WidgetReceiver.m14390a(r1, r10, r3)
            int[] r10 = r9.f35052u0
            int r4 = r10.length
            r5 = 0
            r6 = r10
            r8 = r5
            r5 = r1
            r1 = r4
            r4 = r3
            r3 = r8
        L39:
            if (r3 >= r1) goto L54
            r10 = r6[r3]
            ph.e r7 = r5.f40340b
            r9.f35049r0 = r6
            r9.f35044Y = r5
            r9.f35045Z = r4
            r9.f35046o0 = r3
            r9.f35047p0 = r1
            r9.f35048q0 = r2
            java.lang.Object r10 = r7.m12974a(r4, r10, r9)
            if (r10 != r0) goto L52
            return r0
        L52:
            int r3 = r3 + r2
            goto L39
        L54:
            mm.C r10 = mm.C17296C.f55119a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p672c3.C11586T.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
