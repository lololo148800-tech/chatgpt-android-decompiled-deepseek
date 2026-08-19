package p389Pn;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21098s;
import p1139z0.C21587J;
import p346Nn.C5891c0;
import p346Nn.InterfaceC5917p0;
import p774h1.C14328F;

/* JADX INFO: renamed from: Pn.t */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6535t extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21151Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f21152Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6535t(C6536u c6536u) {
        super(1, AbstractC16543k.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z", 0);
        this.f21152Z = c6536u;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        boolean z6;
        switch (this.f21151Y) {
            case 0:
                Iterator it = ((C6536u) this.f21152Z).f21154b.iterator();
                boolean z10 = false;
                boolean z11 = false;
                while (it.hasNext()) {
                    if (AbstractC16544l.m18089b(((C5891c0) it.next()).f19219a.f21150Y.get(obj), Boolean.TRUE)) {
                        z11 = true;
                    } else {
                        InterfaceC5917p0 obj2 = (InterfaceC5917p0) obj;
                        AbstractC16544l.m18094g(obj2, "obj");
                        Integer numMo6285c = obj2.mo6285c();
                        if ((numMo6285c != null ? numMo6285c.intValue() : 0) == 0) {
                            Integer numMo6287p = obj2.mo6287p();
                            if ((numMo6287p != null ? numMo6287p.intValue() : 0) == 0) {
                                Integer numMo6286g = obj2.mo6286g();
                                z6 = (numMo6286g != null ? numMo6286g.intValue() : 0) == 0;
                            }
                        }
                        if (!z6) {
                            return Boolean.valueOf(z10);
                        }
                    }
                }
                z10 = z11;
                return Boolean.valueOf(z10);
            default:
                float[] fArr = ((C14328F) obj).f44968a;
                InterfaceC21098s interfaceC21098s = (InterfaceC21098s) ((C21587J) this.f21152Z).f68351C0.getValue();
                if (interfaceC21098s != null) {
                    if (!interfaceC21098s.mo21522h()) {
                        interfaceC21098s = null;
                    }
                    if (interfaceC21098s != null) {
                        interfaceC21098s.mo21523j(fArr);
                    }
                }
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6535t(C21587J c21587j) {
        super(1, AbstractC16543k.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f21152Z = c21587j;
    }
}
