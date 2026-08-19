package p196Hi;

import com.openai.chatgpt.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8087f5;
import p523V9.AbstractC8142m4;
import p774h1.C14341T;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;
import p895n1.C17429i;
import p895n1.C17432l;
import p895n1.C17433m;
import p895n1.C17440t;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Hi.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C3451u extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C3451u f10495Z = new C3451u(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3451u f10496o0 = new C3451u(3, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10497Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3451u(int i10, int i11) {
        super(i10);
        this.f10497Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f10497Y) {
            case 0:
                InterfaceC17783s0 TextButton = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TextButton, "$this$TextButton");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C17425e c17425eM19122b = AbstractC8087f5.f25412a;
                    if (c17425eM19122b == null) {
                        C17424d c17424d = new C17424d("Filled.Done", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i10 = AbstractC17418F.f55636a;
                        C14341T c14341t = new C14341T(C14365u.f45052b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new C17433m(9.0f, 16.2f));
                        arrayList.add(new C17432l(4.8f, 12.0f));
                        arrayList.add(new C17440t(-1.4f, 1.4f));
                        arrayList.add(new C17432l(9.0f, 19.0f));
                        arrayList.add(new C17432l(21.0f, 7.0f));
                        arrayList.add(new C17440t(-1.4f, -1.4f));
                        arrayList.add(new C17432l(9.0f, 16.2f));
                        arrayList.add(C17429i.f55733c);
                        C17424d.m19121a(c17424d, arrayList, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
                        c17425eM19122b = c17424d.m19122b();
                        AbstractC8087f5.f25412a = c17425eM19122b;
                    }
                    AbstractC3878A1.m4597b(c17425eM19122b, AbstractC8142m4.m8676d(R.string.assistant_notification_confirm, c6021p), null, 0L, c6021p, 0, 12);
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.assistant_notification_confirm, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            default:
                InterfaceC17783s0 TextButton2 = (InterfaceC17783s0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TextButton2, "$this$TextButton");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC3878A1.m4597b(AbstractC8079e5.m8503c(), AbstractC8142m4.m8676d(R.string.assistant_notification_dismiss, c6021p2), null, 0L, c6021p2, 0, 12);
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.assistant_notification_dismiss, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                break;
        }
        return c17296c;
    }
}
