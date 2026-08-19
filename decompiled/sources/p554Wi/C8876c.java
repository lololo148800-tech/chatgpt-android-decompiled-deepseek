package p554Wi;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.C1736d;
import p077Cn.InterfaceC1730B;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wi.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C8876c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C8878e f27160Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC1730B f27161Z;

    /* JADX INFO: renamed from: o0 */
    public C1736d f27162o0;

    /* JADX INFO: renamed from: p0 */
    public int f27163p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C8878e f27164q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8876c(C8878e c8878e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f27164q0 = c8878e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8876c(this.f27164q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8876c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:7:0x0012, B:27:0x0091, B:28:0x00a4, B:18:0x003c, B:22:0x004e, B:24:0x0057, B:30:0x00aa, B:32:0x00bb, B:35:0x00c7, B:38:0x00df, B:42:0x0103, B:40:0x00fa, B:14:0x0029, B:17:0x0034), top: B:52:0x0006, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #1 {all -> 0x0018, blocks: (B:7:0x0012, B:27:0x0091, B:28:0x00a4, B:18:0x003c, B:22:0x004e, B:24:0x0057, B:30:0x00aa, B:32:0x00bb, B:35:0x00c7, B:38:0x00df, B:42:0x0103, B:40:0x00fa, B:14:0x0029, B:17:0x0034), top: B:52:0x0006, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7 A[Catch: all -> 0x0018, Exception -> 0x00dd, TRY_ENTER, TryCatch #0 {Exception -> 0x00dd, blocks: (B:32:0x00bb, B:35:0x00c7, B:38:0x00df), top: B:50:0x00bb, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0114  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [Cn.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [Cn.B] */
    /* JADX WARN: Type inference failed for: r4v3, types: [Cn.B] */
    /* JADX WARN: Type inference failed for: r4v4, types: [Cn.B] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008e -> B:8:0x0015). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p554Wi.C8876c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
