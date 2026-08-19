package p332N8;

import android.gov.nist.javax.sip.header.ParameterNames;
import bo.AbstractC11523k;
import bo.C11527o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1014t1.C19732i;
import p1095x1.AbstractC21069X;
import p1140z1.EnumC21705m0;
import p1140z1.InterfaceC21707n0;
import p646aj.AbstractC10628h;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p953q0.C18566Y;
import p953q0.C18591l0;

/* JADX INFO: renamed from: N8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5677a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18437Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f18438Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5677a(C16525B c16525b, int i10) {
        super(1);
        this.f18437Y = i10;
        this.f18438Z = c16525b;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        EnumC21705m0 enumC21705m0 = EnumC21705m0.f68878Z;
        C17296C c17296c = C17296C.f55119a;
        C16525B c16525b = this.f18438Z;
        switch (this.f18437Y) {
            case 0:
                List fields = (List) obj;
                AbstractC16544l.m18094g(fields, "fields");
                return AbstractC17659D.m19253o(AbstractC17680n.m19334J0((Iterable) c16525b.f51262Y, fields));
            case 1:
                Map it = (Map) obj;
                AbstractC16544l.m18094g(it, "it");
                String str = (String) c16525b.f51262Y;
                C11527o c11527o = AbstractC10628h.f31539a;
                if (str == null) {
                    it.remove(ParameterNames.f31999ID);
                } else {
                    it.put(ParameterNames.f31999ID, AbstractC11523k.m12910c(str));
                }
                return c17296c;
            case 2:
                c16525b.f51262Y = (AbstractC21069X) obj;
                return c17296c;
            case 3:
                c16525b.f51262Y = (AbstractC21069X) obj;
                return c17296c;
            case 4:
                InterfaceC21707n0 interfaceC21707n0 = (InterfaceC21707n0) obj;
                AbstractC16544l.m18092e(interfaceC21707n0, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                C18566Y c18566y = ((C18591l0) interfaceC21707n0).f59229z0;
                List listM19384m = (List) c16525b.f51262Y;
                if (listM19384m != null) {
                    listM19384m.add(c18566y);
                } else {
                    listM19384m = AbstractC17681o.m19384m(c18566y);
                }
                c16525b.f51262Y = listM19384m;
                return enumC21705m0;
            case 5:
                C19732i c19732i = (C19732i) obj;
                Object obj2 = c16525b.f51262Y;
                if (obj2 == null && c19732i.f62470B0) {
                    c16525b.f51262Y = c19732i;
                } else if (obj2 != null && c19732i.f62469A0 && c19732i.f62470B0) {
                    c16525b.f51262Y = c19732i;
                }
                return Boolean.TRUE;
            case 6:
                C19732i c19732i2 = (C19732i) obj;
                EnumC21705m0 enumC21705m1 = EnumC21705m0.f68877Y;
                if (c19732i2.f62470B0) {
                    c16525b.f51262Y = c19732i2;
                    if (c19732i2.f62469A0) {
                        return enumC21705m0;
                    }
                }
                return enumC21705m1;
            default:
                C19732i c19732i3 = (C19732i) obj;
                if (c19732i3.f62469A0 && c19732i3.f62470B0) {
                    c16525b.f51262Y = c19732i3;
                }
                return Boolean.TRUE;
        }
    }
}
