package p316Mf;

import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1150zd.EnumC21875k;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p562X0.C9008c;
import p586Y0.C9566r;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Mf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C5334a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C5334a f17546Z = new C5334a(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5334a f17547o0 = new C5334a(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f17548Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5334a(int i10, int i11) {
        super(i10);
        this.f17548Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17548Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.message_feedback_placeholder, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                return C17296C.f55119a;
            default:
                C9008c Saver = (C9008c) obj;
                C9566r tags = (C9566r) obj2;
                AbstractC16544l.m18094g(Saver, "$this$Saver");
                AbstractC16544l.m18094g(tags, "tags");
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(tags, 10));
                Iterator it = tags.iterator();
                while (it.hasNext()) {
                    arrayList.add(((EnumC21875k) it.next()).name());
                }
                return arrayList;
        }
    }
}
