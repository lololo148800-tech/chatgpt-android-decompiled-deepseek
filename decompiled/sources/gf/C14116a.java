package gf;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC4124r4;
import p257K3.C4535c;
import p349O0.C6021p;
import p523V9.AbstractC8047a5;
import p523V9.AbstractC8142m4;
import p774h1.C14341T;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;

/* JADX INFO: renamed from: gf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14116a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C14116a f44447Z = new C14116a(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C14116a f44448o0 = new C14116a(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44449Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14116a(int i10, int i11) {
        super(i10);
        this.f44449Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f44449Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.snorlax_list_title, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C17425e c17425eM19122b = AbstractC8047a5.f25355a;
                    if (c17425eM19122b == null) {
                        C17424d c17424d = new C17424d("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i10 = AbstractC17418F.f55636a;
                        C14341T c14341t = new C14341T(C14365u.f45052b);
                        C4535c c4535c = new C4535c(3);
                        c4535c.m5290p(19.0f, 13.0f);
                        c4535c.m5287m(-6.0f);
                        c4535c.m5294t(6.0f);
                        c4535c.m5287m(-2.0f);
                        c4535c.m5294t(-6.0f);
                        c4535c.m5286l(5.0f);
                        c4535c.m5294t(-2.0f);
                        c4535c.m5287m(6.0f);
                        c4535c.m5293s(5.0f);
                        c4535c.m5287m(2.0f);
                        c4535c.m5294t(6.0f);
                        c4535c.m5287m(6.0f);
                        c4535c.m5294t(2.0f);
                        c4535c.m5282h();
                        C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
                        c17425eM19122b = c17424d.m19122b();
                        AbstractC8047a5.f25355a = c17425eM19122b;
                    }
                    AbstractC3878A1.m4597b(c17425eM19122b, AbstractC8142m4.m8676d(R.string.snorlax_add_new, c6021p2), null, 0L, c6021p2, 0, 12);
                }
                break;
        }
        return c17296c;
    }
}
