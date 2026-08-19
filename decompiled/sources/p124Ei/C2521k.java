package p124Ei;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p257K3.C4535c;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p523V9.AbstractC8063c5;
import p523V9.AbstractC8087f5;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8670m;
import p635a1.C10456n;
import p774h1.C14341T;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.AbstractC17421a;
import p895n1.C17424d;
import p895n1.C17425e;

/* JADX INFO: renamed from: Ei.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C2521k extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7830Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5982V0 f7831Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2521k(InterfaceC5982V0 interfaceC5982V0, int i10) {
        super(2);
        this.f7830Y = i10;
        this.f7831Z = interfaceC5982V0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17296C c17296c = C17296C.f55119a;
        InterfaceC5982V0 interfaceC5982V0 = this.f7831Z;
        switch (this.f7830Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.rotate_image, c6021p, 0), AbstractC8142m4.m8676d(R.string.voice_switch_cameras, c6021p), AbstractC8087f5.m8534c(C10456n.f30959Y, ((Number) interfaceC5982V0.getValue()).floatValue()), C14365u.f45055e, c6021p, 3072, 0);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C17425e c17425eM19122b = AbstractC8670m.f26604a;
                    if (c17425eM19122b == null) {
                        C17424d c17424d = new C17424d("Filled.LibraryAddCheck", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i10 = AbstractC17418F.f55636a;
                        C14341T c14341t = new C14341T(C14365u.f45052b);
                        C4535c c4535c = new C4535c(3);
                        c4535c.m5290p(20.0f, 2.0f);
                        c4535c.m5288n(8.0f, 2.0f);
                        c4535c.m5284j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        c4535c.m5294t(12.0f);
                        c4535c.m5284j(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        c4535c.m5287m(12.0f);
                        c4535c.m5284j(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        c4535c.m5288n(22.0f, 4.0f);
                        c4535c.m5284j(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        c4535c.m5282h();
                        c4535c.m5290p(12.47f, 14.0f);
                        c4535c.m5288n(9.0f, 10.5f);
                        c4535c.m5289o(1.4f, -1.41f);
                        c4535c.m5289o(2.07f, 2.08f);
                        c4535c.m5288n(17.6f, 6.0f);
                        c4535c.m5288n(19.0f, 7.41f);
                        c4535c.m5288n(12.47f, 14.0f);
                        c4535c.m5282h();
                        c4535c.m5290p(4.0f, 6.0f);
                        c4535c.m5288n(2.0f, 6.0f);
                        c4535c.m5294t(14.0f);
                        c4535c.m5284j(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        c4535c.m5287m(14.0f);
                        c4535c.m5294t(-2.0f);
                        c4535c.m5288n(4.0f, 20.0f);
                        c4535c.m5288n(4.0f, 6.0f);
                        c4535c.m5282h();
                        C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
                        c17425eM19122b = c17424d.m19122b();
                        AbstractC8670m.f26604a = c17425eM19122b;
                    }
                    AbstractC3878A1.m4596a(AbstractC17421a.m19116c(c17425eM19122b, c6021p2), null, null, ((C14365u) interfaceC5982V0.getValue()).f45062a, c6021p2, 56, 4);
                }
                break;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C17425e c17425eM19122b2 = AbstractC8063c5.f25374a;
                    if (c17425eM19122b2 == null) {
                        C17424d c17424d2 = new C17424d("Filled.Build", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = AbstractC17418F.f55636a;
                        C14341T c14341t2 = new C14341T(C14365u.f45052b);
                        C4535c c4535c2 = new C4535c(3);
                        c4535c2.m5290p(22.7f, 19.0f);
                        c4535c2.m5289o(-9.1f, -9.1f);
                        c4535c2.m5284j(0.9f, -2.3f, 0.4f, -5.0f, -1.5f, -6.9f);
                        c4535c2.m5284j(-2.0f, -2.0f, -5.0f, -2.4f, -7.4f, -1.3f);
                        c4535c2.m5288n(9.0f, 6.0f);
                        c4535c2.m5288n(6.0f, 9.0f);
                        c4535c2.m5288n(1.6f, 4.7f);
                        c4535c2.m5283i(0.4f, 7.1f, 0.9f, 10.1f, 2.9f, 12.1f);
                        c4535c2.m5284j(1.9f, 1.9f, 4.6f, 2.4f, 6.9f, 1.5f);
                        c4535c2.m5289o(9.1f, 9.1f);
                        c4535c2.m5284j(0.4f, 0.4f, 1.0f, 0.4f, 1.4f, 0.0f);
                        c4535c2.m5289o(2.3f, -2.3f);
                        c4535c2.m5284j(0.5f, -0.4f, 0.5f, -1.1f, 0.1f, -1.4f);
                        c4535c2.m5282h();
                        C17424d.m19121a(c17424d2, c4535c2.f14813Z, 0, c14341t2, null, 1.0f, 0, 2, 1.0f);
                        c17425eM19122b2 = c17424d2.m19122b();
                        AbstractC8063c5.f25374a = c17425eM19122b2;
                    }
                    AbstractC3878A1.m4596a(AbstractC17421a.m19116c(c17425eM19122b2, c6021p3), null, null, ((C14365u) interfaceC5982V0.getValue()).f45062a, c6021p3, 56, 4);
                }
                break;
            default:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.user_lock, c6021p4, 0), null, null, ((C14365u) interfaceC5982V0.getValue()).f45062a, c6021p4, 48, 4);
                }
                break;
        }
        return c17296c;
    }
}
