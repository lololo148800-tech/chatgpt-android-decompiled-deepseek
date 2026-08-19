package p554Wi;

import com.segment.analytics.kotlin.core.AbstractC12774a;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.C1736d;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wi.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C8877d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C1736d f27165Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC12774a f27166Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f27167o0;

    /* JADX INFO: renamed from: p0 */
    public int f27168p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C8878e f27169q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8877d(C8878e c8878e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f27169q0 = c8878e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8877d(this.f27169q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8877d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106 A[LOOP:2: B:46:0x0100->B:48:0x0106, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[LOOP:1: B:41:0x00df->B:57:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:34:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:28:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p554Wi.C8877d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
