package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p909nm.C17689w;
import pn.C18515b;
import pn.C18516c;
import pn.C18517d;
import pn.C18518e;
import pn.C18519f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {

    /* JADX INFO: renamed from: b */
    public final NotNullLazyValue f53144b;

    public AbstractTypeConstructor(StorageManager storageManager) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        this.f53144b = storageManager.createLazyValueWithPostCompute(new C18515b(this, 0), C18516c.f59004Z, new C18517d(this, 0));
    }

    /* JADX INFO: renamed from: b */
    public abstract Collection mo7319b();

    /* JADX INFO: renamed from: c */
    public KotlinType mo7320c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public Collection mo18402d(boolean z6) {
        return C17689w.f56480Y;
    }

    /* JADX INFO: renamed from: e */
    public abstract SupertypeLoopChecker mo7321e();

    /* JADX INFO: renamed from: f */
    public List mo7322f(List list) {
        return list;
    }

    /* JADX INFO: renamed from: g */
    public void mo7323g(KotlinType type) {
        AbstractC16544l.m18094g(type, "type");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C18518e(this, kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<KotlinType> getSupertypes() {
        return ((C18519f) this.f53144b.invoke()).f59013b;
    }
}
