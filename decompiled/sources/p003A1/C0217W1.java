package p003A1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.C1736d;
import p077Cn.C1743k;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A1.W1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0217W1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C1736d f838Y;

    /* JADX INFO: renamed from: Z */
    public int f839Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f840o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ContentResolver f841p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Uri f842q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C0220X1 f843r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C1743k f844s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Context f845t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0217W1(ContentResolver contentResolver, Uri uri, C0220X1 c0220x1, C1743k c1743k, Context context, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f841p0 = contentResolver;
        this.f842q0 = uri;
        this.f843r0 = c0220x1;
        this.f844s0 = c1743k;
        this.f845t0 = context;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1743k c1743k = this.f844s0;
        C0217W1 c0217w1 = new C0217W1(this.f841p0, this.f842q0, this.f843r0, c1743k, this.f845t0, interfaceC18770c);
        c0217w1.f840o0 = obj;
        return c0217w1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0217W1) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:18:0x0044, B:22:0x0055, B:24:0x005d, B:14:0x002c, B:17:0x003d), top: B:31:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:26:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r10.f839Z
            A1.X1 r2 = r10.f843r0
            r3 = 2
            r4 = 1
            android.content.ContentResolver r5 = r10.f841p0
            if (r1 == 0) goto L30
            if (r1 == r4) goto L26
            if (r1 != r3) goto L1e
            Cn.d r1 = r10.f838Y
            java.lang.Object r6 = r10.f840o0
            Dn.j r6 = (p103Dn.InterfaceC2186j) r6
            p571X9.AbstractC9233X.m9807c(r11)     // Catch: java.lang.Throwable -> L1c
        L19:
            r11 = r6
            r6 = r1
            goto L44
        L1c:
            r11 = move-exception
            goto L86
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            Cn.d r1 = r10.f838Y
            java.lang.Object r6 = r10.f840o0
            Dn.j r6 = (p103Dn.InterfaceC2186j) r6
            p571X9.AbstractC9233X.m9807c(r11)     // Catch: java.lang.Throwable -> L1c
            goto L55
        L30:
            p571X9.AbstractC9233X.m9807c(r11)
            java.lang.Object r11 = r10.f840o0
            Dn.j r11 = (p103Dn.InterfaceC2186j) r11
            android.net.Uri r1 = r10.f842q0
            r6 = 0
            r5.registerContentObserver(r1, r6, r2)
            Cn.k r1 = r10.f844s0     // Catch: java.lang.Throwable -> L1c
            Cn.d r6 = new Cn.d     // Catch: java.lang.Throwable -> L1c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1c
        L44:
            r10.f840o0 = r11     // Catch: java.lang.Throwable -> L1c
            r10.f838Y = r6     // Catch: java.lang.Throwable -> L1c
            r10.f839Z = r4     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r6.m2525b(r10)     // Catch: java.lang.Throwable -> L1c
            if (r1 != r0) goto L51
            return r0
        L51:
            r9 = r6
            r6 = r11
            r11 = r1
            r1 = r9
        L55:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1c
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1c
            if (r11 == 0) goto L80
            r1.m2526c()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r11 = r10.f845t0     // Catch: java.lang.Throwable -> L1c
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L1c
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1c
            r10.f840o0 = r6     // Catch: java.lang.Throwable -> L1c
            r10.f838Y = r1     // Catch: java.lang.Throwable -> L1c
            r10.f839Z = r3     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r11 = r6.mo395a(r7, r10)     // Catch: java.lang.Throwable -> L1c
            if (r11 != r0) goto L19
            return r0
        L80:
            r5.unregisterContentObserver(r2)
            mm.C r11 = mm.C17296C.f55119a
            return r11
        L86:
            r5.unregisterContentObserver(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p003A1.C0217W1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
