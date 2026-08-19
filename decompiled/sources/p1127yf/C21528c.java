package p1127yf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1155zi.C21965U0;
import p479Td.AbstractC7343b0;
import p479Td.C7315A;
import p479Td.C7373x;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17682p;
import p926of.C18146I;
import p926of.C18173j;
import p926of.C18174k;

/* JADX INFO: renamed from: yf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C21528c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68183Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC7343b0 f68184Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f68185o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f68186p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21528c(InterfaceC1436k interfaceC1436k, AbstractC7343b0 abstractC7343b0, String str) {
        super(1);
        this.f68185o0 = interfaceC1436k;
        this.f68184Z = abstractC7343b0;
        this.f68186p0 = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f68183Y) {
            case 0:
                C18174k it = (C18174k) obj;
                AbstractC16544l.m18094g(it, "it");
                this.f68185o0.invoke(new C18146I(AbstractC9393x3.m9974d(new C18173j(((C7373x) this.f68184Z).f23373c, this.f68186p0)), 0, 14));
                break;
            default:
                C18174k image = (C18174k) obj;
                AbstractC16544l.m18094g(image, "image");
                List list = ((C7315A) this.f68184Z).f23212c;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C18173j((C21965U0) it2.next(), this.f68186p0));
                }
                Iterator it3 = arrayList.iterator();
                int i10 = 0;
                while (it3.hasNext()) {
                    if (AbstractC16544l.m18089b(((C18173j) it3.next()).f57968a, image.f57980c)) {
                        this.f68185o0.invoke(new C18146I(arrayList, i10, 12));
                    } else {
                        i10++;
                    }
                    break;
                }
                i10 = -1;
                this.f68185o0.invoke(new C18146I(arrayList, i10, 12));
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21528c(AbstractC7343b0 abstractC7343b0, InterfaceC1436k interfaceC1436k, String str) {
        super(1);
        this.f68184Z = abstractC7343b0;
        this.f68185o0 = interfaceC1436k;
        this.f68186p0 = str;
    }
}
