package p080D0;

import ge.C14060X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import nf.C17607f;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1156zj.AbstractC22180o0;
import p1156zj.C22171l0;
import p1156zj.C22177n0;
import p523V9.AbstractC8154o0;
import p531Vj.EnumC8334D;
import p647ak.AbstractC10708i1;
import p647ak.AbstractC10712k0;
import p647ak.C10678Y;
import p647ak.C10683a0;
import p647ak.C10701g0;
import p729ej.C13430u;
import p759g1.C13800b;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import ye.C21515d;

/* JADX INFO: renamed from: D0.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1825q0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5260Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ArrayList f5261Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1825q0(int i10, ArrayList arrayList) {
        super(1);
        this.f5260Y = i10;
        this.f5261Z = arrayList;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f5260Y) {
            case 0:
                AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
                ArrayList arrayList = this.f5261Z;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    abstractC21068W.m21545d((AbstractC21069X) arrayList.get(i10), 0, 0, 0.0f);
                }
                return C17296C.f55119a;
            case 1:
                C21515d setState = (C21515d) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C21515d.m21794a(setState, null, this.f5261Z, false, null, false, 29);
            case 2:
                AbstractC21068W layout = (AbstractC21068W) obj;
                AbstractC16544l.m18094g(layout, "$this$layout");
                for (C17309l c17309l : this.f5261Z) {
                    List list = (List) c17309l.f55136Y;
                    long j10 = ((C13800b) c17309l.f55137Z).f43584a;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        layout.m21546g((AbstractC21069X) it.next(), (int) C13800b.m15306g(j10), (int) C13800b.m15307h(j10), 0.0f);
                    }
                }
                return C17296C.f55119a;
            case 3:
                AbstractC21068W abstractC21068W2 = (AbstractC21068W) obj;
                ArrayList arrayList2 = this.f5261Z;
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    abstractC21068W2.m21546g((AbstractC21069X) arrayList2.get(i11), 0, 0, 0.0f);
                }
                return C17296C.f55119a;
            case 4:
                AbstractC21068W abstractC21068W3 = (AbstractC21068W) obj;
                ArrayList arrayList3 = this.f5261Z;
                int iM19381j = AbstractC17681o.m19381j(arrayList3);
                if (iM19381j >= 0) {
                    int i12 = 0;
                    while (true) {
                        abstractC21068W3.m21546g((AbstractC21069X) arrayList3.get(i12), 0, 0, 0.0f);
                        if (i12 != iM19381j) {
                            i12++;
                        }
                    }
                }
                return C17296C.f55119a;
            case 5:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                AbstractC10712k0 abstractC10712k0 = (AbstractC10712k0) action.f42521b;
                if (abstractC10712k0 instanceof C10701g0) {
                    EnumC8334D enumC8334D = EnumC8334D.f25983Y;
                    ArrayList arrayList4 = this.f5261Z;
                    action.f42521b = C10701g0.m11026l((C10701g0) abstractC10712k0, !arrayList4.contains(enumC8334D), !arrayList4.contains(EnumC8334D.f25984Z), 12);
                } else {
                    AbstractC8154o0.m8711b(abstractC10712k0);
                    action.f42521b = new C10683a0(false, false, AbstractC10708i1.m11027a(action, false));
                }
                return C17296C.f55119a;
            case 6:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                Object obj2 = action2.f42521b;
                C10678Y c10678y = obj2 instanceof C10678Y ? (C10678Y) obj2 : null;
                if (c10678y != null) {
                    action2.f42521b = C10678Y.m11017l(c10678y, AbstractC17680n.m19361k0(this.f5261Z, ((AbstractC10712k0) obj2).mo11015j()), false, true, 118);
                }
                return C17296C.f55119a;
            case 7:
                AbstractC21068W abstractC21068W4 = (AbstractC21068W) obj;
                ArrayList arrayList5 = this.f5261Z;
                int size3 = arrayList5.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    abstractC21068W4.m21545d((AbstractC21069X) arrayList5.get(i13), 0, 0, 0.0f);
                }
                return C17296C.f55119a;
            case 8:
                return C14060X.f44203Z.invoke(this.f5261Z.get(((Number) obj).intValue()));
            case 9:
                this.f5261Z.get(((Number) obj).intValue());
                return null;
            case 10:
                this.f5261Z.get(((Number) obj).intValue());
                return null;
            case 11:
                return C17607f.f56361Y.invoke(this.f5261Z.get(((Number) obj).intValue()));
            case 12:
                this.f5261Z.get(((Number) obj).intValue());
                return null;
            case 13:
                AbstractC21068W abstractC21068W5 = (AbstractC21068W) obj;
                ArrayList arrayList6 = this.f5261Z;
                int size4 = arrayList6.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    abstractC21068W5.m21546g((AbstractC21069X) arrayList6.get(i14), 0, 0, 0.0f);
                }
                return C17296C.f55119a;
            case 14:
                AbstractC21068W abstractC21068W6 = (AbstractC21068W) obj;
                ArrayList arrayList7 = this.f5261Z;
                int size5 = arrayList7.size();
                for (int i15 = 0; i15 < size5; i15++) {
                    AbstractC21068W.m21540j(abstractC21068W6, (AbstractC21069X) arrayList7.get(i15), 0, 0);
                }
                return C17296C.f55119a;
            default:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                AbstractC22180o0 abstractC22180o0 = (AbstractC22180o0) action3.f42521b;
                if (abstractC22180o0 instanceof C22177n0) {
                    C22177n0 c22177n0 = (C22177n0) abstractC22180o0;
                    EnumC8334D enumC8334D2 = EnumC8334D.f25983Y;
                    ArrayList arrayList8 = this.f5261Z;
                    action3.f42521b = C22177n0.m22397i(c22177n0, null, null, null, arrayList8.contains(enumC8334D2), arrayList8.contains(EnumC8334D.f25984Z), null, 13311);
                } else {
                    abstractC22180o0.mo22384b();
                    action3.f42521b = new C22171l0();
                }
                return C17296C.f55119a;
        }
    }
}
