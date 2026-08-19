package p622Ze;

import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3980S2;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p478Tc.AbstractC7312p;
import p523V9.AbstractC8142m4;
import p635a1.C10456n;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Ze.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C10289g extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f30562Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f30563Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10289g(boolean z6, boolean z10) {
        super(3);
        this.f30562Y = z6;
        this.f30563Z = z10;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6021p c6021p;
        boolean z6;
        InterfaceC17783s0 OutlinedButton = (InterfaceC17783s0) obj;
        C6021p c6021p2 = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(OutlinedButton, "$this$OutlinedButton");
        if ((iIntValue & 17) == 16 && c6021p2.m6562y()) {
            c6021p2.m6517L();
        } else if (this.f30562Y) {
            c6021p2.m6524S(339873736);
            AbstractC3980S2.m4668b(AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7312p.f23187d), 0L, 0.0f, 0L, 0, c6021p2, 0, 30);
            c6021p2.m6553p(false);
        } else {
            c6021p2.m6524S(339992435);
            boolean z10 = this.f30563Z;
            if (z10) {
                c6021p2.m6524S(1257895650);
                c6021p = c6021p2;
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.gizmos_accounts_logout, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                c6021p.m6553p(false);
                z6 = false;
            } else {
                c6021p = c6021p2;
                if (z10) {
                    z6 = false;
                    c6021p.m6524S(340222517);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(1257898438);
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.gizmos_accounts_logged_out, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                    z6 = false;
                    c6021p.m6553p(false);
                }
            }
            c6021p.m6553p(z6);
        }
        return C17296C.f55119a;
    }
}
