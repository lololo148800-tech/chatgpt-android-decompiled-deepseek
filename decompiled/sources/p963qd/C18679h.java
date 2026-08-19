package p963qd;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p220Ih.AbstractC3719a;
import p229J0.AbstractC4124r4;
import p269Kh.C4688o;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;

/* JADX INFO: renamed from: qd.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C18679h extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59459Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4688o f59460Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18679h(C4688o c4688o, int i10) {
        super(2);
        this.f59459Y = i10;
        this.f59460Z = c4688o;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        String strM8676d;
        int i10;
        String strM8676d2;
        int i11;
        switch (this.f59459Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C4688o c4688o = this.f59460Z;
                    String str = c4688o.f15254c;
                    c6021p.m6524S(1978470518);
                    if (str == null) {
                        String str2 = AbstractC3719a.f11271d.f15253b;
                        String str3 = c4688o.f15253b;
                        if (AbstractC16544l.m18089b(str3, str2)) {
                            i10 = R.string.model_gpt_auto_title;
                        } else {
                            i10 = AbstractC16544l.m18089b(str3, AbstractC3719a.f11269b.f15253b) ? R.string.model_gpt_4o_title : R.string.model_gpt_4o_mini_title;
                        }
                        strM8676d = AbstractC8142m4.m8676d(i10, c6021p);
                    } else {
                        strM8676d = str;
                    }
                    c6021p.m6553p(false);
                    AbstractC4124r4.m4768b(strM8676d, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C4688o c4688o2 = this.f59460Z;
                    String str4 = c4688o2.f15255d;
                    c6021p2.m6524S(1978473666);
                    if (str4 == null) {
                        String str5 = AbstractC3719a.f11271d.f15253b;
                        String str6 = c4688o2.f15253b;
                        if (AbstractC16544l.m18089b(str6, str5)) {
                            i11 = R.string.model_gpt_auto_description;
                        } else {
                            i11 = AbstractC16544l.m18089b(str6, AbstractC3719a.f11269b.f15253b) ? R.string.model_gpt_4o_description : R.string.model_gpt_4o_mini_description;
                        }
                        strM8676d2 = AbstractC8142m4.m8676d(i11, c6021p2);
                    } else {
                        strM8676d2 = str4;
                    }
                    c6021p2.m6553p(false);
                    AbstractC4124r4.m4768b(strM8676d2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
