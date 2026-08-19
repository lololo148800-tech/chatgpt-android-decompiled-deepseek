package p229J0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1071w0.AbstractC20740b0;
import p1071w0.C20706E0;
import p1071w0.C20710G0;
import p1071w0.C20726O0;
import p1071w0.C20732V;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21078d;
import p1095x1.InterfaceC21102w;
import p349O0.C5944C;
import p349O0.InterfaceC5985X;
import p482Tg.C7448e;
import p492U1.EnumC7546k;
import p537W0.C8410b;
import p537W0.C8412d;
import p547Wc.C8813w;
import p586Y0.C9569u;
import p586Y0.InterfaceC9542A;
import p594Y9.AbstractC9930m3;
import p692d0.C12948A;
import p737f1.AbstractC13512d;
import p737f1.C13526r;
import p758g0.C13756d;
import p759g1.C13801c;
import p860l0.EnumC16673F0;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17792x;
import p911o0.C17756f;
import p936p0.C18265e;
import p936p0.C18280t;
import p988rc.C18918f;
import p988rc.C18931s;
import pf.AbstractC18384B;

/* JADX INFO: renamed from: J0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4041e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12739Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f12740Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f12741o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f12742p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f12743q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4041e(int i10, List list, Object obj, Object obj2, int i11) {
        super(1);
        this.f12739Y = i11;
        this.f12740Z = i10;
        this.f12741o0 = list;
        this.f12742p0 = obj;
        this.f12743q0 = obj2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        float f10;
        int i10 = 0;
        C17296C c17296c = C17296C.f55119a;
        int i11 = this.f12740Z;
        Object obj2 = this.f12743q0;
        Object obj3 = this.f12742p0;
        Object obj4 = this.f12741o0;
        switch (this.f12739Y) {
            case 0:
                AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
                ArrayList arrayList = (ArrayList) obj4;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    List list = (List) arrayList.get(i12);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i13 = i10;
                    while (true) {
                        InterfaceC21059M interfaceC21059M = (InterfaceC21059M) obj2;
                        if (i13 < size2) {
                            iArr[i13] = ((AbstractC21069X) list.get(i13)).f66981Y + (i13 < AbstractC17681o.m19381j(list) ? interfaceC21059M.mo7866k0(AbstractC4071j.f12955c) : 0);
                            i13++;
                        } else {
                            C17756f c17756f = AbstractC17770m.f56725b;
                            int[] iArr2 = new int[size2];
                            for (int i14 = 0; i14 < size2; i14++) {
                                iArr2[i14] = 0;
                            }
                            c17756f.mo457c(interfaceC21059M, this.f12740Z, iArr, interfaceC21059M.getLayoutDirection(), iArr2);
                            int size3 = list.size();
                            for (int i15 = 0; i15 < size3; i15++) {
                                abstractC21068W.m21545d((AbstractC21069X) list.get(i15), iArr2[i15], ((Number) ((ArrayList) obj3).get(i12)).intValue(), 0.0f);
                            }
                            i12++;
                            i10 = 0;
                        }
                    }
                }
                return c17296c;
            case 1:
                if (obj == ((C5944C) obj4)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof InterfaceC9542A) {
                    int i16 = ((C8412d) obj3).f26158a - i11;
                    C12948A c12948a = (C12948A) obj2;
                    int iM14603c = c12948a.m14603c(obj);
                    c12948a.m14606f(Math.min(i16, iM14603c >= 0 ? c12948a.f41111c[iM14603c] : Integer.MAX_VALUE), obj);
                }
                return c17296c;
            case 2:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                AbstractC17792x.m19529l(LazyColumn, Integer.MAX_VALUE, null, new C8410b(new C8813w(i11, (List) obj4, (C18280t) obj3, (InterfaceC1436k) obj2), true, -734079982), 6);
                return c17296c;
            case 3:
                InterfaceC21078d interfaceC21078d = (InterfaceC21078d) obj;
                boolean zM15036I = AbstractC13512d.m15036I((C13526r) obj4, (C13526r) obj3, i11, (C7448e) obj2);
                Boolean boolValueOf = Boolean.valueOf(zM15036I);
                if (zM15036I || !interfaceC21078d.mo19952a()) {
                    return boolValueOf;
                }
                return null;
            case 4:
                InterfaceC21078d interfaceC21078d2 = (InterfaceC21078d) obj;
                boolean zM15035H = AbstractC13512d.m15035H(i11, (C7448e) obj2, (C13526r) obj4, (C13801c) obj3);
                Boolean boolValueOf2 = Boolean.valueOf(zM15035H);
                if (zM15035H || !interfaceC21078d2.mo19952a()) {
                    return boolValueOf2;
                }
                return null;
            case 5:
                C13756d animateTo = (C13756d) obj;
                AbstractC16544l.m18094g(animateTo, "$this$animateTo");
                List list2 = AbstractC18384B.f58664a;
                List list3 = (List) ((InterfaceC5985X) obj3).getValue();
                float fFloatValue = ((Number) animateTo.m15224e()).floatValue();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i17 = 0; i17 < i11; i17++) {
                    float f11 = i17 / i11;
                    float fM19864d = AbstractC18384B.m19864d(f11, list3);
                    float fM19864d2 = AbstractC18384B.m19864d(f11, (List) obj4);
                    float f12 = f11 * fFloatValue;
                    boolean z6 = fFloatValue <= f12;
                    if (z6) {
                        f10 = 0.0f;
                    } else {
                        if (z6) {
                            throw new C0644w();
                        }
                        f10 = (fFloatValue - f12) / (1.0f - f12);
                    }
                    arrayList2.add(Float.valueOf(AbstractC9930m3.m10589c(fM19864d, fM19864d2, f10)));
                }
                ((InterfaceC5985X) obj2).setValue(arrayList2);
                return c17296c;
            case 6:
                C13756d animateTo2 = (C13756d) obj;
                AbstractC16544l.m18094g(animateTo2, "$this$animateTo");
                C16556x c16556x = (C16556x) obj4;
                C18918f c18918f = (C18918f) obj3;
                if (c16556x.f51285Y) {
                    c18918f.f60371h.invoke();
                } else {
                    c18918f.f60372i.invoke();
                    c16556x.f51285Y = true;
                }
                ((C9569u) obj2).put(Integer.valueOf(i11), new C18931s(i11, ((Number) animateTo2.m15224e()).floatValue()));
                return c17296c;
            case 7:
                AbstractC21068W abstractC21068W2 = (AbstractC21068W) obj;
                C20732V c20732v = (C20732V) obj4;
                int i18 = c20732v.f65736Z;
                C20710G0 c20710g0 = (C20710G0) c20732v.f65738p0.invoke();
                InterfaceC21059M interfaceC21059M2 = (InterfaceC21059M) obj2;
                AbstractC21069X abstractC21069X = (AbstractC21069X) obj3;
                C13801c c13801cM21271l = AbstractC20740b0.m21271l(interfaceC21059M2, i18, c20732v.f65737o0, c20710g0 != null ? c20710g0.f65650a : null, interfaceC21059M2.getLayoutDirection() == EnumC7546k.f23905Z, abstractC21069X.f66981Y);
                EnumC16673F0 enumC16673F0 = EnumC16673F0.f53402Z;
                int i19 = abstractC21069X.f66981Y;
                C20706E0 c20706e0 = c20732v.f65735Y;
                c20706e0.m21214a(enumC16673F0, c13801cM21271l, i11, i19);
                abstractC21068W2.m21546g(abstractC21069X, Math.round(-c20706e0.f65619a.m6409g()), 0, 0.0f);
                return c17296c;
            default:
                AbstractC21068W abstractC21068W3 = (AbstractC21068W) obj;
                C20726O0 c20726o0 = (C20726O0) obj4;
                int i20 = c20726o0.f65716Z;
                C20710G0 c20710g1 = (C20710G0) c20726o0.f65718p0.invoke();
                AbstractC21069X abstractC21069X2 = (AbstractC21069X) obj3;
                C13801c c13801cM21271l2 = AbstractC20740b0.m21271l((InterfaceC21059M) obj2, i20, c20726o0.f65717o0, c20710g1 != null ? c20710g1.f65650a : null, false, abstractC21069X2.f66981Y);
                EnumC16673F0 enumC16673F1 = EnumC16673F0.f53401Y;
                int i21 = abstractC21069X2.f66982Z;
                C20706E0 c20706e1 = c20726o0.f65715Y;
                c20706e1.m21214a(enumC16673F1, c13801cM21271l2, i11, i21);
                abstractC21068W3.m21546g(abstractC21069X2, 0, Math.round(-c20706e1.f65619a.m6409g()), 0.0f);
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4041e(C13526r c13526r, Object obj, int i10, C7448e c7448e, int i11) {
        super(1);
        this.f12739Y = i11;
        this.f12741o0 = c13526r;
        this.f12742p0 = obj;
        this.f12740Z = i10;
        this.f12743q0 = c7448e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4041e(Object obj, Object obj2, Object obj3, int i10, int i11) {
        super(1);
        this.f12739Y = i11;
        this.f12741o0 = obj;
        this.f12742p0 = obj2;
        this.f12743q0 = obj3;
        this.f12740Z = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4041e(ArrayList arrayList, InterfaceC21059M interfaceC21059M, int i10, ArrayList arrayList2) {
        super(1);
        this.f12739Y = 0;
        float f10 = AbstractC4071j.f12953a;
        this.f12741o0 = arrayList;
        this.f12743q0 = interfaceC21059M;
        this.f12740Z = i10;
        this.f12742p0 = arrayList2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4041e(InterfaceC21059M interfaceC21059M, InterfaceC21102w interfaceC21102w, AbstractC21069X abstractC21069X, int i10, int i11) {
        super(1);
        this.f12739Y = i11;
        this.f12743q0 = interfaceC21059M;
        this.f12741o0 = interfaceC21102w;
        this.f12742p0 = abstractC21069X;
        this.f12740Z = i10;
    }
}
