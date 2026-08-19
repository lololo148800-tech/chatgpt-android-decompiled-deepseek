package p388Pm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Pm.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C6514h implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21123Y;

    /* JADX INFO: renamed from: Z */
    public final FqName f21124Z;

    public /* synthetic */ C6514h(FqName fqName, int i10) {
        this.f21123Y = i10;
        this.f21124Z = fqName;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f21123Y) {
            case 0:
                FqName it = (FqName) obj;
                AbstractC16544l.m18094g(it, "it");
                return Boolean.valueOf(!it.isRoot() && AbstractC16544l.m18089b(it.parent(), this.f21124Z));
            default:
                Annotations it2 = (Annotations) obj;
                AbstractC16544l.m18094g(it2, "it");
                return it2.mo22585findAnnotation(this.f21124Z);
        }
    }
}
