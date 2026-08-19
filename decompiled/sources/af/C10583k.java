package af;

import android.gov.nist.core.Separators;
import bf.C11356K;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;

/* JADX INFO: renamed from: af.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C10583k extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31427Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11356K f31428Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10583k(C11356K c11356k, int i10) {
        super(2);
        this.f31427Y = i10;
        this.f31428Z = c11356k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17296C c17296c = C17296C.f55119a;
        C11356K c11356k = this.f31428Z;
        switch (this.f31427Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(Separators.POUND + c11356k.f34352b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.gizmo_details_in_category, new Object[]{c11356k.f34351a}, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b(c11356k.f34351a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 0, 0, 131070);
                }
                break;
        }
        return c17296c;
    }
}
