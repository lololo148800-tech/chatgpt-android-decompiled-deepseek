package p006A4;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p042Bf.AbstractC1270l;
import p042Bf.AbstractC1283y;
import p049Bm.InterfaceC1426a;
import p1095x1.InterfaceC21098s;
import p1113xn.AbstractC21322p;
import p1143z4.C21778h;
import p145Ff.EnumC2731i;
import p193Hf.AbstractC3349b;
import p203I0.C3551h;
import p349O0.InterfaceC5985X;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p499U9.C7591u;
import p909nm.C17689w;
import p991rh.C18998g;
import p991rh.C18999h;
import p991rh.C19003l;

/* JADX INFO: renamed from: A4.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0339D extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1192Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f1193Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0339D(InterfaceC5985X interfaceC5985X, int i10) {
        super(0);
        this.f1192Y = i10;
        this.f1193Z = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C17296C c17296c = C17296C.f55119a;
        InterfaceC5985X interfaceC5985X = this.f1193Z;
        switch (this.f1192Y) {
            case 0:
                List list = (List) interfaceC5985X.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (AbstractC16544l.m18089b(((C21778h) obj).f69074Z.f69130Y, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                float f10 = AbstractC1270l.f3375a;
                interfaceC5985X.setValue(Boolean.TRUE);
                return c17296c;
            case 2:
                float f11 = AbstractC1270l.f3375a;
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 3:
                interfaceC5985X.setValue(null);
                return c17296c;
            case 4:
                interfaceC5985X.setValue(Boolean.valueOf(!((Boolean) interfaceC5985X.getValue()).booleanValue()));
                return c17296c;
            case 5:
                float f12 = AbstractC1283y.f3415a;
                interfaceC5985X.setValue(null);
                return c17296c;
            case 6:
                interfaceC5985X.setValue(Boolean.valueOf(!((Boolean) interfaceC5985X.getValue()).booleanValue()));
                return c17296c;
            case 7:
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 8:
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 9:
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 10:
                C7591u c7591u = EnumC2731i.f8384Y;
                AbstractC6224C abstractC6224C = (AbstractC6224C) interfaceC5985X.getValue();
                c7591u.getClass();
                if (abstractC6224C == null) {
                    return EnumC2731i.f8385Z;
                }
                boolean z6 = abstractC6224C instanceof AbstractC6249w;
                if (z6 && (((AbstractC6249w) abstractC6224C).f20328a instanceof C18998g)) {
                    return EnumC2731i.f8386o0;
                }
                if (z6 && (((AbstractC6249w) abstractC6224C).f20328a instanceof C18999h)) {
                    return EnumC2731i.f8387p0;
                }
                if (abstractC6224C instanceof C6223B) {
                    C19003l c19003l = (C19003l) ((C6223B) abstractC6224C).f20258a;
                    String str = c19003l != null ? c19003l.f60582b : null;
                    if (str == null) {
                        str = "";
                    }
                    if (!AbstractC21322p.m21681O(str)) {
                        return EnumC2731i.f8389r0;
                    }
                }
                return EnumC2731i.f8388q0;
            case 11:
                interfaceC5985X.setValue(Boolean.valueOf(!((Boolean) interfaceC5985X.getValue()).booleanValue()));
                return c17296c;
            case 12:
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 13:
                int i10 = AbstractC3349b.f10236b;
                interfaceC5985X.setValue(Boolean.TRUE);
                return c17296c;
            case 14:
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 15:
                return (Boolean) interfaceC5985X.getValue();
            case 16:
                interfaceC5985X.setValue(Boolean.TRUE);
                return c17296c;
            case 17:
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 18:
                return (C3551h) interfaceC5985X.getValue();
            case 19:
                return (InterfaceC21098s) interfaceC5985X.getValue();
            case 20:
                interfaceC5985X.setValue(C17689w.f56480Y);
                return c17296c;
            case 21:
                interfaceC5985X.setValue(Boolean.valueOf(!((Boolean) interfaceC5985X.getValue()).booleanValue()));
                return c17296c;
            case 22:
                interfaceC5985X.setValue(Boolean.valueOf(!((Boolean) interfaceC5985X.getValue()).booleanValue()));
                return c17296c;
            case 23:
                interfaceC5985X.setValue(Boolean.TRUE);
                return c17296c;
            case 24:
                interfaceC5985X.setValue(Boolean.TRUE);
                return c17296c;
            case 25:
                interfaceC5985X.setValue(Boolean.TRUE);
                return c17296c;
            case 26:
                interfaceC5985X.setValue(Boolean.TRUE);
                return c17296c;
            case 27:
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
            case 28:
                interfaceC5985X.setValue(Boolean.TRUE);
                return c17296c;
            default:
                interfaceC5985X.setValue(Boolean.FALSE);
                return c17296c;
        }
    }
}
