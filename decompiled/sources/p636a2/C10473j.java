package p636a2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p492U1.EnumC7546k;
import p716e2.C13265b;
import p738f2.C13529a;
import p760g2.C13804a;

/* JADX INFO: renamed from: a2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C10473j extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31017Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f31018Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C10469f[] f31019o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10473j(int i10, float f10, C10469f[] c10469fArr) {
        super(1);
        this.f31017Y = i10;
        this.f31018Z = f10;
        this.f31019o0 = c10469fArr;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10482s state = (C10482s) obj;
        AbstractC16544l.m18094g(state, "state");
        EnumC7546k enumC7546k = state.f31059g;
        if (enumC7546k == null) {
            AbstractC16544l.m18103p("layoutDirection");
            throw null;
        }
        int i10 = enumC7546k == EnumC7546k.f23904Y ? 1 : 2;
        C13265b c13265bM10948a = state.m10948a(Integer.valueOf(this.f31017Y));
        if (c13265bM10948a.f41900c == null) {
            C13529a c13529a = new C13529a(state);
            c13529a.f42819R = i10;
            c13265bM10948a.f41900c = c13529a;
            C13804a c13804aM15083h = c13529a.m15083h();
            if (c13804aM15083h != null) {
                c13265bM10948a.f41894L = c13804aM15083h;
                c13804aM15083h.f43668g0 = c13265bM10948a.f41893K;
            }
        }
        C13529a c13529a2 = c13265bM10948a.f41900c;
        C10469f[] c10469fArr = this.f31019o0;
        ArrayList arrayList = new ArrayList(c10469fArr.length);
        for (C10469f c10469f : c10469fArr) {
            arrayList.add(c10469f.f31005a);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Collections.addAll(c13529a2.f42818Q, Arrays.copyOf(array, array.length));
        c13529a2.f42820S = state.f31057e.mo7866k0(this.f31018Z);
        return C17296C.f55119a;
    }
}
