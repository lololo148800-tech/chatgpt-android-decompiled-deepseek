package p1127yf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21322p;
import p291Lf.C5026w;
import p349O0.C6021p;
import p479Td.AbstractC7343b0;
import p479Td.C7320F;
import p523V9.AbstractC8071d5;
import p523V9.AbstractC8080e6;
import p523V9.AbstractC8142m4;
import p575Xd.C9436E;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: yf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C21527b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f68174Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f68175Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f68176o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f68177p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC7343b0 f68178q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C5026w f68179r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C9436E f68180s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1436k f68181t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ InterfaceC10459q f68182u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21527b(String str, String str2, boolean z6, boolean z10, AbstractC7343b0 abstractC7343b0, C5026w c5026w, C9436E c9436e, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q) {
        super(2);
        this.f68174Y = str;
        this.f68175Z = str2;
        this.f68176o0 = z6;
        this.f68177p0 = z10;
        this.f68178q0 = abstractC7343b0;
        this.f68179r0 = c5026w;
        this.f68180s0 = c9436e;
        this.f68181t0 = interfaceC1436k;
        this.f68182u0 = interfaceC10459q;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C7320F c7320fM7776c;
        String strM11054l;
        InterfaceC10459q interfaceC10459qM8483b;
        float f10;
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-1804874777);
            C5026w c5026w = this.f68179r0;
            boolean z6 = this.f68177p0;
            AbstractC7343b0 abstractC7343b0 = this.f68178q0;
            boolean z10 = this.f68176o0;
            if (z10 && z6) {
                c7320fM7776c = (C7320F) abstractC7343b0;
            } else if (z10 && !z6) {
                C7320F c7320f = (C7320F) abstractC7343b0;
                c7320fM7776c = C7320F.m7776c(c7320f, c7320f.f23219c + "⬤");
            } else if (c5026w.f16435c) {
                C7320F c7320f2 = (C7320F) abstractC7343b0;
                if (c7320f2.f23220d) {
                    String str = c7320f2.f23219c;
                    boolean zM21681O = AbstractC21322p.m21681O(str);
                    if (zM21681O) {
                        strM11054l = AbstractC10763a.m11054l("_", AbstractC8142m4.m8676d(R.string.conversation_content_transcript_unavailable, c6021p), "_");
                    } else {
                        if (zM21681O) {
                            throw new C0644w();
                        }
                        strM11054l = AbstractC10763a.m11054l("“_", AbstractC21322p.m21711s0(str).toString(), "_”");
                    }
                    c7320fM7776c = C7320F.m7776c(c7320f2, strM11054l);
                } else {
                    c7320fM7776c = (C7320F) abstractC7343b0;
                }
            } else {
                c7320fM7776c = (C7320F) abstractC7343b0;
            }
            C7320F c7320f3 = c7320fM7776c;
            c6021p.m6553p(false);
            boolean z11 = c5026w.f16435c;
            InterfaceC10459q interfaceC10459q = this.f68182u0;
            if (z11) {
                C7320F c7320f4 = (C7320F) abstractC7343b0;
                if (AbstractC21322p.m21681O(c7320f4.f23219c)) {
                    f10 = 0.38f;
                } else {
                    f10 = c7320f4.f23220d ? 0.65f : 1.0f;
                }
                interfaceC10459qM8483b = AbstractC8071d5.m8483b(interfaceC10459q, f10);
            } else {
                interfaceC10459qM8483b = interfaceC10459q;
            }
            AbstractC8080e6.m8506a(this.f68174Y, this.f68175Z, c7320f3, this.f68176o0, this.f68180s0, this.f68181t0, interfaceC10459qM8483b, c6021p, 0);
        }
        return C17296C.f55119a;
    }
}
