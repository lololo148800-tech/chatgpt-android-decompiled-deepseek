package p953q0;

import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p492U1.InterfaceC7537b;
import p860l0.InterfaceC16694M0;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: q0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C18586j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16556x f59212Y;

    /* JADX INFO: renamed from: Z */
    public C16525B f59213Z;

    /* JADX INFO: renamed from: o0 */
    public C16558z f59214o0;

    /* JADX INFO: renamed from: p0 */
    public float f59215p0;

    /* JADX INFO: renamed from: q0 */
    public float f59216q0;

    /* JADX INFO: renamed from: r0 */
    public float f59217r0;

    /* JADX INFO: renamed from: s0 */
    public int f59218s0;

    /* JADX INFO: renamed from: t0 */
    public int f59219t0;

    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ Object f59220u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int f59221v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ InterfaceC7537b f59222w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ InterfaceC18590l f59223x0;

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ int f59224y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18586j(int i10, InterfaceC7537b interfaceC7537b, InterfaceC18590l interfaceC18590l, int i11, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f59221v0 = i10;
        this.f59222w0 = interfaceC7537b;
        this.f59223x0 = interfaceC18590l;
        this.f59224y0 = i11;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m19950c(boolean z6, InterfaceC18590l interfaceC18590l, int i10, int i11) {
        if (z6) {
            if (interfaceC18590l.mo10197H() <= i10 && (interfaceC18590l.mo10197H() != i10 || interfaceC18590l.mo10223x() <= i11)) {
                return false;
            }
        } else if (interfaceC18590l.mo10197H() >= i10 && (interfaceC18590l.mo10197H() != i10 || interfaceC18590l.mo10223x() >= i11)) {
            return false;
        }
        return true;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C18586j c18586j = new C18586j(this.f59221v0, this.f59222w0, this.f59223x0, this.f59224y0, interfaceC18770c);
        c18586j.f59220u0 = obj;
        return c18586j;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18586j) create((InterfaceC16694M0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8 A[Catch: h -> 0x01c8, TryCatch #12 {h -> 0x01c8, blocks: (B:25:0x00b4, B:27:0x00b8, B:29:0x00be, B:41:0x00e7), top: B:134:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x0113  */
    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    /* JADX WARN: Code duplicated, block: B:54:0x0124  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0175  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [l0.M0] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [l0.M0] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0175 -> B:130:0x017c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p953q0.C18586j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
