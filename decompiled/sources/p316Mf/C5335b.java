package p316Mf;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1440o;
import p1139z0.C21585H;
import p1150zd.EnumC21875k;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Mf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5335b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C5335b f17549Z = new C5335b(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5335b f17550o0 = new C5335b(3, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f17551Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5335b(int i10, int i11) {
        super(i10);
        this.f17551Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        switch (this.f17551Y) {
            case 0:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.message_feedback_submit, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                return C17296C.f55119a;
            default:
                EnumC21875k it = (EnumC21875k) obj;
                C6021p c6021p2 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(it, "it");
                c6021p2.m6524S(986924617);
                C21585H c21585h = AbstractC5340g.f17559a;
                int iOrdinal = it.ordinal();
                if (iOrdinal == 0) {
                    i10 = R.string.message_feedback_tag_harmful;
                } else if (iOrdinal == 1) {
                    i10 = R.string.message_feedback_tag_false;
                } else if (iOrdinal == 2) {
                    i10 = R.string.message_feedback_tag_not_helpful;
                } else {
                    if (iOrdinal != 3) {
                        throw new C0644w();
                    }
                    i10 = R.string.message_feedback_bad_transcription;
                }
                String strM8676d = AbstractC8142m4.m8676d(i10, c6021p2);
                c6021p2.m6553p(false);
                return strM8676d;
        }
    }
}
