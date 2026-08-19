package p455Sf;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC7973Q4;
import p523V9.AbstractC8142m4;
import p705dd.EnumC13068a;

/* JADX INFO: renamed from: Sf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C7116a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C7116a f22656Z = new C7116a(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C7116a f22657o0 = new C7116a(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C7116a f22658p0 = new C7116a(2, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22659Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7116a(int i10, int i11) {
        super(i10);
        this.f22659Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22659Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.notification_settings_screen_title, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC7973Q4.m8271a(EnumC13068a.Short, null, c6021p3, 6);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
