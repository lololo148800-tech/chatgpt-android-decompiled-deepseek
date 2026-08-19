package p749fd;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p492U1.C7545j;
import p571X9.AbstractC9113C4;
import p759g1.C13800b;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: fd.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C13622g extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C13622g f43035Z = new C13622g(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13622g f43036o0 = new C13622g(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43037Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13622g(int i10, int i11) {
        super(i10);
        this.f43037Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f43037Y) {
            case 0:
                return new C13800b(((C13800b) obj).f43584a);
            default:
                List restored = (List) obj;
                AbstractC16544l.m18094g(restored, "restored");
                Object obj2 = restored.get(0);
                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = restored.get(1);
                AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) obj3).floatValue();
                Object obj4 = restored.get(2);
                AbstractC16544l.m18092e(obj4, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue2 = ((Float) obj4).floatValue();
                Object obj5 = restored.get(3);
                AbstractC16544l.m18092e(obj5, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj5).intValue();
                Object obj6 = restored.get(4);
                AbstractC16544l.m18092e(obj6, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj6;
                Object obj7 = restored.get(5);
                AbstractC16544l.m18092e(obj7, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list2 = (List) obj7;
                Object obj8 = restored.get(6);
                AbstractC16544l.m18092e(obj8, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list3 = (List) obj8;
                Object obj9 = restored.get(7);
                AbstractC16544l.m18092e(obj9, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) obj9).intValue();
                Object obj10 = restored.get(8);
                AbstractC16544l.m18092e(obj10, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue3 = ((Integer) obj10).intValue();
                Object obj11 = restored.get(9);
                AbstractC16544l.m18092e(obj11, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue4 = ((Integer) obj11).intValue();
                Object obj12 = restored.get(10);
                AbstractC16544l.m18092e(obj12, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue5 = ((Integer) obj12).intValue();
                C13625j c13625j = new C13625j((String) obj2);
                c13625j.f43052e.m6410h(fFloatValue);
                c13625j.f43053f.m6410h(fFloatValue2);
                long jM9643a = AbstractC9113C4.m9643a(iIntValue4, iIntValue5);
                if (C7545j.m7886a(c13625j.f43055h, 0L)) {
                    c13625j.f43055h = jM9643a;
                }
                c13625j.m15147b(AbstractC9113C4.m9643a(iIntValue2, iIntValue3));
                c13625j.f43054g.setValue(new C14365u(AbstractC14334L.m15625c(iIntValue)));
                List list4 = list;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list4, 10));
                for (Object obj13 : list4) {
                    AbstractC16544l.m18092e(obj13, "null cannot be cast to non-null type kotlin.collections.List<com.openai.draw.ImageDrawPath>");
                    arrayList.add(AbstractC13627l.m15151c((List) obj13, c13625j.f43056i));
                }
                c13625j.f43049b.addAll(arrayList);
                List list5 = list2;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list5, 10));
                for (Object obj14 : list5) {
                    AbstractC16544l.m18092e(obj14, "null cannot be cast to non-null type kotlin.collections.List<com.openai.draw.ImageDrawPath>");
                    arrayList2.add(AbstractC13627l.m15151c((List) obj14, c13625j.f43056i));
                }
                c13625j.f43051d.addAll(arrayList2);
                List list6 = list3;
                ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list6, 10));
                for (Object obj15 : list6) {
                    AbstractC16544l.m18092e(obj15, "null cannot be cast to non-null type kotlin.collections.List<com.openai.draw.ImageDrawPath>");
                    arrayList3.add(AbstractC13627l.m15151c((List) obj15, c13625j.f43056i));
                }
                c13625j.f43050c.addAll(arrayList3);
                return c13625j;
        }
    }
}
