package p926of;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.C21965U0;
import p403Qd.AbstractC6601G;
import p403Qd.AbstractC6653q0;
import p403Qd.C6600F;
import p403Qd.C6617X;
import p403Qd.C6621a0;
import p479Td.AbstractC7343b0;
import p479Td.C7351f0;
import p479Td.C7373x;
import p571X9.AbstractC9280e4;
import p575Xd.C9444c;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: of.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C18164a0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C18164a0 f57931Z = new C18164a0(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18164a0 f57932o0 = new C18164a0(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C18164a0 f57933p0 = new C18164a0(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C18164a0 f57934q0 = new C18164a0(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C18164a0 f57935r0 = new C18164a0(1, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f57936Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18164a0(int i10, int i11) {
        super(i10);
        this.f57936Y = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ?? arrayList;
        AbstractC7343b0 abstractC7343b0;
        switch (this.f57936Y) {
            case 0:
                AbstractC6601G it = (AbstractC6601G) obj;
                AbstractC16544l.m18094g(it, "it");
                if (it instanceof C6600F) {
                    return (C6600F) it;
                }
                return null;
            case 1:
                C6600F it2 = (C6600F) obj;
                AbstractC16544l.m18094g(it2, "it");
                return Boolean.valueOf(it2.f21314f instanceof C6617X);
            case 2:
                C6600F it3 = (C6600F) obj;
                AbstractC16544l.m18094g(it3, "it");
                AbstractC6653q0 abstractC6653q0 = it3.f21314f;
                AbstractC16544l.m18092e(abstractC6653q0, "null cannot be cast to non-null type com.openai.feature.conversations.domain.conversation.ToolSummaryData.CustomActionData");
                return ((C6617X) abstractC6653q0).f21344b;
            case 3:
                AbstractC6601G it4 = (AbstractC6601G) obj;
                AbstractC16544l.m18094g(it4, "it");
                if (it4 instanceof C6600F) {
                    return (C6600F) it4;
                }
                return null;
            default:
                C6600F toolItem = (C6600F) obj;
                AbstractC16544l.m18094g(toolItem, "toolItem");
                C6600F c6600f = toolItem.f21314f instanceof C6621a0 ? toolItem : null;
                if (c6600f == null || (abstractC7343b0 = c6600f.f21313e) == null) {
                    arrayList = 0;
                } else {
                    List listM9849a = AbstractC9280e4.m9849a(abstractC7343b0);
                    arrayList = new ArrayList();
                    for (Object obj2 : listM9849a) {
                        if (obj2 instanceof C7373x) {
                            arrayList.add(obj2);
                        }
                    }
                }
                if (arrayList == 0) {
                    arrayList = C17689w.f56480Y;
                }
                List list = toolItem.f21312d;
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    C9444c c9444c = ((C7351f0) it5.next()).f23270F;
                    List list2 = c9444c != null ? c9444c.f28447b : null;
                    if (list2 != null) {
                        arrayList2.add(list2);
                    }
                }
                ArrayList arrayListM19390s = AbstractC17682p.m19390s(arrayList2);
                ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayListM19390s, 10));
                Iterator it6 = arrayListM19390s.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(new C7373x((C21965U0) it6.next()));
                }
                return AbstractC17680n.m19361k0(arrayList3, (Collection) arrayList);
        }
    }
}
