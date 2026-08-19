package pn;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: pn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C18517d implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59007Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractTypeConstructor f59008Z;

    public /* synthetic */ C18517d(AbstractTypeConstructor abstractTypeConstructor, int i10) {
        this.f59007Y = i10;
        this.f59008Z = abstractTypeConstructor;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Collection<KotlinType> supertypes;
        switch (this.f59007Y) {
            case 0:
                C18519f supertypes2 = (C18519f) obj;
                AbstractC16544l.m18094g(supertypes2, "supertypes");
                AbstractTypeConstructor abstractTypeConstructor = this.f59008Z;
                List listFindLoopsInSupertypesAndDisconnect = abstractTypeConstructor.mo7321e().findLoopsInSupertypesAndDisconnect(abstractTypeConstructor, supertypes2.f59012a, new C18517d(abstractTypeConstructor, 1), new C18517d(abstractTypeConstructor, 2));
                if (listFindLoopsInSupertypesAndDisconnect.isEmpty()) {
                    KotlinType kotlinTypeMo7320c = abstractTypeConstructor.mo7320c();
                    List listM9974d = kotlinTypeMo7320c != null ? AbstractC9393x3.m9974d(kotlinTypeMo7320c) : null;
                    if (listM9974d == null) {
                        listM9974d = C17689w.f56480Y;
                    }
                    listFindLoopsInSupertypesAndDisconnect = listM9974d;
                }
                List listM19322C0 = listFindLoopsInSupertypesAndDisconnect instanceof List ? (List) listFindLoopsInSupertypesAndDisconnect : null;
                if (listM19322C0 == null) {
                    listM19322C0 = AbstractC17680n.m19322C0(listFindLoopsInSupertypesAndDisconnect);
                }
                List listMo7322f = abstractTypeConstructor.mo7322f(listM19322C0);
                AbstractC16544l.m18094g(listMo7322f, "<set-?>");
                supertypes2.f59013b = listMo7322f;
                return C17296C.f55119a;
            case 1:
                TypeConstructor it = (TypeConstructor) obj;
                AbstractC16544l.m18094g(it, "it");
                this.f59008Z.getClass();
                AbstractTypeConstructor abstractTypeConstructor2 = it instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) it : null;
                if (abstractTypeConstructor2 != null) {
                    supertypes = AbstractC17680n.m19361k0(abstractTypeConstructor2.mo18402d(false), ((C18519f) abstractTypeConstructor2.f53144b.invoke()).f59012a);
                } else {
                    supertypes = it.getSupertypes();
                    AbstractC16544l.m18093f(supertypes, "getSupertypes(...)");
                }
                return supertypes;
            default:
                KotlinType it2 = (KotlinType) obj;
                AbstractC16544l.m18094g(it2, "it");
                this.f59008Z.mo7323g(it2);
                return C17296C.f55119a;
        }
    }
}
