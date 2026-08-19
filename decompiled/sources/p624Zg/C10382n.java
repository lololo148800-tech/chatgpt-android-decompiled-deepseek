package p624Zg;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p467T1.C7199i;
import p523V9.AbstractC7973Q4;
import p523V9.AbstractC8142m4;
import p594Y9.AbstractC9703B3;
import p705dd.EnumC13068a;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Zg.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C10382n extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C10382n f30764Z = new C10382n(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10382n f30765o0 = new C10382n(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C10382n f30766p0 = new C10382n(3, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C10382n f30767q0 = new C10382n(3, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C10382n f30768r0 = new C10382n(3, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30769Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10382n(int i10, int i11) {
        super(i10);
        this.f30769Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f30769Y) {
            case 0:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC7973Q4.m8271a(EnumC13068a.Short, null, c6021p, 6);
                }
                break;
            case 1:
                InterfaceC17783s0 OutlinedButton = (InterfaceC17783s0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(OutlinedButton, "$this$OutlinedButton");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC7973Q4.m8271a(EnumC13068a.Short, null, c6021p2, 6);
                }
                break;
            case 2:
                InterfaceC17783s0 Button2 = (InterfaceC17783s0) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button2, "$this$Button");
                if ((iIntValue3 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC9703B3.m10296a(AbstractC8142m4.m8676d(R.string.subscriptions_choose_plan_screen_current_plan_text, c6021p3), null, 0L, c6021p3, 0);
                }
                break;
            case 3:
                InterfaceC17783s0 OutlinedButton2 = (InterfaceC17783s0) obj;
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(OutlinedButton2, "$this$OutlinedButton");
                if ((iIntValue4 & 17) == 16 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC9703B3.m10296a(AbstractC8142m4.m8676d(R.string.subscriptions_choose_plan_screen_manage_subscription_button_text, c6021p4), null, 0L, c6021p4, 0);
                }
                break;
            default:
                InterfaceC17783s0 TextButton = (InterfaceC17783s0) obj;
                C6021p c6021p5 = (C6021p) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TextButton, "$this$TextButton");
                if ((iIntValue5 & 17) == 16 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.subscriptions_restore_subscription_cta, c6021p5), null, 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, null, c6021p5, 0, 0, 130558);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
