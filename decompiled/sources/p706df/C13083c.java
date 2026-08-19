package p706df;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8126k4;
import p594Y9.AbstractC9818V;
import p635a1.C10456n;

/* JADX INFO: renamed from: df.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C13083c extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C13083c f41568Z = new C13083c(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13083c f41569o0 = new C13083c(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C13083c f41570p0 = new C13083c(2, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41571Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13083c(int i10, int i11) {
        super(i10);
        this.f41571Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41571Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.chats, c6021p, 0), null, null, 0L, c6021p, 48, 12);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b("Loading conversations...", AbstractC9818V.m10458b(C10456n.f30959Y, true, false, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 6, 0, 131068);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.chats, c6021p3, 0), null, null, 0L, c6021p3, 48, 12);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
