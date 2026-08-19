package p003A1;

import androidx.compose.p650ui.platform.AndroidComposeView;
import co.C11824n;
import com.squareup.workflow1.p685ui.backstack.BackStackContainer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mm.C17296C;
import p001A.AbstractC0010F;
import p013Ab.C0420b;
import p046Bk.C1361Y;
import p046Bk.C1375d0;
import p046Bk.C1407s0;
import p049Bm.InterfaceC1439n;
import p1156zj.C22170l;
import p1156zj.C22172l1;
import p130Eo.C2617b;
import p130Eo.C2618c;
import p130Eo.C2619d;
import p154Fo.C2947b;
import p154Fo.InterfaceC2948c;
import p343Nk.C5817a;
import p366Oj.C6262d;
import p366Oj.C6263e;
import p408Qj.C6741g;
import p544W9.AbstractC8740x3;
import p647ak.C10652K0;
import p647ak.C10713l;
import p729ej.AbstractC13422m;
import p729ej.C13420k;
import p737f1.C13510b;
import p759g1.C13801c;
import p769gj.C14183y;
import p813ij.C15022f;
import p838jj.C16223d;
import p838jj.InterfaceC16230k;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p931ok.C18226g;
import p931ok.C18230k;
import p977r0.C18842n;
import p977r0.C18852x;

/* JADX INFO: renamed from: A1.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0295v extends AbstractC16541i implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1066Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0295v(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f1066Y = i12;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x008e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0099  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0 A[LOOP:2: B:26:0x0097->B:30:0x00a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00aa A[EDGE_INSN: B:99:0x00aa->B:32:0x00aa BREAK  A[LOOP:2: B:26:0x0097->B:30:0x00a0], SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        Object objM6216b;
        Object objM6216b2;
        int length;
        List list = C17689w.f56480Y;
        boolean z6 = false;
        iMin = 0;
        int iMin = 0;
        z6 = false;
        C17296C c17296c = C17296C.f55119a;
        switch (this.f1066Y) {
            case 0:
                return Boolean.valueOf(AndroidComposeView.m11323d((AndroidComposeView) this.receiver, (C13510b) obj, (C13801c) obj2));
            case 1:
                C1407s0 p10 = (C1407s0) obj;
                C14183y p11 = (C14183y) obj2;
                AbstractC16544l.m18094g(p10, "p0");
                AbstractC16544l.m18094g(p11, "p1");
                ((C1375d0) this.receiver).mo1133a(p10, p11);
                return c17296c;
            case 2:
                C2617b p12 = (C2617b) obj;
                C5817a p13 = (C5817a) obj2;
                AbstractC16544l.m18094g(p12, "p0");
                AbstractC16544l.m18094g(p13, "p1");
                ((C2618c) this.receiver).getClass();
                List list2 = p12.f8104a;
                if (list2 != null) {
                    list = list2;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    Map map = p12.f8105b;
                    if (map == null || (objM6216b = p13.m6216b(map, obj3)) == null) {
                        objM6216b = p12.f8106c;
                    }
                    if (AbstractC8740x3.m9475a(objM6216b)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 3:
                C2617b p14 = (C2617b) obj;
                C5817a p15 = (C5817a) obj2;
                AbstractC16544l.m18094g(p14, "p0");
                AbstractC16544l.m18094g(p15, "p1");
                ((C2619d) this.receiver).getClass();
                List list3 = p14.f8104a;
                if (list3 != null) {
                    list = list3;
                }
                List list4 = list;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list4, 10));
                for (Object obj4 : list4) {
                    Map map2 = p14.f8105b;
                    if (map2 == null || (objM6216b2 = p15.m6216b(map2, obj4)) == null) {
                        objM6216b2 = p14.f8106c;
                    }
                    arrayList2.add(objM6216b2);
                }
                return arrayList2;
            case 4:
                C2947b p16 = (C2947b) obj;
                C5817a p17 = (C5817a) obj2;
                AbstractC16544l.m18094g(p16, "p0");
                AbstractC16544l.m18094g(p17, "p1");
                return ((InterfaceC2948c) this.receiver).mo3772a(p16, p17);
            case 5:
                C6263e p18 = (C6263e) obj;
                C14183y p19 = (C14183y) obj2;
                AbstractC16544l.m18094g(p18, "p0");
                AbstractC16544l.m18094g(p19, "p1");
                ((C6262d) this.receiver).m6750a(p18, p19);
                return c17296c;
            case 6:
                InterfaceC16230k p20 = (InterfaceC16230k) obj;
                C14183y p21 = (C14183y) obj2;
                AbstractC16544l.m18094g(p20, "p0");
                AbstractC16544l.m18094g(p21, "p1");
                C6741g c6741g = (C6741g) this.receiver;
                C1361Y c1361y = C6741g.f21643s0;
                c6741g.m17810c(p20, p21);
                return c17296c;
            case 7:
                C10652K0 p22 = (C10652K0) obj;
                C14183y p23 = (C14183y) obj2;
                AbstractC16544l.m18094g(p22, "p0");
                AbstractC16544l.m18094g(p23, "p1");
                ((C10713l) this.receiver).mo1133a(p22, p23);
                return c17296c;
            case 8:
                SerialDescriptor p24 = (SerialDescriptor) obj;
                int iIntValue = ((Number) obj2).intValue();
                AbstractC16544l.m18094g(p24, "p0");
                C11824n c11824n = (C11824n) this.receiver;
                c11824n.getClass();
                if (!p24.mo10686i(iIntValue) && p24.mo10685h(iIntValue).mo10680c()) {
                    z6 = true;
                }
                c11824n.f35834b = z6;
                return Boolean.valueOf(z6);
            case 9:
                return ((AbstractC13422m) this.receiver).mo2033a(obj, (C13420k) obj2);
            case 10:
                C15022f p25 = (C15022f) obj;
                C14183y p26 = (C14183y) obj2;
                AbstractC16544l.m18094g(p25, "p0");
                AbstractC16544l.m18094g(p26, "p1");
                ((BackStackContainer) this.receiver).m14526a(p25, p26);
                return c17296c;
            case 11:
                InterfaceC16230k p27 = (InterfaceC16230k) obj;
                C14183y p28 = (C14183y) obj2;
                AbstractC16544l.m18094g(p27, "p0");
                AbstractC16544l.m18094g(p28, "p1");
                ((C16223d) this.receiver).m17810c(p27, p28);
                return c17296c;
            case 12:
                C18226g p29 = (C18226g) obj;
                C14183y p30 = (C14183y) obj2;
                AbstractC16544l.m18094g(p29, "p0");
                AbstractC16544l.m18094g(p30, "p1");
                ((C18230k) this.receiver).m19733a(p29, p30);
                return c17296c;
            case 13:
                KotlinType p31 = (KotlinType) obj;
                KotlinType p32 = (KotlinType) obj2;
                AbstractC16544l.m18094g(p31, "p0");
                AbstractC16544l.m18094g(p32, "p1");
                return Boolean.valueOf(TypeIntersector.access$isStrictSupertype((TypeIntersector) this.receiver, p31, p32));
            case 14:
                KotlinType p33 = (KotlinType) obj;
                KotlinType p34 = (KotlinType) obj2;
                AbstractC16544l.m18094g(p33, "p0");
                AbstractC16544l.m18094g(p34, "p1");
                return Boolean.valueOf(((NewKotlinTypeCheckerImpl) this.receiver).equalTypes(p33, p34));
            case 15:
                int iIntValue2 = ((Number) obj).intValue();
                int iIntValue3 = ((Number) obj2).intValue();
                C18852x c18852x = (C18852x) this.receiver;
                c18852x.getClass();
                int[] iArr = new int[iIntValue3];
                if (((C18842n) c18852x.f60043b.getValue()).f59996h.m16555f(iIntValue2)) {
                    AbstractC17678l.m19312s(iArr, iIntValue2, 0, 6);
                } else {
                    C0420b c0420b = c18852x.f60044c;
                    c0420b.m1057m(iIntValue2 + iIntValue3);
                    int iM1065u = c0420b.m1065u(iIntValue2);
                    if (iM1065u != -2 && iM1065u != -1) {
                        if (iM1065u < 0) {
                            throw new IllegalArgumentException(AbstractC0010F.m19c(iM1065u, "Expected positive lane number, got ", " instead.").toString());
                        }
                        iMin = Math.min(iM1065u, iIntValue3);
                    }
                    int iM1059o = iIntValue2;
                    for (int i10 = iMin - 1; -1 < i10; i10--) {
                        iM1059o = c0420b.m1059o(iM1059o, i10);
                        iArr[i10] = iM1059o;
                        if (iM1059o == -1) {
                            AbstractC17678l.m19312s(iArr, -1, i10, 2);
                            iArr[iMin] = iIntValue2;
                            while (true) {
                                iMin++;
                                if (iMin < iIntValue3) {
                                    iIntValue2++;
                                    length = c0420b.f1381Z + ((int[]) c0420b.f1382o0).length;
                                    while (true) {
                                        if (iIntValue2 < length) {
                                            iIntValue2 = c0420b.f1381Z + ((int[]) c0420b.f1382o0).length;
                                        }
                                        if (c0420b.m1049d(iIntValue2, iMin)) {
                                        }
                                        iIntValue2++;
                                        break;
                                        break;
                                    }
                                    iArr[iMin] = iIntValue2;
                                }
                            }
                        }
                    }
                    iArr[iMin] = iIntValue2;
                    while (true) {
                        iMin++;
                        if (iMin < iIntValue3) {
                            iIntValue2++;
                            length = c0420b.f1381Z + ((int[]) c0420b.f1382o0).length;
                            while (true) {
                                if (iIntValue2 < length) {
                                    iIntValue2 = c0420b.f1381Z + ((int[]) c0420b.f1382o0).length;
                                }
                                if (c0420b.m1049d(iIntValue2, iMin)) {
                                }
                                iIntValue2++;
                                break;
                                break;
                            }
                            iArr[iMin] = iIntValue2;
                        }
                    }
                }
                return iArr;
            default:
                C22172l1 p35 = (C22172l1) obj;
                C14183y p36 = (C14183y) obj2;
                AbstractC16544l.m18094g(p35, "p0");
                AbstractC16544l.m18094g(p36, "p1");
                ((C22170l) this.receiver).mo1133a(p35, p36);
                return c17296c;
        }
    }
}
