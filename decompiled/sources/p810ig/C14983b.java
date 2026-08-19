package p810ig;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC4124r4;
import p257K3.C4535c;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8676n;
import p774h1.C14341T;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.AbstractC17421a;
import p895n1.C17424d;
import p895n1.C17425e;

/* JADX INFO: renamed from: ig.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14983b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C14983b f46642Z = new C14983b(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C14983b f46643o0 = new C14983b(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C14983b f46644p0 = new C14983b(2, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46645Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14983b(int i10, int i11) {
        super(i10);
        this.f46645Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f46645Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.onboarding_birthday, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C17425e c17425eM19122b = AbstractC8676n.f26622a;
                    if (c17425eM19122b == null) {
                        C17424d c17424d = new C17424d("Filled.Today", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i10 = AbstractC17418F.f55636a;
                        C14341T c14341t = new C14341T(C14365u.f45052b);
                        C4535c c4535c = new C4535c(3);
                        c4535c.m5290p(19.0f, 3.0f);
                        c4535c.m5287m(-1.0f);
                        c4535c.m5288n(18.0f, 1.0f);
                        c4535c.m5287m(-2.0f);
                        c4535c.m5294t(2.0f);
                        c4535c.m5288n(8.0f, 3.0f);
                        c4535c.m5288n(8.0f, 1.0f);
                        c4535c.m5288n(6.0f, 1.0f);
                        c4535c.m5294t(2.0f);
                        c4535c.m5288n(5.0f, 3.0f);
                        c4535c.m5284j(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        c4535c.m5288n(3.0f, 19.0f);
                        c4535c.m5284j(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        c4535c.m5287m(14.0f);
                        c4535c.m5284j(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        c4535c.m5288n(21.0f, 5.0f);
                        c4535c.m5284j(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        c4535c.m5282h();
                        c4535c.m5290p(19.0f, 19.0f);
                        c4535c.m5288n(5.0f, 19.0f);
                        c4535c.m5288n(5.0f, 8.0f);
                        c4535c.m5287m(14.0f);
                        c4535c.m5294t(11.0f);
                        c4535c.m5282h();
                        c4535c.m5290p(7.0f, 10.0f);
                        c4535c.m5287m(5.0f);
                        c4535c.m5294t(5.0f);
                        c4535c.m5288n(7.0f, 15.0f);
                        c4535c.m5282h();
                        C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
                        c17425eM19122b = c17424d.m19122b();
                        AbstractC8676n.f26622a = c17425eM19122b;
                    }
                    AbstractC3878A1.m4596a(AbstractC17421a.m19116c(c17425eM19122b, c6021p2), null, null, 0L, c6021p2, 56, 12);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.onboarding_phone_number, c6021p3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 0, 0, 131070);
                }
                break;
        }
        return c17296c;
    }
}
