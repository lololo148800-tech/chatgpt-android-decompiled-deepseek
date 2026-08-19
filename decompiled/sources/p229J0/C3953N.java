package p229J0;

import androidx.compose.foundation.layout.AbstractC10842a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p278L0.C4847K;
import p278L0.C4855T;
import p349O0.C5944C;
import p349O0.C6021p;
import p492U1.C7536a;
import p492U1.C7545j;
import p537W0.C8410b;

/* JADX INFO: renamed from: J0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C3953N extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12254Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f12255Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f12256o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3953N(Object obj, float f10, int i10) {
        super(2);
        this.f12254Y = i10;
        this.f12256o0 = obj;
        this.f12255Z = f10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0058  */
    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12254Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    ((C8410b) this.f12256o0).invoke(AbstractC10842a.m11225c(0.0f, 0.0f, 0.0f, this.f12255Z, 7), c6021p, 0);
                }
                return C17296C.f55119a;
            default:
                long j10 = ((C7545j) obj).f23903a;
                float f10 = this.f12255Z;
                C3880A3 c3880a3 = (C3880A3) this.f12256o0;
                C3992V c3992v = new C3992V(c3880a3, C7536a.m7853h(((C7536a) obj2).f23888a), f10, (int) (j10 & 4294967295L));
                C4847K c4847k = new C4847K();
                c3992v.invoke(c4847k);
                LinkedHashMap linkedHashMap = c4847k.f15778a;
                C4855T c4855t = new C4855T(linkedHashMap);
                EnumC3886B3 enumC3886B3 = (EnumC3886B3) ((C5944C) c3880a3.f11737c.f34071h).getValue();
                int iOrdinal = enumC3886B3.ordinal();
                EnumC3886B3 enumC3886B4 = EnumC3886B3.f11777Y;
                if (iOrdinal != 0) {
                    EnumC3886B3 enumC3886B5 = EnumC3886B3.f11779o0;
                    EnumC3886B3 enumC3886B6 = EnumC3886B3.f11778Z;
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new C0644w();
                        }
                        if (linkedHashMap.containsKey(enumC3886B5)) {
                            enumC3886B3 = enumC3886B5;
                        } else if (linkedHashMap.containsKey(enumC3886B6)) {
                            enumC3886B3 = enumC3886B6;
                        } else if (linkedHashMap.containsKey(enumC3886B4)) {
                            enumC3886B3 = enumC3886B4;
                        }
                    } else if (linkedHashMap.containsKey(enumC3886B6)) {
                        enumC3886B3 = enumC3886B6;
                    } else if (linkedHashMap.containsKey(enumC3886B5)) {
                        enumC3886B3 = enumC3886B5;
                    } else if (linkedHashMap.containsKey(enumC3886B4)) {
                        enumC3886B3 = enumC3886B4;
                    }
                } else if (linkedHashMap.containsKey(enumC3886B4)) {
                    enumC3886B3 = enumC3886B4;
                }
                return new C17309l(c4855t, enumC3886B3);
        }
    }
}
