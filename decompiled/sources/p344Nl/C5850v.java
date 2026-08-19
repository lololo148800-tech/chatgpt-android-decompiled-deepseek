package p344Nl;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p199Hl.C3479d;
import p199Hl.C3480e;
import p199Hl.C3481f;
import p199Hl.C3482g;
import p199Hl.C3483h;
import p909nm.AbstractC17665J;

/* JADX INFO: renamed from: Nl.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C5850v extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19139Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC5821C f19140Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5850v(AbstractC5821C abstractC5821C, int i10) {
        super(2);
        this.f19139Y = i10;
        this.f19140Z = abstractC5821C;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19139Y) {
            case 0:
                Map newAttributes = (Map) obj;
                Map oldAttributes = (Map) obj2;
                AbstractC16544l.m18094g(newAttributes, "newAttributes");
                AbstractC16544l.m18094g(oldAttributes, "oldAttributes");
                if (!newAttributes.equals(oldAttributes)) {
                    LinkedHashSet linkedHashSetM19266f = AbstractC17665J.m19266f(newAttributes.keySet(), oldAttributes.keySet());
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj3 : linkedHashSetM19266f) {
                        if (!AbstractC16544l.m18089b(newAttributes.get(obj3), oldAttributes.get(obj3))) {
                            Object obj4 = newAttributes.get(obj3);
                            if (obj4 == null) {
                                obj4 = "";
                            }
                            linkedHashMap.put(obj3, obj4);
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        AbstractC5821C abstractC5821C = this.f19140Z;
                        abstractC5821C.f18997d.m12669r(new C3479d(abstractC5821C, linkedHashMap, oldAttributes), abstractC5821C.f18996c);
                    }
                }
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue != ((Boolean) obj2).booleanValue()) {
                    AbstractC5821C abstractC5821C2 = this.f19140Z;
                    abstractC5821C2.f18997d.m12669r(new C3480e(abstractC5821C2), abstractC5821C2.f18996c);
                    if (zBooleanValue) {
                        abstractC5821C2.f19008o.m8944g(Long.valueOf(new Date().getTime()), AbstractC5821C.f18993u[9]);
                    }
                }
                break;
            case 2:
                String str = (String) obj2;
                if (!AbstractC16544l.m18089b((String) obj, str)) {
                    AbstractC5821C abstractC5821C3 = this.f19140Z;
                    abstractC5821C3.f18997d.m12669r(new C3481f(abstractC5821C3, str), abstractC5821C3.f18996c);
                }
                break;
            case 3:
                String str2 = (String) obj;
                if (!AbstractC16544l.m18089b(str2, (String) obj2)) {
                    AbstractC5821C abstractC5821C4 = this.f19140Z;
                    abstractC5821C4.f18997d.m12669r(new C3482g(abstractC5821C4, str2), abstractC5821C4.f18996c);
                }
                break;
            default:
                C5823E c5823e = (C5823E) obj;
                C5823E c5823e2 = (C5823E) obj2;
                if (!AbstractC16544l.m18089b(c5823e, c5823e2)) {
                    AbstractC5821C abstractC5821C5 = this.f19140Z;
                    abstractC5821C5.f18997d.m12669r(new C3483h(abstractC5821C5, c5823e, c5823e2), abstractC5821C5.f18996c);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
