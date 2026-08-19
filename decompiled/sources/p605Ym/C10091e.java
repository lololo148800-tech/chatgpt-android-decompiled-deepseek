package p605Ym;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Ym.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C10091e implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29875Y;

    /* JADX INFO: renamed from: Z */
    public final LazyJavaClassMemberScope f29876Z;

    public /* synthetic */ C10091e(LazyJavaClassMemberScope lazyJavaClassMemberScope, int i10) {
        this.f29875Y = i10;
        this.f29876Z = lazyJavaClassMemberScope;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f29876Z;
        switch (this.f29875Y) {
            case 0:
                return AbstractC17680n.m19328G0(lazyJavaClassMemberScope.f51911n.getInnerClassNames());
            case 1:
                Collection<JavaField> fields = lazyJavaClassMemberScope.f51911n.getFields();
                ArrayList arrayList = new ArrayList();
                for (Object obj : fields) {
                    if (((JavaField) obj).isEnumEntry()) {
                        arrayList.add(obj);
                    }
                }
                int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(arrayList, 10));
                if (iM19257b < 16) {
                    iM19257b = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((JavaField) obj2).getName(), obj2);
                }
                return linkedHashMap;
            default:
                int i10 = LazyJavaClassMemberScope.f51909u;
                return AbstractC17665J.m19266f(lazyJavaClassMemberScope.getFunctionNames(), lazyJavaClassMemberScope.getVariableNames());
        }
    }
}
